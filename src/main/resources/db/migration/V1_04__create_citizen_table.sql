CREATE TABLE citizens(
  id SERIAL PRIMARY KEY,
  name_en VARCHAR(255) NOT NULL,
  name_bn VARCHAR(255) NOT NULL,
  fathers_name VARCHAR(255),
  mothers_name VARCHAR(255),
  spouse_name VARCHAR(255),
  gender VARCHAR(10),
  word_no INT,
  post VARCHAR(255),
  union_id INT REFERENCES unions(id),
  nid VARCHAR(25),
  birth_id VARCHAR(25),
  created_at date,
  modified_at date,
  status INT
);
