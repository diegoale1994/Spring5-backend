INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(1,'diego','franco','diego.fc.1@hotmail.com','2018-01-15');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(2,'diego1','franco1','diego1.fc.1@hotmail.com','2019-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(7,'diego2','franco2','diego2.fc.1@hotmail.com','2019-01-03');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(1,'diego3','franco3','diego3.fc.1@hotmail.com','2019-01-04');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(3,'diego4','franco4','diego4.fc.1@hotmail.com','2019-01-05');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(3,'diego5','franco5','diego5.fc.1@hotmail.com','2019-01-05');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(8,'diego6','franco6','diego6.fc.1@hotmail.com','2019-01-06');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(5,'diego7','franco7','diego7.fc.1@hotmail.com','2019-01-06');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(5,'diego8','franco8','diego8.fc.1@hotmail.com','2019-01-09');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES(6,'diego9','franco9','diego9.fc.1@hotmail.com','2019-01-10');

INSERT INTO regiones (id,nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones (id,nombre) VALUES (2, 'Centroamerica');
INSERT INTO regiones (id,nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones (id,nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id,nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id,nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id,nombre) VALUES (7, 'Oceania');
INSERT INTO regiones (id,nombre) VALUES (8, 'Antartida');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('diego','$2a$10$c.OXMl22oBdSK8spNXohxeTh0T4sjuvGPdZhZ4O2RNMrDdWuN6tjy',1,'Diego Alejandro', 'Franco Cuesta', 'diego.fc.1@hotmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$rSdhNkyWuL9xJ9nT2fUTyexNhXiVu8li2FTbOsm8J/T4lxgOj7Qey',1,'Chuck', 'Zchuldiner', 'Chuck@hotmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,1);

