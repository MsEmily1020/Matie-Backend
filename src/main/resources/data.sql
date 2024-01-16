INSERT INTO image (url) VALUES ('http://localhost:8080/1.svg');
INSERT INTO image (url) VALUES ('http://localhost:8080/2.svg');
INSERT INTO image (url) VALUES ('http://localhost:8080/3.svg');
INSERT INTO image (url) VALUES ('http://localhost:8080/4.svg');

INSERT INTO users (name, user_id, email, pw, created_date) VALUES ('김혜승', 'hyeseung', 's2224@e-mirim.hs.kr', 'hyeseung1!', '2023-10-20 10:11:20');
INSERT INTO point (variation, balance, user_id) VALUES (0, 0, 1);

INSERT INTO team (title, description, start_date, finish_date, user_list) VALUES ('title', 'description', '2023-10-20 00:00:00', '2024-01-10 00:00:00', '1, 2, 3');

INSERT INTO category (name) VALUES ('의류');
INSERT INTO category (name) VALUES ('잡화');

INSERT INTO product (name, description, point, category_id) VALUES ('상의', '상의입니다', 200, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('잡화', '잡화입니다', 100, 2);

INSERT INTO challenge (description, point) VALUES ('만보기 100번 걷기', 100);