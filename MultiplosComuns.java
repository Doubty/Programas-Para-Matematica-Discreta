import java.util.Scanner;
public class MultiplosComuns{
    
    public static int calcularMMC(int numeroUm, int numeroDois){
        int mmc = 1, ate = 0;

        if(numeroUm >= numeroDois)
            ate = numeroUm;
        else
            ate = numeroDois;
        
        for(int i = 2; i <= ate; i++){
            if((numeroUm % i == 0) && (numeroDois % i == 0)){
                numeroUm = (numeroUm/i);
                numeroDois = (numeroDois/i);
                mmc *= i;
                i--;
            }else if((numeroUm % i == 0) && (numeroDois % i != 0)){
                numeroUm = (numeroUm/i);
                mmc *= i;
                i--;
            }else if((numeroUm % i != 0) && (numeroDois % i == 0)){
                numeroDois = (numeroDois/i);
                mmc *= i;
                i--;
            }
        }
        return mmc;
    }
    
    public static int calcularMDC(int numeroUm, int numeroDois){
        return (numeroUm*numeroDois)/calcularMMC(numeroUm, numeroDois);
    }

    public static void main(String args[]){
        int numeroUm = 0, numeroDois = 0, opcao = 0;
        Scanner entrada = new Scanner(System.in);
        

        do{
            System.out.println("Digite a opcao desejada: ");
            System.out.println("(1) MMC");
            System.out.println("(2) MDC");
            System.out.println("(0) Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o primeiro numero: ");
                    numeroUm = entrada.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    numeroDois = entrada.nextInt();
                    System.out.println("O MMC entre " + numeroUm + " e " + numeroDois + " = " + calcularMMC(numeroUm, numeroDois) + "\n\n");
                    break;

                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    numeroUm = entrada.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    numeroDois = entrada.nextInt();
                    System.out.println("O MDC entre " + numeroUm + " e " + numeroDois + " = " + calcularMDC(numeroUm, numeroDois) + "\n\n");

                    break;                
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida...");
            }
        }while(opcao != 0);

    }
}