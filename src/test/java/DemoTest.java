import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test
    public void triangle_test_1() {
        boolean result = Demo.isTriangle(3, 4, 5);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_2() {
        boolean result = Demo.isTriangle(10, 15, 20);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_3() {
        boolean result = Demo.isTriangle(32, 94, 101);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_4() {
        boolean result = Demo.isTriangle(420, 940, 1019);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_5() {
        boolean result = Demo.isTriangle(-1, -2, -3);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_6() {
        boolean result = Demo.isTriangle(0, 20, 309);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_7() {
        boolean result = Demo.isTriangle(1, 2, 3);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_8() {
        boolean result = Demo.isTriangle(-1, 2, 3);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_9() {
        boolean result = Demo.isTriangle(10, 2, 0);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_10() {
        boolean result = Demo.isTriangle(17, 21, 34);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_11() {
        boolean result = Demo.isTriangle(15, 25, -73);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_12() {
        boolean result = Demo.isTriangle(55, 0, -93);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_13() {
        boolean result = Demo.isTriangle(12, 4, 6);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_14() {
        boolean result = Demo.isTriangle(7, 8, 15);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_15() {
        boolean result = Demo.isTriangle(18, 8, 5);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_16() {
        boolean result = Demo.isTriangle(21, 22, 53);
        assert
       // assertEquals(result, false);
    }

    @Test
    public void triangle_test_17() {
        boolean result = Demo.isTriangle(20, 1, 16);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_18() {
        boolean result = Demo.isTriangle(23,18 , 3);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_19() {
        boolean result = Demo.isTriangle(60, 54, 6);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_20() {
        boolean result = Demo.isTriangle(50, 62, 2);
        assertEquals(result, false);
    }

    @Test
    public void triangle_test_21() {
        boolean result = Demo.isTriangle(23.5, 11.4, 12.9);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_22() {
        boolean result = Demo.isTriangle(100092432, 78787878, 87887887);
        assertEquals(result, true);
    }

    @Test
    public void triangle_test_23() {
        boolean result = Demo.isTriangle(0, 0, 0);
        assertEquals(result, false);
    }






    @Test
    public void main_test_1() {
        String input = "3\n4\n5\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_2() {
        String input = "10\n15\n20\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_3() {
        String input = "420\n940\n1019\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_4() {
        String input = "-1\n-2\n-3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_5() {
        String input = "32\n94\n101\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_6() {
        String input = "0\n20\n309\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_7() {
        String input = "1\n2\n3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_8() {
        String input = "-1\n2\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_9() {
        String input = "10\n2\n0\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_10() {
        String input = "17\n21\n34\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_11() {
        String input = "15\n25\n-73\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_12() {
        String input = "55\n0\n-93\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_13() {
        String input = "0\n0\n0\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_14() {
        String input = "23\n11\n12\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_15() {
        String input = "60\n54\n6\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_16() {
        String input = "18\n5\n-8\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }

    @Test
    public void main_test_17() {
        String input = "17584578\n5\n579847598\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput = consoleOutput + "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }





}
