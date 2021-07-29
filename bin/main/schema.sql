CREATE TABLE IF NOT EXISTS user (
  user_id bigint(20) NOT NULL,
  email varchar(255) DEFAULT NULL,
  first_name varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  active int DEFAULT NULL,
  role varchar(255) DEFAULT NULL,
  PRIMARY KEY (user_id),
  UNIQUE KEY (email)
);


CREATE TABLE profile (
profile_id bigint(20) NOT NULL,
mobile_number varchar(10) DEFAULT NULL,
dob DATE ,
about varchar(255) DEFAULT NULL,
gender varchar(10) DEFAULT NULL,
location varchar(255) DEFAULT NULL,
address varchar(255) DEFAULT NULL,
PRIMARY KEY(profile_id)
);


CREATE TABLE IF NOT EXISTS user_profile (
  user_userid  int NOT NULL,
  profile_profile_id int NOT NULL,
  FOREIGN KEY (user_userid) REFERENCES user(user_id),
  FOREIGN KEY (profile_profile_id) REFERENCES profile(profile_id)
);















