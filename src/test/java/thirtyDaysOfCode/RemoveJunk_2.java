package thirtyDaysOfCode;

public class RemoveJunk_2 {
    public static void main(String[] args) {
        String str = "中等的 latin string 0123345566";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);
    }

}
