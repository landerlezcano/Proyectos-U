#include <iostream>
#include <cstdlib>
#include <conio.h>
#define TAM 3


using namespace std;

struct Proveedor{
	char nombre_proveedor[80];
	long telefono_proveedor;
	char direccion_proveedor[80];
};

struct Cliente{
	char nombre_cliente[80];
	long telefono_cliente;
	char direccion_cliente[80];
};

struct Empleado{
	char nombre_empleado[80];
	char cargo_empleado[80];
	long telefono_empleado;
	char direccion_empleado[80];
};

struct Producto{
	char nombre_producto[80];
	char marca_producto[50];
	char codigo_producto[50];
};

void ingresarProveedor(Proveedor* aux, int tam, int posicion){
	Proveedor aux1;
	if (posicion<tam){
		fflush(stdin);
		cout << "Nombre del cliente: " << endl;
		gets(aux1.nombre_proveedor);
		fflush(stdin);
		cout << "Telefono del cliente: " << endl;
		cin>>aux1.telefono_proveedor;
		fflush(stdin);
		cout << "Direccion del cliente: " << endl;
		gets(aux1.direccion_proveedor);
		fflush(stdin);
		aux[posicion] = aux1;
	}else{
		cout << "No hay espacio disponible" << endl;
	}
}
void ingresarCliente(Cliente* aux, int tam, int posicion){
	Cliente aux1;
	if (posicion<tam){
		fflush(stdin);
		cout << "Nombre del cliente: " << endl;
		gets(aux1.nombre_cliente);
		fflush(stdin);
		cout << "Telefono del cliente: " << endl;
		cin >> aux1.telefono_cliente;
		fflush(stdin);
		cout << "Direccion del cliente: " << endl;
		gets(aux1.direccion_cliente);
		fflush(stdin);
		aux[posicion] = aux1;
	}else{
		cout << "No hay espacio disponible" << endl;
	}
}
void ingresarEmpleado(Empleado* aux, int tam, int posicion){
	Empleado aux1;
	if (posicion<tam){
		fflush(stdin);
		cout << "Nombre del empleado: " << endl;
		gets(aux1.nombre_empleado);
		fflush(stdin);
		cout << "Telefono del empleado: " << endl;
		cin >> aux1.telefono_empleado;
		fflush(stdin);
		cout << "Direccion del empleado: " << endl;
		gets(aux1.direccion_empleado);
		fflush(stdin);
		cout << "Cargo del empleado: " << endl;
		gets(aux1.cargo_empleado);
		fflush(stdin);
		aux[posicion] = aux1;
	}else{
		cout << "No hay espacio disponible" << endl;
	}
}
void ingresarProducto(Producto * aux, int tam, int posicion){
	Producto aux1;
	if (posicion<tam){
		fflush(stdin);
		cout << "Nombre del producto: " << endl;
		gets(aux1.nombre_producto);
		fflush(stdin);
		cout << "Marca del producto: " << endl;
		gets(aux1.marca_producto);
		fflush(stdin);
		cout << "Codigo del producto: " << endl;
		gets(aux1.codigo_producto);
		fflush(stdin);
		aux[posicion] = aux1;
	}else{
		cout << "No hay espacio disponible"<<endl;
	}

}

void mostrarProveedores(Proveedor* aux, int tope){
	if (tope != 0){
		for (int i = 0; i < tope; i++){
			cout << "------------------------------------------------------" << endl;
			cout << "\nProveedor no." << i + 1 << " : " << endl;
			cout << "\nNombre del proveedor: \n";
			cout << aux[i].nombre_proveedor << endl;
			cout << "\nTelefono del proveedor:\n";
			cout << aux[i].telefono_proveedor << endl;
			cout << "\nDireccion del proveedor:\n";
			cout << aux[i].direccion_proveedor << endl;
			cout << "------------------------------------------------------" << endl;
		}
	}else{
		cout << "No se han anadido proveedores." << endl;
	}
}

