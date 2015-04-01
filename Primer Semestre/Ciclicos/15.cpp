#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,d;
    float a,b,c;
    a=0;
    b=0;
    i=0;
    cout<<"Ingrese las notas de alumno"<<endl;
    for(d=1;d>=1;d++)
    {
          cin>>a;
          if(a>=0 & a<=5)
          {
                     b=a+b;
                     i++;
                     if (a==1) break;
          }
          else
          {
              cout<<"Debe ingresar valores entre 0 y 5"<<endl;
          }
    };
    c=b/i;
    cout<<"El promedio del alumno es: "<<c<<endl;
    if(c>3)
    {
       cout<<"Aprobado"<<endl;    
    }
    else
    {
       cout<<"Reprobado"<<endl;          
    }    
    system ("PAUSE");
    return EXIT_SUCCESS;
}
