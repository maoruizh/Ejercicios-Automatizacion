import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class AddHospitalPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/addHospital";

    public code: ElementFinder;
    public name: ElementFinder;
    public address: ElementFinder;
    public telephone: ElementFinder;
    public department: ElementFinder;
    public municipality: ElementFinder;
    public save: ElementFinder;

    //Assertions
    public message: ElementFinder;
    public tablemessage: ElementFinder;
    public codemessage: ElementFinder
    public namemessage: ElementFinder
    public addressmessage: ElementFinder
    public telephonemessage: ElementFinder
    public departmentmessage: ElementFinder
    public municipalitymessage: ElementFinder

    constructor() {
        this.code = this.findByPlaceholder("Ingrese el código")
        this.name = this.findByPlaceholder("Ingrese el nombre")
        this.address = $("[placeholder='Ingrese los apellidos']")
        this.telephone = $("[placeholder='Ingrese el teléfono']")
        this.department = $("#department")
        this.municipality = $("[value=Antioquia]")
        this.save = $(".btn-primary")

        //Assertions
        this.message = $(".panel-body")
        this.tablemessage = $(".col-md-4")
        this.codemessage = $("tr:nth-child(1) > td:nth-child(2)")
        this.namemessage = $("tr:nth-child(2) > td:nth-child(2)")
        this.addressmessage = $("tr:nth-child(3) > td:nth-child(2)")
        this.telephonemessage = $("tr:nth-child(4) > td:nth-child(2)")
        this.departmentmessage = $("tr:nth-child(5) > td:nth-child(2)")
        this.municipalitymessage = $("tr:nth-child(6) > td:nth-child(2)")
    }
    private findByPlaceholder(value: string): ElementFinder {
        return $("[placeholder='" + value + "']")
    }
}
