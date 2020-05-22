import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class LoginPageObject {
    static url = "https://www.linio.com.co/";

    public perfilIcon: ElementFinder;
    public iniciaSesión: ElementFinder;
    public emailField: ElementFinder;
    public passWordField: ElementFinder;
    public loginButton: ElementFinder;

    //Assertions
    public helloUser: ElementFinder;
    public icon: ElementFinder;
    public table: ElementFinder;
    public firstOption: ElementFinder;
    public secondOption: ElementFinder;
    public thirdOption: ElementFinder;
    public fourthOption: ElementFinder;
    public fifthOption: ElementFinder;
    public lastOption: ElementFinder;

    constructor() {
        this.perfilIcon = $(".header-icons-row [href='/account']")
        this.iniciaSesión = $("#user-menu a[href='/account/login']")
        this.emailField = $("#login_form_email")
        this.passWordField = $("#login_form_password")
        this.loginButton = $(".btn.btn-security.col-xs-12")

        //Assertions
        this.helloUser = $(".user-welcome.body-base-sm")
        this.icon = $(".header-icons-row [href='/account']")
        this.table = $(".header-menu")
        this.firstOption = $("#user-menu .icon-menu [href='/account/profile-edit']")
        this.secondOption = $("#user-menu .icon-menu [href='/account/reviews']")
        this.thirdOption = $("#user-menu .icon-menu [href='/account/order/list']")
        this.fourthOption = $("#user-menu .icon-menu [href='/account/coupons']")
        this.fifthOption = $("#user-menu .icon-menu [href='/account/notifications']")
        this.lastOption = $(".item-header-menu [href='/account/logout']")  
    }
}