package homeWork2;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите степень: ");
        int b = scanner.nextInt();
        System.out.println(a + " в степени " + b + " равно " +  myPow(a,b));
    }

    public static double myPow(double a, int b) {
        if (b < 0){
            return 1.0 / calcPow(a, b);
        }
        else {
            return calcPow(a, b);
        }
    }
    public static double calcPow(double a, int b){
        if (b == 0) return 1;

        if (b == 1 || a == 1) return a;

        if (b % 2 == 0) {
            return calcPow(a * a, b / 2);
        }
        return a * calcPow(a * a, b / 2);
    }
}
