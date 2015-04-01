#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int a=0;
    int i,b,c;
    for (i=1;i<11;i++)
    {
        cout<<"Ingrese un numero"<<endl;
        cin>>b;
        a=a+b;
    }
    c=a/10;
    cout<<"El promedio de los numeros ingresados es: "<<c<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
}
