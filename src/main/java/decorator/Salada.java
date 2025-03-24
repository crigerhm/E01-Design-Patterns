package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public void imprimeIngrediente() {
        super.imprimeIngrediente();
        System.out.print(", Salada");
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.25;  
    }
}
