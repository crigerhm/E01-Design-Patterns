package observer;

public class TermometroCelsius implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            String temp = ((ConcreteSubject) subject).getTemperature();
            System.out.println("Temperatura em Celsius: " + temp);
        }
    }
}
