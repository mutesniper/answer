package question8.hungrysingleton;

public class BlockHungrySingleton {
    private static BlockHungrySingleton instance;
    private BlockHungrySingleton() {}
    static {
        instance = new BlockHungrySingleton();
    }
    public static BlockHungrySingleton getInstance() {
        return instance;
    }




}
