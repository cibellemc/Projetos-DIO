import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.4);
        notas.add(6.2);
        notas.add(0.0);
        notas.add(3.6);
        notas.add(5.0);
        notas.add(9.3);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 2.7 na posição 4");
        notas.add(4,2.7); // adicionar em posição específica
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5d), 6d); // index de mudança, conseguido através de indexOf e novo valor
        System.out.println(notas);

        System.out.println("Confira se a nota 2.2 está na lista: " + notas.contains(2.2)); // passa o objeto, obtém retorno boolean

        System.out.println("Exibir a terceira nota adicionada: " + notas.get(2)); // passa a posição, obtém objeto

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){ // enquanto tiverem elementos
            Double next = iterator.next();
            soma += next; // adiciona o valor do próximo
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size()); // size é o length 

        System.out.println("Remova a nota 0:");
        notas.remove(0d); // remove pode receber tanto o objeto quanto a posição. nesse caso remove valor
        System.out.println(notas);

        System.out.println("Remova a nota 0:");
        notas.remove(0); // remove pode receber tanto o objeto quanto a posição. nesse caso remove posição
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 7){ // remover notas menores que 7
                iterator1.remove();
            }
        }
        System.out.println(notas);

        notas.clear(); // apagar toda a lista
        System.out.println(notas); // visualizar depois de limpar
        System.out.println(notas.isEmpty()); // retorna boolean, se tá vazia
    }
}
