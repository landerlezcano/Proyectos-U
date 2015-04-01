#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int media[5];
    int num, contador;
    float acum = 0;
    cout<<"A continuacion ingrese 5 numeros"<<endl;
    for (num=0;num<5;num++){
        cin>>media[num];
        cout<<endl;
    }
    cout<<"La media aritmetica de los numeros ingresados al arreglo es ";
    for(contador=0;contador<5;contador++){
        acum=acum+media[contador];                                                                        
    }
    acum = acum/5;
    cout<<acum<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;                                    
}
