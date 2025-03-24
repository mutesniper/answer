package question8.lazyingleton;

public class StaticInnerClass {
    private StaticInnerClass() {}

    private static class StaticInnerClassHolder{
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance(){
        return StaticInnerClassHolder.INSTANCE;
    }



}
