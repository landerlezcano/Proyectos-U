Proceso Ejercicio5
	Escribir "A continuación ingrese la calificación del estudiante, de 1 al 10"
	Leer a
	Según a Hacer
		10:
			Escribir "Felicitaciones"
		9:
			Escribir "Muy bien"
		8:
			Escribir "Bien"
		7:
			Escribir "Sigue adelante"
		6:
			Escribir "Puedes mejorar"
			
		De Otro Modo:
			Si a>10 o a<=0 Entonces
				Escribir "Asegurese de ingresar una nota del 1 al 10"
			Sino
				Escribir "Reprobó"
			FinSi
	FinSegun
FinProceso