void mostrarClientes(Cliente* aux, int tope){
	if (tope != 0){
		for (int i = 0; i < tope; i++){
			cout << "------------------------------------------------------" << endl;
			cout << "\nCliente no." << i + 1 << " : " << endl;
			cout << "\nNombre del cliente: \n";
			cout << aux[i].nombre_cliente << endl;
			cout << "\nTelefono del cliente:\n";
			cout << aux[i].telefono_cliente << endl;
			cout << "\nDireccion del cliente:\n";
			cout << aux[i].direccion_cliente << endl;
			cout << "------------------------------------------------------" << endl;
		}
	}else{
		cout << "No se han anadido clientes." << endl;
	}
}

void mostrarEmpleados(Empleado* aux, int tope){
	if (tope != 0){
		for (int i = 0; i < tope; i++){
			cout << "------------------------------------------------------" << endl;
			cout << "\nEmpleado no." << i + 1 << " : " << endl;
			cout << "\nNombre del empleado:\n";
			cout << aux[i].nombre_empleado;
			cout << "\nTelefono del empleado:\n";
			cout << aux[i].telefono_empleado;
			cout << "\nDireccion del empleado:\n";
			cout << aux[i].direccion_empleado;
			cout << "\nCargo del empleado:\n";
			cout << aux[i].cargo_empleado;
			cout << "------------------------------------------------------" << endl;
		}
	}else{
		cout << "No se han anadido empleados." << endl;
	}
}

void mostrarProductos(Producto * aux, int tope){
	if (tope != 0){
		for (int i = 0; i < tope; i++){
			cout << "------------------------------------------------------" << endl;
			cout << "\nProducto no." << i + 1 << " : " << endl;
			cout << "\nCódigo del producto:\n";
			cout << aux[i].codigo_producto;
			cout << "\nNombre del producto:\n";
			cout << aux[i].nombre_producto;
			cout << "\nMarca del producto:\n";
			cout << aux[i].marca_producto;
			cout << "------------------------------------------------------" << endl;
		}
	}else{
		cout << "No se han anadido productos." << endl;
	}
}

