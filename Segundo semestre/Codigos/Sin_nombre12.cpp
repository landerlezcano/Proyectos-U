#include<iostream>
#include<cstdlib>
using namespace std;
class arreglo
{
	public:
           int b[4],cont;
		arreglo();
		int* insertar ();
		void borrar ();
		void mostrar (int);  
		void operator+(int m);
		void operator-(int m);
};
arreglo::arreglo(){
	for(int i=0;i<4;i++)
	b[i]=0;
	cont=0;
}
void arreglo::operator+(int m){
         if(cont>3){
     	cout<<"Error";
     }else{
     	b[cont]=m;
     	cont++;
     }
     }
void arreglo::operator-(int m){
     
     }
int* arreglo::insertar()
{
		system ("cls");
    if(cont>3)
	cout<<"No hay espacio para ingresar un nuevo numero...\n";
	else
	{
		cout<<"Ingrese un datos para el espacio "<<cont<<" del arreglo: \n";
		cin>>b[cont];
		cont++;
	}
	return b;
}
void arreglo::mostrar(int )
{
		system ("cls");
			if(cont==0)
		{
			cout<<endl;
			cout<<"El arreglo no tiene valores aun que mostrar... \n\n";
		}
		else
		{
            cout<<"Estos son los numeros que ingreso anteriormente\n";
			for(int i=0;i<cont;i++)
			{
				cout<<b[i]<<"\t";	
			}
			cout<<endl<<endl<<endl;		
		}
	
}
void arreglo::borrar()
{
		system ("cls");
		if(cont==0)
		{
			cout<<endl;
			cout<<"No hay ningun elemento para borrar... \n\n";
		}
		else
		{
			int x,aux;				
			cout<<endl;
			cout<<"Pocicion: ";
			for(int i=0;i<cont;i++)
				cout<<i<<"\t";
			cout<<endl;
			cout<<"valores:  ";
			for(int i=0;i<cont;i++)
				cout<<b[i]<<"\t";
			cout<<endl;	
			cout<<"Ingrese la posision que sesea eliminar: ";
			cin>>x;	
			b[x]=NULL;
			aux=b[x];
			for(int j=x;j<cont;j++){
                    b[j]=b[j+1];
            }
            cont--;
            b[3]=aux;
		}	
}
int main()
{
	arreglo p;
int a,b[4],cont=0;
		do
	{
		cout<<" 1. Ingresar\n";
		cout<<" 2. Borrar\n";
		cout<<" 3. Mostrar\n";
		cout<<" 4. Salir\n";
		cout<<"Seleccione una de las opciones\t";cin>>a;		
		switch(a)
		{
			case 1:				
				{
					system ("cls");
					p.insertar();
					break;
				}
			case 2:
				{
					system ("cls");
					p.borrar();
					break;
				}
			case 3:
				{
					system ("cls");
					p.mostrar(*b);
					p+ 2;
					p.mostrar(*b);
					break;
				}	
			default:
				{
					system ("cls");
					cout<<"Seleccione una opcion que se encuentre en el menu. \n";	
				}
		}
	}
	while(a!=4);
}
