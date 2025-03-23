package strategy;

public class PasswordValidator {
    private PasswordStrategy strategy;

    // Define a estratégia de validação
    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    // Valida a senha utilizando a estratégia definida
    public boolean validate(String password) {
        return strategy.validatePassword(password);
    }
}
