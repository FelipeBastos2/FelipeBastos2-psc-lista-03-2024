import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner inicialScanner = new Scanner(System.in);

        System.out.println("Digite os valores da equação.\nDigite o valor de A:");
        double nA = inicialScanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double nB = inicialScanner.nextDouble();

        System.out.println("Digite o valor de C:");
        double nC = inicialScanner.nextDouble();

        double nD = nB * nB  -4 * nA * nC;

            if (nA == 0 && nB == 0 && nC != 0) {
                System.out.println("Coeficientes informados incorretamente.");
                return;

                }
                if (nA == 0 && nB != 0) {
                    System.out.println("Essa é uma equação de primeiro grau.");
                   
                }
                else if(nA == 0 && nB!= 0){
                    System.out.println("Essa é uma equação de primeiro grau");
                double rQ = -nC/nB;
                System.out.println("Raiz Quadrada:"+rQ);
                }
                else if ( nD < 0) {
                    System.out.println( "Esta equação não possui raízes reais");
                    
                }
                else if (nD == 0) {
                    System.out.println("Esta equação possuiduas raizes reais iguais.\nValor:"+nD);
                }
                else if (nD> 0) {       
                    System.out.println("Esta equação possui duas raizes reais diferentes\nValor:"+nD);
                    
                }

            inicialScanner.close();
    }


}
