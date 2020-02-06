import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class DoctorListPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/sgarcesg/doctorList";
    
    //Assertions
    public message: ElementFinder;
    public table: ElementFinder;
    public documentOfId: ElementFinder;
    public typeOfDocumentId: ElementFinder;
    public name: ElementFinder;
    public lastName: ElementFinder;
    public telephone: ElementFinder;


    //public getTableCell(row, column): ElementFinder {
      //  return $('table tr').get(row).find("td").get(column);
    //}

    constructor() {
    //Assertions
        this.message = $(".panel-body")
        this.table =$(".col-md-12")
        this.documentOfId =$("tbody tr:nth-child(1) > td:nth-child(1)")
        this.typeOfDocumentId =$("tbody tr:nth-child(1) > td:nth-child(2)")
        this.name =$("tbody tr:nth-child(1) > td:nth-child(3)")
        this.lastName =$("tbody tr:nth-child(1) > td:nth-child(4)")
        this.telephone =$("tbody tr:nth-child(1) > td:nth-child(5)")
    }
}