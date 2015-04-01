#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    float num,acum,prom,produc,i;
    produc=1;
    i=0;
    do{
        cin>>num;
        if (num !=1)
        {
           produc=num*produc;
           acum=num+acum;
           i++;
        }
        
    }
    while(num !=1);
    prom=acum/i;
    cout<<"El producto de los numeros ingresados es: "<<produc<<endl;
    cout<<"El promedio de los numeros ingresados es: "<<prom<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
