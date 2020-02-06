import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class LoginmodalPageObject {
    static url = "https://www.falabella.com.co/falabella-co/";
    
    public categorias: ElementFinder;
    public emailField: ElementFinder;
    public tecnologia: ElementFinder;
    public samsungWatch: ElementFinder;
    public active: ElementFinder;
  
    //Assertions
           
    constructor() {
        this.categorias = $(".jsx-1339749587.line")
        this.emailField = $(".active:nth-child(2)")
        this.tecnologia = $(".InputPassword__inputText__2IUUv")
        this.active = $(".Button__main__1NDc9.Button__green__1fhy5")
       
    //Assertions
    
  }
}
