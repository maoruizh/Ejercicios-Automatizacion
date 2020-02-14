import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class SearchPageObject {
    static url = "https://www.falabella.com.co/falabella-co/";
    
    public categorias: ElementFinder;
    public tecnologia: ElementFinder;
    public samsungWatch: ElementFinder;
    public active: ElementFinder;
  
    //Assertions
           
    constructor() {
        this.categorias = $("#hamburgerMenu")
        this.tecnologia = $("#item-1")
        this.samsungWatch = $(".SecondLevelItems_displaySubMenuDesktop__33Gpt .SecondLevelItems_submenuElements__3l4ER  :nth-child(4) .ThirdLevelItems_listElements__ZcR7D:nth-child(2) .ThirdLevelItems_submenuElementLi__n49I5")
        this.active = $(".jsx-3185677989 #testId-pod-image-4181242")

    //Assertions
    
  }
}
