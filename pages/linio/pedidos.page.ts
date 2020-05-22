import { $,$$, ElementFinder, ElementArrayFinder } from "protractor";
//URL
//Elementos de la pagina
export class misPedidosPageObject {
    static url = "https://www.linio.com.co/account/profile-edit";

    public mispedidosButton: ElementFinder;
    public verpedidoButton: ElementFinder;

    constructor() {
        this.mispedidosButton = $(".mobile-menu.account-menu.col-md-3.col-xs-12 li:nth-child(1)")
        this.verpedidoButton = $("[href='/account/order/253578292/details']")
    }
}