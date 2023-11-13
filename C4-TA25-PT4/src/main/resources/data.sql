-- Tabla peliculas
CREATE TABLE peliculas(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	calificacion_edad INT
);

-- Tabla salas
CREATE TABLE salas(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	pelicula INT,
	FOREIGN KEY (pelicula) REFERENCES peliculas (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Inserts para la tabla peliculas
INSERT INTO peliculas (nombre, calificacion_edad) VALUES
('Pelicula 1', 12),
('Pelicula 2', 16),
('Pelicula 3', 18),
('Pelicula 4', 7),
('Pelicula 5', 12),
('Pelicula 6', 7),
('Pelicula 7', 18),
('Pelicula 8', 14);

-- Inserts para la tabla salas
INSERT INTO salas (nombre, pelicula) VALUES
('Sala A', 1),
('Sala B', 2),
('Sala C', 3),
('Sala D', 4),
('Sala E', 5),
('Sala F', 6),
('Sala G', 7),
('Sala H', 8);