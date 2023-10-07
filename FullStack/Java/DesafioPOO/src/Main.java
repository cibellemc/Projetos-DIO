import dispositivos.Celular;

public class Main {
    public static void main(String[] args) {
        Celular Iphone = new Celular();

        System.out.println("\nFunções de um reprodutor musical:");
        Iphone.selecionarMusica();
        Iphone.tocar();
        Iphone.pausar();

        System.out.println("\nFunções de um teledone:");
        Iphone.ligar();
        Iphone.desligar();
    }
}
