#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a,b;
    b=0;
    cout << " Los impares entre 1 y 30 son " <<endl;
    for (i=1;i<14;i++)
    {
        a=(2*i)+1 ;
        cout<<a<<endl;
        b=b+a;
    }
    cout<<"la sumatoria de estos numeros es: "<<b<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
