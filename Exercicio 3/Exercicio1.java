import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args) {
        Scanner numUmScanner = new Scanner(System.in);

        System.out.println("Digite o numero aqui:");
        
        int numUm = numUmScanner.nextInt();
         
        System.out.println("Digite o numero aqui:");
        int numDois =numUmScanner.nextInt();

        System.out.println("Digite o numero aqui:");
        int numTres=numUmScanner.nextInt();

    

        
            int maiorNum = Math.max(Math.max(numDois, numTres), numUm);
            int menorNum = Math.min(Math.min(numDois, numTres), numUm);

            double mediaNum = (numUm + numDois +numTres )/3.0;

            System.out.println("Maior numero:" + maiorNum);
            System.out.println("Menor numero:" + menorNum);
           System.out.println("Média:" +mediaNum);

           numUmScanner.close();

    }
}