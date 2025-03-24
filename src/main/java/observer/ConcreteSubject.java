package observer;

public class ConcreteSubject extends Subject {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        notifyObservers();  // Notifica os observadores
    }
}
