import javax.swing.JOptionPane;

public class UncheckedExpection {
    public static void main(String[] args) throws Exception {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador");
        
            // faz o try antes do estouro
        try{
            int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            continueLooping = false;

            // e é objeto
        } catch (NumberFormatException e) { // no caso de entrada string 
            JOptionPane.showMessageDialog(null, "Entrada inválida. Informe um número inteiro");
            // e.printStackTrace(); -> mostra o erro

        } catch (ArithmeticException e) { // no caso de divisão por 0
            JOptionPane.showMessageDialog(null, "Impossível dividir por 0");

        } finally {
            System.out.println("Chegou ao fim.");
        }

        } while (continueLooping); // enquanto não conseguir printar resultado, pede números novamente
}

    private static int dividir(int a, int b) {
        return a/b;
    }
}
