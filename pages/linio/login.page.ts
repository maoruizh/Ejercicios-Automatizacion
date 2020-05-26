import { $, ElementFinder } from "protractor";
import { timingSafeEqual } from "crypto";
//URL
//Elementos de la pagina
export class LoginPageObject {
    static url = "https://www.linio.com.co/";

    // Scenario: Login successful
    public perfilIcon: ElementFinder;
    public iniciaSesión: ElementFinder;
    public emailField: ElementFinder;
    public passWordField: ElementFinder;
    public loginButton: ElementFinder;
    public logout: ElementFinder;
    public forgotPassword: ElementFinder
    public forgotEmail: ElementFinder
    public notRobot: ElementFinder
    public recoverPass: ElementFinder
    public newAccount: ElementFinder
    public nameField: ElementFinder
    public lastNameField: ElementFinder
    public newEmail: ElementFinder
    public newPassword: ElementFinder
    public acceptTerms: ElementFinder

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
    public invalidPassMessage: ElementFinder

    constructor() {
        // Scenario: Login successful
        this.perfilIcon = $(".header-icons-row [href='/account']")
        this.iniciaSesión = $("#user-menu a[href='/account/login']")
        this.emailField = $("#login_form_email")
        this.passWordField = $("#login_form_password")
        this.loginButton = $(".btn.btn-security.col-xs-12")
        this.logout= $(".item-header-menu [href='/account/logout']")
        this.forgotPassword= $(".link-low-sm")
        this.forgotEmail= $("#forgot_password_form_email")
        this.notRobot= $(".g-recaptcha")
        this.recoverPass= $(".btn.btn-primary.col-xs-12")
        this.newAccount= $(".nav-item:nth-child(2) > a")
        this.nameField= $("#registration_firstName")
        this.lastNameField= $("#registration_lastName")
        this.newEmail= $("#registration_email")
        this.newPassword= $("#registration_password")
        this.acceptTerms= $("[href='/sp/terminos']")
        
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
        this.invalidPassMessage= $(".alert-text")

    }
}