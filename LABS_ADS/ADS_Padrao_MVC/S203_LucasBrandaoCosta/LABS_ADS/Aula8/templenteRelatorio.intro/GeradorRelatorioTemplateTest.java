public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate {
    private Integer ano;
    private Integer mes;

    public GeradorRelatorioVendasMensais(Integer ano, Integer mes){
        this.ano = ano;
        this.mes = mes;
    }

    @Override
    public List<String> getConteudo() {
        List<String> vendasMensal = ServicoRelatorio.getInstance().getVendasMensal(ano, mes);
        return vendasMensal;
    }
}