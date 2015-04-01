#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a,b,c;
      cout<<"Ingrese 3 numeros: "<<endl;
      cin>>a>>b>>c;
      if (a>b and a>c)
         {
              cout<<"El mayor de los numeros ingresados es "<<a<<endl;
         }
      else
          {
              if (b>a and b>c)
              {
                cout<<"El mayor de los numeros ingresados es "<<b<<endl;              
              }
              else
              {
                cout<<"El mayor de los numeros ingresados es "<<c<<endl;  
              }            
          }           
      system ("PAUSE");
      return EXIT_SUCCESS;  
}                
              
                     
