#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a,b;
      cout<<"Ingrese el numero entero"<<endl;
      cin>>a;
      b=a%2;
      if (a==0)
      {
         cout<<"El numero es nulo"<<endl;
      }
      else
      {
          if (b==0)
          {
             cout<<"El numero es par"<<endl;
          }
          else
          {
              cout<<"El numero es impar"<<endl;
          }
      }
      system ("PAUSE");
      return EXIT_SUCCESS;  
}     
