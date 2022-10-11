public class Teste {
    public double CalcularFreteParaDH(){
        CalculadoraFrete calculadora = new CalculadoraFreteParaDH()
        double valorObtido = calculadoracalcularValor(,'dh,'10.0);
        double valorEsperado = 100.0;
        assertEquals(valorObtido, valorEsperado);
    }
}