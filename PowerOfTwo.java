package homeWork2;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(check(n));
    }
    public static boolean check( int n){
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return check(n / 2);
    }
}
