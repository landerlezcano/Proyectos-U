#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int i,a;
    a=1;
    for (i=1;i<=6;i++)
    {
        a=a*i;
        if (i==6)
        {
            cout<<i<<"=";        
        }
        else
        {
            cout<<i<<"x";
        }
    }
    cout<<a<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
} 
