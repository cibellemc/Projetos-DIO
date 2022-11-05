public class EstruturaDecisao {

    /* https://github.com/tlcdio/CLBSAula03/blob/master/src/one/digitalinnovation/basecamp/Main.java
     * if-else: para expressões booleanas, mais de uma variavel
        * evitar aninhamento
     * operador ternario - evitar
     * switch: dados exatos, uma variavel
        * avalia os valores que uma variavel pode ter
        * os mais comuns sao int, enum e string
        * evitar default para casos genericos
     */

    public static void main(String[] args) {
        ifSemFlecha();
        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifSemFlecha() { // dava pra fazer com switch ja que so é uma variavel

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
           System.out.println("Mês indefinido"); // o else deve ser usado para o inesperado, nao o ultimo caso previsto
        }

    }

    private static void switchSemana() {

        String dia = "mgmgjmg";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero){
            case 1:
            case 2: // vale pra os 3 casos, o que no if seria aninhamento
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}


