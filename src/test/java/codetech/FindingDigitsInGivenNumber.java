package codetech;

public class FindingDigitsInGivenNumber {
    public static void main(String[] args) {
        int i = 1234567;
        System.out.println(findDigitsInGivenNumber1(i));
    }

    private static int findDigitsInGivenNumber(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;

        }

        return count;
    }

    private static int findDigitsInGivenNumber1(int num){
        String str = String.valueOf(num);
        return str.length();
    }
}
