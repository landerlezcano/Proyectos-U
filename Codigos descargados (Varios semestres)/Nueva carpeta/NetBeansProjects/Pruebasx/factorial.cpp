#include "iostream"
#include "cstdlib"
using namespace std;
class fac{
      private:
              int m,n,i,t,o,aux,s;
              float f;
      public:
             void leer(void);
             void proceso(void);
             void factorial(void);
             void imprimir(int num1, float num2);
      };
      void fac::leer(void){
           cout<<"Digite dos numeros"<<'\n';
           cout<<"Digite el primer numero"<<'\n';
           cin>>m;
           cout<<"Digite el segundo numero"<<'\n';
           cin>>n;
           }
      void fac::proceso(void){
           if(n<m){
           aux=n;
           n=m;
           m=aux;
           }
           cout<<"n:"<<n<<endl;
           cout<<"m:"<<m<<endl;
           }
      void fac::factorial(void){
           int o;
           int cont=1;
           f=1;
           for(cont=m;cont<=n;cont++){
                   for(o=cont;o>=1;o--){
                   f=f*o;
                   }
                   imprimir(cont,f);
                   f=1;
               }
               
           }
      void fac::imprimir(int num1, float num2){
                   cout<<"el factorial de "<<num1<<" es: "<<num2<<'\n';
           }
      int main(){
          fac dos;
          dos.leer();
          dos.proceso();
          dos.factorial();
          system("pause");
          }
