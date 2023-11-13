DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

-- Tabla fabricantes
create table fabricantes(
	codigo int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
  	PRIMARY KEY (codigo)
);

-- Tabla articulos
create table articulos(
	codigo int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
	precio int DEFAULT NULL,
	fabricante int,
	PRIMARY KEY (codigo),
	CONSTRAINT articulos_fk FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo)
);

-- Inserts para la tabla fabricantes
insert into fabricantes(nombre) values('Fabricante1');
insert into fabricantes(nombre) values('Fabricante2');
insert into fabricantes(nombre) values('Fabricante3');
insert into fabricantes(nombre) values('Fabricante4');
insert into fabricantes(nombre) values('Fabricante5');
insert into fabricantes(nombre) values('Fabricante6');
insert into fabricantes(nombre) values('Fabricante7');
insert into fabricantes(nombre) values('Fabricante8');
insert into fabricantes(nombre) values('Fabricante9');
insert into fabricantes(nombre) values('Fabricante10');

-- Inserts para la tabla articulos
insert into articulos (nombre, precio, fabricante) values('Articulo1', 500, 1);
insert into articulos (nombre, precio, fabricante) values('Articulo2', 750, 2);
insert into articulos (nombre, precio, fabricante) values('Articulo3', 600, 3);
insert into articulos (nombre, precio, fabricante) values('Articulo4', 800, 4);
insert into articulos (nombre, precio, fabricante) values('Articulo5', 450, 5);
insert into articulos (nombre, precio, fabricante) values('Articulo6', 700, 6);
insert into articulos (nombre, precio, fabricante) values('Articulo7', 550, 7);
insert into articulos (nombre, precio, fabricante) values('Articulo8', 900, 8);
insert into articulos (nombre, precio, fabricante) values('Articulo9', 650, 9);
insert into articulos (nombre, precio, fabricante) values('Articulo10', 1000, 10);