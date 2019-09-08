import java.util.Scanner;
public class DecomporEmPrimos{
    static int expoente = 0, numero = 0;
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

    public static int calcularFatorExp(){
        boolean dividiu = false;
        int posicao = 1, primo = 0;

        while(dividiu == false){
            primo = gerarPrimo(posicao);
            while(numero % primo == 0){
                expoente++;
                numero = numero / primo;
                dividiu = true;
            }
            posicao++;
        }
        return primo;
    }
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para decompor em fatores primos: ");
        numero = entrada.nextInt();

        while(numero != 1){
            int fator = calcularFatorExp();
            System.out.print(fator);

            if(expoente > 1){
                System.out.print("^" + expoente);
            }

            expoente = 0;

		    if (numero != 1)
		    {
			    System.out.print(" * ");
		    }	
        }
    }
}