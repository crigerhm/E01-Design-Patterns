package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject sensorTemp = new ConcreteSubject();

        sensorTemp.addObserver(new TermometroCelsius());
        sensorTemp.addObserver(new TermometroFahrenheit());

        sensorTemp.setTemperature("32");
        System.out.println("=======================");
        sensorTemp.setTemperature("45");
        System.out.println("=======================");
        sensorTemp.setTemperature("100");
    }
}
