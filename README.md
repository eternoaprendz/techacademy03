create database Aventuras;

use Aventuras;


CREATE TABLE cenas (
	id_cena int not null primary key auto_increment,
	descricao varchar(255)
);

CREATE TABLE itens (
	id_item int not null primary key auto_increment,
	nome varchar(255),
	comando_correto varchar(255),

	id_cena_atual int,
	id_cena_destino int,
	FOREIGN KEY(id_cena_atual) REFERENCES cenas(id_cena)
);
    

CREATE TABLE saves (
    id_save INt PRIMARY KEY  AUTO_INCREMENT,
    id_cena_atual INT not null,
    FOREIGN KEY(id_cena_atual) REFERENCES cenas(id_cena));
    DROP TABLE itens ;
    
   
   

ALTER TABLE itens ADD COLUMN descricao VARCHAR(255);
ALTER TABLE itens ADD COLUMN descricao VARCHAR(255);

   
   
