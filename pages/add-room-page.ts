import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class AddroomPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/addRoom";
    
    public numberroom: ElementFinder;
    public deluxeroom: ElementFinder;
    public directv: ElementFinder;
    public save: ElementFinder;
    
    //Assertions
    public message: ElementFinder;
    public table: ElementFinder;
    public roomnumber: ElementFinder
    public roomtype: ElementFinder
    public doubleroom: ElementFinder
    public directvroom: ElementFinder

    constructor() {

        this.numberroom = $(".form-control")
        this.deluxeroom = $("[value='Habitación de lujo']")
        this.directv = $(".luxury label")
        this.save = $(".btn-primary")
        
        //Assertions
        this.message = $(".panel-body")
        this.table =$(".col-md-4")
        this.roomnumber =$("tr:nth-child(1) > td:nth-child(2)")
        this.roomtype =$("tr:nth-child(2) > td:nth-child(2)")
        this.doubleroom =$("tr:nth-child(3) .fa-times")
        this.directvroom =$("tr:nth-child(4) .fa-check")
    }
}