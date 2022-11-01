package template.relatorio.intro;
public class GeradorRelatorioVendasAnuaisTest {

    @Test
    void deveGerarRelatorioVendasAnuais(){
        GeradorRelatorioVendasAnuais gerador = new GeradorRelatorioVendasAnuais();
        String pagina = gerador.criarPagina(2022);
        System.out.printf(pagina);
    }

}