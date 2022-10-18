package strategy.comparator;

public class Animal {
    private string nome;
    private Long id;

    public Animal(Long id, String nome){
        super();
        this.id = id;
        this.nome = nome;
    }

    public Long getID(){
        return id;
    }
    public string getNome(){
        return nome;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
}