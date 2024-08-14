import java.util.Scanner;

public class baiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float PI = 3.14159265f;
        System.out.println("nhap vao ban kinh hinh tron");
        double  banKinh = sc.nextDouble();
        double chuVi = 2 * PI * banKinh;
        System.out.println("chu vi hinh tron la" + chuVi);
        System.out.println("nhap vao ban kinh hinh tron");
        double banKinh2 = sc.nextInt();
        double dienTich = PI * banKinh2 * banKinh2;
        System.out.println("dien tich hinh tron la" + dienTich);

    }
}
