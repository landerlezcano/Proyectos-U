Proceso Ejercicio4
	Definir a,b Como Real
	Escribir "Ingrese dos n�meros a operar"
	Leer a,b
	Escribir "A continuaci�n seleccione la operaci�n que desea realizar con los dos n�meros"
	Escribir "Para seleccionar la operaci�n, escriba: s para suma, r para resta, m para multiplicaci�n y d para divisi�n";
	Leer c
	Seg�n c Hacer
		's':
			Escribir "El resultado de la suma es : ",a+b;
		'r':
			Escribir "El resultado de la resta es : ",a-b;
		'm':
			Escribir "El resultado de la multiplicaci�n es : ",a*b;
		'd':	
			Escribir "El resultado de la divisi�n es : ",a/b;
				
		De Otro Modo:
			Escribir "La letra ingresada no corresponde a una operaci�n"
	FinSegun
FinProceso
