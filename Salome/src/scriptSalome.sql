CREATE DATABASE `salome`;
USE salome;

CREATE TABLE `Localidad`
(
`localidad` VARCHAR(45) NOT NULL,
PRIMARY KEY (`localidad`));

CREATE TABLE `Persona`
(
`dni` INT(10) NOT NULL,
`nombre` VARCHAR(45) NOT NULL,
`apellido` VARCHAR(20) NOT NULL,
`localidad` VARCHAR(20) ,
`calle` VARCHAR(20) ,
`altura` VARCHAR(8) ,
`depto` VARCHAR(8) ,
`mail` VARCHAR(45) ,
`mailTrabajo` VARCHAR(45) ,
`telefono` VARCHAR(20) NOT NULL,
`telefonoCasa` VARCHAR(20) ,
`telefonoTrabajo` VARCHAR(20) ,
PRIMARY KEY (`dni`));
alter table `Persona` add foreign key (`localidad`) references `Localidad` (`localidad`) on update cascade;

CREATE TABLE `InmobiliariaColega` (
`cuit` INT(15) NOT NULL,
`razonSocial` VARCHAR(45) NOT NULL,
`localidad` VARCHAR(20) ,
`calle` VARCHAR(20) ,
`altura` VARCHAR(8) ,
`depto` VARCHAR(8) ,
`mail` VARCHAR(45) ,
`telefono` VARCHAR(20) NOT NULL,
`telefonoOpcional` VARCHAR(20) ,
PRIMARY KEY (`cuit`));
alter table `InmobiliariaColega` add foreign key (`localidad`) references `Localidad` (`localidad`) on update cascade;

CREATE TABLE `Escribania` (
`cuit` INT(15) NOT NULL,
`razonSocial` VARCHAR(45) NOT NULL,
`localidad` VARCHAR(20) ,
`calle` VARCHAR(20) ,
`altura` VARCHAR(8) ,
`depto` VARCHAR(8) ,
`mail` VARCHAR(45) ,
`telefono` VARCHAR(20) NOT NULL,
`telefonoOpcional` VARCHAR(20) ,
PRIMARY KEY (`cuit`));
alter table `Escribania` add foreign key (`localidad`) references `Localidad` (`localidad`) on update cascade;

CREATE TABLE `Inmueble` (
`idInmueble` INT(20) NOT NULL AUTO_INCREMENT,
`calle` VARCHAR(20) NOT NULL,
`altura` VARCHAR(8) NOT NULL,
`depto` VARCHAR(8) NOT NULL,
`localidad` VARCHAR(20) NOT NULL,
`duenio` INT(10) ,
`inmoColega` VARCHAR(45) ,
`cartel` VARCHAR(20) ,
`precio` INT(20) ,
`alqCom` VARCHAR(20) ,
`alqPart` VARCHAR(20),
`vtaCom` VARCHAR(20) ,
`vtaPart` VARCHAR(20) ,
`ambientes` VARCHAR(20) ,
`mtsCub` VARCHAR(20) ,
`mtsTotal` VARCHAR(20) ,
`quincho` VARCHAR(20) ,
`parrilla` VARCHAR(20) ,
`salon` VARCHAR(20) ,
`banios` VARCHAR(20) ,
`habitaciones` VARCHAR(20) ,
`garage` VARCHAR(20) ,
`pileta` VARCHAR(20) ,
`balcon` VARCHAR(20) ,
`tipo` VARCHAR(20) ,
PRIMARY KEY (`idInmueble`));
alter table `Inmueble` add foreign key (`localidad`) references `Localidad` (`localidad`) on update cascade;
alter table `Inmueble` add foreign key (`duenio`) references `Persona` (`dni`) on update cascade;

CREATE TABLE `InmuebleImagen` (
`idImagen` INT(20) NOT NULL AUTO_INCREMENT,
`idInmueble` INT(20) NOT NULL,
`imagen` BLOB NOT NULL,
PRIMARY KEY (`idImagen`));
alter table `InmuebleImagen` add foreign key (`idInmueble`) references `Inmueble` (`idInmueble`) on update cascade;

