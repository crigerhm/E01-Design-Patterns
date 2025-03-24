package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public void imprimeIngrediente() {
        super.imprimeIngrediente();
        System.out.print(", Ketchup");
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 1.00;  
    }
}
