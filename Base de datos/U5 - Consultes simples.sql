-- 1. Llistar la quantitat de llibres agrupats per editorial:
-- Columnes: Editorial, recompte llibres
SELECT editorial, count(*) AS Recompte FROM llibres GROUP BY editorial;

-- 2. Llistar la quantitat de llibres agrupats per editorial, però només els grups editorials que tenen més de quatre llibres:
-- Columnes: Editorial, recompte llibres
SELECT editorial, count(*) AS Recompte FROM llibres GROUP BY editorial HAVING count(*) > 4;

-- 3. Llistar la mitjana dels preus dels llibres agrupats per editorial i ordenats per preu descendent:
-- Columnes: editorial, preu mitjà
SELECT editorial, AVG(preu) AS "Preu Mitja" FROM llibres GROUP BY editorial ORDER BY "Preu Mitja" DESC;

-- 4. Llistar la mitjana dels preus dels llibres agrupats per editorial, però només aquells la mitjana dels quals superi els 25 euros:
-- Columnes: editorial, preu mitjà
SELECT editorial, AVG(preu) AS "Preu Mitja" FROM llibres GROUP BY editorial HAVING AVG(preu) > 25 ORDER BY "Preu Mitja" DESC;

-- 5. Llistar nombre de llibres agrupats per editorial sense tenir en compte l'editorial "Planeta":
-- Columnes: editorial, recompte llibres
SELECT editorial, count(*) AS Recompte FROM llibres WHERE editorial != 'Planeta' GROUP BY editorial;

-- 6. Llistar nombre de llibres agrupats per editorial sense tenir en compte l'editorial "Planeta" ni els llibres amb preu nul:
-- Columnes: editorial, recompte llibres
SELECT editorial, count(*) AS Recompte FROM llibres WHERE editorial != 'Planeta' AND PREU IS NOT NULL GROUP BY editorial;

-- 7. Llistar mitjana dels preus agrupats per editorial d'aquelles editorials que tenen més de 2 llibres:
-- Columnes: editorial, preu mitjà
SELECT EDITORIAL, AVG(PREU) FROM LLIBRES GROUP BY editorial HAVING COUNT(*) > 2;

-- 8. Llistar el preu més gran d'un llibre per editorial i ordenat per preu descendent:
-- Columnes: editorial, preu més car
SELECT EDITORIAL, MAX(PREU) FROM LLIBRES GROUP BY editorial ORDER BY MAX(PREU) DESC;

-- 9. Llistar el preu més gran d'un llibre per editorial d'aquelles que tinguin, almenys, un llibre que superi els 30 euros:
-- Columnes: editorial, preu més car
SELECT EDITORIAL, MAX(PREU) FROM LLIBRES WHERE PREU > 30 GROUP BY editorial

-- 10. Llistar el títol i l'autor dels llibres amb títol que comenci per la lletra "M" i l'autor dels quals contingui la lletra "H", independent de majúscula/minúscula:
-- Columnes: títol, autor
SELECT TITOL, AUTOR FROM LLIBRES WHERE UPPER(TITOL) LIKE UPPER('M%') AND UPPER(AUTOR) LIKE UPPER('%H%');

-- 11. Llistar la quantitat de llibres agrupats per autor, ordenat per quantitat descendent:
-- Columnes: autor, quantitat llibres
SELECT AUTOR,COUNT(*) FROM LLIBRES GROUP BY AUTOR ORDER BY COUNT(*) DESC;

-- 12. Llista les diferents lletres inicials dels titols dels llibres i el preu promig dels llibres amb un títol que comenci per aquesta lletra. Ordena per preu ascendent:
-- Columnes: Lletra inicial títol, preu mitjà

