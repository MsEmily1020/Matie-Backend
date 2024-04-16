INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/1.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/2.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/3.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/4.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/1.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/2.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/3.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/4.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/5.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/6.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/7.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/8.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/9.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/10.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/11.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/12.svg', 3);

INSERT INTO users (name, user_id, email, pw, created_date) VALUES ('김혜승', 'hyeseung', 's2224@e-mirim.hs.kr', '$2a$10$tEM8I25AuRIaY61FrEEBDe6ljr5F17UEzl50pjZoPe40m0gZrifA6', '2023-10-20 10:11:20');
INSERT INTO point (variation, balance, user_id) VALUES (0, 0, 1);

INSERT INTO category (name) VALUES ('Grocery');
INSERT INTO category (name) VALUES ('Food');

INSERT INTO product (name, description, point, category_id) VALUES ('recycled cotton bucket hat colourful patterns', '', 40000, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('recycled cotton orange shirt t-shirt short sleeves', '', 28000, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('recycle graphic fasion tanktop limited edition', '', 25000, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('recycled wool knitted jumper colourful patterns', '', 32000, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('[Making for Change collaboration] organic footy top half-sleeve', '', 22000, 1);
INSERT INTO product (name, description, point, category_id) VALUES ('[Artist collaboration] eco-friendly art graphic fasion t-shirt short sleeves', '', 23000, 1);

INSERT INTO product (name, description, point, category_id) VALUES ('Reuseable Bamboo Utensil set', '', 20000, 2);
INSERT INTO product (name, description, point, category_id) VALUES ('Recover Insulated Water Bottle', '', 30000, 2);
INSERT INTO product (name, description, point, category_id) VALUES ('Recover Topo Map Water Bottle', '', 18000, 2);
INSERT INTO product (name, description, point, category_id) VALUES ('Be The Impact Tumbler', '', 26000, 2);
INSERT INTO product (name, description, point, category_id) VALUES ('Recycled cotton clear black totebag', '', 16000, 2);
INSERT INTO product (name, description, point, category_id) VALUES ('Cat activity mat Donation for Cats Recycled', '', 35000, 2);

INSERT INTO challenge (title, description, point, type) VALUES ('만보기 100번 걷기', '설명입니다.', 100, 1);

INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, created_date, user_id) VALUES ('Are eggs general waste?', 'Are eggs general waste? My mother says its general waste, but there are foreign substances in it. Why is it called general waste?', 'Q&A', '2023-10-20 00:00:00', 1);

INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);
INSERT INTO community (title, description, type, agree, disagree, created_date, user_id) VALUES ('Are you in favor of cap-and-trade?', 'in favor of it. Greenhouse gases are a major contributor to our environmental degradation and the', 'Debate', 132, 230, '2023-10-20 00:00:00', 1);

INSERT INTO comments (description, user_id, community_id, created_date) VALUES ('I think right about that.', 1, 1, '2023-10-20 00:00:00');
INSERT INTO comments (description, user_id, community_id, created_date) VALUES ('amazing!', 1, 1, '2023-10-20 00:00:00');
INSERT INTO comments (description, user_id, community_id, created_date) VALUES ('really?', 1, 1, '2023-10-20 00:00:00');
INSERT INTO comments (description, user_id, community_id, created_date) VALUES ('awesome!', 1, 1, '2023-10-20 00:00:00');
INSERT INTO comments (description, user_id, community_id, created_date) VALUES ('very good!', 1, 1, '2023-10-20 00:00:00');