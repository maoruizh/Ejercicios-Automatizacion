import { ElementArrayFinder, ElementFinder, $ } from "protractor";
import { Category } from "./category";

//Elementos del componente
export class Menu {
    public element: ElementFinder; //cual es su "cuadrito"
    public categories: ElementArrayFinder; //varios elementos [] 

    constructor() {
        this.element = $('.Menu-module_firstCategories__1v_O9'); //todo el cuadro del menu - $ para un elemento - $$ arreglo de elementos []
        this.categories = this.element.$$('.FirstLevelItems_menuText__UYB9A') //17 categorias
    }

    public async findCategory(name: string): Promise<Category> {
        let result = null;
        await this.categories.each(async (categoryElement) => { //por cada categoryElement dentro de categories
            let category = new Category(categoryElement, $('.SecondLevelItems_displaySubMenuDesktop__33Gpt'));
            let categoryName = await category.name.getText() //string
            if (categoryName === name) {
                result = category;
            }
        })
        return result;
    }
}

/**
   * $$('.Menu-module_firstCategories__1v_O9') cuadro de las categorias
   * $$('.FirstLevelItems_menuText__UYB9A') lista de categorias
   * $$('.SecondLevelItems_submenuElements__3l4ER') cuadro de toda la categoria
   * $$('.secondLevelMenu.secondLevelMenu__dekstop') cuadro de la subcategoria
   * $$('.secondLevelMenu__title') titulo de la subcategoria
   * $$('.thirdLevelMenu.thirdLevelMenu__desktop li')
   */