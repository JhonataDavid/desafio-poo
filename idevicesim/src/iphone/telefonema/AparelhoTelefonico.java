package iphone.telefonema;

public class AparelhoTelefonico {
    public void ligar(String numero){
        iniciarCorreioDeVoz();
        System.out.println("ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligaçao");
    }

    private void iniciarCorreioDeVoz(){
        System.out.println("iniciando ligaçao...");

    }
}
