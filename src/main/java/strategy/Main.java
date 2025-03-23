package strategy;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        // Estratégia de validação: comprimento mínimo de 8 caracteres
        PasswordStrategy lengthStrategy = new PasswordStrategy() {
            @Override
            public boolean validatePassword(String password) {
                return password.length() >= 8;
            }
        };

        // Estratégia de validação: pelo menos uma letra maiúscula
        PasswordStrategy upperCaseStrategy = new PasswordStrategy() {
            @Override
            public boolean validatePassword(String password) {
                return password.chars().anyMatch(Character::isUpperCase);
            }
        };

        // Estratégia de validação: pelo menos um caractere especial
        PasswordStrategy specialCharStrategy = new PasswordStrategy() {
            @Override
            public boolean validatePassword(String password) {
                return password.chars().anyMatch(ch -> "!@#$%^&*()".indexOf(ch) >= 0);
            }
        };

        // Testando a estratégia LengthStrategy
        validator.setStrategy(lengthStrategy);
        System.out.println("LengthStrategy (senha 'abc1234'): " + validator.validate("abc1234")); // false
        System.out.println("LengthStrategy (senha 'abc12345'): " + validator.validate("abc12345")); // true

        // Testando a estratégia UpperCaseStrategy
        validator.setStrategy(upperCaseStrategy);
        System.out.println("UpperCaseStrategy (senha 'abc1234'): " + validator.validate("abc1234")); // false
        System.out.println("UpperCaseStrategy (senha 'Abc1234'): " + validator.validate("Abc1234")); // true

        // Testando a estratégia SpecialCharStrategy
        validator.setStrategy(specialCharStrategy);
        System.out.println("SpecialCharStrategy (senha 'abc1234'): " + validator.validate("abc1234")); // false
        System.out.println("SpecialCharStrategy (senha 'abc1234!'): " + validator.validate("abc1234!")); // true
    }
}
