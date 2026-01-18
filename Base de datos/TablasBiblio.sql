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