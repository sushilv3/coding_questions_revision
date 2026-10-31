package streamQuestions;

import java.time.LocalDate;
import java.util.Date;

public class Manager extends Person{
    public Manager(String name, Integer age, LocalDate dob){
        super(name,age,dob);
    }
    @Override
    public void doWork() {
        System.out.println(getName()+" is manages team");
    }
}
