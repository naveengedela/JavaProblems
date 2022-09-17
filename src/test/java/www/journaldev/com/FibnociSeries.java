package www.journaldev.com;

public class FibnociSeries {
    public static void main(String[] args) {
       int num = 10;
       int n0=0, n1=1, n2;
        System.out.println(n0 + "  " + n1);
        for (int i = 0; i <= num ;i++) {
            n2 = n0 + n1;
            System.out.print(n2);
            n0 = n1;
            n1 = n2;
            System.out.println();
        }
    }
}
