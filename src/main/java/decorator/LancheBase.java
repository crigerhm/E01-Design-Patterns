package decorator;

public class LancheBase implements Ingrediente {

    @Override
    public void imprimeIngrediente() {
        System.out.print("Lanche simples");
    }

    @Override
    public double valorDoIngrediente() {
        return 5.00; 
    }
}
