#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a;
      cout<<"Ingrese un numero entero"<<endl;
      cin>>a;
      if (a==0)
      {
         cout<<"El numero es nulo"<<endl;        
      }
      else
      {
          if (a>0)
          {
              cout<<"El numero es positivo"<<endl;
          }
          else
          {
              cout<<"El numero es negativo"<<endl;
          }
      }
      system ("PAUSE");
      return EXIT_SUCCESS;  
}     
