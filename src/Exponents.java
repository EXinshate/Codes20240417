public class Exponents {
    public static void main(String[] args) {
        // e大小写都可以，含义相同：
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // d是可选的
        double expDouble2 = 47e47; // 默认就是double类型的
        System.out.println(expDouble);
    }
}