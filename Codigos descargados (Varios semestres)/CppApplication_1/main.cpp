/* 
 * File:   main.cpp
 * Author: Yair
 *
 * Created on 29 de noviembre de 2014, 10:53 AM
 */

#include <iostream>
#include <stdio.h>
#include <windows.h>
using namespace std;
class banco{
      int ID;
      char cliente[50];
      float saldo, cuenta;
      banco *sig,*ant;
      public:
             banco* leer(void);
             void insertarcola(banco*&cola);
             banco* borrarcola(banco *cola);
             void imprimir(banco *cola);
      };
      
banco* banco::leer(void){
banco *nuevo=NULL;
nuevo= new banco;
cout<<"Ingrese nombre"<<endl;
gets(nuevo->cliente);
gets(nuevo->cliente);
cout<<"Ingrese identificacion"<<endl;
cin>>nuevo->ID;
cout<<"Ingrese numero de cuenta"<<endl;
cin>>nuevo->cuenta;
return (nuevo);
}
      
void banco::insertarcola(banco *&cola){
banco *nuevo=leer();
banco *aux=NULL;
if (cola){
          aux=cola;
          while(aux->sig!=NULL){
          aux=aux->sig;
          }
          aux->sig=nuevo;
          nuevo->ant=aux;
          nuevo->sig=NULL;
          }else{
	          cola=nuevo;
	          cola->sig=NULL;
	          cola->ant=NULL;
          }
}
banco* banco::borrarcola(banco *cola){
banco *aux;
if(cola){
         aux=cola;
         
         cola=cola->sig;
         cola->ant=NULL;
         delete(aux);
         }
         else{
         cout<<"No hay cliente en la fila"<<endl;
         }
         return (cola);
}
void banco::imprimir(banco *cola){
if(cola){
         while(cola->sig!=NULL){
         cola=cola->sig;
         }
         while(cola!=NULL){
         cout<<"Identificacion "<<ID<<endl;
         cout<<"Nombre "<<cliente<<endl;
         cola=cola->ant;
         }
         }
         else{
              cout<<"No hay clientes en la fila"<<endl;
              }
}
int main(){
int opc;
banco obj,*cola1,*cola2,*cola3,*nuevo;
do{
//system("cls");
cout<<"SISTEMA BANCARIA"<<endl;
cout<<"1 hacer fila"<<endl;
cout<<"2 Atender"<<endl;
cout<<"3 mostrar fila"<<endl;
cout<<"4 Salir"<<endl;
cin>>opc;
switch(opc){
            case 1: {int opcion;
                     //system("cls");
                     cout<<"1 En pedir credito"<<endl;
                     cout<<"2 En pagar servicios"<<endl;
                     cout<<"3 En "<<endl;
                     cin>>opcion;
                     switch(opcion){
                                    case 1: {//system("cls");
                                            //obj.leer()
                                            cout<<"aa"<<endl;
                                            obj.insertarcola(cola1);
                                            cout<<"Espere en la fila..."<<endl;
                                            }break;
                                    case 2: {system("cls");
                                            //obj.leer();
                                            obj.insertarcola(cola2);
                                            cout<<"Espere en la fila..."<<endl;
                                            }break;
                                    case 3: {system("cls");
                                            //obj.leer();
                                            obj.insertarcola(cola3);
                                            cout<<"Espere en la fila..."<<endl;
                                            }break;
                                    case 4: {//system("cls");
									}break;
                                    default: {//system("cls");
                                             cout<<"Esa fila no esta disponible"<<endl;
                                             }break;
                                    }
                    }break;
            case 2: {int opcion1;
                     //system("cls");
                     cout<<"1 La fila de credito"<<endl;
                     cout<<"2 La fila de pago de servicios"<<endl;
                     cout<<"3 La fila de "<<endl;
                     cin>>opcion1;
                     switch(opcion1){
                                     case 1: {//system("cls");
                                             obj.borrarcola(cola1);
                                              
                                             }break;
                                     case 2: {//system("cls");
                                             obj.borrarcola(cola2);
                                              
                                             }break;
                                     case 3: {//system("cls");
                                             obj.borrarcola(cola3);
                                              
                                             }break;
                                     case 4: {//system("cls");
									 }break;
                                     default: {//system("cls");
                                               cout<<"No existe fila"<<endl;
                                                
                                              }break;
                                     }
                    }break;
            case 3: {int opcion2;
                     //system("cls");
                     cout<<"1 Ver los clientes de la fila de credito"<<endl;
                     cout<<"2 Ver los clientes de la fila de pago de servicios"<<endl;
                     cout<<"3 Ver los clientes de la fila de "<<endl;
                     cin>>opcion2;
                     switch(opcion2){
                                     case 1: {//system("cls");
                                              obj.imprimir(cola1);
                                               
                                             }break;
                                     case 2: {//system("cls");
                                              obj.imprimir(cola2);
                                               
                                             }break;
                                     case 3: {//system("cls");
                                              obj.imprimir(cola3);
                                               
                                             }break;
                                     case 4: {//system("cls");
									 }
									 break;
                                     default: {//system("cls");
                                               cout<<"No existe fila"<<endl;
                                                
                                              }break;
                                     }
                    }break;
            case 4: {//system("cls");
			}			break;
            default: {//system("cls");
                      cout<<"opcion invalida"<<endl;
                       
                     }break;
            }
}while(opc!=4);
cout<<"\n\n\t\tNicolas garcia"<<endl;
Sleep(1500);
system("pause");
}