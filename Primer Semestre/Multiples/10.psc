Proceso Ejercicio10
	Escribir "Ingrese su edad, para calcular el costo de la entrada"
	Leer a
	Si a<=13 Entonces
		Escribir "El costo de la entrada es de $3000 pesos"
	Sino
		Si a<60 Entonces
			Escribir "El costo de la entrada es de $6000 pesos"
		SiNo 
			Si a>=60 Entonces
				Escribir "El costo de la entrada es de $4000 pesos"
			Sino
				Escribir "Asegurese de ingresar un valor válido en la edad"
			FinSi
		FinSi
	FinSi
FinProceso
