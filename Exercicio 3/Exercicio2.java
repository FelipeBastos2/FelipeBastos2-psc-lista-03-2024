import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        System.out.println("Salgadinhos: R$10,00 \nDigite a quantidade:");
        int salgadinho1 = inicialScanner.nextInt();
        float valorSal = (salgadinho1 * 10);

        System.out.println("Doce: R$2,00 \nDigite a quantidade:");
        int doces1 = inicialScanner.nextInt();
        float valorDoc = (doces1 * 2);

        System.out.println("Sucos: R$5,00 \nDigite a quantidade:");
        int sucos1 = inicialScanner.nextInt();
        float valorSuc = (sucos1 * 5);

        System.out.println("Refrigerantes: R$20,00 \nDigite a quantidade:");
        int refrigerantes1 = inicialScanner.nextInt();
        float valorRefri = (refrigerantes1 * 20);

        float soma = valorSal + valorDoc + valorSuc + valorRefri;

        System.out.println("Valor da compra:"+soma );
        System.out.println("Valor pago:"); 
        double valorPag = inicialScanner.nextDouble(); 
        double troco = valorPag - soma;
            if (valorPag< soma) {
                System.out.println("Valor insuficiente:");
            }
            else


        System.out.println("Troco:"+troco);
            inicialScanner.close();
        
    }
}
