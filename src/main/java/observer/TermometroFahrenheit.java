package observer;

public class TermometroFahrenheit implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            String temp = ((ConcreteSubject) subject).getTemperature();
            System.out.println("Temperatura em Fahrenheit: " + temp);
        }
    }
}
