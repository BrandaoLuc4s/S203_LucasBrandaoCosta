package template.relatorio.intro;
public class GeradorRelatorioVendasAnuais {

    private String getCabecalho() {
        String cabecalho = "Empresa My" + '\n'
                         + "----------";
        return cabecalho;
    }
    private String getRodape(){
        String rodape = "-----------------" + '\n'
                      + "* Propriedade particular - Uso confidencial";
        return rodape;
    }

    private Liste<String> getConteudo( Integer ano) {
        List<String> getConteudo(Integer ano) {
            List<String> conteudo = ServicoRelatorio.getInstance().getVendasAnual(ano);
            return conteudo;    
        }
    }
}