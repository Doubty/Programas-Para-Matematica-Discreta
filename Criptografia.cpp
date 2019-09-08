# include <iostream> // Necessário para std::cout e std::endl
using namespace std;
int main()
{
	//cria uma tabela de codificação para os caractéres
	char tabelaLetras[26] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
							 'O', 'P', 'Q', 'R', 'S', 'T' ,'U', 'V', 'W', 'X', 'Y', 'Z' };

	//Cria um vetor para armazenar a palavra a ser decodificada
	char palavra[10];
	//Cria uma variável que recebe a chave e um vetor para guardar a constante K para valores acima de 26
	int chave = 0, constanteK[10];

	//O usuário entra com a palavra e a chave
	cout << "Digite uma palavra com até 10 letras: ";
	cin >> palavra;
	cout << "Digite uma chave para codificaçao: ";
	cin >> chave;

	/*Codifica a palavra*/
	cout << "Palavra codificada: " << endl;
	cout << "--------------------" << endl;
	//percorre toda a palavra
	for (int i = 0; palavra[i]; i++) {
		//testa se o valor da letra está abaixo de 26
		if ((palavra[i] - 65 + chave) < 26) {
			//Se sim, ele codifica somando a letra + chave
			palavra[i] = tabelaLetras[palavra[i] - 65 + chave];
			cout << palavra[i];
			//guarda o valor k para a constante que multiplica o valor no mod (26)
			constanteK[i] = 1;

		}else {
			//caso o valor seja maior
			//cria uma constante k para controlar o valor de k 
			//ex: 106 - k * 26 = x
			int k = 1;
			//guarda o valor da letra codificada acima de 26
			int letraCriptograda = palavra[i] - 65 + chave;
			//enquanto o valor for acima de 26, ele subtrai do valor da constante
			while (letraCriptograda > 26) {
				letraCriptograda -= 26;
				k++;
			}
			//salva a palavra no vetor
			palavra[i] = tabelaLetras[letraCriptograda];
			//mostra na tela
			cout << tabelaLetras[letraCriptograda];
			//guarda o valor da constante k
			constanteK[i] = k;
		}
			
	}
	cout << endl;
	cout << "Palavra decodificada: " << endl;
	cout << "--------------------" << endl;
	/*Decodifica a palavra*/
	//percore o vetor palavra
	for (int i = 0; palavra[i]; i++) {
		//decodifica a palavra usando a constante k para facilitar as operações
		//subtraindo o número da palavra pela chave * k
		palavra[i] = tabelaLetras[palavra[i] - 65 - (chave * constanteK[i])];
		cout << palavra[i];
		

	}
	cout << endl;

	system("pause");
	return 0;
}