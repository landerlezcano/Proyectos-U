#include<iostream>
#include<stdio.h>

using namespace std;


struct articulo{
	double codigo;
 	char nombre[20];
	float peso,longitud;
 }art;  
 articulo s[100];
 
 
 int i;
 int j;
 int clave=0;
 int band=0;

  int leerdatos(){
       char opcion;
       i=0;
       do{
          s[i]=art;
           inicio:
           cout<<"\nCodigo: ";cin>>s[i].codigo;
               for(j=0;j<i;j++){
               if(s[i].codigo==s[j].codigo)
               {
                cout<<"Este codigo de articulo ya esta siendo usado"<<endl;
                goto inicio;                                                    
               }
              }
           cout<<"Nombre: ";cin>>s[i].nombre;
           cout<<"Peso: ";cin>>s[i].peso;
           cout<<"Longitud: ";cin>>s[i].longitud;   
           cout<<"\nDesea ingresar otro registro? s/n: ";cin>>opcion;   
           i++; 
       }while(opcion=='s' && i<100);
       return i;
       }
       
  void mostrar() {
          int k=0;
          system("cls");  
          while (k<i)
       {    
         cout<<"\n\n................................\n\n  codigo\t: "<<s[k].codigo<<" \n  nombre\t: "<<s[k].nombre<<" \n  peso\t\t: "<<s[k].peso<<" \n  longitud\t: "<<s[k].longitud<<endl;
         k++;
       }
  }
  void modificar(int y){
       char opcion2;
         int k, t=0;
         cout<<"\nDesea modificar algun articulo? s/n: ";cin>>opcion2;
         if(opcion2=='s')
         {
         do{
         cout<<"\nIngrese el codigo del articulo que desea modificar: ";cin>>clave;
         for(k=0;k<y;k++){
          if(clave==s[k].codigo){
          cout<<"Ingrese los datos del articulo: "<<endl;
          cout<<"Nombre: ";gets(s[k].nombre);
          cout<<"Nombre: ";gets(s[k].nombre);
          cout<<"Peso: ";cin>>s[k].peso;
          cout<<"Longitud: ";cin>>s[k].longitud; 
          mostrar();
         }
         else
         {
             t=1;}
             }
             }while(t!=0);
             
             };
}
  int main(){
      int x;
      x=leerdatos();
      mostrar();
      modificar(x);
      
      system("PAUSE");

      }
       
