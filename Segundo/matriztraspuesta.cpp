#include<iostream>
using namespace std;
class traspuesta
{
      int **m,f,c,i,j,*col,*fil;
      public:
      traspuesta();
      ~traspuesta();
      void leer(void);
      void mostrarori(void);
      void cambiar(void);};

traspuesta::traspuesta()
{
     f=i=0 ;
     c=j=0 ;
     cout<<"ingrese el tamaño de la matriz"<<endl;
     cin>>f;
     c=f;
     fil=new int[f];
     col=new int[c];
     if (col==NULL||fil==NULL)
     {
                              cout<<"-------------ERROR EN MEMORIA---------------"<<endl;
     }
     m=new int*[f];
     if(m==NULL)
     {
                cout<<"ERROR-----...."<<endl;
     }
     for(j=0;j<f;j++)
     {
                     m[j]=new int[c];
                     if(m[j]==NULL)
                     cout<<"ERROR--------"<<endl;
     } 
     cout<<"construyendo............."<<endl;
}

traspuesta::~traspuesta()
{
     for(j=0;j<f;j++)
     delete m[j];
     delete m;
     delete col;
     delete fil;
     cout<<"destruyendo........"<<endl;
}

void traspuesta::leer(void)
{
     for(i=0;i<f;i++)
     for(j=0;j<c;j++)
     {
                     cout<<"ingrese el numero en posicion"<<"["<<i+1<<"]["<<j+1<<"]"<<endl;
                     cin>>m[i][j];
     }
}

void traspuesta::mostrarori(void)
{
     cout<<"\nesta es la matriz original"<<endl;
     for(i=0;i<f;i++)
     {
                     cout<<endl;
                     for(j=0;j<c;j++)
                     {
                                     if(m[i][j]<10)
                                     cout<<"\t"<<m[i][j];
                                     else
                                     cout<<" "<<m[i][j];
                     }
     }
}

void traspuesta::cambiar(void)
{
     cout<<"\nestas es la traspuesta"<<endl;
     for(i=0;i<c;i++)
     {
                     cout<<endl;
                     for(j=0;j<f;j++)
                     {
                                     if(m[j][i]<10)
                                     cout<<"\t"<<m[j][i];
                                     else
                                     cout<<"\t"<<m[j][i];
                     }
     }
     cout<<endl;
}

int main()
{
    traspuesta a;
    a.leer();
    a.mostrarori();
    a.cambiar();
    system("pause");
}             
