import { ElementArrayFinder, ElementFinder } from "protractor";

//Elementos del componente
export class SubCategory {
    public element: ElementFinder; //cual es su "cuadrito"
    public name: ElementFinder; //1 solo elemento
    public items: ElementArrayFinder; //varios elementos [] 
            
    constructor(element) {
        this.element = element; //paseme el cuadrado - paseme el cuadraro - $ para un elemento - $$ arreglo de elementos []
        this.name = this.element.$('.SecondLevelItems_submenuTitle__3U6Ct') //busca el titulo dentro del cuadrado
        this.items = this.element.$$('.ThirdLevelItems_listElements__ZcR7D')
    }

    public async findItem(name : string): Promise<ElementFinder>{
        let result = null;
        await this.items.each(async (item) => { //por cada item dentro de items
            let itemName = await item.getText()
            if (itemName === name) {
                result = item;
            }
        })
        return result;
    }
}