create table users(
	username varchar(50) not null,
	password varchar(200) not null,
	token varchar(200) not null,
	enabled boolean not null,
	primary key(username)
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);

create table movies (
	id bigint(20) auto_increment,
	title varchar(200) not null unique,
	synopsis text not null,
	release_year int not null,
	likes int default 0,
	primary key(id)
);