#include "iostream"
#include "cstdlib"
using namespace std;
class orden{
      private:
              int n[50],i,j,a;
      public:
             void leer(void);
             void parar(void);
             void proceso(void);
             void imprimir(void);
      };
     void orden::leer(void){
           cout<<"Digite la cantidad de numeros que quiera y oprima el numero 0(cero) cuando no se quiera digitar mas numeros"<<'\n';
     for(i=0; i<50; i++){
     cin>>n[i];
     if(n[i]==0){break;}
     }    
     }
      void orden::proceso(void){
       for(i=0;i<50;i++){
           for(j=0;j<50;j++){
               if(n[j]>n[j+1]){
               a=n[j];
               n[j]=n[j+1];
               n[j+1]=a;                
               }
           }
       }
           }
      void orden::imprimir(void){
                cout<<"Estos son los numeros que ingreso ordenados de menor a mayor"<<'\n'<<endl;
                for(int acum=0;acum<50;acum++){
                        cout<<n[acum]<<'\n';
                        }
                }
      int main(){
          orden mm;
          mm.leer();
          mm.proceso();
          mm.imprimir();
          system("pause");
          }
