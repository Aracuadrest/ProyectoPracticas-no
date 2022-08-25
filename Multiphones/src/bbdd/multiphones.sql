drop database if exists multiphones ;
create database  if not exists multiphones
character set latin1 collate latin1_spanish_ci;
use multiphones;

create table operadores (
id_operador smallint unsigned auto_increment primary key,
nombre_operador varchar(40) not null unique,
red_movil varchar(30) not null,
red_fija varchar(30) not null
);
create table tarifas_movil (
id_tarifa_movil smallint unsigned auto_increment primary key,
tipo_tarifa enum('contrato','prepago'),
nombre_tarifa varchar(60) not null unique,
id_operador smallint unsigned,
gigas char(15) not null,
minutos char(15) not null,
precio float not null,
precio_promocion float not null,
precio_pack float not null,
duracion_promocion varchar(20), 
acumula tinyint(0),
comparte tinyint(0),
foreign key (id_operador) references operadores(id_operador)
);
create table tarifas_fibra (
id_tarifa_fibra smallint unsigned auto_increment primary key,
tipo_tarifa enum('contrato'),
nombre_tarifa varchar(60) not null unique,
id_operador smallint unsigned,
velocidad_fibra smallint unsigned not null,
precio float not null,
precio_promocion float not null,
precio_pack float not null,
duracion_promocion varchar(20), 
fijo tinyint(0),
foreign key (id_operador) references operadores(id_operador)
);
create table tarifas_movilYfibra (
id_tarifa_movilYfibra smallint unsigned auto_increment primary key,
tipo_tarifa enum('contrato'),
nombre_tarifa varchar(60) not null unique,
id_operador smallint unsigned,
gigas char(15) not null,
minutos char(15) not null,
velocidad_fibra  smallint unsigned not null,
precio float not null,
precio_promocion float not null,
precio_pack float not null,
duracion_promocion varchar(20), 
acumula tinyint(0),
comparte tinyint(0),
fijo tinyint(0),
foreign key (id_operador) references operadores(id_operador)
);
create table tarifas_fijo (
id_tarifa_fijo smallint unsigned auto_increment primary key,
tipo_tarifa enum('contrato'),
nombre_tarifa varchar(60) not null unique,
id_operador smallint unsigned,
minutos_nacionales char(15) not null,
minutos_internacionales char(15) not null,
precio float not null,
precio_promocion float not null,
precio_pack float not null,
duracion_promocion varchar(20), 
foreign key (id_operador) references operadores(id_operador)
);
create table clientes (
id_cliente smallint unsigned  auto_increment primary key,
nombre varchar(30) not null,
apellidos varchar(50) not null,
dni char(9) not null,
domicilio varchar(50) not null,
localidad varchar(40) not null,
provincia varchar(20) not null,
cod_postal char(5) not null,
fecha_nacimiento date not null,
telefono_contacto char(9) not null,
email varchar(40),
fecha_contratacion date not null,
permanencia date,
telefono_tarifa char(9),
id_tarifa_movil smallint unsigned,
id_tarifa_fibra smallint unsigned,
id_tarifa_movilYfibra smallint unsigned,
id_tarifa_fijo smallint unsigned,
foreign key (id_tarifa_movil) references tarifas_movil(id_tarifa_movil),
foreign key (id_tarifa_fibra) references tarifas_fibra(id_tarifa_fibra),
foreign key (id_tarifa_movilYfibra) references tarifas_movilYfibra(id_tarifa_movilYfibra),
foreign key (id_tarifa_fijo) references tarifas_fijo(id_tarifa_fijo)
);

insert into operadores (nombre_operador, red_movil, red_fija) 
values ('DIGI','movistar','movistar'),
('Lowi','vodafone','vodafone'),
('Simyo','orange','orange'),
('MASMOVIL','yoigo','yoigo'),
('Vodafone','vodafone','vodafone'),
('O2','movistar','movistar'),
('Pepephone','yoigo','yoigo'),
('Lebara','yoigo','yoigo'),
('Llamaya','orange','orange'),
('Lycamobile','movistar','movistar'),
('Finetwork','vodafone','vodafone');

