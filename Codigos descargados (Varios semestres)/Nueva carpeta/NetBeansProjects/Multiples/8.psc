Proceso Ejercicio8
	Escribir "Ingrese el monto a pagar en dolares "
		Leer b
		Si b<500 Entonces
			Escribir "No hay descuento"
			escribir " el valor final a pagar es $ ",b;
			
		Sino
			Si b<1000 Entonces
				c<- b*0.05
				
                Escribir "El valor del descuento en su compra es $",c;
				escribir "el valor final a pagar es $", b-c;
			Sino
				Si b<7000 Entonces
					c<-b*0.11
					Escribir "El valor del descuento en su compra es $",c;
					escribir "el valor final a pagar es $", b-c;
				Sino
					Si b<15000 Entonces
						c<-b*0.18
						
                    Escribir "El valor del descuento en su compra es $",c;
					escribir "el valor final a pagar es $", b-c;
					Sino
						c<-b*0.25
						Escribir "El valor del descuento en su compra es $",c;
						escribir "el valor final a pagar es $", b-c;
					FinSi
				FinSi
				
			FinSi
		FinSi
FinProceso
