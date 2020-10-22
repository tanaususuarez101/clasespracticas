# INICIALIZACIÓN EN LA PROGRAMACIÓN EN JAVA

## Estructura de un método:

[tipo de acceso] | [¿Se refiere a un objecto?] | [¿qué devuelve?] | nombre Del Método | (parámetros)
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
public | no - static | [¿qué devuelve?] | nombre Del Método | (parámetros)
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
private | - | [¿qué devuelve?] | nombre Del Método | (parámetros)
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
protected | [¿Se refiere a un objecto?] | [¿qué devuelve?] | nombre Del Método | (parámetros)
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
anónimo | [¿Se refiere a un objecto?] | [¿qué devuelve?] | nombre Del Método | (parámetros)

```
[tipo de acceso] [¿Se refiere a un objecto?]  [Lo que devuelve]                 [nombre del método] [Los parametros de entrada (tipo nombreParámetro, ....)] 			
public			         si - void				                void
private			        no - 						                  Tipo primitivo (no es un objecto)
 -				 							                                 Tipo no primitivo (es un objecto)
protected
```

## CONDICIONALES lógicos:
```
|| = O -> primera condición O segunda condición
&& = Y -> primera condición Y segunda condición
```

## GIT && GITHUB
https://github.com/tanaususuarez101/clasespracticas/tree/master

- clonar proyecto
```
git clone https://github.com/tanaususuarez101/clasespracticas.git
```

- Ver ramas del proyecto
```
git branch -a
```

- Cambiar de rama
```
git checkout master
```
- Ver cambios realizados
```
git status
```
- Añadir todos los archivos mdificados
```
gid add *
```
- Realizar un commit 
```
git commit -m "Aquí va el mensaje"
```
- Subir la rama al remoto
```
git push origin master
```

- Descargar los cambios realizados en remoto
```
git pull
```


