
CREATE TABLE districts(
  id SERIAL PRIMARY KEY,
  name_en VARCHAR(255) NOT NULL,
  name_bn VARCHAR(255) NOT NULL,
  description text,
  division INTEGER references divisions(id)
);


INSERT INTO districts(name_en,name_bn,description,division) VALUES('Dinajpur','দিনাজপুর','',1);
INSERT INTO districts(name_en,name_bn,description,division) VALUES('Rangpur','রংপুর','',1);
INSERT INTO districts(name_en,name_bn,description,division) VALUES('Dhaka','ঢাকা','',2);