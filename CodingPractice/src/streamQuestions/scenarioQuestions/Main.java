package streamQuestions.scenarioQuestions;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Address address = new Address();

        Student student = new Student(
                "Rahul",
                "STU101",
                new Date(98, 9, 17),
                address
        );

        Date dob = student.getDob();

        System.out.println("Before modification:");
        System.out.println("Student DOB: " + student.getDob());

        dob.setMonth(8);

        System.out.println("After modification:");
        System.out.println("Student DOB: " + student.getDob());
        System.out.println("Local DOB: " + dob);
    }
}