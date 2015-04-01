#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a,b;
    cout<<"Ingrese el numero del cual quiere generar la tabla de multiplicar"<<endl;
    cin>>b;
    for (i=1;i<=10;i++)
    {
        a=b*i;
        cout<<b<<"*"<<i<<"="<<a<<endl;
    }
    system ("PAUSE");
    return EXIT_SUCCESS;
}
