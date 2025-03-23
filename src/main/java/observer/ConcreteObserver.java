package observer;

public class ConcreteObserver implements Observer {
    private String observerName;
    private String message;

    public ConcreteObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(observerName + " recebeu a mensagem: " + message);
    }
}
