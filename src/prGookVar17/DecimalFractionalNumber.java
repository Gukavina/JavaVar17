package prGookVar17;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by Александра on 25.02.2017.
 */
public class DecimalFractionalNumber {
    int i;
    float f;
    long l;
    double d;
    char sing;
    String fraction, integer;
    String str;
    String[] number;
    ArrayList<Integer> numberInteger, numberFraction;

    public DecimalFractionalNumber(String str) {
        this.str = str;
        fraction = "0";
        integer = "0";
        numberFraction = new ArrayList<>();
        numberInteger = new ArrayList<>();
        number = str.split("(?<=\\G.{1})");
        String[] IntFraction = str.split("\\.");
        if (IntFraction.length == 1) {
            integer = IntFraction[0];
            try {
                int flag = Integer.parseInt(integer);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат числа");
            }
        } else {
            if (IntFraction.length != 2) throw new NumberFormatException("Неверный формат числа");
            else {
                fraction = IntFraction[1];
                integer = IntFraction[0];
                try {
                    int flag = Integer.parseInt(integer);
                    flag = Integer.parseInt(fraction);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Неверный формат числа");
                }
            }
        }
        if (number[0].equals("-")) {
            sing = '-';
            number[0] = ".";
        } else sing = '+';
        int flag = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i].equals(".")) {
                if (i != 0)
                    flag = 1;
            } else {
                if (flag == 0)
                    numberInteger.add(Integer.parseInt(number[i]));
                else numberFraction.add(Integer.parseInt(number[i]));
            }
        }
    }

    public DecimalFractionalNumber(int i) {
        this.i = i;
        fraction = "0";
        integer = "0";
        str = "";
        str += i;
        numberFraction = new ArrayList<>();
        numberInteger = new ArrayList<>();
        number = str.split("(?<=\\G.{1})");
        String[] IntFraction = str.split("\\.");
        if (IntFraction.length == 1) {
            integer = IntFraction[0];
            try {
                int flag = Integer.parseInt(integer);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат числа");
            }
        } else {
            if (IntFraction.length != 2) throw new NumberFormatException("Неверный формат числа");
            else {
                fraction = IntFraction[1];
                integer = IntFraction[0];
                try {
                    int flag = Integer.parseInt(integer);
                    flag = Integer.parseInt(fraction);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Неверный формат числа");
                }
            }
        }
        if (number[0].equals("-")) {
            sing = '-';
            number[0] = ".";
        } else sing = '+';
        int flag = 0;
        for (int k = 0; k < number.length; k++) {
            if (number[k].equals(".")) {
                if (k != 0)
                    flag = 1;
            } else {
                if (flag == 0)
                    numberInteger.add(Integer.parseInt(number[k]));
                else numberFraction.add(Integer.parseInt(number[k]));
            }
        }

    }

    public DecimalFractionalNumber(long l) {
        this.l = l;
        fraction = "0";
        integer = "0";
        str = "";
        str += l;
        numberFraction = new ArrayList<>();
        numberInteger = new ArrayList<>();
        number = str.split("(?<=\\G.{1})");
        String[] IntFraction = str.split("\\.");
        if (IntFraction.length == 1) {
            integer = IntFraction[0];
            try {
                int flag = Integer.parseInt(integer);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат числа");
            }
        } else {
            if (IntFraction.length != 2) throw new NumberFormatException("Неверный формат числа");
            else {
                fraction = IntFraction[1];
                integer = IntFraction[0];
                try {
                    int flag = Integer.parseInt(integer);
                    flag = Integer.parseInt(fraction);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Неверный формат числа");
                }
            }
        }
        if (number[0].equals("-")) {
            sing = '-';
            number[0] = ".";
        } else sing = '+';
        int flag = 0;
        for (int k = 0; k < number.length; k++) {
            if (number[k].equals(".")) {
                if (k != 0)
                    flag = 1;
            } else {
                if (flag == 0)
                    numberInteger.add(Integer.parseInt(number[k]));
                else numberFraction.add(Integer.parseInt(number[k]));
            }
        }
    }

    public DecimalFractionalNumber(double d) {
        this.d = d;
        fraction = "0";
        integer = "0";
        str = "";
        str += d;
        numberFraction = new ArrayList<>();
        numberInteger = new ArrayList<>();
        number = str.split("(?<=\\G.{1})");
        String[] IntFraction = str.split("\\.");

        if (IntFraction.length == 1) {
            integer = IntFraction[0];
            try {
                int flag = Integer.parseInt(integer);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат числа");
            }
        } else {
            if (IntFraction.length != 2) throw new NumberFormatException("Неверный формат числа");
            else {
                fraction = IntFraction[1];
                integer = IntFraction[0];
                try {
                    int flag = Integer.parseInt(integer);
                    flag = Integer.parseInt(fraction);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Неверный формат числа");
                }
            }
        }
        if (number[0].equals("-")) {
            sing = '-';
            number[0] = ".";
        } else sing = '+';
        int flag = 0;
        for (int k = 0; k < number.length; k++) {
            if (number[k].equals(".")) {
                if (k != 0)
                    flag = 1;
            } else {
                if (flag == 0)
                    numberInteger.add(Integer.parseInt(number[k]));
                else numberFraction.add(Integer.parseInt(number[k]));
            }
        }
    }

    public DecimalFractionalNumber(float f) {
        this.f = f;
        fraction = "0";
        integer = "0";
        str = "";
        str += f;
        numberFraction = new ArrayList<>();
        numberInteger = new ArrayList<>();
        number = str.split("(?<=\\G.{1})");
        String[] IntFraction = str.split("\\.");
        if (IntFraction.length == 1) {
            integer = IntFraction[0];
            try {
                int flag = Integer.parseInt(integer);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат числа");
            }
        } else {
            if (IntFraction.length != 2) throw new NumberFormatException("Неверный формат числа");
            else {
                fraction = IntFraction[1];
                integer = IntFraction[0];
                try {
                    int flag = Integer.parseInt(integer);
                    flag = Integer.parseInt(fraction);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Неверный формат числа");
                }
            }
        }
        if (number[0].equals("-")) {
            sing = '-';
            number[0] = ".";
        } else sing = '+';
        int flag = 0;
        for (int k = 0; k < number.length; k++) {
            if (number[k].equals(".")) {
                if (k != 0)
                    flag = 1;
            } else {
                if (flag == 0)
                    numberInteger.add(Integer.parseInt(number[k]));
                else numberFraction.add(Integer.parseInt(number[k]));
            }
        }
    }

    public String showNumber() {
        return "Десятичное дробное число: " +
                str +
                "; целая часть: " + integer +
                "; дробная часть: " + fraction +
                ". \nКоличество символов целой части - " + integer.length() + ". Количество символов дробной части -  " + fraction.length();
    }

    public int toInt() {
        return Integer.parseInt(str);
    }

    public int toIntIAE() {
        if ((fraction != "0") || (integer.length() > 32)) throw new IllegalArgumentException("Потеря точности");
        return Integer.parseInt(str);
    }

    public long toLong() {
        return Long.parseLong(str);
    }

    public long toLongIAE() {
        if ((fraction != "0") || (integer.length() > 64)) throw new IllegalArgumentException("Потеря точности");
        return Long.parseLong(str);
    }

    public float toFloat() {
        return Float.parseFloat(str);
    }

    public double toFloatIAE() {
        if (Math.abs(Double.parseDouble(str)) > 3.4 * Math.pow(10, 32))
            throw new IllegalArgumentException("Потеря точности");
        return Float.parseFloat(str);
    }

    public double toDouble() {
        return Double.parseDouble(str);
    }

    public double toDoubleIAE() {
        if (Math.abs(Double.parseDouble(str)) > 1.7 * Math.pow(10, 308))
            throw new IllegalArgumentException("Потеря точности");
        return Double.parseDouble(str);
    }


    @Override
    public String toString() {
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecimalFractionalNumber that = (DecimalFractionalNumber) o;

        if (sing != that.sing) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(number, that.number)) return false;
        if (numberInteger != null ? !numberInteger.equals(that.numberInteger) : that.numberInteger != null)
            return false;
        return numberFraction != null ? numberFraction.equals(that.numberFraction) : that.numberFraction == null;
    }

    @Override
    public int hashCode() {
        int result = (int) sing;
        result = 31 * result + Arrays.hashCode(number);
        result = 31 * result + (numberInteger != null ? numberInteger.hashCode() : 0);
        result = 31 * result + (numberFraction != null ? numberFraction.hashCode() : 0);
        return result;
    }

    public DecimalFractionalNumber rounding(int quantity) {
        int temp = 0;
        String strResult = "";
        if (quantity >= numberFraction.size())
            strResult = this.str;
        else {
            if (quantity != 0) {
                if (this.sing == '-') {
                    number[0] = "0";
                }
                for (int k = number.length - 1; k >= integer.length() + quantity; k--) {
                    number[k] = Integer.toString(Integer.parseInt(number[k]) + temp);
                    temp = 0;
                    if (Integer.parseInt(number[k]) >= 5) temp = 1;
                }
                int n = quantity;
                while (number[integer.length() + n].equals("10") && integer.length() + n != 0) {
                    number[integer.length() + n] = "0";
                    if (number[integer.length() + n - 1].equals(".")) {
                        number[integer.length() + n - 2]
                                = Integer.toString(Integer.parseInt(number[integer.length() + n - 2]) + 1);
                        n -= 2;
                    } else {
                        number[integer.length() + n - 1]
                                = Integer.toString(Integer.parseInt(number[integer.length() + n - 1]) + 1);
                        n -= 1;
                    }
                }
                if (sing == '-') {
                    if (number[0] == "0") number[0] = "-";
                    else {
                        strResult += "-";
                    }
                }
                for (int k = 0; k <= integer.length() + quantity; k++) {
                    strResult += number[k];
                }
            } else {
                DecimalFractionalNumber n = this.rounding(1);
                if (Integer.parseInt(n.number[n.number.length - 1]) > 4)
                    temp = 1;
                n.number[n.number.length - 1] = "";
                n.number[n.number.length - 2] = "";
                n.number[n.number.length - 3] = Integer.toString(Integer.parseInt(n.number[n.number.length - 3]) + temp);
                if (n.sing == '-') {
                    n.number[0] = "0";
                }
                int t = n.integer.length() - 1;
                while (n.number[t].equals("10") && t != 0) {
                    n.number[t] = "0";
                    n.number[t - 1]
                            = Integer.toString(Integer.parseInt(n.number[t - 1]) + 1);
                    t -= 1;
                }
                if (sing == '-') {
                    if (n.number[0].equals("0")) {
                        n.number[0] = "-";
                    } else {
                        strResult += "-";
                    }
                }
                for (int k = 0; k < n.number.length - 2; k++) {
                    strResult += n.number[k];
                }
            }
        }
        return new DecimalFractionalNumber(strResult);
    }

    public Integer comparison(DecimalFractionalNumber number) {
        int temp = 0;
        if (sing == number.sing) {
            if (numberInteger.equals(number.numberInteger)) {
                if (numberFraction.equals(number.numberFraction)) {
                    temp = 0;
                } else {
                    if (numberFraction.size() > number.numberFraction.size()) {
                        for (int i = 0; i < numberFraction.size() - number.numberFraction.size(); i++)
                            number.numberFraction.add(0);
                    } else {
                        for (int i = 0; i < number.numberFraction.size() - numberFraction.size(); i++)
                            numberFraction.add(0);
                    }
                    for (int i = 0; i < number.numberFraction.size(); i++) {
                        if (numberFraction.get(i) > number.numberFraction.get(i)) {
                            temp = 1;
                            break;
                        } else {
                            temp = -1;
                            break;
                        }
                    }
                }
            } else {
                if (numberInteger.size() > number.numberInteger.size()) temp = 1;
                if (numberInteger.size() < number.numberInteger.size()) temp = -1;
                if (numberInteger.size() == number.numberInteger.size()) {
                    for (int i = numberInteger.size() - 1; i >= 0; i--) {
                        if (numberInteger.get(i) > number.numberInteger.get(i)) {
                            temp = 1;
                            break;
                        }
                    }
                    if (temp != 1) temp = -1;
                }
            }
        } else {
            if (sing == '-') temp = -1;
            else temp = 1;
        }
        return temp;
    }

    public DecimalFractionalNumber addition(DecimalFractionalNumber number) {
        String strResult = "";
        ArrayList<Integer> intResult = new ArrayList<>();
        ArrayList<Integer> fractionResult = new ArrayList<>();
        int temp = 0;
        if (this.sing == number.sing) {
            if (this.numberFraction.size() > number.numberFraction.size()) {
                fractionResult = this.numberFraction;
                for (int k = number.numberFraction.size() - 1; k >= 0; k--) {
                    temp += number.numberFraction.get(k) + fractionResult.get(k);
                    fractionResult.set(k, temp % 10);
                    temp = temp / 10;
                }

            } else {
                fractionResult = number.numberFraction;
                for (int k = this.numberFraction.size() - 1; k >= 0; k--) {
                    temp += this.numberFraction.get(k) + fractionResult.get(k);
                    fractionResult.set(k, temp % 10);
                    temp = temp / 10;
                }
            }
            if (this.numberInteger.size() > number.numberInteger.size()) {
                if (sing == '-') strResult += "-";
                intResult = this.numberInteger;
                int i = this.numberInteger.size() - 1;
                for (int k = number.numberInteger.size() - 1; k >= 0; k--) {
                    temp += intResult.get(i) + number.numberInteger.get(k);
                    intResult.set(i, temp % 10);
                    temp = temp / 10;
                    i--;
                }
                if (temp != 0) {
                    intResult.set(i, intResult.get(i) + temp);
                }
            } else {
                if (sing == '-') strResult += "-";
                intResult = number.numberInteger;
                int i = number.numberInteger.size() - 1;
                for (int k = this.numberInteger.size() - 1; k >= 0; k--) {
                    temp += intResult.get(i) + this.numberInteger.get(k);
                    intResult.set(i, temp % 10);
                    temp = temp / 10;
                    i--;
                }
                if (temp != 0) {
                    if (i == -1) {
                        intResult.add(0, 1);
                    } else intResult.set(i, intResult.get(i) + temp);
                }
            }
        } else {
            if (this.sing == '-') {
                String newString = this.str.substring(1);
                return number.subtraction(new DecimalFractionalNumber(newString));
            } else {
                String newString = number.str.substring(1);
                return this.subtraction(new DecimalFractionalNumber(newString));
            }
        }
        for (int k = 0; k < intResult.size(); k++)
            strResult += intResult.get(k);
        if (fractionResult.size() > 0) strResult += ".";
        for (int k = 0; k < fractionResult.size(); k++)
            strResult += fractionResult.get(k);
        return new DecimalFractionalNumber(strResult);
    }

    public DecimalFractionalNumber subtraction(DecimalFractionalNumber number) {
        String singResult = "";
        String strResult = "";
        ArrayList<Integer> intResult = new ArrayList<>();
        ArrayList<Integer> fractionResult = new ArrayList<>();
        int temp = 0;
        if (number.comparison(this) == 0) return new DecimalFractionalNumber(0);
        else {
            if (this.comparison(number) == -1)
                if (sing != '-') singResult = "-";
        }
        if (this.sing == number.sing) {
            if (numberFraction.size() > number.numberFraction.size()) {
                for (int i = 0; i < numberFraction.size() - number.numberFraction.size(); i++)
                    number.numberFraction.add(0);
            }
            if (numberFraction.size() < number.numberFraction.size()) {
                int k = number.numberFraction.size() - numberFraction.size();
                for (int i = 0; i < k; i++)
                    numberFraction.add(0);
            }

            String str1 = "0.";
            String str2 = "0.";
            if (numberFraction.size() == 0) str1 += 0;
            else {
                for (int i = 0; i < numberFraction.size(); i++)
                    str1 += numberFraction.get(i);
            }
            if (number.numberFraction.size() == 0) str2 += 0;
            else {
                for (int i = 0; i < number.numberFraction.size(); i++)
                    str2 += number.numberFraction.get(i);
            }

            if ((new DecimalFractionalNumber(str1).comparison(new DecimalFractionalNumber(str2)) == 1)) {
                if (numberFraction.size() > number.numberFraction.size()) {
                    for (int i = 0; i < numberFraction.size() - number.numberFraction.size(); i++)
                        number.numberFraction.add(0);
                } else {
                    for (int i = 0; i < number.numberFraction.size() - numberFraction.size(); i++)
                        numberFraction.add(0);
                }
                for (int i = numberFraction.size() - 1; i >= 0; i--) {
                    if (numberFraction.get(i) >= number.numberFraction.get(i))
                        fractionResult.add(0, numberFraction.get(i) - number.numberFraction.get(i));
                    else {
                        numberFraction.set(i - 1, numberFraction.get(i - 1) - 1);
                        fractionResult.add(0, 10 + numberFraction.get(i) - number.numberFraction.get(i));
                    }
                }
            }


            if ((new DecimalFractionalNumber(str1).comparison(new DecimalFractionalNumber(str2)) == -1) || numberInteger.equals(number.numberInteger)) {
                if (this.comparison(number) == -1) {
                    for (int i = numberFraction.size() - 1; i >= 0; i--) {
                        if (number.numberFraction.get(i) >= numberFraction.get(i))
                            fractionResult.add(0, number.numberFraction.get(i) - numberFraction.get(i));
                        else {
                            number.numberFraction.set(i - 1, number.numberFraction.get(i - 1) - 1);
                            fractionResult.add(0, 10 + number.numberFraction.get(i) - numberFraction.get(i));
                        }
                    }
                }
                if (this.comparison(number) == 1) {
                    for (int i = numberFraction.size() - 1; i > 0; i--) {
                        if (numberFraction.get(i) >= number.numberFraction.get(i))
                            fractionResult.add(0, numberFraction.get(i) - number.numberFraction.get(i));
                        else {
                            numberFraction.set(i - 1, numberFraction.get(i - 1) - 1);
                            fractionResult.add(0, 10 - (number.numberFraction.get(i) - numberFraction.get(i)));
                        }
                    }

                    if (numberFraction.get(0) >= number.numberFraction.get(0))
                        fractionResult.add(0, numberFraction.get(0) - number.numberFraction.get(0));
                    else {
                        fractionResult.add(0, 10 - (number.numberFraction.get(0) - numberFraction.get(0)));
                        numberInteger.set(numberInteger.size() - 1, numberInteger.get(numberInteger.size() - 1) - 1);
                    }

                }
            }

            if (numberInteger.equals(number.numberInteger)) {
                intResult.add(0);
            } else {
                if (this.numberInteger.size() >= number.numberInteger.size()) {
                    if (this.numberInteger.size() > number.numberInteger.size()) {
                        intResult = this.numberInteger;
                        int i = this.numberInteger.size() - 1;
                        for (int k = number.numberInteger.size() - 1; k >= 0; k--) {
                            temp = intResult.get(i) - number.numberInteger.get(k);
                            if (temp < 0) {
                                intResult.set(i, -number.numberInteger.get(k) + intResult.get(i) + 10);
                                intResult.set(i - 1, intResult.get(i - 1) - 1);
                            } else intResult.set(i, temp);
                            i--;
                        }
                    } else {
                        intResult = this.numberInteger;
                        int i = this.numberInteger.size() - 1;
                        for (int k = number.numberInteger.size() - 1; k >= 0; k--) {
                            if (number.numberInteger.get(k) > intResult.get(i)) {
                                temp = number.numberInteger.get(k) - intResult.get(i);
                            } else {
                                temp = intResult.get(i) - number.numberInteger.get(k);
                            }
                            intResult.set(i, temp);
                            i--;
                        }
                    }
                } else {
                    intResult = number.numberInteger;
                    int i = number.numberInteger.size() - 1;
                    for (int k = this.numberInteger.size() - 1; k >= 0; k--) {
                        temp = intResult.get(i) - this.numberInteger.get(k);
                        if (temp < 0) {
                            intResult.set(i, intResult.get(i) - this.numberInteger.get(k) + 10);
                            intResult.set(i - 1, intResult.get(i - 1) - 1);
                        } else intResult.set(i, temp);
                        i--;
                    }
                }
            }
            if (intResult.size() > 1 && intResult.get(0) == 0) intResult.remove(0);
        } else {
            if (this.sing == '-') {
                String newString = "-" + number.str;
                return this.addition(new DecimalFractionalNumber(newString));
            } else {
                String newString = number.str.substring(1);
                return this.addition(new DecimalFractionalNumber(newString));
            }
        }
        strResult += singResult;
        for (int k = 0; k < intResult.size(); k++)
            strResult += intResult.get(k);
        if (fractionResult.size() > 0) strResult += ".";
        for (int k = 0; k < fractionResult.size(); k++)
            strResult += fractionResult.get(k);
        return new DecimalFractionalNumber(strResult);
    }

    public DecimalFractionalNumber multiplication(DecimalFractionalNumber number){
        String strResult = "";
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> tempResult = new ArrayList<>();
        int temp = 0;
        ArrayList<Integer> number1 = numberInteger;
        for (int i = 0; i < numberFraction.size(); i++)
            number1.add(numberFraction.get(i));
        ArrayList<Integer> number2 = number.numberInteger;
        for (int i = 0; i < number.numberFraction.size(); i++)
            number2.add(number.numberFraction.get(i));
        int k = 0;
        for (int i = number1.size() - 1; i >= 0; i--) {
            temp = number1.get(i)*number2.get(number2.size() - 1) + temp;
            k = temp % 10;
            result.add(0, k);
            temp /= 10;
        }
        if (temp != 0) result.add(0, temp);

        int zero = 1;
        int sumIndex = 0;
        for (int n = number2.size() - 2; n >= 0; n--) {
            temp = 0;
            for (int i = number1.size() - 1; i >= 0; i--) {
                temp = number1.get(i)*number2.get(n) + temp;
                k = temp % 10;
                tempResult.add(0, k);
                temp /= 10;
            }
            if (temp != 0) tempResult.add(0, temp);
            for(int z = 0; z < zero; z++) {
                tempResult.add(0);
            }
            temp = 0;
            sumIndex = result.size() - 1;
            for (int s = tempResult.size() - 1; s >= 0; s--) {
                if (sumIndex >= 0) {
                    temp = tempResult.get(s) + result.get(sumIndex) + temp;
                    k = temp % 10;
                    tempResult.set(s, k);
                    temp /= 10;
                    sumIndex--;
                } else {
                    if (temp != 0) {
                        tempResult.set(s, tempResult.get(s) + temp);
                        temp = 0;
                    }
                }
            }
            if (temp != 0) tempResult.add(0, temp);
            result = tempResult;
            zero++;
            tempResult = new ArrayList<>();
        }

        temp = numberFraction.size() + number.numberFraction.size();
        if(result.get(0) == 0 && result.size() - temp > 1) result.remove(0);
        if (temp == 0) {
            for (int i = 0; i < result.size(); i++)
                strResult += result.get(i);
        } else {
            for (int i = result.size() - 1; i >= 0; i--) {
                strResult = result.get(i) + strResult;
                if (temp == 1) strResult = "." + strResult;
                temp--;
            }
        }
        if ((sing != '-' && number.sing == '-') || (sing == '-' && number.sing != '-')) strResult = "-" + strResult;

        return new DecimalFractionalNumber(strResult);
    }
}
