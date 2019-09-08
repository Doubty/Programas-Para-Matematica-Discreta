#include <iostream> 

using namespace std; 

long long fatorial(long long num);

int main() {
	int op;
	long long num;
	long long p;

	do {
		cout << " 1 - Fatorial" <<
			"\n 2 - Fatorial com comparacao" <<
			"\n 3 - Combinacao " <<
			"\n 4 - Arranjo " <<
			"\n 5 - Permutacao " <<
			"\n 0 - Sair. " <<
			"Opcao: ";
		cin >> op;

		switch (op)
		{
		case 1:
			cout << "\n-------- Calcular Fatorial --------" << endl;
			cout << "Digite um numero inteiro qualquer: " << endl;
			
			cin >> num;
			cout << "Fatorial de " << num << " = " << fatorial(num) << "\n" << endl;
			break;

		case 2: 
			cout << "\n-------- Fatorial comparacao --------" << endl;
			cout << "Digite um numero inteiro qualquer: " << endl;
			
			cin >> num;
			cout << "Fatorial de " << num << " = " << fatorial(num) << "\n" << endl;
			cout << "Fatorial de " << num << " = " << sqrt(2*3.1415*num) * pow(double(num) / 2.7182, num) << " (Formula de Stirling)"<<"\n" << endl;
			cout << "Erro percentual de aproximacao: " <<( 1.0 - double ((sqrt(2 * 3.1415*num) * pow(double(num) / 2.7182, num))/120))*100 << "%\n"  << endl;
			break;

		case 3: 
			cout << "\n-------- Combinacao --------" << endl;
			cout << "Combinacao -> C n,p: Digite o valor de n:" << endl;
			cin >> num;
			cout << "Combinacao -> C n,p: Digite o valor de p:" << endl;
			cin >> p;
			cout << "Combinacao de C " << num << "," << p << " = " << (fatorial(num)/(fatorial(p) * fatorial(num -p))) << "\n" << endl;
			break;

		case 4:
			cout << "\n-------- Arranjo --------" << endl;
			cout << "Arranjo -> A n,p: Digite o valor de n:" << endl;
			cin >> num;
			cout << "Arranjo -> C n,p: Digite o valor de p:" << endl;
			cin >> p;
			cout << "Arranjo de A " << num << "," << p << " = " << (fatorial(num) / fatorial(num - p)) << "\n" << endl;
			break;

		case 5:
			cout << "\n-------- Permutacao --------" << endl;
			cout << "Digite um numero inteiro qualquer para permutar: " << endl;

			cin >> num;
			cout << "Permutacao de " << num << " = " << fatorial(num) << "\n" << endl;
			break;
		case 0: 
			cout << "\n Programa finalizado. \n\n";
			break;

		default:
			cout << " \n Opcao invalida. \n " << endl;

		}


	} while (op != 0);



	system("pause"); 
	return 0;
}


long long fatorial(long long num) {
	long long fat = num;
	if (num == 0) {
		return 1LL; 
	}
	else if (num ==1) {
		return 1LL;
	}
	else {
		for (int i = 2; i < num; i++) {
			fat = fat * i;
		}
		return fat;
	}
}