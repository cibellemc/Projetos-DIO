package dispositivos;

public class Celular implements Browser, Mp3, Telefone {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Encerrando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Você está atendendo uma chamada no celular...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz está sendo iniciado...");
    }

    @Override
    public void tocar() {
        System.out.println("A reprodução de música está em andamento...");
    }

    @Override
    public void pausar() {
        System.out.println("A reprodução de música foi pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Uma nova música foi selecionada para reprodução.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Uma página da web está sendo exibida no navegador.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada ao navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página da web está sendo atualizada no navegador.");
    }
}