CREATE TABLE `Cita` (
`idCita` INT(20) NOT NULL AUTO_INCREMENT,
`personaInteresada` INT(45) NOT NULL,
`personaReferente` INT(45) ,
`usuario` TIME ,
`horaInicio` TIME ,
`horaFin` VARCHAR(20) ,
`fecha` DATE ,
`idInmueble` INT(20) ,
`direccion` VARCHAR(20) ,
`asunto` VARCHAR(20) ,
`descripcion` VARCHAR(200) NOT NULL,
PRIMARY KEY (`idCita`));
alter table `Cita` add foreign key (`personaInteresada`) references `Persona` (`dni`) on update cascade;
alter table `Cita` add foreign key (`personaReferente`) references `Persona` (`dni`) on update cascade;
alter table `Cita` add foreign key (`idInmueble`) references `Inmueble` (`idInmueble`) on update cascade;

CREATE TABLE `ContratoCompraVenta` (
`idBoleto` INT(20) NOT NULL AUTO_INCREMENT,
`vendedor` INT(10) NOT NULL,
`comprador` INT(10) NOT NULL,
`fecha` DATE NOT NULL,
`valor` INT(20) NOT NULL,
`comision` INT(20) NOT NULL,
`idInmueble` INT(20) NOT NULL,
PRIMARY KEY (`idBoleto`));
alter table `ContratoCompraVenta` add foreign key (`vendedor`) references `Persona` (`dni`) on update cascade;
alter table `ContratoCompraVenta` add foreign key (`comprador`) references `Persona` (`dni`) on update cascade;
alter table `ContratoCompraVenta` add foreign key (`idInmueble`) references `Inmueble` (`idInmueble`) on update cascade;

CREATE TABLE `ContratoAlquiler` (
`idContrato` INT(20) NOT NULL AUTO_INCREMENT,
`duenio` INT(10) NOT NULL,
`inquilino` INT(10) NOT NULL,
`fechaInicio` DATE NOT NULL,
`fechaFin` DATE NOT NULL,
`idInmueble` INT(20) NOT NULL,
`incremento` INT(15) NOT NULL,
`porcentajeIncremento` INT(8) NOT NULL,
`porcentajeComision` INT(8) NOT NULL,
`tipoContrato` VARCHAR(15) NOT NULL,
`escribania` INT(15) ,
`monto` INT(15) ,
PRIMARY KEY (`idContrato`));
alter table `ContratoAlquiler` add foreign key (`duenio`) references `Persona` (`dni`) on update cascade;
alter table `ContratoAlquiler` add foreign key (`inquilino`) references `Persona` (`dni`) on update cascade;
alter table `ContratoAlquiler` add foreign key (`idInmueble`) references `Inmueble` (`idInmueble`) on update cascade;
alter table `ContratoAlquiler` add foreign key (`escribania`) references `Escribania` (`cuit`) on update cascade;

CREATE TABLE `Pago` (
`idPago` INT(20) NOT NULL AUTO_INCREMENT,
`idContrato` INT(20) NOT NULL,
`mes` INT(20) NOT NULL,
`pagoDuenio` INT(10) ,
`cobroInqui` INT(10) NOT NULL,
`valor` INT(10) ,
`interes` INT(10) ,
PRIMARY KEY (`idPago`));
alter table `Pago` add foreign key (`idContrato`) references `ContratoAlquiler` (`idContrato`) on update cascade;

CREATE TABLE `Interesado` (
`idInteresado` INT(20) NOT NULL AUTO_INCREMENT,
`personaInteresada` INT(10) NOT NULL,
`ambientes` INT(20) ,
`mtsCubiertos` INT(20) ,
`mtsTotal` INT(20) ,
`quincho` VARCHAR(20) ,
`parrilla` VARCHAR(20) ,
`salon` VARCHAR(20) ,
`banios` INT(20) ,
`habitaciones` INT(20) ,
`garage` VARCHAR(20) ,
`pileta` VARCHAR(20) ,
`balcon` VARCHAR(20) ,
`tipo` VARCHAR(20) ,
PRIMARY KEY (`idInteresado`));
alter table `Interesado` add foreign key (`personaInteresada`) references `Persona` (`dni`) on update cascade;

CREATE TABLE `Egresos` (
`idEgresos` INT(20) NOT NULL AUTO_INCREMENT,
`fecha` DATE NOT NULL,
`descripcion` VARCHAR(200) ,
`monto` INT(10) NOT NULL,
`tipo` VARCHAR(10) ,
PRIMARY KEY (`idEgresos`));