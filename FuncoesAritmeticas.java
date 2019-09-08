import java.util.Scanner;
public class FuncoesAritmeticas {
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
	
	public static void funEulerEModus(int numero) {
		int posicao = 1, n = numero, primo = 0, expoente = 0, expAnt = 0;
		double prodFat = 1;
		boolean modus = true;
		
		while(numero != 1) {
			primo = gerarPrimo(posicao);
			
			if(numero % primo == 0) {
				prodFat *= (1.0 - (1.0/primo));
				while(numero % primo == 0){
					
					numero = numero / primo;
					expoente++;
				}
				
				if((expoente - expAnt) != 1) {
					modus = false;
					
				}
				expAnt = expoente;
					
			}
			
			posicao++;
		}
		
		System.out.println("Euler("+ n + ") = " + (int)(n * prodFat));
		
		if(n == 1)
			System.out.println("Modus(" + n + ") = " + 1);
		else if( modus == false)
			System.out.println("Modus(" + n + ") = " + 0);
		else 
			System.out.println("Modus(" + n + ") = " + Math.pow((-1), expoente));
	}
	
	public static void funTauESigma(int numero) {
		int divisores = 0, soma = 0;
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisores++;
				soma+=i;
			}
		}
	
		System.out.println("Tau(" + numero + ") = " + divisores);
		System.out.println("Sigma(" + numero + ") = " + soma);
	}
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int numero, opcao;
		do {
			System.out.print("Digite um numero (N) para calcular as funcoes aritmeticas: ");
			numero = entrada.nextInt();
			
			funTauESigma(numero);
			funEulerEModus(numero);
			
			
			
			System.out.println("\n\nCalcular novamente? (1) Sim e (0) Nao");
			opcao = entrada.nextInt();
		}while(opcao != 0);
	}
}
