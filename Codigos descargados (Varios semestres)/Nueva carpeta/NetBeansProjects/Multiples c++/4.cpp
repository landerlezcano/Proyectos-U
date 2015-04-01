#include <cstdlib>
#include <iostream>
using namespace std;
main()
{
      int a,b,c,d;
      cout<<"Ingrese 3 valores"<<endl;
      cin>>a>>b>>c;
      if (a>10)
      {
           d=a*b;
           if (d==50)
           {
                cout<<"El resultado es: "<<d+c<<endl;
           }        
      }
      system ("PAUSE");
      return EXIT_SUCCESS;  
}               
