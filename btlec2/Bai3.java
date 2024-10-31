/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;
import java.util.Scanner;

/** 
 *
 * @author Nguyen Sy Tan
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Nhap so: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            System.out.println(" da nhap so: " + input);
        } else {
            System.out.println("Ban da khong nhap so nguyen. ");
        }
    }
}