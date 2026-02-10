SELECT titol ||'-'|| exemplars FROM llibre;
SELECT substr(cognoms,1, INSTR(cognoms,' ')-1) as cognom1, + substr(cognoms,INSTR(cognoms,' ')+1) as cognom2 FROM autor;
SELECT upper(substr(replace(cognoms,' ',''),1,10)) from autor;
SELECT upper(nom) from autor where length(nom)>=6;