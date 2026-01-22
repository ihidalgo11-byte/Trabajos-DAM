CREATE TABLE autor (
    ID number GENERATED AS IDENTITY PRIMARY KEY,
    nom varchar2(50),
    cognoms varchar2(100),
    data_naix DATE,
    nacionalitat varchar2(3),
    UNIQUE (nom,cognoms,nacionalitat)
);

CREATE TABLE editorial (
    ID number GENERATED AS IDENTITY PRIMARY KEY,
    nom varchar2(30)
);

CREATE TABLE genere (
    nom varchar2(20) PRIMARY KEY
);

CREATE TABLE llibre (
    ID number GENERATED AS IDENTITY PRIMARY KEY,
    titol varchar2(50),
    ano number CHECK (ano <= 2023),
    exemplars number CHECK (exemplars > 0),
    ID_Editorial number NOT NULL,
    ID_Sequela number,
    FOREIGN KEY (ID_Editorial) REFERENCES editorial (ID),
    FOREIGN KEY (ID_Sequela) REFERENCES llibre (ID),
    UNIQUE (titol,ano)
);

CREATE TABLE autor_llibre (
    ID_Autor number,
    ID_Llibre number,
    FOREIGN KEY (ID_Autor) REFERENCES autor (ID),
    FOREIGN KEY (ID_Llibre) REFERENCES llibre (ID),
    PRIMARY KEY (ID_Autor,ID_Llibre)
);

CREATE TABLE llibre_genere (
    ID_Llibre number,
    Genere_Nom varchar2(20),
    FOREIGN KEY (ID_Llibre) REFERENCES llibre (ID),
    FOREIGN KEY (Genere_Nom) REFERENCES genere (nom),
    PRIMARY KEY (ID_Llibre,Genere_Nom)
);

DROP TABLE AUTOR;
DROP TABLE AUTOR_LLIBRE;
DROP TABLE EDITORIAL;
DROP TABLE GENERE;
DROP TABLE LLIBRE;
DROP TABLE LLIBRE_GENERE;
DROP TABLE LLIBRES_ESGOTATS;


INSERT INTO editorial (nom) VALUES ('Quaderns Crema');
INSERT INTO editorial (nom) VALUES ('Edicions 62');

INSERT INTO llibre (titol,ano,exemplars,id_editorial,id_sequela) VALUES ('El món d’ahir', 2021, 3, 1, NULL);
INSERT INTO llibre (titol,ano,exemplars,id_editorial,id_sequela) VALUES ('La vida imaginada', 2020, 6, 2, NULL);

INSERT INTO autor (nom,cognoms,data_naix,nacionalitat) VALUES ('Stefan','Zweig', DATE'1976-02-24','ESP');
INSERT INTO autor (nom,cognoms,data_naix,nacionalitat) VALUES ('Màrius','Serra', DATE'1986-08-14','ESP');
INSERT INTO autor (nom,cognoms,data_naix,nacionalitat) VALUES ('Romain','Puértolas', DATE'1986-08-27','ESP');

INSERT INTO autor_llibre (id_autor,id_llibre) VALUES(1, 1);
INSERT INTO autor_llibre (id_autor,id_llibre) VALUES(2, 2);
INSERT INTO autor_llibre (id_autor,id_llibre) VALUES(3, 2);


DELETE FROM autor_llibre WHERE id_autor=3 AND id_llibre=2;
UPDATE llibre SET id_editorial=1 WHERE id_editorial=2;
DELETE FROM editorial WHERE id=2;
UPDATE llibre SET exemplars=0 WHERE exemplars=3;
CREATE TABLE LLIBRES_ESGOTATS (
    ID number GENERATED AS IDENTITY PRIMARY KEY,
    titol varchar2(50)
    ano number CHECK (ano <= 2023),
    exemplars number CHECK (exemplars > 0),
    ID_Editorial number NOT NULL,
    ID_Sequela number,
    FOREIGN KEY (ID_Editorial) REFERENCES editorial (ID),
    FOREIGN KEY (ID_Sequela) REFERENCES llibre (ID),
    UNIQUE (titol,ano)
)
INSERT INTO llibres_esgotats (titol,ano,exemplars,id_editorial,id_sequela) SELECT titol,ano,exemplars,id_editorial,id_sequela FROM llibre WHERE llibre.exemplars=1;
DELETE FROM AUTOR_LLIBRE WHERE ID_LLIBRE = (SELECT ID FROM LLIBRE WHERE EXEMPLARS = 1);
DELETE FROM LLIBRE WHERE EXEMPLARS = 0;