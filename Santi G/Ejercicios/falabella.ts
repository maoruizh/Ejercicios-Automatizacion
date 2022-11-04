/*Crear un objeto que represente:
Menu, menu tiene varias Categorias, cada categoria tiene subcategorias, cada subcategoria tiene items

Metodos:
Menu.findCategory -> dado un nombre retorna la categoria
Category.findSubCategory -> dado un nombre retornar la subcategoria
SubCategory.findItem -> dado un nombre retorne el item

Esto fue una forma de aprender como los objetos podian contener otros objetos, arrays, etc.
Y tambien me sirvio para dimensiosnr lo gigante que seria hacer todo este ejercicio con cada una de sus categorias de forma manual
let Menu = {
    DiviérteteEnCasa : {
        OficinaEnCasa : {
            items : ["Computadores" , "Parlantes", "Tablets", "Audífonos", "Lámparas y Bombillos", "Escritorios", "Sillas de Oficina", "Ver todo Oficina en Casa"]
        },  
        CocinaDivertida:{},
        EntretenimientoCineTv:{},
        Higiene:{},
        SalonDeBelleza:{},
        JuegosYDiversion:{},
        ejercicioEnCasa:{},
        Libros:{},
    },
    Celulares:{},
    Tecnología:{},
    Electrodomésticos:{},
    Muebles:{},
    Dormitorio:{},
    Decohogar:{},
    Zapatos:{},
    Mujer:{},
    Accesorios:{},
    Belleza:{},
    Hombre:{},
    Deportes:{},
    Infantil:{},
    Juguetería:{},
    CrateyBarrel:{},
    OtrasCategorías:{},
}
console.log(Menu.DiviérteteEnCasa.OficinaEnCasa.items[0]);

Con este ejercicio vi como atraves de variables podia hacer un codigo mas funcional que lo anterior pero aun asi tenia que repetir mucho codigo
Version 1
Menu
var menu = {
    //properties
    categories: ["DiviérteteEnCasa","Celulares","Tecnología", "Electrodomésticos"],

    //metodos o funciones
    findCategory: function(name){
        let result = null;
        for(let i = 0; i < this.categories.length; i++) {
            if (this.categories[i] === name) {
                result = this.categories[i];
            }
        }
        return result;
    }
}

//Category
var category = {
    //properties
    subCategories: ["Oficina En Casa", "Cocina Divertida", "Entretenimiento Cine Tv"],

    //metodos o funciones
    findSubCategory: function(name){
        let result = null;
        for(let i = 0; i < this.subCategories.length; i++) {
            if (this.subCategories[i] === name) {
                result = this.subCategories[i];
            }
        }
        return result;
    }
}

//SubCategory
var subCategory = {
    //properties
    items : ["Computadores" , "Parlantes", "Tablets", "Audífonos", "Lámparas y Bombillos", "Escritorios", "Sillas de Oficina", "Ver todo Oficina en Casa"],

    //metodos o funciones
    findItem: function(name){
        let result = null;
        for(let i = 0; i < this.items.length; i++) {
            if (this.items[i] === name) {
                result = this.items[i];
            }
        }
        return result;
    }
}
item: array
*/

//Version 3 En este ejercicio vi como utilizando clases o moldes, podia crear un solo molde y luego usarlo para cada una de las posibles acciones a realizar con estos datos 
class Menu {

    public categories
    //properties
    constructor(categories) {
        this.categories = categories; //Array(Category)
    }
    //metodos o funciones
    findCategory(name) { // Category
        let result = null;
        for (let i = 0; i < this.categories.length; i++) {
            if (this.categories[i].name === name) {
                result = this.categories[i];
            }
        }
        return result;
    }
}

class Category {

    public subCategories
    public name
    //properties
    constructor(name, subCategories) {
        this.name = name; //Diviertete en Casa
        this.subCategories = subCategories; // Array(SubCategory)  [{name: "Oficina en casa", items: ['parlantes', tablet]},{name: "Salon de belleza", items: ['Depilacion', Cepillos]}]
    }
    //metodos o funciones
    findSubCategory(name) { //SubCategory
        let result = null;
        for (let i = 0; i < this.subCategories.length; i++) {
            if (this.subCategories[i].name === name) {
                result = this.subCategories[i];
            }
        }
        return result;
    }
}

class SubCategory {

    public items
    public name
    //properties
    constructor(name, items) {
        this.name = name;  //"Oficina En Casa" 
        this.items = items; // [item1, item2]
    }
    //metodos o funciones
    findItem(name) {  //Items
        let result = null;
        for (let i = 0; i < this.items.length; i++) {
            if (this.items[i] === name) {
                result = this.items[i];
            }
        }
        return result;
    }
}

//creacion de 2 Subcategorias y su categoria
let item1 = "parlantes";
let item2 = "tablets";
let sub_categoria1 = new SubCategory("Oficina En Casa", [item1, item2])
// sub_categoria1 = {
//     nombre: "Oficina En Casa", items: [item1, item2]
// }

let item3 = "Depilacion";
let item4 = "Cepillos";
let sub_categoria2 = new SubCategory("Salon de belleza", [item3, item4])
// sub_categoria2 = {
//     nombre: "Salon de belleza",
//     items: [item3, item4]
// }

let categoria1 = new Category("Diviertete en casa", [sub_categoria1, sub_categoria2])
// let categoria1 = {
//     nombre: "Diviertete en casa",
//     sub_categorias: [sub_categoria1, sub_categoria2]
// }


//creacion de 2 Subcategorias y su categoria
let item5 = "Celulares Samsung";
let item6 = "Celulares Huawei";
let sub_categoria3 = new SubCategory("Celulares y Telefonos", [item5, item6])
// sub_categoria3 = {
//     nombre: "Celulares y Telefonos",
//     items: [item1, item2]
// }

let item7 = "Smartwatch";
let item8 = "Smartbands";
let sub_categoria4 = new SubCategory("Wearables", [item7, item8])
// sub_categoria4 = {
//     nombre: "Wearables",
//     items: [item7, item8]
// }

let categoria2 = new Category("Celulares", [sub_categoria3, sub_categoria4])
// let categoria2 = {
//     nombre: "Celulares",
//     sub_categorias: [sub_categoria3, sub_categoria4]
// }

//cracion del menu con las dos categorias
let menu = new Menu([categoria1, categoria2])
// let Menu = {
//     categorias: [categoria1, categoria2]
// }

let categoriaEncontrada = menu.findCategory("Diviertete en casa")
console.log(categoriaEncontrada)

console.log(categoriaEncontrada === categoria1)
console.log(categoriaEncontrada === categoria2)

console.log(menu.findCategory("Diviertete en casa"))
//___________________________________________________________________

console.log(menu.findCategory("Diviertete en casa").findSubCategory("Salon de belleza").findItem("Cepillos"))

let categoriaEncontrada3 = menu.findCategory("Diviertete en casa")
let subCategoriaEncontrada = categoriaEncontrada3.findSubCategory("Salon de belleza")
let itemEncontrado = subCategoriaEncontrada.findItem("Cepillos")
console.log(itemEncontrado)

// ts-node .\Ejercicios\falabella.ts
// escribir en consola esta ruta para poder ejecutar el codigo node .\Ejercicios\falabella.ts 
// set-executionpolicy -Scope CurrentUser unrestricted
 