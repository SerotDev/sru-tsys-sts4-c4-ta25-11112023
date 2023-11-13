-- Tabla almacenes
create table almacenes(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	lugar VARCHAR(100),
	capacidad INT
);

-- Tabla cajas
create table cajas(
	num_referencia VARCHAR(5) PRIMARY KEY,
	contenido VARCHAR(100),
	valor INT,
	almacen INT,
	FOREIGN KEY (almacen) REFERENCES almacenes(codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Inserts para la tabla almacenes
INSERT INTO almacenes (lugar, capacidad) VALUES
('Almacén A', 5),
('Almacén B', 70),
('Almacén C', 60),
('Almacén D', 8),
('Almacén E', 40),
('Almacén F', 9),
('Almacén G', 55),
('Almacén H', 75);

-- Inserts para la tabla Cajas
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES
('A0001', 'Producto 1', 100, 1),
('A0002', 'Producto 2', 150, 2),
('A0003', 'Producto 3', 120, 3),
('A0004', 'Producto 4', 200, 4),
('A0005', 'Producto 5', 80, 5),
('A0006', 'Producto 6', 250, 6),
('A0007', 'Producto 7', 110, 7),
('A0008', 'Producto 8', 180, 8);
