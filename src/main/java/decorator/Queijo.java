package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public void imprimeIngrediente() {
        super.imprimeIngrediente();
        System.out.print(", Queijo");
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.75; 
    }
}
