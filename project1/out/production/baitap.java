import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        final double TG = 160;

        Scanner scanner = new  Scanner(System.in);
        System.out.println("nhap vao so tien");
        double money = scanner.nextDouble();
        double vnd = TG * money;
        System.out.println(vnd +"vnd");

    }
}
