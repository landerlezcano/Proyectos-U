#include <stdio.h>
#include <math.h>
#include <cstdlib>
using namespace std;
int main()
{
   char str[80];

   sprintf(str, "Value of Pi = %f", M_PI);
   puts(str);
   system("PAUSE");
   return(0);
}
