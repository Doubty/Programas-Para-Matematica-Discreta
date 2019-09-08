import java.util.Scanner;
public class EncontrarPrimos{
    int posicao = 1;
    

    public static int gerarPrimo(int posicao){
        int primo = 2;
        
        while(posicao>0){
            int divisores = 0;
            for(int i = 1; i <= primo; i++){
                if(primo % i == 0)
                    divisores++;
            }

            if(divisores == 2){
                posicao--;

            }
            primo++;
        }
        return(primo-1);
    }
    public static void main(String args[]){
        int opcao = 0;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a opçao desejada: ");
            System.out.println("(1) encontrar um primo na posicao (N)");
            System.out.println("(2) encontrar os primos ate a posicao (N)");
            System.out.println("(0) Sair");
            
            opcao = entrada.nextInt();

            
            switch (opcao){
                case 1:
                    System.out.print("Entre com a posicao (N): ");
                    int posicao = entrada.nextInt();

                    System.out.println("O numero na posicao (" + posicao + ") = " + gerarPrimo(posicao));
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.print("Entre com a posicao (N): ");
                    posicao = entrada.nextInt();

                    for(int i = 1; i <= posicao; i++)
                        System.out.println("O numero na posicao (" + i + ") = " + gerarPrimo(i));
                    System.out.println("\n\n");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida...");
                
            }
        }while(opcao > 0);
        
    }        
}

