package streamQuestions.scenarioQuestions;

import java.io.Serializable;
import java.util.Date;


public final class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final String studentId;
    private final Date dob;
    private final Address address;

    public Student(String name, String studentId, Date dob, Address address) {
        this.name = name;
        this.studentId = studentId;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public Date getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }
}