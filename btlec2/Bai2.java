package bai1;

import java.util.Scanner;

/**
 *
 * @author  Nguyen Sy Tan
 */
public class Bai2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");

        String input = scanner.nextLine();

        
        try {
            Integer.parseInt(input);
            System.out.println("Ban nhap ky tu khong phai la chuoi.");
        } catch (NumberFormatException e) {
            System.out.println("Ban da nhap chuoi: " + input);
        }

        scanner.close();
    }
}
