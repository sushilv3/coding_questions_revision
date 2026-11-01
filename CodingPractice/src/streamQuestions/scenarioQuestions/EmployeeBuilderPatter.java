package streamQuestions.scenarioQuestions;

public class EmployeeBuilderPatter {
    private final int id;
    private final String name;
    private final int age;

    public EmployeeBuilderPatter( int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public static class Builder {
        private int id;
        private String name;
        private int age;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilderPatter build() {
            return new EmployeeBuilderPatter(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
