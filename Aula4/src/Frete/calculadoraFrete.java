public double calcularValor(String servico, double pesoEmKG){
    //sedex
    if (servico.equals("Sedex")){
        if (pesoEmKG < 10.0){
            return 50.00;
        } else if (pesoEmKg < 20.00){
            return 70.00;
        } else {
            return 90.00;
        }
    }

    if (servico.equals("dh1")){
        if (pesoEmKG < 20.00){
            return 100.00;
        }
    }
    if (servico.equals("jadlog")){
        if (pesoEmKG < 30.00){
            return 0.00;
        } else {
            return 150.00;
        }
    }
    
    throw new RunTimeException("Servico desconhecido: " + servico)
}