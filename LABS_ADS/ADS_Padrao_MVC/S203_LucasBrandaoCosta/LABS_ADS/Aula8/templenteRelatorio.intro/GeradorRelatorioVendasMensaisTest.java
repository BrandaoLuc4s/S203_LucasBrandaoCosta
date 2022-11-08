package template.relatorio.intro;

public class GeradorRelatorioVendasMensaisTest {
    @Test
    Void deveGerarRelatorioVendasMensais(){
        GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();
        
        String pagina = gerador.criarPagina(2022, 10);
         
        System.out.println( pagina );
    }
}