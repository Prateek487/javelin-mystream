create database mystream;
use mystream;

create table user(
	id bigint PRIMARY KEY AUTO_INCREMENT,
	password varchar(255) NOT NULL,
	name varchar(255) NOT NULL,
	email varchar(255) UNIQUE,
	phone varchar(20) UNIQUE
);

create table detail(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    directed_by varchar(255),
    produced_by varchar(255),
    rating int
);

create table content(
	id bigint PRIMARY KEY AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	description text,
	type varchar(20) NOT NULL,
	release_date datetime NOT NULL,
	image text NOT NULL,
	detail_id bigint,
	FOREIGN KEY (detail_id) REFERENCES detail(id)
);

create table video(
	id bigint PRIMARY KEY AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	description text,
	upload_date datetime,
	thumbnail text,
	url text NOT NULL,
	uploaded_by text,
	content_id bigint NOT NULL,
	FOREIGN KEY (content_id) REFERENCES content(id)
);

create table genre(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    name varchar(255) NOT NULL UNIQUE
);

create table content_genre(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    content_id bigint NOT NULL,
    genre_id bigint NOT NULL,
    FOREIGN KEY (content_id) REFERENCES content(id),
    FOREIGN KEY (genre_id) REFERENCES genre(id)
);

create table watchlist(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    content_id bigint NOT NULL,
    user_id bigint NOT NULL,
    video_id bigint NOT NULL,
    status varchar(20) NOT NULL,
    watch_time bigint,
    FOREIGN KEY (content_id) REFERENCES content(id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (video_id) REFERENCES video(id)
);