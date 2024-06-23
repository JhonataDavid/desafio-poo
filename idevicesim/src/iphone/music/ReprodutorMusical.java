package iphone.music;

public class ReprodutorMusical {

    private void tocar(){
        System.out.println("Reproduzindo a musica...");

    }public void pausar(){
        System.out.println("Musica Pausada");

    }
    public void selecionarMusica (Musicas selecionar){
        tocar();
        System.out.println("Musica Selecionada: " + selecionar);

    }


}
