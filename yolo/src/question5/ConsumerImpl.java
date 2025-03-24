package question5;

import java.util.concurrent.BlockingDeque;

public class ConsumerImpl implements Consumer{
    private String name;

    public ConsumerImpl(String name) {
        this.name=name;
    }
    @Override
    public void consume(Cake cake) {
        System.out.println(this.name+"消费了"+"蛋糕"+cake.getId());
    }



}
