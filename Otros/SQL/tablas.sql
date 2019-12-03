create table usuario(
id serial not null primary key,
nombre varchar(30) not null,
correo varchar(40) not null,
password varchar(30) not null,
rol serial not null
);

create table roll(
id serial not null primary key,
nombre  varchar(30)
);

create table reserva(
id serial not null primary key,
fecha_inicio date not null,
fecha_fin date not null,
fecha_reserva date not null,
usuario serial not null,
recurso serial not null
);

create table recurso(
id serial not null primary key,
disponible boolean not null,
averiado boolean not null,
ubicacion varchar(40) not null,
nombre varchar(30) not null,
tipo_recurso varchar(30) not null
);

