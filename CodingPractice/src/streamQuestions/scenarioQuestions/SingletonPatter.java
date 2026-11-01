package streamQuestions.scenarioQuestions;

public class SingletonPatter {
    private static SingletonPatter instance;

    private SingletonPatter() {

    }

    public static SingletonPatter getInstance(SingletonPatter singletonPatter) {
        if (instance == null) {
            synchronized (SingletonPatter.class) {
                if (instance == null) {
                    instance = new SingletonPatter();
                }
            }
        }
        return instance;
    }
}
