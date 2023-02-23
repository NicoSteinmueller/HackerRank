package Advanced.Singleton_Pattern;

public class Solution {
}

class Singleton {
    private Singleton() {}
    public String str;
    private static Singleton singleton = null;
    public static Singleton getSingleInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
