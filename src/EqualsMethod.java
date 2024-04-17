class ValA {
    int i;
}

class ValB {
    int i;
    // 对这个示例是适用的，但这里并不是一个完整的equals()方法
    public boolean equals(Object o) {
        ValB rval = (ValB)o;  // 将对象o转型为ValB
        return i == rval.i;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));
        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2));
    }
}