import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class profileconfigPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/profileConfig";
    
    public fullname: ElementFinder;
    public fulllastname: ElementFinder;
    public telephone: ElementFinder;
    public listdisease: ElementFinder;
    public disease: ElementFinder;
    public out: ElementFinder;
    public id: ElementFinder;
    public save: ElementFinder;

     //Assertions
        public message: ElementFinder;
        public tablemessage: ElementFinder;
        public namemessage: ElementFinder
        public lastnamemessage: ElementFinder
        public telephonemessage: ElementFinder
        public diseasemessage: ElementFinder;
        public IDmessage: ElementFinder

    constructor() {
        this.fullname = $("#name")
        this.fulllastname = $("#last_name")
        this.telephone = $("[placeholder='Ingrese el teléfono']")
        this.listdisease = $(".ui-multiselect")
        this.disease = $("#ui-multiselect-diseaseHistory-option-4")
        this.out = $(".row")
        this.id = $("#identification")
        this.save = $(".btn.btn-primary.pull-right")

    //Assertions
        this.message = $(".panel-body")
        this.tablemessage =$(".col-md-4")
        this.namemessage =$("tr:nth-child(1) > td:nth-child(2)")
        this.lastnamemessage =$("tr:nth-child(2) > td:nth-child(2)")
        this.telephonemessage =$("tr:nth-child(3) > td:nth-child(2)")
        this.diseasemessage =$("tr:nth-child(4) > td:nth-child(2)")
        this.IDmessage =$("tr:nth-child(5) > td:nth-child(2)")
    }
}
