import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        double d = scan.nextDouble();
        boolean e = scan.nextBoolean();
        String f = scan.next();
        char g =scan.next().charAt(0);
        System.out.println("读取了整数：" + a);
        System.out.println("读取了浮点数：" + b);
        System.out.println("读取了双精度浮点数：" + d);
        System.out.println("读取了布尔值：" + e);
        System.out.println("读取了字符串：" + f);
        System.out.println("读取了字符：" + g);
        scan.close();
    }
}