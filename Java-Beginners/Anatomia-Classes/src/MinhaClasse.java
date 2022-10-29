public class MinhaClasse {

    // método principal
    public static void main(String[] args) {
        String meuNome =  "Cibelle";
        String meuSobrenome = "Maciel";

        System.out.print(nomeCompleto(meuNome, meuSobrenome));
        // poderia atribuir a uma variável e exibir depois
    }
    
    public static String nomeCompleto (String nome, String sobrenome){
        return nome + " " + sobrenome;
        // poderia fazer usando concat: return nome.concat(" ").concat(sobrenome);
    }
}