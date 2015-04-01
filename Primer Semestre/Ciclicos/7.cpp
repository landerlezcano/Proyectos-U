#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a;
    float b;
    b=0;
    cout<<"Ingrese 6 numeros a promediar"<<endl;
    for (i=1;i<=6;i++)
    {
        cin>>a;
        b=a+b;
    }
    b=b/6;
    cout<<"El promedio de los numeros ingresados es: "<<b<<endl; 
    system ("PAUSE");
    return EXIT_SUCCESS;
}    
