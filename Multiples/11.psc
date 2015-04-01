Proceso Ejercicio11
	Escribir "A continuación ingrese tres números distintos"
	Leer a,b,c
	Si a>b y a>c Entonces
		Si b>c Entonces
			Escribir "El orden de los números de mayor a menor es: ",a ,", ",b," y ",c;
		Sino
			Escribir "El orden de los números de mayor a menor es: ",a ,", ",c," y ",b;
		FinSi
	SiNo 
		Si b>a y b>c Entonces
			Si a>c Entonces
				Escribir "El orden de los números de mayor a menor es: ",b ,", ",a," y ",c;
			Sino
				Escribir "El orden de los números de mayor a menor es: ",b ,", ",c," y ",a;
			FinSi
		SiNo 
			Si a>b Entonces
				Escribir "El orden de los números de mayor a menor es: ",c ,", ",a," y ",b;
			Sino
				Escribir "El orden de los números de mayor a menor es: ",c ,", ",b," y ",a;
			FinSi	
		FinSi
	FinSi
	
FinProceso
