#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i;
    float a;
    cout<<"Ingrese a continuacion 7 numeros"<<endl;
    for (i=1;i<=7;i++)
        {
                     cin>>a;
                     a=a*a;
                     cout<<"El cuadrado del numero ingresado es: "<<a<<endl; 
        }
    system("PAUSE");
    return EXIT_SUCCESS;
}
