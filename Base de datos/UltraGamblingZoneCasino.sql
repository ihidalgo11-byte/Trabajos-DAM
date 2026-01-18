CREATE TABLE clients (
    DNI varchar2(9),
    nom varchar2(50),
    telefon varchar2(13),
    email varchar2(100),
    PRIMARY KEY (DNI)
);

CREATE TABLE supervisor (
    ID NUMBER,
    DataIniciSupervisio DATE,
    HorariSupervisio varchar2(50),
    PRIMARY KEY (ID)
);

CREATE TABLE sala (
    ID NUMBER,
    nom varchar2(50),
    ubicacio varchar2(500),
    capacitat NUMBER,
    PRIMARY KEY(ID)
);

CREATE TABLE jocs (
    ID NUMBER,
    nom varchar2(50),
    tipus varchar2(25),
    descripcio varchar2(3000),
    PRIMARY KEY (ID)
);

CREATE TABLE apostes (
    ID NUMBER,
    import NUMBER,
    resultat varchar2(6),
    DNI_Client varchar2(9),
    ID_Joc NUMBER,
    PRIMARY KEY (ID),
    FOREIGN KEY (DNI_Client) REFERENCES clients (DNI),
    FOREIGN KEY (ID_Joc) REFERENCES jocs (ID)
);

CREATE TABLE tiene (
    ID NUMBER,
    ID_Sala NUMBER,
    ID_Joc NUMBER,
    PRIMARY KEY (ID),
    FOREIGN KEY (ID_Sala) REFERENCES sala (ID),
    FOREIGN KEY (ID_Joc) REFERENCES jocs (ID)
);

CREATE TABLE empleats (
    DNI varchar2(9),
    nom varchar2(50),
    telefon varchar2(13), 
    carrec varchar2(30),
    ID_Sala NUMBER,
    torn varchar2(30),
    ID_Supervisor NUMBER,
    PRIMARY KEY (DNI),
    FOREIGN KEY (ID_Sala) REFERENCES sala (ID),
    FOREIGN KEY (ID_Supervisor) REFERENCES supervisor (ID)
);




