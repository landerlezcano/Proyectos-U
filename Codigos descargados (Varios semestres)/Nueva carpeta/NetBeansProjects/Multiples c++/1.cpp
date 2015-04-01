#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
    int a;
    cout<<"Ingrese la altura: "<<endl;
    cin>>a;  
    if (a<=150)
    {
               cout<<"Persona de baja altura"<<endl;
               }
     else
     {
         if (a<=170)
         {
                    cout<<"Persona de altura media"<<endl;
                    }
         else
         {
             cout<<"Persona alta"<<endl;
         }           
     }  
      system ("PAUSE");
      return EXIT_SUCCESS;      
}      
