#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a,b;
      cout<<"Ingrese el sueldo y el valor del impuesto del empleado"<<endl;
      cin>>a>>b;
      if (b>200000)
      {
         if (a>500000)
         {
            cout<<"Paga demasiado"<<endl;
         }                          
      }
      system ("PAUSE");
      return EXIT_SUCCESS;  
}                
                    
