import { ElementArrayFinder, ElementFinder } from "protractor";
import { SubCategory } from "./subcategory";

//Elementos del componente
export class Category {
    public element: ElementFinder; //cual es su "cuadrito"
    public name: ElementFinder; //1 solo elemento
    public subCategories: ElementArrayFinder; //varios elementos [] 
  
    constructor(nameElement, element) {
        this.element = element; //paseme el cuadrado - $ para un elemento - $$ arreglo de elementos []
        this.name = nameElement;
        this.subCategories = this.element.$$('.SecondLevelItems_detailsElements__36uYN')
    }

    public async findSubCategory(name : string): Promise<SubCategory>{
        let result = null;
        await this.subCategories.each(async (subCategoryElement) => { //por cada subCategoryElement dentro de subCategories
            let subCategory = new SubCategory(subCategoryElement);
            let subCategoryName = await subCategory.name.getText()
            if (subCategoryName === name) {
                result = subCategory;
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