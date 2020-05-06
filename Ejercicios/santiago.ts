
var student1 = {name: "Mao", lastName: "Ruiz"}
var student2 = {name: "Laura", lastName: "Pulgarin"}
var students = [student1, student2]

var school = {
    //properties
    name: "Automation School",
    students: [],
    //metodos
    enrollment: function(p1, p2) {
        //ingresar al colegi0
        //this.students.concat(students)
        this.students.push(p1, p2)
    },
    graduate: function() { // el pop en este ejercicio con necesita paramaetros
        //Retira del colegio
        this.students.pop()
    },

    findByName: function(name) {
        //buscar en los estudiantes cuyo nombre sea igual a "name"
        return this.students.filter (student => {   // for each students
            if(student.name === name) { // compare "name" student.name
                return true // if true return
            } else {
                return false //ignore it
            }
        })
    }
}

console.log("Antes de las inscripciones", school)
/*
DE ESTA MANERA SE MATRICULAN LOS ESTUDIANTES UNO A UNO
school.enrollment(student1) //push
console.log("Despues de inscribir a Mao", school)

school.enrollment(student2) //push
console.log("Despues de inscribir a laura", school)
*/

// DE ESTA MANERA SE INGRESAN LOS ESTUDIANTES (DOS) EN UN SOLO PASO
school.enrollment(students[0], students[1])// Push
console.log("Despues de MATRICULR a los dos estudiantes", school)

console.log("Buscar por nombre", school.findByName("Mao"))

//DE ESTA MANERA SE GRADUAN LOS ESTUDIANTES UNO A UNO

school.graduate() //pop
console.log("Despues de egresar a Laura", school) // el siempre retira la ultima posicion del arreglo

school.graduate()// pop
console.log("Despues de egresar a Mao", school)


/*DE ESTA MANERA SE GRADUAN LOS ESTUDIANTES (DOS) EN UN SOLO PASO
school.graduate()
school.graduate()
console.log("Despues de GRADUAR a los dos estudiantes", school)
*/

// escribir en consola esta ruta para poder ejecutar el codigo node .\Ejercicios\santiago.ts