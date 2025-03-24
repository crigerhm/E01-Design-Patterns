package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    // Adiciona um observer à lista
    public void add(Observer observer) {
        observers.add(observer);
    }

    // Remove um observer da lista
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observers registrados
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this); // Notifica todos os observers
        }
    }
}
