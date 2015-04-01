#include<cstdlib>
#include<iostream>
using namespace std;
int main(){
           int i,j;
           int m,n;
           int m1,n1;
           int acum=0;
           int arreglon[50];
           int arreglom[50];
           cout<<"digite un numero"<<'\n';
           cin>>m;
           cout<<"digite un numero"<<'\n';
           cin>>n;
           
           for(i=1;i<=n;i++)
           {
               if(n%i==0)
               {
               cout<<i<<" Es divisor de:"<<n<<'\n';  
               arreglon[acum]=i;
               acum++;           
                            }
           }
           n1=acum;
           acum=0;
           for(i=1;i<=m;i++)
           {
               if(m%i==0)
               {
               cout<<i<<" Es divisor de:"<<m<<'\n'; 
               arreglom[acum]=i;
               acum++;                 
               }
           }
           m1=acum;
           for(i=0;i<n1;i++){
                for(j=0;j<m1;j++){
                      if(arreglon[i]==arreglom[j]){
                            cout<<"El numero "<<arreglon[i]<<" es divisor comun de "<<m<<" y "<<n<<endl;
                            }
                      }
           }
           system("PAUSE");
           return 0;         
           
}
