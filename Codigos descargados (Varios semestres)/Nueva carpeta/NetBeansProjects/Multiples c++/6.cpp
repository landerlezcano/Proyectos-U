#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a;
      cout<<"Ingrese la edad de una persona"<<endl;
      cin>>a;
      if (a<10)
      {
         cout<<"Es menor de 10 años"<<endl;         
      }
      else
      {
          if (a<20)
          {
             cout<<"Tiene entre 10 y 20 años"<<endl;         
          }
          else
          {
              if (a<30)
              {
                 cout<<"Tiene entre 20 y 30 años"<<endl;          
              }
              else
              {
                 cout<<"Es mayor de 30 años"<<endl;
              }
          }
      }
      system ("PAUSE");
      return EXIT_SUCCESS;  
}     
