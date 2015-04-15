#include<cstdlib>
#include<iostream>
using namespace std;
int contadora,contadorb,contadorc = 0;
void generacion(){
    int a,b,c,d;
    a=rand()%101;
    b=rand()%101;
    c=rand()%101;
    if (a>b && a>c){
          d=a;
          contadora++;
    }else{
          if(b>a && b>c){
                 d=b;
                 contadorb++;
          }else{
                d=c;
                contadorc++;
          }
    }
    cout<<a<<"\t"<<b<<"\t"<<c<<endl;
    cout<<d<<endl;
     }
int main(){
    srand(time(NULL));
    int num,acum;
    cout<<contadora<<"\t"<<contadorb<<"\t"<<contadorc<<endl;
    cout<<"--------Inicio-------"<<endl;
    cout<<"Numero de veces"<<endl;
    cin>>num;
    for(acum=0;acum<num;acum++){
            cout<<"----------"<<acum<<"-------"<<"\n";
            generacion();           
    }
    cout<<"FIN"<<endl;
    cout<<contadora<<"\t"<<contadorb<<"\t"<<contadorc<<endl;
    system("PAUSE");
    return 0;
}
