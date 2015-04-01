#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i;
    float a;
    a=0;
    for (i=1;i<=100;i++)
    {
        a=a+i;
    }
    cout<<"La suma de los numeros entre 1 hasta 100 es de: "<<a<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
