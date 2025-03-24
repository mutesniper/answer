package question8.hungrysingleton;

public class LiteralHunfrySingleton {
    private static final LiteralHunfrySingleton instance = new LiteralHunfrySingleton();
    private LiteralHunfrySingleton() {}
    public static LiteralHunfrySingleton getInstance() {
        return instance;
    }
}
