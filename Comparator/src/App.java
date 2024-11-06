import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.00));
        produtos.add(new Produto("Notebook", 750.00));
        produtos.add(new Produto("Tablet", 370.00));

        // Comparator objeto de classe anonima
        Comparator<Produto> ComparatorAnonimo = new Comparator<Produto>() {

            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }

        };

        // COmparator objeto de expressao lambda sem chaves
        Comparator<Produto> ComparatorLambda = (p1, p2) -> p1.getNome().toUpperCase()
                .compareTo(p2.getNome().toUpperCase());

        // Comparator definido pela sintaxe de uma funcao lambida "direto no argumento"
        produtos.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Produto p : produtos) {
            System.out.println(p);
        }

    }
}