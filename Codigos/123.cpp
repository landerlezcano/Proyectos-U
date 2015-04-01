#include <iostream>
#include <stdio.h>
#include <cstdlib>
using namespace std;
int main(){
      char h;
      int hor,a;
      cout<<"Digite si el empleado el empleado ha realizado horas extra     s/n\n";
      cin>>h;
       while(h != 's' && h != 'n'){
       	cin>>h;
       }
       if(h == 's'){
       do{
       cout<<"Digite el tipo de horas que el empleado realizo:\n";
       cout<<"1.sdfsdf\n";
       cout<<"2.sdfsdf\n";
       cout<<"3.sdfsdf\n";
       cout<<"4.salir\n";
            cin>>a;
           	switch(a)
		{
			case 1:				
				{
                       system ("cls");
					cout<<"asdas\n";
					 system("pause");
					break;
				}
			case 2:
				{
                    system ("cls");
				cout<<"asdas\n";
				 system("pause");
					break;
				}
			case 3:
				{
                    system ("cls");
					cout<<"asdas\n";
					 system("pause");
					break;
				}	
			default:
				{
					system ("cls");
					cout<<"La opcion que selecciono no hace referencia a ningun tipo de horas extra. \n";
                    system("pause");	
				}
           }
           }while(a!=4);
      }
      else{
           if(h == 'n'){
                cout<<"El empleado no realizo ningun tipo de horas extra\n";
                }
                else
                cout<<"La opcion que digito es incorrecta\n";
      }
      system("pause");
}
