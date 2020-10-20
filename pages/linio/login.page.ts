import { $, ElementFinder } from "protractor"
const  camelcase = require("camelcase");;

//URL
//Elementos de la pagina
export class LoginPageObject {
    //static url = "https://www.linio.com.co/";
    public url = "https://www.linio.com.co/";

    // Scenario: Login successful
    public profileIcon: ElementFinder;
    public login: ElementFinder;
    public emailField: ElementFinder;
    public passwordField: ElementFinder;
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
    public welcomeMessage: ElementFinder;
    public profileIcon2: ElementFinder;
    public someOptions: ElementFinder;
    public myAcount: ElementFinder;
    public myReviews: ElementFinder;
    public myOrders: ElementFinder;
    public myCoupons: ElementFinder;
    public mySubscriptions: ElementFinder;
    public signOff: ElementFinder;
    public invalidPassMessage: ElementFinder

    constructor() {
        // Scenario: Login successful
        this.profileIcon = $(".header-icons-row [href='/account']")
        this.login = $("#user-menu a[href='/account/login']")
        this.emailField = $("#login_form_email")
        this.passwordField = $("#login_form_password")
        this.loginButton = $('form[name=login_form] button[type=submit]')
        this.logout= $(".item-header-menu [href='/account/logout']")
        this.forgotPassword= $(".link-low-sm")
        this.forgotEmail= $("#forgot_password_form_email")
        this.notRobot= $("#recaptcha-anchor")
        this.recoverPass= $(".btn.btn-primary.col-xs-12")
        this.newAccount= $(".nav-item:nth-child(2) > a")
        this.nameField= $("#registration_firstName")
        this.lastNameField= $("#registration_lastName")
        this.newEmail= $("#registration_email")
        this.newPassword= $("#registration_password")
        this.acceptTerms= $("[href='/sp/terminos']")
        
        //Assertions
        this.welcomeMessage = $(".user-welcome.body-base-sm")
        this.profileIcon2 = $(".header-icons-row [href='/account']")
        this.someOptions = $(".header-menu")
        this.myAcount = $("#user-menu .icon-menu [href='/account/profile-edit']")
        this.myReviews = $("#user-menu .icon-menu [href='/account/reviews']")
        this.myOrders = $("#user-menu .icon-menu [href='/account/order/list']")
        this.myCoupons = $("#user-menu .icon-menu [href='/account/coupons']")
        this.mySubscriptions = $("#user-menu .icon-menu [href='/account/notifications']")
        this.signOff = $(".item-header-menu")
        this.invalidPassMessage= $(".alert-text")

    }

    getField(name : string): ElementFinder {
        let field = this[camelcase(name)];
        if (!field) {
            throw "Field not found for name: " + camelcase(name)
        }
        return this[camelcase(name)];
    }
}