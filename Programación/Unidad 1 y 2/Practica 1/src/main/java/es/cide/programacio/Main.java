//nom: Iván Hidalgo Montalvo
//data: 25/09/2025

package es.cide.programacio;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Indica els identificadors correctes:
            int registro1;
            // int 1registro; no es correcto, ya que empieza con numero
            int archivo_3;
            // int while; no es correcto, ya que es un palabra clave
            int $impuesto;
            int año;
            // int primer apellido; no es correcto, ya que tiene un espacio
            int primer_apellido;
            // int primer-apellido; no es correcto, ya que tiene un guion
            int primerApellido;
            // int Tom's; no es correcto, ya que tiene una comilla
            int C3PO;
            // int 123#; no es correcto, ya que empieza con numero y tiene #
            // int PesoMáximo; no es correcto aunque funcione, ya que tiene acento
            // int descuento; no es correcto, ya que tiene un %
            int Weight;
            // int $$precioMínimo; no es correcto aunque funcione, ya que tiene acento
            // int _$Único; no es correcto aunque funcione, ya que tiene acento
            // int tamaño_màximo; no es correcto aunque funcione, ya que tiene acento
            // int peso.maximo; no es correcto, ya que contiene un punto
            int Precio___;
            // int matrícula?; no es correcto, ya que tiene un signo de pregunta 
            // int cuántoVale; no es correcto aunque funcione, ya que tiene acento
            int high;
            int barça;
            // int piragüista; no es correcto aunque funcione, ya que tiene dieresis
            int B_011;
            int X012AB;
            // int 70libro; no es correcto, ya que empieza con numero
            // int nombre&apellido; no es correcto, ya que tiene un & en medio
            // int 0X1A; no es correcto, ya que empieza con numero
            // int else; no es correcto, ya que es un palabra clave

        //Identifica els literals correctes
            double num1 = 0.5;
                System.out.println(num1);
            // .5 no es correcto, ya que tiene un punto delante del numero
            double num3 = 9.3e12;
                System.out.println(num3);
            double num4 = 9.3e-12;
                System.out.println(num4);
            int num5 = 12345678;
                System.out.println(num5);
            // 12345678_L no funciona, ya que el _ tiene que ir entre numeros
            // 0.8E+0.8 no funciona, ya que ni empieza por 0X al ser hexadecimal
            // 0.8E 8 no funciona, ya que tiene un espacio
            int num9 = 05_15;
                System.out.println(num9);
            // 018CDF no funciona, ya que le falta la X después del 0
            int num11 = 0XBC5DA;
                System.out.println(num11);
            int num12 = 0x87e3a;
                System.out.println(num12);
            long num13 = 234567L;
                System.out.println(num13);
            // 0_B11 no funciona, ya que el _ tiene que ir entre numeros
            int num15 = 010101;
                System.out.println(num15);
            int num16 = 0_557;
                System.out.println(num16);
            // .00.8E2 no funciona, ya que tiene un punto delante del numero
            // .3e3f no funciona, ya que tiene un punto delante del numero
            byte num19 = 0b111;
                System.out.println(num19);
            long num20 = 12_234L;
                System.out.println(num20);
            int num21 = 0Xabcd;
                System.out.println(num21);
            long num22 = 0xabcEL;
                System.out.println(num22);
            // _234 no funciona, ya que empieza con _
            // 1010B no funciona, ya que no puedes poner una letra en binario
            int num25 = 0x1010B;
                System.out.println(num25);
            double num26 = 1_234.2E-2;
                System.out.println(num26);
            // 1234.2EF no funciona el hexadecimal, por el punto
            double num28 = 234.2E3F;
                System.out.println(num28);
            // 1_1.2e_2 no funciona por el punto y por el _ que tiene que ir entre numeros
            // 0bABCDL no funciona, ya que le falta la x después del 0 para indicar que es hexadecimal
            byte num31 = 0X1A;
                System.out.println(num31);
            long num32 = 0X12AL;
                System.out.println(num32);
            // abcd no funciona, ya que le falta el 0x para indicar que es hexadecimal
            byte num34 = 0125;
                System.out.println(num34);
            // .01011 no funciona, ya que un binario no puede tener un punto al principio
            double num36 = 3e12;
                System.out.println(num36);
            // 3_e12 no funciona, ya que el _ tiene que ir entre numeros
            double num38 = -3E-1_2;
                System.out.println(num38);
            // 0.8E no funciona, ya que no tiene un numero detras
            // 0B1212 no funciona, ya que falta la x después del 0 para indicar que es hexadecimal
            byte num41 = 1_2_3;
                System.out.println(num41);
            int num42 = 0xedad;
                System.out.println(num42);
            short num43 = 0XBE2;
                System.out.println(num43);
            double num44 = 101e2;
                System.out.println(num44);
            // B1101 no funciona, ya que le falta el 0 delante de la B para indicar que es binario
            // 1.34.5 no funciona, ya que un decimal solo tiene un punto
            float num47 = 12.3E4F;
                System.out.println(num47);
            // 0X12AG no funciona, ya que en hexadecimal no hay G

        //Exercicis de literals del tipus “char”
            char D5num1 = 'a';
            char D5num2 = '$';
            char D5num3 = '\n'; // La \ sirve para hacer una cadena de caracteres
            // '/n' no funciona, ya que es más de un caracter
            char D5num5 = '\\';
            // '\ñ' la letra ñ no es puede usar en una cadena de caracteres
            // "T" no puede usar " solo '
            char D5num8 = 'ñ';
            // 'xyz' no funciona, ya que hay más de un caracter
            char D5num10 = '\u0066'; // Se puede usar gracias a la \ que indica una cadena de caracteres
            // "XYZ" no funciona, ya que hay más de un caracter y esta usando "
            char D5num12 = '4';
            char D5num13 = '\t';
            char D5num14 = '\b';
            // k no funciona, ya que no esta entre ''
            // + no funciona, ya que no esta entre ''
            char D5num17 = '+';
            char D5num18 = '?';
            char D5num19 = 'â';
            char D5num20 = ':';
        //Exercicis sobre strings
            // '8:15 P.M.' no funciona, ya que tiene que ir con "" no con ''
            String D6a = "Rojo, Blanco y Azul";
            // "Nombre: no funciona, ya que le falta una " al final
            // "Capítulo \’3\’" no funciona, ya que las comas y la ultima contra barra no tienen sentido.
            String D6e = "1.3e-1-2";
            String D6f = "";
            String D6g = " ";
            String D6h = "A";
            // "FP' no funciona, ya que FP tiene que estar entre ""
            String D6j = " programación ";
            // "programación "Java"" no funciona, ya que no puedes poner una palabra entre "" dentro de otras ""
            // programación no funciona, ya que no esta entre ""   
            // 'W' no funciona, ya que esta entre '' y no entre ""
            String D6n = "\n";
            String D6o = "4 + 5 * 2";

        //Declara les següents variables
            int p = 1;
                System.out.println(p);
            int q = 2;
                System.out.println(q);
            float x = 1.5F;
                System.out.println(x);
            float y = 2.5F;
                System.out.println(y);
            float z = 3.5F;
                System.out.println(z);
            char a = 'S';
                System.out.println(a);
            char b = 'O';
                System.out.println(b);
            char c = 'L';
                System.out.println(c);
            double raiz1 = 10.5;
                System.out.println(raiz1);
            double raiz2 = 20.5;
                System.out.println(raiz2);
            long contador = 5L;
                System.out.println(contador);
            short indicador = 32767;
                System.out.println(indicador);
            int indice = 2147483647;
                System.out.println(indice);
            double precio = 5.5;
                System.out.println(precio);
            double precioFinal = 9.5;
                System.out.println(precioFinal);
            char car1 = 'U';
                System.out.println(car1);
            char car2 = 'Y';
                System.out.println(car2);
            byte valor = 127;
                System.out.println(valor);
            boolean primero = true;
                System.out.println(primero);
            boolean ultimo = false;
                System.out.println(ultimo);
            String nombre1 = "Iván";
                System.out.println(nombre1);

        //Declara aquestes variables
            byte edad = 18;
                System.out.println(edad);
            int codigoPostal = 07016;
                System.out.println(codigoPostal);
            float altura = 1.79F;
                System.out.println(altura);
            char genero = 'M';
                System.out.println(genero);
            String nombre2 = "Alex";
                System.out.println(nombre2);
            byte numeroDeHijos = 3;
                System.out.println(numeroDeHijos);
            float iva = 21.0F;
                System.out.println(iva);
            int tallaCamisa = 38;
                System.out.println(tallaCamisa);
            float peso = 72.5f;
                System.out.println(peso);
            double precio2 = 4.99;
                System.out.println(precio2);
            String alumnoRepetidor = "NO";
                System.out.println(alumnoRepetidor);
            String mensaje = "Hola";
                System.out.println(mensaje);
            char letra = 'A';
                System.out.println(letra);
            String mayorEdad = "SI";
                System.out.println(mayorEdad);
            int minutos = 60;          
                System.out.println(minutos);  
            String dias = "Lunes, Martes";
                System.out.println(dias);          
            String matriculaCoche = "8349HJL";
                System.out.println(matriculaCoche);           
            int contador2 = 0;
                System.out.println(contador2);           
            boolean mayorDeEdad = true;
                System.out.println(mayorDeEdad);
            String tallaCamiseta = "L";
                System.out.println(tallaCamiseta);
            
        //Convertir les expressions algebràiques a algotímiques
            int D9valorA = 1, D9valorB = 6, D9valorC = 2, D9valorD = 4, D9valorX = 3, D9valorY = 2, D9valorZ = 5;

            double D9a = (D9valorB / 2) - 4 * D9valorA * D9valorC;
                System.out.println(D9a);
        
            double D9b = 3 * D9valorX * D9valorY - 5 * D9valorX + 12 * D9valorX - 17;
                System.out.println(D9b);        

            double D9c = (D9valorB + D9valorD) / (D9valorC + 4);
                System.out.println(D9c);

            double D9d = D9valorY / D9valorX + 3 + D9valorX / D9valorY + 1;
                System.out.println(D9d);

            double D9e = 1 / D9valorY + (3 * D9valorX / D9valorZ);
                System.out.println(D9e);

            double D9f = 1 / D9valorY + 3 / D9valorX;
                System.out.println(D9f);

            double D9g = 1 / D9valorY + (3 * D9valorX / D9valorY) + 1;
                System.out.println(D9g);

        //Convertir les expressions algebràiques a algorítmiques
            int D10valorA = 2, D10valorB = 5, D10valorC = 3, D10valorD = 4, D10valorE = 1, D10valorF = 6, D10valorG = 2, D10valorH = 3;
            int D10valorJ = 2, D10valorS = 4, D10valorR = 2, D10valorX = 3, D10valorY = 2, D10valorM = 8, D10valorN = 4, D10valorP = 2, D10valorQ = 1;
        
            double D10a = 3/2 + 4/3;
                System.out.println(D10a);

            double D10b = (1 / (D10valorX - 5)) - ((3 * D10valorX * D10valorY) / 4);
                System.out.println(D10b);

            double D10c = 1/2+7;
                System.out.println(D10c);

            double D10d = 7+1/2;
                System.out.println(D10d);

            double D10e = (Math.pow(D10valorA,2)/D10valorB - D10valorC) + (D10valorD - D10valorE)/(D10valorF - D10valorG * D10valorH/D10valorJ);
                System.out.println(D10e);

            double D10f = D10valorM/D10valorN + D10valorP;
                System.out.println(D10f);
            
            double D10g = D10valorM + D10valorN/(D10valorP - D10valorQ);
                System.out.println(D10g);

            double D10h = (Math.pow(D10valorA,2))/(Math.pow(D10valorB,2)) + (Math.pow(D10valorC,2))/(Math.pow(D10valorD,2));
                System.out.println(D10h);
            
            double D10i = (D10valorM + D10valorN/D10valorP)/D10valorQ - (D10valorR/D10valorS);
                System.out.println(D10i);
            
            double D10j = (3*D10valorA + D10valorB)/(D10valorC - ((D10valorD + 5*D10valorE)/(D10valorF + (D10valorG/2*D10valorH))));
                System.out.println(D10j);
            
            double D10k = (Math.pow(D10valorA,2)) + 2*D10valorA*D10valorB + Math.pow(D10valorB,2)/(1/(Math.pow(D10valorX,2)) + 2);
                System.out.println(D10k);

            //Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de les següents expressions aritmètiques:
            
            int D11valorA = 8, D11valorB = 3, D11valorC = -5;

            double D11a = D11valorA + D11valorB +D11valorC;
                System.out.println(D11a);
            
            double D11b = 2 * D11valorB + 3 * (D11valorA - D11valorC);
                System.out.println(D11b);
            
            double D11c = D11valorA/D11valorB;
                System.out.println(D11c);

            double D11d = D11valorA % D11valorB;
                System.out.println(D11d);
            
            double D11e = D11valorA/D11valorC;
                System.out.println(D11e);

            double D11f = D11valorA % D11valorC;
                System.out.println(D11f);

            double D11g = D11valorA * D11valorB/D11valorC;
                System.out.println(D11g);

            double D11h = D11valorA * (D11valorB/D11valorC);
                System.out.println(D11h);
            
            double D11i = (D11valorA * D11valorC) % D11valorB;
                System.out.println(D11i);

            double D11j = D11valorA * (D11valorC % D11valorB);
                System.out.println(D11j);

            double D11k = (3 * D11valorA - 2 * D11valorB) % (2 * D11valorA - D11valorC);
                System.out.println(D11k);

            double D11l = 2 * (D11valorA/5 + (4 - D11valorB * 3)) % (D11valorA + D11valorC - 2);
                System.out.println(D11l);

            double D11m = (D11valorA - 3 * D11valorB) % (D11valorC + 2 * D11valorA)/(D11valorA - D11valorC);
                System.out.println(D11m);

            double D11n = D11valorA - D11valorB - D11valorC * 2;
                System.out.println(D11n);
        
        /*Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2, determina el valor de les següents expressions aritmètiques. 
        Obtén el resultat de cada expressió amb un màxim de quatre decimals.*/

            double D12valorX = 88, D12valorY = 3.5, D12valorZ = -5.2;

            DecimalFormat formato = new DecimalFormat("#.0000");

            double D12a = D12valorX + D12valorY + D12valorZ;
                System.out.println(formato.format(D12a));

            double D12b = 2 * D12valorY + 3 * (D12valorX - D12valorZ);
                System.out.println(formato.format(D12b));

            double D12c = D12valorX/D12valorY;
                System.out.println(formato.format(D12c));

            double D12d = D12valorX % D12valorY;
                System.out.println(D12d);

            double D12e = D12valorX/(D12valorY + D12valorZ);
                System.out.println(formato.format(D12e));

            double D12f = (D12valorX/D12valorY) + D12valorZ;
                System.out.println(formato.format(D12f));
            
            double D12g = 2 * D12valorX/3 * D12valorY;
                System.out.println(formato.format(D12g));

            double D12h = 2 * D12valorX/(3 * D12valorY);
                System.out.println(formato.format(D12h));

            double D12i = D12valorX * D12valorY % D12valorZ;
                System.out.println(formato.format(D12i));
        
            double D12j = D12valorX * (D12valorY % D12valorZ);
                System.out.println(formato.format(D12j));

            double D12k = 3 * D12valorX - D12valorZ - 2 * D12valorX;
                System.out.println(formato.format(D12k));

            double D12l = 2 * D12valorX/5 % D12valorY;
                System.out.println(formato.format(D12l));

            double D12m = D12valorX - 100 % D12valorY % D12valorZ;
                System.out.println(formato.format(D12m));

            double D12n = D12valorX - D12valorY - D12valorZ * 2;
                System.out.println(formato.format(D12n));

        /*A partir de les següents declaracions de variables:
            byte b;
            short s;
            long ln;
            int i, j;
            float f;
            double d;
            char c;
        Determina quin és el tipus de data del resultat de les següents expressions aritmètiques:*/

            byte D13valorB = 127;
            short D13valorS = 3;
            long D13valorLn = 434123;
            int D13valorI = -30, D13valorJ = -20;
            float D13valorF = 3.1416F;
            double D13valorD = 20.5;
            char D13valorC = 'c';

                System.out.println(D13valorI + D13valorC);//int A

                System.out.println(D13valorF - D13valorC);//float B

                System.out.println(D13valorD + D13valorF);//double C

                System.out.println(D13valorD + D13valorI);//float D

                System.out.println(D13valorI/D13valorF);//float E

                System.out.println(D13valorS + D13valorJ);//byte F
 
                System.out.println(D13valorD + D13valorJ);//float G

                System.out.println(D13valorS * D13valorC);//short H

                System.out.println(D13valorD + D13valorC);//float I

                System.out.println(D13valorB + D13valorC);//short J

                System.out.println(D13valorB/D13valorC + D13valorS);//byte K

                System.out.println(D13valorC + D13valorC);//short L

                System.out.println(D13valorI + D13valorLn + D13valorD);//double M

                System.out.println(D13valorLn + D13valorC);//int N

                System.out.println(5/D13valorJ);//byte O

                System.out.println(5.2/D13valorJ);//float P

                System.out.println(D13valorI * D13valorF * 2.5);//double Q

                System.out.println(D13valorLn * D13valorF * 2.5F);//double R

                System.out.println(D13valorJ - 4L);//byte S

                System.out.println(D13valorJ - 4L * 2.5F);//float T

                System.out.println(D13valorB + 2.5 * D13valorI + 35F);//float U

                System.out.println('a' + D13valorB);//short V
                
                System.out.println('a' + D13valorC);//short W

                System.out.println(D13valorC + 2);//byte X
                
                System.out.println(D13valorC - D13valorLn/2);//int Y

                System.out.println(2/D13valorI + 2.0/D13valorJ);//float Z

            //Si X, Y y Z son variables de tipus boolean amb valors X = true, Y = false, Z = true, determina el valor de les següents expressions lògiques:

                boolean D14X = true, D14Y = false, D14Z = true;
                
                System.out.println((D14X && D14Y) || (D14X && D14Z));

                System.out.println((D14X || !D14Y) && (!D14X || D14Z));

                System.out.println(D14X || D14Y && D14Z);

                System.out.println(!(D14X || D14Y) && D14Z);

                System.out.println(D14X || D14Y || D14X && !D14Z && !D14Y);

                System.out.println(!D14X || !D14Y || D14Z && D14X && !D14Y);

            //Si W, X i Y son variables de tipus boolean amb valors W = false, X = true, Y = true, Z = false,  determina el valor de les següents expressions lògiques:

                boolean D15W = false, D15X = true, D15Y = true, D15Z = false;

                System.out.println(D15W || D15Y && D15X && D15W || D15Z);

                System.out.println(D15X && !D15Y && !D15X || !D15W && D15Y);

                System.out.println(!(D15W || !D15Y) && D15X || D15Z);

                System.out.println(D15X && D15Y && D15W || D15Z || D15X);

                System.out.println(D15Y || !(D15Y || D15Z && D15W));

                System.out.println(!D15X && D15Y && (!D15Z || !D15X));

            /*A partir de les sigüents declaracions de variables:
                int i = 8, j = 5;
                float x = 0.005F, y = -0.01F;
                char c = ‘c’, d = ‘d’;
            Determina el valor de les següents expressions:*/

                int D16valori = 8, D16valorj = 5;
                float D16valorx = 0.005F, D16valory = -0.01F;
                char D16valorc = 'c', D16valord = 'd';

                System.out.println(D16valori <= D16valorj );
                System.out.println(D16valorc > D16valord);
                System.out.println(D16valorx >= 0);
                System.out.println(D16valorx < D16valory--);
                System.out.println(D16valorj != 6);
                System.out.println(D16valorc == 99);
                System.out.println(!(D16valori <= D16valorj));
                System.out.println(!(D16valorc == 99));
                System.out.println(!(D16valorx > 0));
                System.out.println(-D16valorj == D16valori - 13);
                System.out.println(++D16valorx > 0);
                System.out.println(D16valory-- < 1);
                System.out.println(D16valorc > D16valord || D16valorc > 0);
                System.out.println(5 * (D16valori + D16valorj) > 'c');
                System.out.println(2 * D16valorx + D16valory == 0);
                //System.out.println(2 * x + (y == 0)); no funciona
                System.out.println(D16valorx + D16valory  >= 0);
                System.out.println(D16valorx < ++D16valory);
                System.out.println(-(D16valori + D16valorj) != -D16valori + D16valorj);
                System.out.println(D16valori <= D16valorj && D16valori >= D16valorc);
                System.out.println(D16valori > 0 && D16valorj < 5);
                System.out.println(D16valori > 0 || D16valorj < 5);
                System.out.println(D16valorx > D16valory && D16valori > 0 || D16valorj < 5);
                System.out.println((3 * D16valori - 2 * D16valorj) % (2 * D16valord - D16valorc) > 3 * D16valord);
                System.out.println(2 * ((D16valori / 5) + (4 * (D16valorj - 3)) % (D16valori + D16valorj - 2)) >= 10);
                System.out.println((D16valori - 3 * D16valorj) % (D16valorc + 2 * D16valord) / (D16valorx - D16valory) >= 0);
    }       
}