Proceso Punto5
	Definir a,b,c Como Real
	Escribir "A continuación ingrese número para comprobar si es múltiplo del 3"
	Leer a
	b<-a MOD 3
	Si b=0 Entonces
		c=a^3
		Escribir "El número ", a, " es múltiplo del 3, y su cubo es : ",c
	FinSi
FinProceso
