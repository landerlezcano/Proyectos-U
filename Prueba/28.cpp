#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    int a=1;
    int i,acum,num;
    num = 1;
    while (a<=10)
    {
          
          for (i=1;i<=10;i++)
          {
              acum=num*i;
              cout<<num<<"*"<<i<<"="<<acum<<endl;
          }
    a++;
    num++;
    cout<<endl;
    }
    system ("PAUSE");
    return EXIT_SUCCESS;
}
