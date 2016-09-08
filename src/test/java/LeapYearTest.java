import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_isDivisibleBy400_true() {
    LeapYear testInput = new LeapYear();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testInput.isLeapYear(2000));
  }

  @Test
  public void isLeapYear_isDivisibleBy100_false() {
    LeapYear testInput = new LeapYear();
    boolean expectedOutput = false;
    assertEquals(expectedOutput, testInput.isLeapYear(1900));
  }

  @Test
  public void isLeapYear_isDivisibleBy4_true() {
    LeapYear testInput = new LeapYear();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testInput.isLeapYear(2004));
  }
}
