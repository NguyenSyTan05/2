package bai1; // Tên gói cần phải viết đúng

import java.util.Scanner; 
import java.text.SimpleDateFormat; 
import java.text.ParseException; 
import java.util.Date; 

public class Bai1sao { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date namsinh; 
        try {
            System.out.println("Nhap nam sinh (dd-MM-yyyy): ");
            namsinh = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le, vui long nhap theo ngay-thang-nam.");
            return; 
        }

        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap que quan: ");
        String que = scanner.nextLine();

        System.out.println("Nhap chuyen nganh: ");
        String nganh = scanner.nextLine();

        System.out.println("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.println("Thong tin hoc sinh la: ");
        System.out.println("Ten: " + ten);
        System.out.println("Nam sinh: " + dateFormat.format(namsinh)); 
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + que);
        System.out.println("Chuyen nganh: " + nganh);
        System.out.println("GPA: " + gpa);

        scanner.close(); 
    }
}
