#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int a = 0;
    int b,i;
    cout<<"Ingrese 10 numeros"<<endl;
    for (i=1;i<=10;i++)
    {
        cin>>b;
        a=a+b;
    }
    cout<<"La suma de los numeros es: "<<a<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
}
