/* Brayan Daniel Navarro Ortiz    20141578091
   Yair Lopez Poveda              20141578024
   Script SQL - DML (Lenguaje de manipuación de datos)
*/

INSERT INTO Proveedor VALUES ('PR1','Sazalar',20,'Medellin');
INSERT INTO Proveedor VALUES ('PR2','Jaimes',10,'Bogotá');
INSERT INTO Proveedor VALUES ('PR3','Bernal',30,'Bogotá');
INSERT INTO Proveedor VALUES ('PR4','Caceres',20,'Medellin');
INSERT INTO Proveedor VALUES ('PR5','Sazala',30,'Cali');

INSERT INTO Parte VALUES ('PT1','Tuerca','Rojo','12','Medellin');
INSERT INTO Parte VALUES ('PT2','Serucho','Verde','170','Bogotá');
INSERT INTO Parte VALUES ('PT3','Tornillo','Azul','17','Pereira');
INSERT INTO Parte VALUES ('PT4','Tuerca','Rojo','14','Medellin');
INSERT INTO Parte VALUES ('PT5','Martillo','Azul','180','Bogotá');
INSERT INTO Parte VALUES ('PT6','Engrane','Rojo','16','Medellin');

INSERT INTO Envio VALUES ('PR1','PT1','300');
INSERT INTO Envio VALUES ('PR1','PT2','200');
INSERT INTO Envio VALUES ('PR1','PT3','400');
INSERT INTO Envio VALUES ('PR1','PT4','200');
INSERT INTO Envio VALUES ('PR1','PT5','100');
INSERT INTO Envio VALUES ('PR1','PT6','100');
INSERT INTO Envio VALUES ('PR2','PT1','300');
INSERT INTO Envio VALUES ('PR2','PT2','400');
INSERT INTO Envio VALUES ('PR3','PT2','200');
INSERT INTO Envio VALUES ('PR4','PT2','200');
INSERT INTO Envio VALUES ('PR4','PT4','300');
INSERT INTO Envio VALUES ('PR4','PT5','400');


SELECT *
FROM (Proveedor,Parte);

UPDATE Parte SET Peso_pt=500;

DELETE FROM Parte;