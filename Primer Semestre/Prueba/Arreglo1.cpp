#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int num[10],i,acum=0;
    for(i=0;i<10;i++) num[i]=2*i+2;        
    for(i=0;i<10;i++) acum=acum+num[i];
    cout<<"El resultado de la suma es: "<<acum<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}     
                
