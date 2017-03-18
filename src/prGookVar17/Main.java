package prGookVar17;

public class Main {

    public static void main(String[] args) {
        DecimalFractionalNumber a = new DecimalFractionalNumber(-45.8);
        DecimalFractionalNumber b = new DecimalFractionalNumber(-6789.374);
        DecimalFractionalNumber c = new DecimalFractionalNumber(125346.54457);
        System.out.println();
        System.out.println(b);
        System.out.println(a.calculator(b, '*',3));
        System.out.println();
        System.out.println(a.calculator(b, '-',100));
        System.out.println();
        System.out.println(a.calculator(b, '+',0));
        System.out.println();
//        System.out.println(a.rounding(9));
//        System.out.println(b.rounding(0));
        System.out.println(a.rounding(3));

    }
}
