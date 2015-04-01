#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a,b;
    b=0;
    cout << "Los numeros pares entre 10 y 30 son: " <<endl;
    for (i=6;i<15;i++)
    {
        a=2*i;
        b=a+b;
      cout<<a<<endl;
    }
    cout<<endl<<"El resultado de la suma de los anteriores numeros pares es: "<<b<<endl; 
    system("PAUSE");
    return EXIT_SUCCESS;
}
         
         
         
