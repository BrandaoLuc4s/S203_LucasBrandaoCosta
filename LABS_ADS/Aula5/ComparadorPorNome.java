public strategy.comparator;

import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2){
        return a1.getNome().compareTo( as.getNome());
    }
}