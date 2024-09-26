use Aventuras


CREATE TABLE cenas (
	id_cena int not null primary key auto_increment,
	descricao varchar(255)
);

CREATE TABLE itens (
	id_item int not null primary key auto_increment,
	nome varchar(255),
	comando_correto varchar(255),
    descricao varchar(300),
	id_cena_atual int,
	id_cena_destino int,
	FOREIGN KEY(id_cena_atual) REFERENCES cenas(id_cena)
);
    

CREATE TABLE saves (
    id_save INt PRIMARY KEY  AUTO_INCREMENT,
    id_cena_atual INT not null,
    FOREIGN KEY(id_cena_atual) REFERENCES cenas(id_cena));
    DROP TABLE itens ;
    
   
   
   CREATE TABLE inventario (
    id_item INT NOT NULL,
    id_save INT NOT NULL,
    PRIMARY KEY (id_item, id_save),
    FOREIGN KEY (id_item) REFERENCES itens(id_item),
    FOREIGN KEY (id_save) REFERENCES saves(id_save)
);

insert into cenas(id_cena, descricao) values (1, "Jorginho desejou comer uma LASANHA e ele tem uma ROUPA para ir ao MERCADO para comprar os ingredientes para já que estava de cuequinha!
");
insert into cenas(id_cena, descricao) values (2, "Depois de vestir uma roupa você vai para o MERCADO, mas você encontra uma PEDRA-AZUL brilhante no chão e você se interessa naquilo.
");
insert into cenas(id_cena, descricao) values (3, "Vou ver isso depois, você diz e a guarda e volta ao rumo ao MERCADO.");
insert into cenas(id_cena, descricao) values (4, "Enquanto você ia para o mercado você se depara com um PORTAL no chão que acha estranho pois ele é da mesma cor da PEDRA-AZUL e tem um buraco no meio dele.");
insert into cenas(id_cena, descricao) values (5, "Você coloca essa pedra no portal e ele se “abre” e te suga  para dentro dele onde encontra um mundo com uma LASANHA e um MONSTRO faminto mais a frente(sinissstro).");
insert into cenas(id_cena, descricao) values (6, "Você deu a lasanha ao monstro e ele ficou agradecido e com isso ele abriu um PORTAL-AZUL para você!(outro…).");
insert into cenas(id_cena, descricao) values (7, "Você acorda em seu quarto e descobre que tudo foi um sonho (ainda bemkk) mas com uma vontade de comer lasanha…");
   