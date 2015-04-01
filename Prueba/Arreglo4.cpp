#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int num[50],i,acum=0;
    for(i=0;i<50;i++) num[i]=2*i+2;
    for(i=0;i<50;i++){          
    cout<<num[i]<<endl;}
    system("PAUSE");
    return EXIT_SUCCESS;
}
