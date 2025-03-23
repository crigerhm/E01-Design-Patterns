package decorator;

public class Pao {
    private String ingredientes = "Pão";
    private double preco = 2.00; // Preço base do Pão
    
    public String imprimeIngrediente() {
        return ingredientes;
    }

    public double valorDoIngrediente() {
        return preco;
    }

    // Métodos para adicionar ingredientes ao Pão
    public void adicionarKetchup() {
        ingredientes += ", Ketchup";
        preco += 1.00;
    }

    public void adicionarBacon() {
        ingredientes += ", Bacon";
        preco += 1.50;
    }

    public void adicionarQueijo() {
        ingredientes += ", Queijo";
        preco += 0.75;
    }

    public void adicionarSalada() {
        ingredientes += ", Salada";
        preco += 0.25;
    }
}
