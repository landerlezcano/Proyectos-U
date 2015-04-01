#include<iostream>
#include<cstdlib>
using namespace std;

int main() 
{
	int a;
	cout<<"A continuacion ingrese la calificacion del estudiante, de 1 al 10"<<endl;
	cin>>a;
	switch (a) 
    {
	case 10:
		cout<<"Felicitaciones"<<endl;
		break;
	case 9:
		cout<<"Muy bien"<<endl;
		break;
	case 8:
		cout<<"Bien"<<endl;
		break;
	case 7:
		cout<<"Sigue adelante"<<endl;
		break;
	case 6:
		cout<<"Puedes mejorar"<<endl;
		break;
	default:
		if (a>10 || a<=0) 
        {
			cout<<"Asegurese de ingresar una nota del 1 al 10"<<endl;
		} else {
			cout<<"Reprobo"<<endl;
		}
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   

