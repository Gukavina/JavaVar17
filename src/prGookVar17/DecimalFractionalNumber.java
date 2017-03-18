package prGookVar17;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;

/**
 * Created by Александра on 25.02.2017.
 */
public class DecimalFractionalNumber {
    int i;
    float f;
    long l;
    public double a;
    public String str, integer, fraction;

    public DecimalFractionalNumber(float f) {
        this.f = f;
        str = "";
        str += f;
        String part = "";
        part += (int) f;
        integer = part;
        if ((f > -1.0) && (f < 0.0))
            fraction = str.substring(integer.length()+2,str.length());
        else fraction = str.substring(integer.length()+ 1,str.length());
        a = Double.parseDouble(str);
        System.out.println(str);
        System.out.println(integer);
        System.out.println(fraction);

    }

    public DecimalFractionalNumber(int i) {
        this.i = i;
        a = (double) i;
        str = "";
        str += a;
        String part = "";
        part += (int) a;
        integer = part;
        if ((a > -1.0) && (a < 0.0))
            fraction = str.substring(integer.length()+2,str.length());
        else fraction = str.substring(integer.length()+ 1,str.length());
    }

    public DecimalFractionalNumber(long l) {
        this.l = l;
        a = i * 1.0;
        str = "";
        str += a;
        String part = "";
        part += (int) a;
        integer = part;
        if ((a > -1.0) && (a < 0.0))
            fraction = str.substring(integer.length()+2,str.length());
        else fraction = str.substring(integer.length()+ 1,str.length());
    }

    public DecimalFractionalNumber(String str) {
        try {
            this.str = str;
            a = Double.parseDouble(str);
            String part = "";
            part += (int) a;
            integer = part;
            if ((a > -1.0) && (a < 0.0))
                fraction = str.substring(integer.length() + 2, str.length());
            else fraction = str.substring(integer.length() + 1, str.length());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа.");
            System.exit(1);
        }
    }

    public DecimalFractionalNumber(double a) {
        this.a = a;
        str = "";
        str += a;
        String part = "";
        part += (int) a;
        integer = part;
        if ((a > -1.0) && (a < 0.0))
            fraction = str.substring(integer.length()+2,str.length());
        else fraction = str.substring(integer.length()+ 1,str.length());

    }

    @Override
    public String toString() {
        return str;
    }

    public String showNumber() {
        return "Десятичное дробное число: " +
                a +
                "; целая часть: " + integer +
                "; дробная часть: " + fraction +
                ". \nКоличество символов целой части - " + integer.length() + ". Количество символов дробной части -  " + fraction.length() ;
    }

    public DecimalFractionalNumber rounding(int quantity) {
        int n = fraction.length();
        String s2;
        if (quantity < n) {
            double number = a;
            number *= Math.pow(10, quantity);
            int i = (int) Math.round(number);
            number = (double) i/Math.pow(10, quantity);
            return new DecimalFractionalNumber(number);
        } else return new DecimalFractionalNumber(a);
    }

