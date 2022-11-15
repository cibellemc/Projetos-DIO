public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    // atributos, construtor, get/set, métodos de negócio

    Carro(){

    }

    //this diferencia o que pertence ao objeto
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // get e set podem ferir encapsulamento
    void setCar(String cor){
        this.cor = cor;
    }

    String getCar(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double calcularValorTanque(double valorCombustivel){
        return this.capacidadeTanque * valorCombustivel;
    } // se tem 10 L e o combustivel ´´e r$2, fica r$20
}
