INSERT INTO image (url) VALUES ('http://localhost/1.jpg');
INSERT INTO users (name, email, pw, created_date, mascot_id) VALUES ('김혜승', 's2224@e-mirim.hs.kr', 'hyeseung1!', '2023-10-20 10:11:20', 1);
INSERT INTO team (title, description, start_date, finish_date, user_list, image_id) VALUES ('title', 'description', '2023-10-20 00:00:00', '2024-01-10 00:00:00', '1, 2, 3', 1);
INSERT INTO category (name) VALUES ('의류');
INSERT INTO category (name) VALUES ('잡화');
INSERT INTO product (name, description, point, category_id) VALUES ('상의', '상의입니다', 200, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('잡화', '잡화입니다', 100, 2);
INSERT INTO challenge (description, point) VALUES ('만보기 100번 걷기', 100);