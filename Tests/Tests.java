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
        assertEquals(" 55.6\n+\n 55.6\n_____\n111,2",
                new DecimalFractionalNumber(55.6).calculator(new DecimalFractionalNumber(55.6), '+', 6));
        assertEquals(" 1.25\n+\n45.88\n_____\n47,13",
                new DecimalFractionalNumber(1.25).calculator(new DecimalFractionalNumber(45.88), '+', 6));
        assertEquals("-0.25\n+\n15.0\n__\n15",
                new DecimalFractionalNumber(-0.25).calculator(new DecimalFractionalNumber(15), '+', 0));
        assertEquals(" 345.88\n-\n1067.986\n________\n-722,106",
                new DecimalFractionalNumber(345.88).calculator(new DecimalFractionalNumber(1067.986), '-', 8));
        assertEquals(" -15.7\n-\n-367.89\n_______\n 352,19",
                new DecimalFractionalNumber("-15.7").calculator(new DecimalFractionalNumber("-367.89"), '-', 8));
        assertEquals("  1.25\n-\n 45.88\n______\n-44,63",
                new DecimalFractionalNumber(1.25).calculator(new DecimalFractionalNumber(45.88), '-', 8));
        assertEquals("  55.6\n*\n 115.0\n______\n6394.0",
                new DecimalFractionalNumber(55.6).calculator(new DecimalFractionalNumber(115), '*', 5));
        assertEquals("432.0\n*\n  0.3\n_____\n129.6\nОкруглённое значение: 130",
                new DecimalFractionalNumber(432).calculator(new DecimalFractionalNumber(0.3), '*', 0));
        assertEquals("0.0\n*\n0.0\n___\n0.0",
                new DecimalFractionalNumber(0).calculator(new DecimalFractionalNumber(0), '*', 20));
        assertEquals(" -6789.374\n*\n     -45.8\n___________\n310953.3292\nОкруглённое значение: 310953,344",
                new DecimalFractionalNumber(-6789.374).calculator(new DecimalFractionalNumber(-45.8), '*', 3));
        assertEquals(new DecimalFractionalNumber(1.25),
                new DecimalFractionalNumber(1.24768394).rounding(2));
        assertEquals(new DecimalFractionalNumber(156),
                new DecimalFractionalNumber(156.21768394).rounding(0));
        assertEquals(new DecimalFractionalNumber(136),
                new DecimalFractionalNumber(136).rounding(15));
        assertEquals(new DecimalFractionalNumber(0),
                new DecimalFractionalNumber(0.1147890).rounding(0));
        assertEquals(new DecimalFractionalNumber(1),
                new DecimalFractionalNumber(0.58422).rounding(0));
        assertEquals(new DecimalFractionalNumber(0.67),
                new DecimalFractionalNumber(0.6712345).rounding(2));
        assertEquals(new DecimalFractionalNumber(125346.545),
                new DecimalFractionalNumber(125346.54457).rounding(3));
    }
}