    public String calculator(DecimalFractionalNumber number, char sing, int quantity) {
        String indent1 = "";
        String indent2 = "";
        String indent3 = "";
        String underscore = "";
        double result = 0.0;
        String strResult = "";
        String str = "";
        String round = "";
        int n = 0;
        if (sing == '*') {
            result = this.a * number.a;
            strResult += result;
            String integerResult = "";
            integerResult += (int) result;
            int lengthIntegerResult = 0;
            if ((result > -1.0) && (result < 0.0))
                lengthIntegerResult = integerResult.length() + 1;
            else lengthIntegerResult = integerResult.length();
            String fractionResult = "";
            fractionResult += strResult.substring(lengthIntegerResult+1,strResult.length());
            if (fractionResult.length() > this.fraction.length() + number.fraction.length()) {
                String s = Integer.toString(this.fraction.length() + number.fraction.length());
                String s2 = "%.";
                s2 += s + "f";
                str = String.format(s2, Float.parseFloat(strResult));
                fractionResult = str.substring(lengthIntegerResult+ 1,str.length());
            } else str += result;
            n = fractionResult.length();
            if (quantity < n) {
                    String s = Integer.toString(quantity);
                    String s2 = "%.";
                    s2 += s + "f";
                    round = "\nОкруглённое значение: " + String.format(s2, Float.parseFloat(strResult));
            }

            if (this.str.length() > number.str.length()) {
                for (int i = 0; i < this.str.length() - number.str.length(); i++) {
                    indent2 += " ";
                }
            } else {
                for (int i = 0; i < number.str.length() - this.str.length(); i++) {
                    indent1 += " ";
                }
            }
            if (str.length() > number.str.length() + indent2.length()){
                for (int i = 0; i < str.length() - number.str.length() - indent2.length(); i++) {
                    indent1 += " ";
                    indent2 += " ";
                }
            } else
                if (strResult.length() > this.str.length() + indent1.length()) {
                    for (int i = 0; i < strResult.length() - this.str.length() - indent1.length(); i++) {
                        indent1 += " ";
                        indent2 += " ";
                    }
                }
            for (int i = 0; i < str.length(); i++) {
                underscore += "_";
            }
        } else {
            if ((sing == '+') || (sing == '-')) {
                int maxInt = 0;
                if (sing == '+') result = this.a + number.a;
                if (sing == '-') result =this.a - number.a;
                if (number.fraction.length() >= this.fraction.length()){
                    n = number.fraction.length();
                }else {
                    n = this.fraction.length();
                }
                String integerResult = "";
                integerResult += (int) result;
                int lengthIntegerResult = 0;
                if ((result > -1.0) && (result < 0.0))
                    lengthIntegerResult = integerResult.length() + 1;
                else lengthIntegerResult = integerResult.length();
                if (quantity < n) {
                String s = Integer.toString(quantity);
                String s2 = "%.";
                s2 += s + "f";
                str = String.format(s2, result);
                } else{
                String s = Integer.toString(n);
                String s2 = "%.";
                s2 += s + "f";
                str = String.format(s2, result);
                }
                if (this.integer.length() > number.integer.length()) {
                    if (((this.a > -1.0) && (this.a < 0.0)) || ((number.a > -1.0) && (number.a < 0.0)))
                        for (int i = 0; i < this.integer.length() - number.integer.length() - 1; i++)
                        indent2 += " ";
                    else
                        for (int i = 0; i < this.integer.length() - number.integer.length(); i++)
                        indent2 += " ";
                }
                if (this.integer.length() < number.integer.length()){
                    if (((this.a > -1.0) && (this.a < 0.0)) || ((number.a > -1.0) && (number.a < 0.0)))
                        for (int i = 0; i < number.integer.length() - this.integer.length() - 1; i++)
                        indent1 += " ";
                    else
                        for (int i = 0; i < number.integer.length() - this.integer.length(); i++)
                        indent1 += " ";
                }
                if (number.integer.length() > this.integer.length()) {
                    maxInt = number.integer.length() + indent2.length();
                }else {
                    maxInt = this.integer.length() + indent1.length();
                }
                if (lengthIntegerResult > maxInt) {
                    for (int i = 0; i < lengthIntegerResult - maxInt; i++) {
                        indent1 += " ";
                        indent2 += " ";
                    }
                }
                else
                    for (int i = 0; i < maxInt - lengthIntegerResult; i++)
                        indent3 += " ";
                for (int i = 0; i < str.length() + indent3.length(); i++) {
                    underscore += "_";
                }
            } else return "Неверный знак.";
        }
        strResult = indent1 + this.a + "\n" + sing + "\n" + indent2 + number.a + "\n" + underscore + "\n" + indent3 + str + round;
        return strResult;
    }

    public int toInt() {
        return (int) this.a;
    }
    public int toIntIAE() {
        if ((fraction != "0") || (integer.length() > 32)) throw new IllegalArgumentException("Потеря точности");
        return (int) this.a;
    }

    public double toDouble() {
        return this.a;
    }
    public double toDoubleIAE() {
        if (Math.abs(this.a) > 1.7*Math.pow(10,308)) throw new IllegalArgumentException("Потеря точности");
        return this.a;
    }

    public long toLong() {
        return (long) this.a;
    }
    public long toLongIAE() {
        if ((fraction != "0") || (integer.length() > 64)) throw new IllegalArgumentException("Потеря точности");
        return (long) this.a;
    }

    public float toFloat() {
        return (float) this.a;
    }
    public double toFloatIAE() {
        if (Math.abs(this.a) > 3.4*Math.pow(10,32)) throw new IllegalArgumentException("Потеря точности");
        return this.a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecimalFractionalNumber that = (DecimalFractionalNumber) o;

        return Double.compare(that.a, a) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(a);
        return (int) (temp ^ (temp >>> 32));
    }
}