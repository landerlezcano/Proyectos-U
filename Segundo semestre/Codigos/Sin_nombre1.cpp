#include <iostream>
using namespace std;
class arre{
      public:
             struct arreglo{
                    int n,sig;
                    };
      int insertar(arreglo a[4]);
      void borrar(arreglo a[4],int);
      void mostrar(arreglo a[4],int);
      };
int arre::insertar(arreglo a[]){
     int i=0;
     int aux[4];
     char op;
     do{
     if(i==4){
     cout<<"El arreglo esta lleno"<<endl;
     }
     else{
     cout<<"Digite un numero"<<endl;
     cin>>a[i].n;
     cout<<"Desea insertar otro numero s/n"<<endl;
     cin>>op;
     }
     i++;
     }while(op=='s' && i<5);
    
      cout<<i<<endl;
     return i;
}
    
void arre::borrar(arre a[],int k){
     int borra,aux;
     if(a==NULL){
     cout<<"No hay elementos para borrar"<<endl;
     }else{
     cout<<"Digite el numero que desea borrar\n";
     cin>>borra;
     if(a[k].n==borra){
     free(a);
     cout<<"numero borrado"<<endl;
     }
     }
}
           
void arre::mostrar(arreglo a[],int k){
     int j=0;
     if(a){
     cout<<k<<"Arreglo       ";
     for(j=0;j<k;j++){
     cout<<a[j].n<<"\t";
     } 
     }
     else {
          cout<<"No hay elementos en el arreglo";
          }cout<<endl;
     }
          
int main(){
    arre::arreglo c[4];
    arre obj;
    int opc,z,a;
    do{
    system("cls");
    cout<<"1 para insertar"<<endl;
    cout<<"2 para mostrar"<<endl;
    cout<<"3 para eliminar"<<endl;
    cout<<"4 para salir\t"<<"digite opcion  ";
    cin>>opc;
    switch(opc){
                case 1: {system("cls"); z=obj.insertar(c); system("pause");}
                     break;
                case 2: {system("cls"); obj.mostrar(c,4); system("pause");}
                     break;
                case 3: {system("cls"); obj.borrar(c,a); system("pause");}
                     break;
                
    }     
}while(opc!=4);
system("pause");
    }
