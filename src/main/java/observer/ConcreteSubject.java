package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Método que modifica o estado e notifica os observadores
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    // Para obter o estado atual
    public String getMessage() {
        return message;
    }
}
