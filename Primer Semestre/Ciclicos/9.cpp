#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{    
     int i,a,b;
     cout<<"Ingrese un numero de veces para calcular su factorial"<<endl;
     cin>>b;
     a=1;
     for (i=1;i<=b;i++)
     {
        a=a*i;
        if (i==b)
        {
            cout<<i<<"=";        
        }
        else
        {
            cout<<i<<"x";
        }
     }
    cout<<a<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
} 
