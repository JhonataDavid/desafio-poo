package iphone.iphone;

import iphone.music.ReprodutorMusical;
import iphone.music.Musicas;
import iphone.navegador.WebBrowser;
import iphone.telefonema.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical player = new ReprodutorMusical();
        WebBrowser webBrowser = new WebBrowser();

        player.selecionarMusica(Musicas.Gorillaz_clintEastwood);

        telefone.ligar("98885858");

        webBrowser.exibirPagina("santander.com");

        webBrowser.atualizarPagina();

    }
}