CREATE TABLE upazilas(
  id SERIAL PRIMARY KEY,
  name_en VARCHAR(255) NOT NULL,
  name_bn VARCHAR(255) NOT NULL,
  description text,
  district INTEGER references districts(id)
);

INSERT INTO upazilas(name_en,name_bn,description,district) VALUES('Gangachara','গঙ্গাচড়া','',2);
INSERT INTO upazilas(name_en,name_bn,description,district) VALUES('MithaPukur','মিঠাপুকুর','',2);
INSERT INTO upazilas(name_en,name_bn,description,district) VALUES('Pirgacha','পীরগাছা','',2);
INSERT INTO upazilas(name_en,name_bn,description,district) VALUES('Badarganj','বদরগঞ্জ','',2);
INSERT INTO upazilas(name_en,name_bn,description,district) VALUES('Taraganj','তারাগঞ্জ','',2);

CREATE TABLE unions(
  id SERIAL PRIMARY KEY,
  name_en VARCHAR(255) NOT NULL,
  name_bn VARCHAR(255) NOT NULL,
  description text,
  union_no VARCHAR (20),
  post_en VARCHAR(255),
  post_bn VARCHAR(255),
  upazila INTEGER references upazilas(id)
);

INSERT INTO unions(name_en,name_bn,description,union_no,post_en,post_bn,upazila)
    VALUES('Gangachara','গঙ্গাচড়া','','4','Gangachara','গঙ্গাচড়া',1);

