import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Give me a year and I'll let you know if it's a leap year");
    int userInput = Integer.parseInt(myConsole.readLine());
    LeapYear year = new LeapYear();
    System.out.println(year.isLeapYear(userInput));
  }
}
