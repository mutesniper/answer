package question5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Cake> queue = new LinkedBlockingQueue<>(5);
        Producer producer=new ProducerImpl();
        Thread[] threads=new Thread[3];
        Thread p=new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                try{
                    Cake cake = producer.produce();
                    queue.put(cake);
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

        });
        p.start();

        for (int i = 0; i < 3; i++) {
            Consumer consumer=new ConsumerImpl("消费者"+i);
            threads[i]=new Thread(()->{
                while(!Thread.currentThread().isInterrupted()){
                    try {
                        consumer.consume(queue.take());
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            threads[i].start();

        }
        Thread.sleep(1000*5);
        p.interrupt();
        for (Thread thread : threads) {
            thread.interrupt();
        }



    }



}
