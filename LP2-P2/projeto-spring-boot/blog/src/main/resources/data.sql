INSERT INTO address (`id`, `city`, `state`, `street`, `neighborhood`, `latitude`, `longitude`, `cep`, `number`) VALUES (1, 'Palmeira dos Índios', 'Alagoas', 'Rua 1', 'Jardim 2', '10', '10', '57607100', '107');

INSERT INTO local (id, description, expected_gain, total_gain, address_id) VALUES (1, 'Chácara São José', 1000, 500, 1);

INSERT INTO rental_plan(id, title, description, price, local_id) VALUES (1, 'Plano padrão', 'Uma diária', 250, 1);
INSERT INTO rental_plan(id, title, description, price, local_id) VALUES (2, 'Plano diversão', '2 diárias', 450, 1);

INSERT INTO user (id, name, phone, gender, birth_date, local_id) VALUES (1, 'John Silva', '(82) 9 9901-9901', 'Masculino', '1990-11-02',1);
INSERT INTO user (id, name, phone, gender, birth_date, local_id) VALUES (2, 'Maria Silva', '(82) 9 9901-9902', 'Feminino', '1990-11-01', 1);

INSERT INTO user_rental_plan (id, rent_date, amount_rent, status, user_id, rental_plan_id) VALUES (1, '2019-02-21', 1, 'open', 1, 1);

INSERT INTO score (id, score, amount_rent, user_id) VALUES (1, 20, 1, 1);