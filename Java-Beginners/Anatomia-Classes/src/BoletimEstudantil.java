public class BoletimEstudantil {
    // não deixar passar de 6 níveis
    public static void main(String[] args){
        int mediaFinal = 2;

        if(mediaFinal<6)	
            System.out.println("REPROVADO"); 
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA"); 
        else
            System.out.println("APROVADO"); 		
    }
}

