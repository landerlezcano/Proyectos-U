#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int a = 0;
    int b;
    int i;
    for (i=1;i<8;i++)
    {
        cout<<"Ingrese un numero"<<endl;
        cin>>b;
        a=a+b;
    }
    cout<<"La suma de los numeros es: "<<a<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
}