int main()
{
	Cliente array_clientes[TAM];
	int numClientesAnadidos = 0;
	Empleado array_empleados[TAM];
	int numEmpleadosAnadidos = 0;
	Producto array_productos[TAM];
	int numProductosAnadidos = 0;
	Proveedor array_proveedores[TAM];	int numProveedoresAnadidos = 0;
	int opc1=0, opc2;
	do{
		opc1 = 0;
		system("CLS");
		cout << "------------------------------------------------------" << endl;
		cout << "EMPRESA BIENESTAR S.A" << endl;
		cout << "Bienvenido!"<<endl;
 		cout << "------------------------------------------------------" << endl;
		cout << "\n\n" << "A continuacion escoga una de las siguientes opciones: \n\n";
		cout << "1. Proveedores." << endl;
		cout << "2. Clientes." << endl;
		cout << "3. Empleados." << endl;
		cout << "4. Productos." << endl;
		cout << "5. Salir.\n" << endl;
		cin >> opc1;
		system("CLS");
		switch (opc1){
			case 1:
				do{
					opc2 = 0;
					system("CLS");
					cout << "------------------------------------------------------" << endl;
					cout << "1. Proveedores." << endl;
					cout << "------------------------------------------------------" << endl;
					cout << "\n\n" << "A continuacion escoga una de las siguientes opciones: \n\n";
					cout << "1. Nuestros proveedores." << endl;
					cout << "2. Registrar proveedor." << endl;
					cout << "3. Mostrar lista de proveedores." << endl;
					cout << "4. Volver.\n" << endl;
					cin >> opc2;
					system("CLS");
					switch (opc2){
					case 1:
						cout << "------------------------------------------------------" << endl;
						cout << "1. Nuestros proveedores:\n";
						cout << "------------------------------------------------------" << endl;
						cout << "Los socios comerciales le dan vida al negocio del mercado al detal, por eso\n";
						cout << "nuestra empresa trabaja para ofrecerles oportunidades comerciales atractivas y\n";
						cout << "procesos de colaboracion que les permitan crecer en los aspectos económicos, sociales,";
						cout << "ambientales y laborales." << endl;
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 2:
						cout << "------------------------------------------------------" << endl;
						cout << "2. Registrar proveedor:\n";
						cout << "------------------------------------------------------" << endl;
						ingresarProveedor(array_proveedores,TAM,numProveedoresAnadidos);
						cout << "Presione cualquier tecla para continuar..." << endl;
						getch();
						numProveedoresAnadidos++;
						break;
					case 3:
						cout << "------------------------------------------------------" << endl;
						cout << "3. Mostrar lista de proveedores:\n";
						cout << "------------------------------------------------------" << endl;
						mostrarProveedores(array_proveedores, numProveedoresAnadidos);
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 4:
						break;
					default:
						cout << "Opcion no valida, intente de nuevo..." << endl;
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					}
				} while (opc2!=4);
				break;
			case 2:
				do{
					opc2 = 0;
					system("CLS");
					switch (opc2){
					case 1:
						cout << "------------------------------------------------------" << endl;
						cout << "1. Registrar cliente:\n";
						cout << "------------------------------------------------------" << endl;
						ingresarCliente(array_clientes, TAM, numClientesAnadidos);
						cout << "Presione cualquier tecla para continuar..." << endl;
						getch();
						numClientesAnadidos++;
						break;
					case 2:
						cout << "------------------------------------------------------" << endl;
						cout << "3. Mostrar lista de clientes:\n";
						cout << "------------------------------------------------------" << endl;
						mostrarClientes(array_clientes,numClientesAnadidos);
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 3:
						break;
					default:
						cout << "Opcion no valida, intente de nuevo..." << endl;
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					}
					
				} while (opc2 != 3);
				
				break;
			case 3:
				do{
					opc2 = 0;
					system("CLS");
					switch (opc2){
					case 1:
						cout << "------------------------------------------------------" << endl;
						cout << "1. Nuestra gente:\n";
						cout << "------------------------------------------------------" << endl;
						cout << "Somos una compania exitosa, hemos alcanzado todas las metas que nos\n";
						cout << "hemos propuesto, cada vez somos mas reconocidos, no solo por nuestros resultados\n";
						cout << "sino tambien por nuestra gestion, por nuestra forma de hacer las cosas.";
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 2:
						cout << "------------------------------------------------------" << endl;
						cout << "2. Registrar empleado:\n";
						cout << "------------------------------------------------------" << endl;
						ingresarEmpleado(array_empleados, TAM, numEmpleadosAnadidos);
						cout << "Presione cualquier tecla para continuar..." << endl;
						getch();
						numEmpleadosAnadidos++;
						break;
					case 3:
						cout << "------------------------------------------------------" << endl;
						cout << "3. Mostrar lista de empleados:\n";
						cout << "------------------------------------------------------" << endl;
						mostrarEmpleados(array_empleados, numEmpleadosAnadidos);
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 4:
						break;
					default:
						cout << "Opcion no valida, intente de nuevo..." << endl;
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					}

				} while (opc2 != 4);
				system("CLS");
				
				break;
			case 4:
				do{
					opc2 = 0;
					system("CLS");
					switch (opc2){
					case 1:
						cout << "------------------------------------------------------" << endl;
						cout << "1. Nuestros productos:\n";
						cout << "------------------------------------------------------" << endl;
						cout << "Nuestra empresa está comprometida a poner en las manos de nuestros clientes los productos de mayor\n";
						cout << "calidad dentro del mercado. Nuestro objetivo es lograr la satisfacción del cliente, dándoles el producto\n";
						cout << "que necesitan al precio más accesible.";
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						getch();
						break;
					case 2:
						cout << "------------------------------------------------------" << endl;
						cout << "2. Registrar producto:\n";
						cout << "------------------------------------------------------" << endl;
						ingresarProducto(array_productos, TAM, numProductosAnadidos);
						cout << "Presione cualquier tecla para continuar..." << endl;
						getch();
						numProductosAnadidos++;						
						break;
					case 3:
						cout << "------------------------------------------------------" << endl;
						cout << "3. Mostrar lista de productos:\n";
						cout << "------------------------------------------------------" << endl;
						mostrarProductos(array_productos, numProductosAnadidos);
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					case 4:
						break;
					default:
						cout << "Opcion no valida, intente de nuevo..." << endl;
						cout << "\n\nPresione cualquier tecla para continuar..." << endl;
						getch();
						break;
					}

				} while (opc2 != 4);
				system("CLS");
				break;
			case 5:
				break;
			default: 
				cout << "Opcion no valida, intente de nuevo..." << endl;
				cout << "\n\nPresione cualquier tecla para continuar..." << endl;
				getch();
		}
	}while (opc1!=5);
    return 0;
}
