# Responde correctamente

## 1. ¿Qué es una aserción?
Una aserción es una forma de hacer pruebas al programa para evitar errores, estas pruebas son lógicas y no de sintaxis.

---

## 2. ¿Cuál es el objetivo de programar utilizando aserciones?
Detectar errores lógicos en el programa y evitar que aparezcan en etapas avanzadas del desarrollo, donde serían más difíciles de corregir.

---

## 3. ¿Cuál es la palabra reservada para crear aserciones?
`assert`

---

## 4. ¿Qué parámetro se utiliza al compilar para que las aserciones funcionen?
`java -ea NombreDelPrograma`

---

## 5. Escribe un ejemplo de una aserción donde se controle que el valor de una variable esté dentro de un rango determinado.
```java
assert numero > rangoInferior && numero < rangoSuperior : "El número no está en el rango";

