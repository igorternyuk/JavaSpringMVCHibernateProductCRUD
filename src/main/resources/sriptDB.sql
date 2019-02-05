CREATE DATABASE productDB;
USE productDB;
CREATE TABLE product(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    brand VARCHAR(100) NOT NULL,
    price INT
);

INSERT INTO product VALUES(NULL,'Manzana', 'Brand1', 22);
INSERT INTO product VALUES(NULL,'Pimiento', 'Brand2', 40);
INSERT INTO product VALUES(NULL,'Leche evaporada', 'Brand2', 88);
INSERT INTO product VALUES(NULL,'Carne de vaca', 'Brand2', 148);
INSERT INTO product VALUES(NULL,'Manteca de cerdo', 'Brand1', 120);
INSERT INTO product VALUES(NULL,'Caramelos', 'Brand1', 147);
INSERT INTO product VALUES(NULL,'Galletes', 'Brand1', 55);
INSERT INTO product VALUES(NULL,'Pescado', 'Brand2', 36);
INSERT INTO product VALUES(NULL,'Pan', 'Brand2', 8);
INSERT INTO product VALUES(NULL,'Mortadela', 'Brand3', 56);
INSERT INTO product VALUES(NULL,'Salchicha', 'Brand4', 130);

SELECT * FROM product ORDER BY price DESC LIMIT 5;