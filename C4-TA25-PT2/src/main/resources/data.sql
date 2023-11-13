--Tabla departamentos
CREATE TABLE departamentos (
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	presupuesto INT
);

--Tabla empleados
CREATE TABLE empleados (
	dni VARCHAR(8) PRIMARY KEY,
	nombre VARCHAR(100),
	apellidos VARCHAR(250),
	departamento INT,
	FOREIGN KEY (departamento) REFERENCES departamentos(codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO departamentos (nombre, presupuesto) VALUES
('Ventas', 100000),
('Marketing', 80000),
('Recursos Humanos', 120000),
('Produccion', 150000),
('Finanzas', 130000),
('Tecnologia', 180000),
('Logistica', 100000),
('Calidad', 90000);

-- Inserts para la tabla empleados
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES
('1234567A', 'Juan', 'Perez Ferreira', 1),
('2345678A', 'Maria', 'Gomez Angustias', 2),
('3456789A', 'Sergi', 'Rodriguez Utge', 3),
('4567890A', 'Laura', 'Fernandez Ponts', 4),
('5678901A', 'Nerea', 'Prados Mata', 5),
('6789012A', 'Ana', 'Lopez Martinez', 6),
('7890123A', 'Javier', 'Marti Garcia', 7),
('8901234A', 'Carmen', 'Lopez Sanchez', 8);
