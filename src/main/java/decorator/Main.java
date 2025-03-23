package decorator;

public class Main {
    public static void main(String[] args) {
        Ingrediente pedido = new Ketchup(); // Começamos com Ketchup
        pedido = new BaconDecorator(pedido); // Adicionamos Bacon
        pedido = new QueijoDecorator(pedido); // Adicionamos Queijo
        pedido = new SaladaDecorator(pedido); // Adicionamos Salada

        // Imprimir todos os ingredientes
        System.out.println("Ingredientes: " + pedido.imprimeIngrediente());

        // Imprimir o valor total
        System.out.println("Valor total: R$ " + pedido.valorDoIngrediente());
    }
}
