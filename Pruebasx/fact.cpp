#include <iostream>
using namespace std;
void nuevaEntrada(double var[],int b, int c);
double calculoFactorial(int a);
void mostrarArreglo(double var[],int n);
void leerNumero(int &var);
void ordenar(int &n,int &m);
void ordenar(int &n,int &m){    //i siempre va a ser mayor a j
       int aux;
       if(n<m){
           aux=n;
           n=m;
           m=aux;
           }
     }
void leerNumero(int &var){      //solicita numero al usuario implementando referencia
     
     do{
     cin>>var;
     }while(var<1);
     }
void nuevaEntrada(double var[], int b, int c){        //acumula en el vector los factoriales de cada número
     for(int acum=0;acum<=b;acum++){
                var[acum]= calculoFactorial(c);
                c++;
                }
     }
double calculoFactorial(int a){                       //realiza el calculo del factorial
      int cont=a;
      double f;
           f=1;
           for(int o=cont;o>=1;o--){
           f=f*o;
           }
      return f;
      }
void mostrarArreglo(double var[],int n){              //muestra el arreglo que recibe como argumento
     for(int i=0;i<n;i++){
             cout<<var[i]<<"\n";
             }
     cout<<"\n";
     }
int main(){
    int i,j,n;
    cout<<"Ingrese dos numeros para hallar los factoriales entre ese rango"<<"\n";
    leerNumero(i);
    leerNumero(j);
    ordenar(i,j);
    n=(i-j)+1;
    double array[n];
    nuevaEntrada(array,n,j);
    mostrarArreglo(array,n);
    system("PAUSE");
    return 0;
}
