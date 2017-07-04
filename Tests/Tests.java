/**
 * Created by Александра on 02.03.2017.
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import prGookVar17.DecimalFractionalNumber;


public class Tests {
    @Test
    @Tag("Десятичное дробное")
    void test() {
        assertEquals(new DecimalFractionalNumber("1.25"),
                new DecimalFractionalNumber("1.24768394").rounding(2));
        assertEquals(new DecimalFractionalNumber("156"),
                new DecimalFractionalNumber(156.21768394).rounding(0));
        assertEquals(new DecimalFractionalNumber("136"),
                new DecimalFractionalNumber(136).rounding(15));
        assertEquals(new DecimalFractionalNumber("0"),
                new DecimalFractionalNumber(0.1147890).rounding(0));
        assertEquals(new DecimalFractionalNumber("1"),
                new DecimalFractionalNumber(0.58422).rounding(0));
        assertEquals(new DecimalFractionalNumber("0.67"),
                new DecimalFractionalNumber(0.6712345).rounding(2));
        assertEquals(new DecimalFractionalNumber("125346.545"),
                new DecimalFractionalNumber(125346.54457).rounding(3));
        assertEquals(new DecimalFractionalNumber("111.2"),
                new DecimalFractionalNumber("55.6").addition(new DecimalFractionalNumber("55.6")));
        assertEquals(new DecimalFractionalNumber("47.13"),
                new DecimalFractionalNumber(1.25).addition(new DecimalFractionalNumber(45.88)));
        assertEquals(new DecimalFractionalNumber("14.75"),
               new DecimalFractionalNumber(-0.25).addition(new DecimalFractionalNumber(15)));
        assertEquals(new DecimalFractionalNumber("-722.1094736"),
                new DecimalFractionalNumber(345.88).subtraction(new DecimalFractionalNumber("1067.9894736")));
        assertEquals(new DecimalFractionalNumber("352.19"),
                new DecimalFractionalNumber(-15.7).subtraction(new DecimalFractionalNumber(-367.89)));
        assertEquals(new DecimalFractionalNumber("-44.63"),
                new DecimalFractionalNumber(1.25).subtraction(new DecimalFractionalNumber(45.88)));
        assertEquals(new DecimalFractionalNumber("64285998.8"),
                new DecimalFractionalNumber(55.6).multiplication(new DecimalFractionalNumber("1156223")));
        assertEquals(new DecimalFractionalNumber("129.6"),
                new DecimalFractionalNumber(432).multiplication(new DecimalFractionalNumber(0.3)));
        assertEquals(new DecimalFractionalNumber("0"),
                new DecimalFractionalNumber(0).multiplication(new DecimalFractionalNumber(0)));
        assertEquals(new DecimalFractionalNumber("310953.3292"),
                new DecimalFractionalNumber(-6789.374).multiplication(new DecimalFractionalNumber(-45.8)));
    }

}
