#include "iostream"
#include "cstdlib"
using namespace std;
class fac{
      private:
              int m,n,i,t,o,aux,s;
              long double f;
      public:
             void leer(void);
             void ordenar(void);
             void proceso(void);
             void imprimir(void);
      };
      void fac::leer(void){
           cout<<"Digite dos numeros"<<'\n';
           cout<<"Digite el primer numero"<<'\n';
           cin>>m;
           cout<<"Digite el segundo numero"<<'\n';
           cin>>n;
           }
      void fac::ordenar(void){
           if(n<m){
           aux=n;
           n=m;
           m=aux;
           }
           }
      void fac::proceso(void){
           int cont=1;
           f=1;
           for(cont=m;cont<=n;cont++){
                   for(o=cont;o>=1;o--){
                   f=f*o;
                   s=f;
                   }
                  
                   f=1;
               }    
           }
      void fac::imprimir(void){
           int cont=1;
           for(i=m;i<=n;i++){
           for(o=cont;o>=1;o--){
           cout<<"el factorial de "<<i<<" es: "<<s<<'\n';
           }
           }
           }
      int main(){
          fac dos;
          dos.leer();
          dos.ordenar();
          dos.proceso();
          dos.imprimir();
          system("pause");
          }
