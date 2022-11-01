package templatemethod.relatorio.intro;

public class GeradorRelatorioVendasMensais {

    public String getCabecalho() {
        String cabecalho = "Empresa My" + '\n'
                         + "----------";
        return cabecalho;
    }

    public List<String> getConteudo(Integer ano, Integer mes) {
        List<String> vendasMensal = ServicoRelatorio.getInstance().getVendasMensal(anos, mes);
        return vendasMensal;
    }

    public String getRodape() {
        String rodape = "----------------------------------------" + '\n'
                      + "* Proprieda particular - uso confiencial";
        return rodape;
    }  

    public String criarPagina(Integer ano, Integer mes) {

        String cabecalho getCabecalho(); 
        List<String> conteudo getConteudo(ano, mes); 
        String rodape = getRodape();
        StringBuffer bufferPagina = new StringBuffer();
        
        bufferPagina.append( cabecalho);
        
        for (String linha conteudo) {
            bufferPagina.append('\n'); bufferPagina.append( linha ); 
            bufferPagina.append("\n');
        }
    bufferPagina.append('\n');
    bufferPagina.append(rodape);
    return bufferPagina.toString();
    }
}