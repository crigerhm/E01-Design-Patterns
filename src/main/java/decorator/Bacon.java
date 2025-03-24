package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public void imprimeIngrediente() {
        super.imprimeIngrediente();
        System.out.print(", Bacon");
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 1.50;  
    }
}
