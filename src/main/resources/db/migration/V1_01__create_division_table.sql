
CREATE TABLE divisions(
  id SERIAL PRIMARY KEY,
  name_en VARCHAR(255) NOT NULL,
  name_bn VARCHAR(255) NOT NULL,
  description text
);

INSERT INTO divisions(name_en,name_bn,description) VALUES('Rangpur','রংপুর','');
INSERT INTO divisions(name_en,name_bn,description) VALUES('Dhaka','ঢাকা','');

