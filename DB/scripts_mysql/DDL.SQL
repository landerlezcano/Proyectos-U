/* Brayan Daniel Navarro Ortiz    20141578091
   Yair Lopez Poveda              20141578024
   Script SQL - DDL (Lenguaje de definición de datos)
*/

CREATE DATABASE ejercicio;
use ejercicio;
CREATE TABLE Proveedor(
	ID_pr varchar(20) NOT NULL,
	Nombre_pr varchar(20),
	Localidad_pr varchar(20),
	Ciudad_pr varchar(20),
	PRIMARY KEY(ID_pr)
);
CREATE TABLE Parte(
	ID_pt varchar(20) NOT NULL,
	Nombre_pt varchar(20),
	Color_pt varchar(20),
	Peso_pt float(10),
	Ciudad_pt varchar(20),
	PRIMARY KEY(ID_pt)
);
CREATE TABLE Envio(
	ID_pr_E varchar(20) NOT NULL,
	ID_pt_E varchar(20) NOT NULL,
	Cantidad_E int(20),
	PRIMARY KEY(ID_pr_E,ID_pt_E),
	FOREIGN KEY (ID_pr_E)
	REFERENCES Proveedor(ID_pr),
	FOREIGN KEY (ID_pt_E)
	REFERENCES Parte(ID_pt)
);

DROP DATABASE ejercicio;

DROP TABLE Provedor,Parte,Envio;