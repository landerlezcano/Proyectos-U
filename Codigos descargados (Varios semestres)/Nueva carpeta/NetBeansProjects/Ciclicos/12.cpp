#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a,b,c;
    b=0;
    c=0;
    cout<<"A continucion ingrese 12 numeros"<<endl;
    for (i=1;i<=12;i++)
    {
        cin>>a;
        if (a>5)
        {
        b++;
        }
        if(a<8)
        {
        c++;    
        }
        
    }
    cout<<"Se ingresaron "<<b<<" numeros mayores a 5"<<endl;
    cout<<"Se ingresaron "<<c<<" numeros menores a 8"<<endl;
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
