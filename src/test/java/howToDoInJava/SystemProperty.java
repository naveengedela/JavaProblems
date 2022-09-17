package howToDoInJava;

import java.util.Properties;

public class SystemProperty {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.list(System.out);
    }
}
