#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int num[100],i,acum=0;
    for(i=0;i<33;i++) num[i]=3*i+1;
    for(i=0;i<33;i++){          
    cout<<num[i]<<endl;}
    system("PAUSE");
    return EXIT_SUCCESS;
}
