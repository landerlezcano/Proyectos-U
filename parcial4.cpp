#include<iostream>
#include<time.h>
#include<cstdlib>
#include<stdlib.h>
using namespace std;
int aleatorio(){
    int random[10],contador,acum,temp;  
    srand(time(NULL));
    for (contador=0;contador<10;contador++){
        random[contador]=1+rand()%(16-1);
        cout<<random[contador]<<"\t";
    }  
    for (contador=0;contador<10;contador++){
        if ((contador%2)==0){
           acum=acum+random[contador];  
        }
    } 
    cout<<endl;
    return acum;
}

void sumatoria(int temp){
    int num, acum=temp;
    if (acum<50){
    do{cin>>num;
       acum=acum+num;}
    while (acum<50);}
    cout<<"La suma de los numeros ingresados hasta ahora es: "<<acum<<endl;
}
void matriz(){
    int matriz[3][4],i,j,acum=0;
    for (i=0;i<3;i++){
        cout<<"Fila "<<i<<": "<<endl;
        for (j=0;j<4;j++){
            do{
               cin>>matriz[i][j];
               }
            while(matriz[i][j]<0);
            }           
        }
    for (i=0;i<3;i++){
        acum=0;
        cout<<"Suma de fila "<<i<<": ";
        for (j=0;j<4;j++){
                acum = acum +matriz[i][j];
            }
        cout<<acum<<endl;           
        }
    }
int main(){
    int random,temp;
    cout<<"Problema 1"<<endl;  
    random=aleatorio();
    cout<<"La suma de las posiciones pares del arreglo con numeros aleatorios es: "<<random;
    cout<<endl<<endl;  
    cout<<"Problema 2"<<endl; 
    cout<<"A continuacion ingrese varios numeros para que su suma sea 50: "<<endl;
    do{
        cin>>temp;}
    while(temp<0);
    sumatoria(temp);
    cout<<endl<<endl;
    cout<<"Problema 3"<<endl; 
    matriz();
    system("pause");
}
