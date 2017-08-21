CREATE TABLE categories (
  id SERIAL,
  name VARCHAR(128),
  parent_category_id INTEGER REFERENCES categories (id) ON DELETE NO ACTION,
  PRIMARY KEY(id)
);

CREATE TABLE property_types (
  id SERIAL,
  name VARCHAR(256),
  value_type VARCHAR(32),
  category_id INTEGER REFERENCES categories (id) ON DELETE CASCADE,
  PRIMARY KEY(id)
);

CREATE TABLE drinks (
  id SERIAL,
  name VARCHAR(100),
  description VARCHAR,
  image_urls VARCHAR,
  category_id INTEGER REFERENCES categories (id) ON DELETE NO ACTION,
  PRIMARY KEY(id)
);

CREATE TABLE properties (
  id SERIAL,
  drink_id INTEGER REFERENCES drinks (id) ON DELETE CASCADE,
  property_type_id INTEGER REFERENCES property_types (id) ON DELETE CASCADE,
  value VARCHAR,
  PRIMARY KEY(id)
);
