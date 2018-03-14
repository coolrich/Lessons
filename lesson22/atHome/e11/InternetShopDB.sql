/* Разделитель изменен на ; */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: No… */
/* Access denied for user 'root'@'localhost' (using password: NO) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Access denied for user 'root'@'localhost' (using password: YES) */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: No… */
/* Access denied for user 'root'@'localhost' (using password: NO) */
/* Подключение к 127.0.0.1 с помощью Microsoft SQL Server (TCP/IP), с именем пользователя root, используя пароль: No… */
/* Ошибка SQL (17): [DBNETLIB][ConnectionOpen (Connect()).]SQL Server не существует, или доступ запрещен
SQL Server не существует, или доступ запрещен. */
/* Подключение к 127.0.0.1 с помощью Microsoft SQL Server (TCP/IP), с именем пользователя root, используя пароль: Yes… */
/* Ошибка SQL (17): [DBNETLIB][ConnectionOpen (Connect()).]SQL Server не существует, или доступ запрещен
SQL Server не существует, или доступ запрещен. */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
SELECT CONNECTION_ID();
/* Соединено. Идентификатор процесса: 13 */
/* Кодировка: utf8mb4 */
SHOW STATUS;
SHOW VARIABLES;
SHOW DATABASES;
/* Открытие сеанса «Unnamed» */
USE `catalog`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='catalog';
SHOW TABLE STATUS FROM `catalog`;
SHOW FUNCTION STATUS WHERE `Db`='catalog';
SHOW PROCEDURE STATUS WHERE `Db`='catalog';
SHOW TRIGGERS FROM `catalog`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='information_schema';
SHOW TABLE STATUS FROM `information_schema`;
SHOW FUNCTION STATUS WHERE `Db`='information_schema';
SHOW PROCEDURE STATUS WHERE `Db`='information_schema';
SHOW TRIGGERS FROM `information_schema`;
SHOW EVENTS FROM `information_schema`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='catalog';
USE `users`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='users';
SHOW TABLE STATUS FROM `users`;
SHOW FUNCTION STATUS WHERE `Db`='users';
SHOW PROCEDURE STATUS WHERE `Db`='users';
SHOW TRIGGERS FROM `users`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='users';
SHOW COLLATION;
SHOW VARIABLES LIKE 'collation_server';
CREATE DATABASE `internet_shop` /*!40100 COLLATE 'utf8_general_ci' */;
SHOW DATABASES;
/* Открытие сеанса «Unnamed» */
USE `internet_shop`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW ENGINES;
SHOW VARIABLES LIKE 'collation_database';
CREATE TABLE `Products` (
	`Anorak` INT UNSIGNED NULL,
	`Dress` INT UNSIGNED NULL,
	`T-Shirt` INT UNSIGNED NULL
)
COLLATE='utf8_general_ci'
;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
/* Узел таблицы «Products» не найден в дереве. */
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`Products`;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Anorak` ASC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
ALTER TABLE `products`
	ADD COLUMN `Cost` INT UNSIGNED NULL FIRST,
	ADD COLUMN `Rating` INT UNSIGNED NULL AFTER `Cost`,
	DROP COLUMN `Anorak`,
	DROP COLUMN `Dress`,
	DROP COLUMN `T-Shirt`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
USE `mysql`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='mysql';
SHOW TABLE STATUS FROM `mysql`;
SHOW FUNCTION STATUS WHERE `Db`='mysql';
SHOW PROCEDURE STATUS WHERE `Db`='mysql';
SHOW TRIGGERS FROM `mysql`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='mysql';
USE `internet_shop`;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL DEFAULT NULL FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NOT NULL DEFAULT NULL AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`, `Rating`);
/* Ошибка SQL (1067): Invalid default value for 'Cost' */
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL DEFAULT NULL FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NOT NULL DEFAULT NULL AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`);
/* Ошибка SQL (1067): Invalid default value for 'Cost' */
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL DEFAULT NULL FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NOT NULL DEFAULT NULL AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`);
/* Ошибка SQL (1067): Invalid default value for 'Cost' */
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NOT NULL DEFAULT NULL AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`);
/* Ошибка SQL (1067): Invalid default value for 'Rating' */
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`);
/* Ошибка SQL (1075): Incorrect table definition; there can be only one auto column and it must be defined as a key */
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
	CHANGE COLUMN `Rating` `Rating` INT(10) UNSIGNED NULL DEFAULT NULL AFTER `Cost`,
	ADD PRIMARY KEY (`Cost`);
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` ASC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
ALTER TABLE `products`
	ADD CONSTRAINT `FK1` FOREIGN KEY () REFERENCES `` ();
/* Ошибка SQL (1064): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ') REFERENCES `` ()' at line 2 */
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
ALTER TABLE `products`
	ADD COLUMN `Name` VARCHAR(50) NOT NULL DEFAULT '0' FIRST,
	DROP PRIMARY KEY;
/* Ошибка SQL (1075): Incorrect table definition; there can be only one auto column and it must be defined as a key */
ALTER TABLE `products`
	ADD COLUMN `Name` VARCHAR(50) NOT NULL DEFAULT '0' FIRST,
	DROP PRIMARY KEY;
/* Ошибка SQL (1075): Incorrect table definition; there can be only one auto column and it must be defined as a key */
ALTER TABLE `products`
	ADD COLUMN `Name` VARCHAR(50) NOT NULL DEFAULT '0' FIRST,
	DROP PRIMARY KEY,
	ADD PRIMARY KEY (`Name`);
/* Ошибка SQL (1075): Incorrect table definition; there can be only one auto column and it must be defined as a key */
ALTER TABLE `products`
	ADD COLUMN `Name` VARCHAR(50) NOT NULL DEFAULT '0' FIRST,
	DROP PRIMARY KEY,
	ADD PRIMARY KEY (`Name`);
/* Ошибка SQL (1075): Incorrect table definition; there can be only one auto column and it must be defined as a key */
ALTER TABLE `products`
	ALTER `Cost` DROP DEFAULT;
ALTER TABLE `products`
	ADD COLUMN `Name` VARCHAR(50) NOT NULL FIRST,
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NOT NULL AFTER `Name`,
	DROP PRIMARY KEY,
	ADD PRIMARY KEY (`Name`);
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
ALTER TABLE `products`
	CHANGE COLUMN `Cost` `Cost` INT(10) UNSIGNED NULL DEFAULT NULL AFTER `Name`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
INSERT INTO `internet_shop`.`products` (`Name`) VALUES ('T-Shirt');
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='T-Shirt';
UPDATE `internet_shop`.`products` SET `Cost`='1000' WHERE  `Name`='T-Shirt';
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='T-Shirt';
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC, `Rating` ASC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC, `Rating` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
UPDATE `internet_shop`.`products` SET `Rating`='5' WHERE  `Name`='T-Shirt';
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='T-Shirt';
ALTER TABLE `products`
	CHANGE COLUMN `Rating` `Rating` ENUM('1','2','3','4','5') NULL DEFAULT NULL AFTER `Cost`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='internet_shop';
SHOW TABLE STATUS FROM `internet_shop`;
SHOW FUNCTION STATUS WHERE `Db`='internet_shop';
SHOW PROCEDURE STATUS WHERE `Db`='internet_shop';
SHOW TRIGGERS FROM `internet_shop`;
SELECT *, EVENT_SCHEMA AS `Db`, EVENT_NAME AS `Name` FROM information_schema.`EVENTS` WHERE `EVENT_SCHEMA`='internet_shop';
SHOW CREATE TABLE `internet_shop`.`products`;
/* Открытие сеанса «Unnamed» */
SHOW CREATE TABLE `internet_shop`.`products`;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC, `Rating` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;
INSERT INTO `internet_shop`.`products` (`Name`) VALUES ('Anorak');
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='Anorak';
UPDATE `internet_shop`.`products` SET `Cost`='1200', `Rating`='4' WHERE  `Name`='Anorak';
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='Anorak';
INSERT INTO `internet_shop`.`products` (`Rating`) VALUES ('4');
/* Ошибка SQL (1364): Field 'Name' doesn't have a default value */
INSERT INTO `internet_shop`.`products` (`Name`, `Cost`, `Rating`) VALUES ('Dress', '1250', '4');
SELECT `Name`, `Cost`, `Rating` FROM `internet_shop`.`products` WHERE  `Name`='Dress';
/* Подключение к 127.0.0.1 закрыто в 2018-03-14 04:31:57 */
/* Подключение к 127.0.0.1 с помощью MySQL (TCP/IP), с именем пользователя root, используя пароль: Yes… */
SELECT CONNECTION_ID();
/* Соединено. Идентификатор процесса: 14 */
/* Кодировка: utf8mb4 */
SHOW STATUS;
SHOW VARIABLES;
USE `internet_shop`;
SHOW CREATE TABLE `internet_shop`.`products`;
SHOW COLLATION;
SHOW ENGINES;
SHOW CHARSET;
SELECT * FROM `internet_shop`.`products` ORDER BY `Cost` DESC, `Rating` DESC LIMIT 1000;
SHOW CREATE TABLE `internet_shop`.`products`;