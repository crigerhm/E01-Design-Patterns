package decorator;

public abstract class IngredienteDecorator implements Ingrediente {
    protected Ingrediente ingrediente;

    public IngredienteDecorator(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public void imprimeIngrediente() {
        ingrediente.imprimeIngrediente();  
    }

    @Override
    public double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente();  
    }
}
