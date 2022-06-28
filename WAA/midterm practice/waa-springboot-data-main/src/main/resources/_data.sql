-- USERS

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (4, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (5, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (6, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123


-- PRODUCTS

INSERT INTO product (id, name, price, id_user)
VALUES (1, 'iPhone', 1200, 1);

INSERT INTO product (id, name, price, id_user)
VALUES (2, 'iPad', 900, 1);

INSERT INTO product (id, name, price, id_user)
VALUES (3, 'Pen', 5, 1);

-- REVIEWS

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (1,'awesome phone',5,1);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (2,'amazing phone',5,1);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (3,'awesome tablet',5,2);