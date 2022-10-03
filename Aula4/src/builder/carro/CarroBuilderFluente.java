public class CarroBuilderFluente {

    private Carro carro;

    public CarroBuilderFluente(){
        this.carro = new Carro();
    }

    public CarroBuilderFluente buildPortas(Porta[] portas){
        carro.setPortas(portas);
        return this;
    }



    
}
