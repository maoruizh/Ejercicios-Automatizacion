import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class LoginmodalPageObject {
    static url = "https://www.falabella.com.co/falabella-co/";
    
    public iniciaSesión: ElementFinder;
    public emailField: ElementFinder;
    public passWordField: ElementFinder;
    public loginButton: ElementFinder;
  
    //Assertions
     public bienvenido: ElementFinder;
     public mao: ElementFinder;
     public table: ElementFinder;
     public firstOption: ElementFinder;
     public secondOption: ElementFinder;
     public thirdOption: ElementFinder;
       
    constructor() {
        this.iniciaSesión = $(".fb-masthead-login__name")
        this.emailField = $("#emailAddress")
        this.passWordField = $(".InputPassword__inputText__2IUUv")
        this.loginButton = $(".Button__main__1NDc9.Button__green__1fhy5")
       
    //Assertions
     this.bienvenido = $(".fb-masthead-login__user-info__logged")
     this.mao = $(".fb-masthead-login")
     this.table = $(".fb-masthead-login__name")
     this.firstOption = $(".fb-filter-header__list-item")
     //this.secondOption = $(".")
     this.thirdOption = $(".fb-filter-header__log-out")
  }
}
