INSERT INTO tb_category (name, created_at, active) VALUES ('Eletronics', '2023-12-10 02:16:12.88863', true);
INSERT INTO tb_category (name, created_at, active) VALUES ('Office', '2023-12-10 02:16:12.88863', true);
INSERT INTO tb_category (name, created_at, active) VALUES ('Sports and leisure', '2023-12-10 02:16:12.88863', true);
INSERT INTO tb_category (name, created_at, active) VALUES ('Home and Appliances', '2023-12-10 02:16:12.88863', true);
INSERT INTO tb_category (name, created_at, active) VALUES ('Jewelry and watches', '2023-12-10 02:16:12.88863', true);
INSERT INTO tb_category (name, created_at, active) VALUES ('Vehicle accessories', '2023-12-10 02:16:12.88863', true);

INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('TV Philco 32"', 10, 500, 870, 'Tv 32 Polegadas Philco Led Hd Conv. Digital Ptv32b51d', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('AOC Smart TV 43"', 10, 1250, 1623.20, 'Smart Tv Led 43 Polegadas Aoc Le43s5970s Full Hd Wi-fi 2 Usb', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Sansung HD TV 32"', 10, 729, 1073.36, 'Tv Led 32 Samsung Un32n4000', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Celular Moto G7 Plus', 25, 1200.50, 1899, 'Celular Motorola Moto G7 Plus Indigo 64gb 4gb Ram Xt1965', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Smartphone Samsung Galaxy S9', 15, 2750, 3299, 'Smartphone Samsung Galaxy S9+ Tela 6.2 128gb 6gb De Ram', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Piscina', 10, 500, 700, 'Piscina 10 mil listros', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Piscina', 10, 600, 800, 'Piscina 20 mil listros', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Piscina', 10, 700, 900, 'Piscina 30 mil listros', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Liquidificador 12 Veloc. 1000w', 30, 70.90, 139.90, 'Liquidificador 12 Veloc. 1000w Turbo Premium Mondial 110v', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Fogão Elétrico De Mesa', 8, 60.80, 106.80, 'Fogão Elétrico De Mesa 2 Pratos 2000 Watts Agrato 220v', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Fogão 4 Bocas', 20, 280.50, 424.86, 'Fogão 4 Bocas Atlas Mônaco Com Acendimento Automático', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Fogão 5 Bocas', 30, 864, 1164.94, 'Fogão 5 Bocas Tripla Chama Automático Agile Glass Inox Atlas', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Cafeteira Expresso', 22, 315.90, 415.90, 'Cafeteira Expresso 15 Bar Coffee Cream 110v Mondial', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Geladeira / Refrigerador Electrolux', 50, 1000, 1370, 'Geladeira / Refrigerador Electrolux 240 Litros 1 Porta Class', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Relógio Technos Masculino Dourado', 35, 180, 249, 'Relógio Technos Masculino Dourado Performer - 2115laa/4c', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Relógio Nibosi Cronógrafo', 50, 100, 160.50, 'Relógio Nibosi Cronógrafo Fr Grátis Promoção Carnaval', now(), true);
INSERT INTO tb_product (name, quantity, cost_price, sale_price, description, created_at, active) VALUES ('Anel Maciço Ouro 18k', 60, 210, 299.90, 'Anel Solitario Maciço Ouro 18k 750 7mm Escolha A Cor', now(), true);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (11, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (13, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (16, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 5);

INSERT INTO TB_STATE (name, created_at, active) VALUES ('Ceará', '2023-12-10 21:51', true);
INSERT INTO TB_STATE (name, created_at, active) VALUES ('Minas Gerais', '2023-12-10 21:52', true);

INSERT INTO TB_CITY (name, state_id, created_at, active) VALUES ('Fortaleza', 1, '2023-12-10 21:55:00', true);
INSERT INTO TB_CITY (name, state_id, created_at, active) VALUES ('Uberlândia', 2, '2023-12-10 21:56:00', true);
INSERT INTO TB_CITY (name, state_id, created_at, active) VALUES ('Caucaia', 1, '2023-12-10 21:55:00', true);

