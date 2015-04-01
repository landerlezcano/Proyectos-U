#include<iostream>
using namespace std;


struct equipo
{ char codigo[20];
  char marca[20];
  char estado[20];
  int sala;};
equipo arreglo[100];
  
/*int leerdatos();
void mostrar(int);  */

 

      int leerdatos()
       { int i,tope;
       cout<<"ingrese numero de equipos: ";
       cin>>tope;
       
   for(i=0;i<tope;i++)
       {system("color f1");
       
             cout<<"\n\n\t ";
             cout<<"ingrese codigo: ";
             gets(arreglo[i].codigo);
             gets(arreglo[i].codigo);
             cout<<"\tingrese el marca: ";
           gets(arreglo[i]. marca);
              cout<<"\tingrese estado: ";
            gets(arreglo[i].estado);
               cout<<"\tingrese sala: ";
                cin>>arreglo[i].sala;
                }
                return(tope);
                }
               void mostrar(int t) 
               {int i=0;system("cls");
               
                
             while (i<t)
       {    
                  
                   cout<<"\n\n................................\n\n  codigo:\t"<<arreglo[i].codigo<<" \n\n  marca\t:\t"<<arreglo[i]. marca<<"\n\n  estado:\t"<<arreglo[i].estado<<"\n\n  sala\t:\t"<<arreglo[i].sala<<endl<<endl;
                   i++;
       }
                
                }
          
               int main()
               {int t;
               t=leerdatos();
               
                mostrar(t);
                
                cout<<"\n\n................................\n\n";
                
                system("pause");
               }
 
