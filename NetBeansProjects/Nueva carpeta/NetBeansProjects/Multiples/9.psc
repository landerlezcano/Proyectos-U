Proceso Ejercicio9
	Escribir "A continuación ingrese el valor de la compra"
	Leer a
	Escribir "Ahora ingrese el color de bolita que sacó para aplicar el descuento"
	Escribir "Recuerde que a la hora de ingresar los colores las opciones posibles son: blanca, verde, amarilla, azul y roja. En minúsculas"
	Leer b
	Si b="blanca" Entonces
		Escribir "No tiene descuento, debe pagar $",a;
	Sino
		Si b="verde" Entonces
			c<-a*0.10
			Escribir "El valor final de la compra es $",a-c;
		Sino
			Si b="amarilla" Entonces
				c<-a*0.25
				Escribir "El valor final de la compra es $",a-c;
			Sino
				Si b="azul" Entonces
					c<-a*0.50
					Escribir "El valor final de la compra es $",a-c;
				Sino
					Si b="roja" Entonces
						Escribir "El descuento de su compra es del 100%, no debe pagar"
					Sino
						Escribir "Ese color no corresponde a los del descuento"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
