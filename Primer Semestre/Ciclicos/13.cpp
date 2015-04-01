#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int a,b;   
    b=0;
    cout<<"Ingrese un numero"<<endl;
    cin>>a;
    if (a<20)
    {
             for(a;a<=50;a++)
             {
                              b=b+a;
             }
    }
    cout<<"El resultado de la suma es: "<<b<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
