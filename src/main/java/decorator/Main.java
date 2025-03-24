package decorator;

public class Main {
    public static void main(String[] args) {
        // Lanche simples
        Ingrediente lanche = new LancheBase();
        lanche.imprimeIngrediente();
        System.out.println(" - Preço: " + lanche.valorDoIngrediente());

        // Lanche com Ketchup
        Ingrediente lancheComKetchup = new Ketchup(lanche);
        lancheComKetchup.imprimeIngrediente();
        System.out.println(" - Preço: " + lancheComKetchup.valorDoIngrediente());

        // Lanche com Ketchup e Bacon
        Ingrediente lancheComKetchupEBacon = new Bacon(lancheComKetchup);
        lancheComKetchupEBacon.imprimeIngrediente();
        System.out.println(" - Preço: " + lancheComKetchupEBacon.valorDoIngrediente());

        // Lanche com Ketchup, Bacon e Queijo
        Ingrediente lancheComKetchupBaconEQueijo = new Queijo(lancheComKetchupEBacon);
        lancheComKetchupBaconEQueijo.imprimeIngrediente();
        System.out.println(" - Preço: " + lancheComKetchupBaconEQueijo.valorDoIngrediente());

        // Lanche com Ketchup, Bacon, Queijo e Salada
        Ingrediente lancheFinal = new Salada(lancheComKetchupBaconEQueijo);
        lancheFinal.imprimeIngrediente();
        System.out.println(" - Preço: " + lancheFinal.valorDoIngrediente());
    }
}
