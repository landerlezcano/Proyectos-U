Proceso Ejercicio2
	Escribir " A continuación ingrese el valor de su compra"
	Leer a
	Escribir "a continuación ingrese un número del 1 al 7 según el color de la bolita para efectuar el descuento a su compra";
	Escribir "Los valores de los colores son: Blanca = 1, Verde = 2, Amarilla = 3, Azul = 4, Roja = 5"
	Leer b
	Según b Hacer
		1:
			Escribir "No tiene descuento, debe pagar $",a;
		2:
			c<-a*0.10
			Escribir "El valor final de la compra es $",a-c;
		3:	
			c<-a*0.25
			Escribir "El valor final de la compra es $",a-c;
		4:
			c<-a*0.50
			Escribir "El valor final de la compra es $",a-c;
		5:
			Escribir "El descuento de su compra es del 100%, no debe pagar"
		De Otro Modo:
			Escribir "Ese color no corresponde a los del descuento"
	FinSegun
FinProceso
