DROP table IF EXISTS empleados;

create table empleados (
	id int auto_increment,
	salario double,
	nombre varchar(250),
	trabajo ENUM('Programador', 'Professor', 'Medico', 'Bombero', 'Policia')
);

insert into empleados (salario, nombre, trabajo) values 
	(1000, 'Xavi', 'Programador'),
	(1200, 'Ana', 'Diseñador'),
    (1500, 'Carlos', 'Medico'),
    (900, 'María', 'Bombero'),
    (1100, 'Pedro', 'Programador'),
    (1600, 'Luis', 'Professor'),
    (1300, 'Sofía', 'Policia'),
    (800, 'Juan', 'Professor'),
    (1800, 'Laura', 'Programador'),
    (950, 'Miguel', 'Medico'),
    (1350, 'Elena', 'Medico'),
    (1050, 'Ricardo', 'Medico'),
    (1400, 'Isabel', 'Bombero'),
    (1250, 'Antonio', 'Diseñador'),
    (950, 'Carmen', 'Policia'),
    (1700, 'Juan Carlos', 'Policia'),
    (1100, 'Patricia', 'Programador'),
    (1000, 'Alejandro', 'Programador'),
    (1250, 'Lucía', 'Bombero'),
    (950, 'Diego', 'Medico'),
    (1450, 'Laura', 'Professor');