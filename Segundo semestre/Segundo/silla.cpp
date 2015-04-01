#include <iostream>
#include <conio.h>

using namespace std;

class silla
{
      int **datos, fila, colum, *minc, *maxf,*minf,*maxc;
      public:
             silla();
             ~silla();
             void capturar(void);
             void mincmaxf(void);
             void maxcminf(void);
             void salida(void);
};
silla::silla()
{
    cout<<"Construyendo"<<endl;
    //fila=colum=0;
    cout<<"Ingrese filas y columnas  ";
    cin>>fila>>colum;
    datos= new int *[fila];
    if(datos==NULL)
              cout<<"Error 1\n";
    for(int j=0;j<fila;j++)
    {
            datos[j]=new int[colum];
            if(datos[j]==NULL)
                      cout<<"Error 2\n";        
    }   
    minc= new int[fila];
    if(minc==NULL)
         cout<<"Error 3\n";
    for(int i=0;i<colum;i++)
		minc[i]=1000;
		
    maxf= new int[colum];
    if(maxf==NULL)
         cout<<"Error 4\n";
	for(int i=0;i<fila;i++)
		maxf[i]=(-1000);
		
	minf=new int [colum];
	if(minf==NULL)
		cout<<"Error 5\n";
	for(int i=0;i<fila;i++)
		minf[i]=1000;
	
	maxc= new int [fila];
	if(maxc==NULL)
		cout<<"Error 6\n";
	for (int i=0;i<colum;i++)
		maxc[i]=(-1000);
}
silla::~silla()
{
    for(int i=0;i<colum;i++)
            delete datos;
    delete minc;
    delete maxf;
    cout<<"Destruyendo";           
}
void silla::capturar(void)
{     
     cout<<"Ingrese los datos\n";
     for(int i=0;i<fila;i++)
     {
             for(int j=0;j<colum;j++)
             {
                     cout<<"["<<i+1<<"]"<<"["<<j+1<<"] ";
                     cin>>datos[i][j];
             }
     }
}
void silla::mincmaxf(void)
{
	for (int i=0;i<fila;i++)
	{
		for(int j=0;j<colum;j++)
		{
			if(datos[i][j]>maxf[i])
				maxf[i]=datos[i][j];
			if (datos[i][j]<minc[j])
				minc[j]=datos[i][j];
		}
	}
}
void silla::maxcminf(void)
{
	for (int i=0;i<fila;i++)
	{
		for(int j=0;j<colum;j++)
		{
			if(datos[i][j]<minf[i])
				minf[i]=datos[i][j];
			if (datos[i][j]>maxc[j])
				maxc[j]=datos[i][j];
		}	
	}
}
void silla::salida(void)
{
     for(int i=0;i<fila;i++)
     {
             for(int j=0;j<colum;j++)
             {
                     cout<<datos[i][j]<<"\t";
             }
             cout<<endl;
     }
     cout<<endl;
     for (int i=0;i<fila;i++)
	{
		for(int j=0;j<colum;j++)
		{
			if(minf[i]==maxc[j])
				cout<<"Punta de silla # "<<minf[i]<<" posc "<<i+1<<j+1<<endl;
		}
	}
	for (int i=0;i<fila;i++)
	{
		for(int j=0;j<colum;j++)
		{
			if(maxf[i]==minc[j])
				cout<<"Punta de silla # "<<maxf[i]<<" posc "<<i+1<<j+1<<endl;
		}
	}
}
int main ()
{
    silla m;
    m.capturar();
    m.mincmaxf();
    m.maxcminf();
    m.salida();
    getch();
    //system("pause");
    return 0;
}
