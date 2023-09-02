package iphone;

import iphone.funcionalidades.AparelhoTelefonico;
import iphone.funcionalidades.NavegadorInternet;
import iphone.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private boolean ligado = false;

    private boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligarIphone() {
        setLigado(true);
        System.out.println("Iphone ligado");
    }

    public void desligarIphone() {

        if (isLigado()) {
            setLigado(false);
            System.out.println("Iphone desligado");
        }
    }

    @Override
    public void discarNumero(String numero) {
        System.out.printf("Ligando para o número %s\n", numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo uma chamada");

    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando a chamada");

    }

    @Override
    public void iniciarCorreioVoz(String mensagem) {
        System.out.printf("Iniciando correio de vox com a mensagem \"%s\"\n", mensagem);

    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Abrindo a página %s\n", url);

    }

    @Override
    public void atualizarPagina(String url) {
        System.out.printf("Atualizando a página %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando a música \"%s\"\n", musica);

    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a música");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligarIphone();

        System.out.println("");
        iphone.discarNumero("33031244");
        iphone.encerrarChamada();

        System.out.println("");
        iphone.atenderChamada();
        iphone.encerrarChamada();

        System.out.println("");
        iphone.iniciarCorreioVoz("Oi, vejo você mais tarde");

        System.out.println("");
        iphone.selecionarMusica("Try Everything");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.tocarMusica();

        System.out.println("");
        iphone.exibirPagina("https://www.becas-santander.com/pt_br/index.html");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina("https://www.becas-santander.com/pt_br/index.html");

        System.out.println("");
        iphone.desligarIphone();
    }

}
