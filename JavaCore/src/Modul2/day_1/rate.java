package Modul2.day_1;

import java.util.Scanner;

public class rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, rate;
        System.out.println("Input USD: ");
        usd = scanner.nextDouble();
        rate = usd * 23000;
        System.out.println(rate);
    }
}
