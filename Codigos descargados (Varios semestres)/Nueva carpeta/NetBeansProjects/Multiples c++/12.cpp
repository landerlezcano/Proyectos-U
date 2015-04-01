#include<iostream>
#include<cstdlib>
using namespace std;

int main() 
{
	int a;
	cout<<"A continuacion ingrese un numero de 1 al 7"<<endl;
	cin>>a;
	switch (a) 
    {
	case 1:
		cout<<"El dia es lunes"<<endl;
		break;
	case 2:
		cout<<"El dia es martes"<<endl;
		break;
	case 3:
		cout<<"El dia es miercoles"<<endl;
		break;
	case 4:
		cout<<"El dia es jueves"<<endl;
		break;
	case 5:
		cout<<"El dia es viernes"<<endl;
		break;
	case 6:
		cout<<"El dia es sabado"<<endl;
		break;
	case 7:
		cout<<"El dia es domingo"<<endl;
		break;
	default:
		cout<<" El numero no corresponde a un dia de la semana"<<endl;
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   

