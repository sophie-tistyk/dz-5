public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 81;
        int d = 4;

        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println("sum1 is " + sum1 + " and sum2 is " + sum2);
        System.out.println("Is sum1 bigger than sum2? " + (sum1 > sum2));

        sum1++;
        sum2 -= 2;

        System.out.println("sum1 is " + sum1 + " and sum2 is " + sum2);
        System.out.println("Is sum1 bigger than sum2? " + (sum1 > sum2));

        int k = sum1 % 2;
        int l = sum2 % 2;

        System.out.println("Is at least one sum even? " + (k == 0 || l == 0));

    }
}