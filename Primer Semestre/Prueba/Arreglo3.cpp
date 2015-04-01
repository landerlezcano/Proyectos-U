#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int registro[20],num,contador,mayor = 0,menor = 0;
 
    cout<<"A continuacion ingrese 20 numeros"<<endl;
    for (num=0;num<20;num++){     //Ingreso de numeros al arreglo
        cin>>registro[num];
        cout<<endl;
    }
    for (contador=0;contador<20;contador++){
        if (registro[contador]>5){
        mayor++;
        }
        if (registro[contador]<8){
        menor++;                          
        }               
    }
    cout<<"La cantidad de numeros mayores a 5 fue: "<<mayor<<endl;
    cout<<"La cantidad de numeros menores a 8 fue: "<<menor<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;                                    
}
