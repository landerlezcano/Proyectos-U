#include<iostream>
#include<cstdlib>
#include<cctype>
using namespace std;

int main() 
{
	char letra;
	cout<<"Ingrese una letra"<<endl;
	cin>>letra;
	switch (letra) 
    {
	case 'a':
		cout<<"La letra "<<letra<<" es una vocal"<<endl;
		break;
	case 'e':
		cout<<"La letra "<<letra<<" es una vocal"<<endl;
		break;
	case 'i':
		cout<<"La letra "<<letra<<" es una vocal"<<endl;
		break;
	case 'o':
		cout<<"La letra "<<letra<<" es una vocal"<<endl;
		break;
	case 'u':
		cout<<"La letra "<<letra<<" es una vocal"<<endl;
		break;
	default:
		if (isdigit(letra))
		{
        cout<<"Es un numero"<<endl;
        
        }
        else
        {
           cout<<"La letra "<<letra<<" es una consonante"<<endl; 
    }
}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}  

