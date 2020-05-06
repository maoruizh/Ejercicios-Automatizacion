import { $, ElementFinder } from "protractor";
import { Menu } from "./components/menu";
//URL
//Elementos de la pagina
export class SearchPageObject {
    static url = "https://www.falabella.com.co/falabella-co/";

    public categoryButton: ElementFinder;
    public menu: Menu;
  
    constructor() {
        this.categoryButton = $('#hamburgerMenu')
        this.menu = new Menu();
    }

}