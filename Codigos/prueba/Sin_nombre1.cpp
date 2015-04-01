#include <iostream>
#include <stdio.h>
using namespace std;
struct  estudiante
{
        char nombre[40];
        long codigo[20];
        float nota[20];
}estudiante1;
int main()
{
    cout<<"ingrese nombre"<<endl;
    cin>>estudiante1.nombre;
    cout<<"ingrese codigo"<<endl;
    cin>>estudiante1.codigo;
    cout<<"ingrese nota"<<endl;
    cin>>estudiante1.nota;
   getch();
}
