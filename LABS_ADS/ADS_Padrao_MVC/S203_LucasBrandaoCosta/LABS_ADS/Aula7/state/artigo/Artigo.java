package state.artigo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Artigo {

    private String estado;

    private List<String> logHistorico = new ArrayList<>();

    public Artigo() {
        this.estado = "Rascunho";
    }

    public String getEstado() {
        return estado;
    }

    public List<String> getLogHistorico() {
        return logHistorico;
    }

    public void publicar(){
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        if ("Rascunho".equals(this.estado)){
            if (segurança.ehUsuarioAutor()){
                this.estado = "Revisando";
                this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
        }
        if ("Revisando".equals(this.estado)){
            if (segurança.ehUsuarioModerador()){
                this.estado = "Aprovado";
                this.logHistorico.add("Transitado para Aprovado em " + LocalDate.now());
                return;
            }else {
                throw new RuntimeException("Usuario sem permissão para publicar");
            }
        }
        if ("Aprovado".equals(this.estado)){
            return;
        }
    }

    public void reprovar (){
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        if ("Rascunho".equals(this.estado)){
            return;
        }
        if ("Revisando".equals(this.estado)){
            if (segurança.ehUsuarioModerador()){
                this.estado = "Rascunho";
                logHistorico.add("Transitado para Rascunho em" + LocalDate.now() );
                return;
            }else {
                throw new RuntimeException("Usuario sem permissão para reprovar");
            }
        }
        if ("Aprovado".equals(this.estado)){
            return;
        }
    }
}