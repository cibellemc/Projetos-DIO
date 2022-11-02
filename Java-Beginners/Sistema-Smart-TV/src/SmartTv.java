public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25; // definindo estados iniciais

    //metodos que manipulam os estados
    public void ligar(){
        ligada = true; // nao tem this.
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void avancarCanal(){
        canal++;
    }

    public void retonarCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}