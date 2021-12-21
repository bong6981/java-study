package me.bongf;

/**
 * Hello world!
 *
 */
public class App {
    Book book = new Book();

    static String name;

    static {
        name = "bong";
    }

    public static void main( String[] args ) {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
