public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        // 将x转为字符串
        System.out.println(x + " " + s);
        s += "(summed) = "; // 拼接操作符
        System.out.println(s + (x + y + z));
        // Integer.toString()的简化版：
        System.out.println("" + x);
    }
}