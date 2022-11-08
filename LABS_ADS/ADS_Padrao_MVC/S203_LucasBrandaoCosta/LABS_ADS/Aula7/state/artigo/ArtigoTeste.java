package state.artigo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArtigoTeste {

    @Test
    public void deveArtigoTransitarDeRascunhoAteAprovado() {
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        Artigo artigo = new Artigo();

        segurança.setUsuarioCorrente("Autor");
        artigo.publicar();
        assertEquals("Revisando", artigo.getEstado());
        segurança.setUsuarioCorrente("Moderador");
        artigo.publicar();
        assertEquals("Aprovado", artigo.getEstado());
        artigo.getLogHistorico().forEach(System.out::println);
    }
}