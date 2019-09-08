import java.util.Scanner;
public class numerosPerfeitos{

public static boolean perfeito(long numero) {
     long soma,i;                        /* Comentários do código*/
     double raiz = Math.sqrt(numero);    /* Limite para o divisor      */
     soma = 1;                           /* 1 divide qualquer número   */
     for (i=2; i < raiz; ++i)            /* Até antes da raiz quadrada */
       if (numero % i == 0)              /* Se divide número           */
         soma += i + numero/i;           /* Soma divisor e quociente   */
     if (raiz == (int) raiz)             /* Se raiz for inteira, ela   */
       soma += (int) raiz;               /* precisa ser somada         */
     return numero == soma;              /* True ou false              */
   }





public static void main(String args[]){

Scanner input = new Scanner(System.in);
   int op;
do {

  System.out.print("\n1 - Verificar se o numero e perfeito."+
  " \n2 - Os 5 numeros perfeitos."
   + "\n3 - Sair."+
          "\n opcao: ");
    op = input.nextInt();

switch (op) {
  case 1:
    System.out.println("\nDigite um numero para verificar se ele e perfeito: ");
    long num = input.nextLong();
    if (perfeito(num) == true) {
      System.out.println("O numero e perfeito: "+ (long) num);
    }else{
        System.out.println("O numero nao e perfeito: "+ (long) num);
    }

   break;

  case 2:

   long quantidade = 0;
   long contador = 2L;
   while (quantidade != 4) {
     if (perfeito(contador) == true) {
       System.out.println("O numero e perfeito: "+contador);
       quantidade++;
     }
     contador++;
   }

   // Como o teste para o quinto número iria demorar muito, vamos apenas testar de acordo com a função se ele é perfeito.
   // Vale salientar que o numero iria aparecer, contudo, iria demorar muito, por isso estamos fazendo esse teste direto do 5°
   long numP = 33550336L;
   if(perfeito(numP) ==true){
   	    System.out.println("O numero e perfeito: "+numP);

   }


   break;

  case 3:
     System.out.println("Programa finalizado. ");
   break;

   default:
     System.out.println("Opcao invalida. Digite novamente.");
}

} while (op != 3);


}
   }
