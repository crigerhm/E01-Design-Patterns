package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        // Criando observadores
        Observer observer1 = new ConcreteObserver("Observador 1");
        Observer observer2 = new ConcreteObserver("Observador 2");

        // Registrando observadores
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Mudando o estado do assunto e notificando os observadores
        subject.setMessage("Olá, Observadores!");

        // Removendo um observador
        subject.removeObserver(observer1);

        // Mudando o estado novamente e notificando os observadores restantes
        subject.setMessage("Nova mensagem para os Observadores restantes!");
    }
}
