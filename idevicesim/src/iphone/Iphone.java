package iphone;

import iphone.music.ReprodutorMusical;
import iphone.music.Musicas;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical player = new ReprodutorMusical();

        player.selecionarMusica(Musicas.Gorillaz_clintEastwood);

        telefone.ligar("98568174");

    }
}