INSERT INTO tarifas_movil
(tipo_tarifa,
nombre_tarifa,
id_operador,
gigas,
minutos,
precio,
precio_promocion,
precio_pack,
acumula,
comparte)
VALUES
('prepago','DIGI ILIMITADO 10GB',1,'10','ilimitados',7,5,5,1,0),
('prepago','DIGI ILIMITADO 20GB',1,'20','ilimitados',10,6,6,1,0),
('prepago','DIGI ILIMITADO 50GB',1,'50','ilimitados',15,9,9,1,0),
('prepago','DIGI ILIMITADO 100GB',1,'100','ilimitados',20,12,12,1,0),
('prepago','DIGI COMBO 6GB',1,'6','100',5,3,3,1,0),
('prepago','DIGI COMBO 20GB',1,'20','400',10,6,6,1,0),
('prepago','DIGI COMBO 50GB',1,'50','800',15,9,9,1,0),
('prepago','DIGI COMBO 100GB',1,'100','2000',20,12,12,1,0),
('prepago','DIGI ILIMITODO',1,'ilimitados','ilimitados',25,15,15,1,0),
('prepago','DIGI MINI',1,'3','100',3,2,2,1,0);

INSERT INTO tarifas_fibra
(tipo_tarifa,
nombre_tarifa,
id_operador,
velocidad_fibra,
precio,
precio_promocion,
precio_pack, 
fijo)
VALUES
('contrato','DIGI FIBRA 300MB',1,300,25,25,25,0),
('contrato','DIGI FIBRA 1GB',1,1,30,30,30,0),
('contrato','DIGI FIBRA SMART 1GB',1,1,20,20,20,0),
('contrato','DIGI FIBRA SMART 10GB',1,10,30,30,30,0);

INSERT INTO tarifas_fijo
(tipo_tarifa,
nombre_tarifa,
id_operador,
minutos_nacionales,
minutos_internacionales,
precio,
precio_promocion,
precio_pack)
VALUES
('contrato','DIGI FIJO',1,'0','0',0,0,1),
('contrato','DIGI FIJO ILIMITADAS',1,'ilimitados','500',0,0,3);

INSERT INTO tarifas_movil
(tipo_tarifa,
nombre_tarifa,
id_operador,
gigas,
minutos,
precio,
precio_promocion,
precio_pack,
acumula,
comparte)
VALUES
('prepago','SIMYO 4GB + 120MIN',3,'4','120',3.5,3.5,0,1,0),
('prepago','SIMYO 4GB',3,'4','ilimitados',0,0,3,1,0),
('prepago','SIMYO 12GB',3,'12','ilimitados',7.5,7.5,5,1,0),
('prepago','SIMYO 20GB',3,'20','ilimitados',10,10,8,1,0),
('prepago','SIMYO 40GB',3,'40','ilimitados',14,14,10,1,0),
('prepago','SIMYO 100GB',3,'100','ilimitados',20,20,12,1,0);



INSERT INTO tarifas_fibra
(tipo_tarifa,
nombre_tarifa,
id_operador,
velocidad_fibra,
precio,
precio_promocion,
precio_pack, 
fijo)
VALUES
('contrato','SIMYO FIBRA 300MB',3,300,25.99,25.99,0,0),
('contrato','SIMYO FIBRA 500MB',3,500,27.99,27.99,0,0);

INSERT INTO tarifas_movilYfibra
(tipo_tarifa,
nombre_tarifa,
id_operador,
gigas,
minutos,
velocidad_fibra,
precio,
precio_promocion,
precio_pack,
acumula,
comparte,
fijo)
VALUES
('contrato','SIMYO FIBRA 100 + 20GB',3,'20','ilimitados',100,28.99,28.99,0,1,0,0),
('contrato','SIMYO FIBRA 100 + 40GB',3,'40','ilimitados',100,32.99,32.99,0,1,0,0),
('contrato','SIMYO FIBRA 100 + 100GB',3,'100','ilimitados',100,38.99,38.99,0,1,0,0),
('contrato','SIMYO FIBRA 300 + 20GB',3,'20','ilimitados',300,31.99,31.99,0,1,0,0),
('contrato','SIMYO FIBRA 300 + 40GB',3,'40','ilimitados',300,35.99,35.99,0,1,0,0),
('contrato','SIMYO FIBRA 300 + 100GB',3,'100','ilimitados',300,41.99,41.99,0,1,0,0),
('contrato','SIMYO FIBRA 500 + 20GB',3,'20','ilimitados',500,33.99,33.99,0,1,0,0),
('contrato','SIMYO FIBRA 500 + 40GB',3,'40','ilimitados',500,37.99,37.99,0,1,0,0),
('contrato','SIMYO FIBRA 500 + 100GB',3,'100','ilimitados',500,43.99,43.99,0,1,0,0);