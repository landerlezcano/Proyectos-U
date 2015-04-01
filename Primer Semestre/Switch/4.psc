Proceso Ejercicio4
	Definir a,b Como Real
	Escribir "Ingrese dos números a operar"
	Leer a,b
	Escribir "A continuación seleccione la operación que desea realizar con los dos números"
	Escribir "Para seleccionar la operación, escriba: s para suma, r para resta, m para multiplicación y d para división";
	Leer c
	Según c Hacer
		's':
			Escribir "El resultado de la suma es : ",a+b;
		'r':
			Escribir "El resultado de la resta es : ",a-b;
		'm':
			Escribir "El resultado de la multiplicación es : ",a*b;
		'd':	
			Escribir "El resultado de la división es : ",a/b;
				
		De Otro Modo:
			Escribir "La letra ingresada no corresponde a una operación"
	FinSegun
FinProceso
