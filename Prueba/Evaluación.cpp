#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    float acum = 0,contador,herencia,persona1,persona2,persona3;
    int num;
    do{
    cout<<"Ingrese un numero: "<<endl;        
    cin>>num;}
    while(num<=0);
    if (num<=10){
       for(contador=num;contador<=50;contador++){
              acum=acum+contador;                                      
       }
       cout<<"El resultado de la suma de los numeros desde "<<num<<" hasta 50 es: "<<acum<<endl;
       if(acum>1256){
                     for(contador=0;contador<=10;contador++){
                                 cout<<num<<"*"<<contador<<"="<<num*contador<<endl;
                     }
       }                    
    }
    else{
         if ((num%2)==0){
            cout<<"El numero ingresado es par"<<endl;
            acum=num*num*num;
            cout<<"El cubo del numero ingresado es: "<<acum<<endl;
            if (acum>3000){
               cout<<"Ingrese el monto de la herencia: "<<endl;
               cin>>herencia;
               persona1 = herencia*0.225;
               persona2 = persona1*0.6;
               persona3 = herencia-persona1-persona2;
               cout<<"Herencia persona 1: "<<persona1<<endl;
               cout<<"Herencia persona 2: "<<persona2<<endl;
               cout<<"Herencia persona 3: "<<persona3<<endl;
               
            }
         }     
    }
    system ("PAUSE");
    return EXIT_SUCCESS; 
}    
    
