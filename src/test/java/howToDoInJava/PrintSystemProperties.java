package howToDoInJava;

import java.util.Properties;

public class PrintSystemProperties {
    public static void main(String[] args) {
        Properties pros = System.getProperties();
        System.out.println(System.getProperty("java.home"));
    }
}
