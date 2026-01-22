CREATE TABLE TIPUS_PLASA (
    nom varchar2(50) PRIMARY KEY,
    funcio varchar2(100) NOT NULL
);

CREATE TABLE EMPLEAT (
    nss number(12) PRIMARY KEY,
    nom varchar2(50) NOT NULL,
    llinatges varchar2(50) NOT NULL,
    email varchar2(100),
    IBAN varchar2(24) NOT NULL CHECK (IBAN LIKE 'ES%'),
    UNIQUE (IBAN)
);

CREATE TABLE PLASA (
    codi number GENERATED AS IDENTITY PRIMARY KEY,
    nom varchar2(50) NOT NULL,
    salari number NOT NULL,
    codi_plasa_supervisora number,
    informe_supervisio varchar2(500),
    nom_tipus_plasa varchar2(50) NOT NULL,
    FOREIGN KEY (codi_plasa_supervisora) REFERENCES PLASA (codi),
    FOREIGN KEY (nom_tipus_plasa) REFERENCES TIPUS_PLASA (nom)
);

CREATE TABLE NOMINA (
    ID number GENERATED AS IDENTITY PRIMARY KEY,
    IBAN_pagament varchar2(24) NOT NULL CHECK (IBAN_Pagament LIKE 'ES%'),
    import number NOT NULL,
    nss_empleat number(12) NOT NULL,
    codi_plasa number NOT NULL,
    FOREIGN KEY (nss_empleat) REFERENCES EMPLEAT (nss),
    FOREIGN KEY (codi_plasa) REFERENCES PLASA (codi)
);

CREATE TABLE OCUPA (
    nss_empleat number(12) NOT NULL,
    codi_plasa number NOT NULL,
    data_inici date NOT NULL,
    data_fi date,
    PRIMARY KEY (nss_empleat, codi_plasa),
    FOREIGN KEY (nss_empleat) REFERENCES EMPLEAT (nss),
    FOREIGN KEY (codi_plasa) REFERENCES PLASA (codi)
)