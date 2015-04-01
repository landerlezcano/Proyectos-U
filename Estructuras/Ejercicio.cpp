#include<iostream>
#include<stdio.h>
#include<conio.h>
#include<cstdlib>

using namespace std;

struct paciente{
	double codigo;
 	char nombre[20];
 	char sexo[10];
 	char fechaNacimiento[20];
 	char rh[10];
 	char carrera[20];
 }pac;  
 paciente p[100];
 
 struct cita{
	double codigo;
 	char fechaCita[20];
 	char diagnostico[30];
	char especialista[20];
 }date;  
 cita c[100];
 
 int i;int l = 0;
 int j,m;
 int clave=0;
 
 int leerPaciente(){
       char opcion;
       i=0;
       do{
          p[i]=pac;
           inicio:
           cout<<"\nCodigo: ";cin>>p[i].codigo;
               for(j=0;j<i;j++){
               if(p[i].codigo==p[j].codigo)
               {
                cout<<"Este codigo de paciente ya esta siendo usado"<<endl;
                goto inicio;                                                    
               }
              }
           cout<<"Nombre: ";cin>>p[i].nombre;cin>>p[i].nombre;cin>>p[i].nombre;
           cout<<"Sexo: ";cin>>p[i].sexo;
           cout<<"Fecha de nacimiento: ";cin>>p[i].fechaNacimiento; 
		   cout<<"RH: ";cin>>p[i].rh;
           cout<<"Carrera: ";cin>>p[i].carrera;  
           cout<<"\nDesea ingresar otro paciente? s/n: ";cin>>opcion;   
           i++; 
       }while(opcion=='s' && i<100);
       return i;
       }
 void mostrarPaciente() {
          int k=0;
          system("cls");  
          while (k<i)
       {    
         cout<<"\n\n................................\n\n";
         cout<<"Codigo: "<<p[k].codigo<<endl;
         cout<<"Nombre: "<<p[k].nombre<<endl;
          cout<<"Sexo: "<<p[k].sexo<<endl;
          cout<<"Fecha de nacimiento: "<<p[k].fechaNacimiento<<endl; 
		  cout<<"RH: "<<p[k].rh<<endl;
          cout<<"Carrera: "<<p[k].carrera<<endl; 
         k++;
       }
       cout<<"\n\nPresione cualquier letra para continuar.";
       getch();
  }
  void modificarPaciente(int y){
       char opcion2;
         int k, t=0;
         cout<<"\nDesea modificar algun paciente? s/n: ";cin>>opcion2;
         if(opcion2=='s')
         {
         do{
         cout<<"\nIngrese el codigo del paciente que desea modificar: ";cin>>clave;
         for(k=0;k<y;k++){
          if(clave==p[k].codigo){
          cout<<"Ingrese los datos del articulo: "<<endl;
          cout<<"Nombre: ";gets(p[k].nombre);
          cout<<"Nombre: ";gets(p[k].nombre);
          cout<<"Sexo: ";cin>>p[i].sexo;
          cout<<"Fecha de nacimiento: ";cin>>p[i].fechaNacimiento; 
		  cout<<"RH: ";cin>>p[i].rh;
          cout<<"Carrera: ";cin>>p[i].carrera;   
          mostrarPaciente();
         }else{
             t=1;
		 }
         }
         }while(t!=0);
             
         };
}
void leerCitas(){
	char opcion;
	   int aux = l;
	       do{
	          c[aux]=date;
	           inicio1:
	           cout<<"\nCodigo: ";cin>>c[aux].codigo;
	               for(j=0;j<aux;j++){
	               if(c[aux].codigo==c[j].codigo)
	               {
	                cout<<"Este codigo de cita ya esta siendo usado"<<endl;
	                goto inicio1;                                                    
	               }
	              }
	           cout<<"Codigo: ";cin>>c[aux].codigo;
	           cout<<"Fecha de la cita: ";cin>>c[aux].fechaCita; 
			   cout<<"Diagnostico: ";cin>>c[aux].diagnostico;
	           cout<<"Especialista: ";cin>>c[aux].especialista;  
	           cout<<"\nDesea ingresar otra cita? s/n: ";cin>>opcion;   
	           aux++; 
	       }while(opcion=='s' && aux<100);
   	   l=aux;
}

void mostrarCitas(){
	m=0;
	if(l==0){
		cout<<"\nNo hay citas asignadas\n";
	}else{
	      system("cls");  
          while (m<l)
       {    
         cout<<"\n\n................................\n\n";
         cout<<"Codigo: "<<c[m].codigo<<endl;
          cout<<"Fecha de la cita: "<<c[m].fechaCita<<endl;
          cout<<"Diagnostico: "<<c[m].diagnostico<<endl; 
		  cout<<"Especialista: "<<c[m].especialista<<endl;
         m++;
       }
       cout<<"\n\nPresione cualquier letra para continuar.";
       getch();
	}
}

int modificarCitas(){
       char opcion2;
	    int aux;
		int t=0;
         cout<<"\nDesea modificar alguna cita? s/n: ";cin>>opcion2;
         if(opcion2=='s')
         {
         do{
         cout<<"\nIngrese el codigo del paciente que desea modificar: ";cin>>clave;
         for(aux=0;aux<l;aux++){
          if(clave==c[aux].codigo){
          cout<<"Ingrese los datos de la cita: "<<endl;
          cout<<"Codigo: ";cin>>c[aux].codigo;
	           cout<<"Fecha de la cita: ";cin>>c[aux].fechaCita; 
			   cout<<"Diagnostico: ";cin>>c[aux].diagnostico;
	           cout<<"Especialista: ";cin>>c[aux].especialista;   
          mostrarCitas();
         }else{
             t=1;
		 }
         }
         }while(t!=0);
             
         };
}

  int main(){
  	cout<<"\tAdministracion de pacientes y citas\nUniversidad Distrital Francisco Jose de Caldas\n"<<endl;
      int x,opc;
      x=leerPaciente();
	  do{
	  	  system("cls");
	      cout<<"Ingrese a continuacion una de las siguientes opciones:\n";
	      cout<<"1. Mostrar pacientes\n";
	      cout<<"2. Modificar pacientes\n";
	      cout<<"3. Leer citas\n";
	      cout<<"4. Mostrar citas\n";
	      cout<<"5. Modificar citas\n";
	      cout<<"6. Salir\n";
	      do{
	      	cin>>opc;
	  	  }while(opc<0 && opc>6);
	      switch(opc){
	      	  case 1:
			      mostrarPaciente();
			      break;
		      case 2:
			      modificarPaciente(x);
			      break;
			  case 3:
			      leerCitas();
			      break;
			  case 4:
			      mostrarCitas();
			      break;
			  case 5:
			      modificarCitas();
			      break;
			  case 6:
			  	  break;
			  default:
			  		break;
	  	  }
  		}while(opc!=6);
      system("PAUSE");

      }
