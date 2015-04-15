#include<iostream>
int factorial(int n)
{
  if(n<2)
    return 1;
  else
    return n * factorial(n-1);
}
int main()
{
  int num=0;
  printf("::CALCULAR FACTORIAL::n");
  printf("Introduce un numero: ");scanf("%i",&num); //Pedir variable num
  printf("tEl resultado es: %in", factorial(num)); //Llama la funcion e imprime resultado
  system("PAUSE");
  return 0;
}
