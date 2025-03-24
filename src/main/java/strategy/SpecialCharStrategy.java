package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        return password.matches(".*[!@#$%^&*(),.?\":{}|<>].*"); 
    }
}
