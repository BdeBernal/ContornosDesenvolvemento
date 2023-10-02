## Guía instalación prolog

```bash
docker pull swipl
docker run -it swipl
```

Con el 1º comando descargamos en contenedor de prolog.
Con el 2º entramos en el intérprete de prolog.


```bash
docker run -it swipl bash
apt update
apt install nano
```

Con estos comandos ejecutamos el contenedor de prolog no de forma interactiva y descargamos índices para funcionar con nano y crear programas dentro de esta "máquina virtual".


```bash
nano programaprolog.pl

mujer(marge).
mujer(lisa).
mujer(maggie).
mujer(selma).

progenitor(abraham, homer).
progenitor(homer, bart).
progenitor(marge, bart).
progenitor(homer, lisa).
progenitor(marge, lisa).

abuelo(X, Y):- progenitor(X, Z), progenitor(Z, Y), hombre(X).
tia(X,Y):- hermana(X,Z), progenitor(Z,Y).

exit
swipl
consult('programaprolog.pl').
halt.
```

Así podemos crear la carpeta para consultas y pegar lo siguiente, cambiar al intérprete de prolog y ejecutar el último comando para escribir esas consultas. Halt para salir