package streamQuestions;

import java.time.LocalDate;

public class PMain {
    public static void main(String[] args) {
        Person driver = new Driver(
                "Rahul",
                40,
                LocalDate.of(1995, 5, 10)
        );

        Person manager = new Manager(
                "Amit",
                42,
                LocalDate.of(1988, 8, 15)
        );
      manager.doWork();
      driver.doWork();
    }
}
