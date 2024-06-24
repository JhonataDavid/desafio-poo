package iphone.navegador;

public class WebBrowser {

    public void exibirPagina(String url){
        System.out.println("Pesquisando: " + url);
    }
    public void atualizarPagina(){

        System.out.println("atualizando pagina...");
        adicionarNovaAba();

    }
    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    }

}
