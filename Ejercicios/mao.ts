//function nombre (parametros) {
//Instrucciones o procesos;
//}

//Fucion sin parametros y que no devulve valores
function saludo() {
    console.log("Hola Mundo");
}
saludo();

//Las funciones deben retornar valores, para esto se utiliza la sentencia return y por eso esta dentro de la funcion
//Ingresando los valores de los parametros sin variables
function multiplicar(a, b) {
    return a * b;
}
console.log(multiplicar(20, 30));

//Ingresando los valores de los parametros por medio de variables locales (estan dentro de la funcion)
function suma(a, b) {
    let N1 = a;
    let N2 = b;
    return a + b;
}
console.log(suma(30, 30));

//Ingresando los valores de los parametros por medio de variables globales (estan fuera de la funcion)
let j1 = 20, j2 = 30, j3 = 40, j4 = 50, j5 = 60, j6 = 70;

function operacion(a, b) {
    return a + b;
}
console.log(operacion(j2, j3));

//esto es otra forma de llamar a la function
let r1 = operacion(j1, j2);
let r2 = operacion(j3, j4);
let r3 = operacion(j5, j6);
console.log(r1);

// escribir en consola esta ruta para poder ejecutar el codigo node .\Ejercicios\mao.ts 