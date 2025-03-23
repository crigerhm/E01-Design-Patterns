package decorator;

public abstract class IngredienteDecorator extends Ingrediente {
    protected Ingrediente ingrediente;

    public IngredienteDecorator(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public abstract String imprimeIngrediente();

    @Override
    public abstract double valorDoIngrediente();
}
