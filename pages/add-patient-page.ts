import { $, ElementFinder, element, by } from "protractor";
//URL
//Elementos de la pagina
export class AddPatientPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/addPatient";
    public nameField: ElementFinder;
    public lastnameField: ElementFinder;
    public telephoneField: ElementFinder;
    public identificationTypeSelect: ElementFinder;
    public identificationTypeOption: ElementFinder;
    public identification: ElementFinder;
    public prepaidHealth: ElementFinder;
    public save: ElementFinder;
   
    //Assertions
    public message: ElementFinder;
    public table: ElementFinder;
    public namerow: ElementFinder;
    public lastnamerow: ElementFinder;
    public Phonerow: ElementFinder;
    public identificationTypeSelectrow: ElementFinder;
    //public identificationrow: ElementFinder; nos saltamos este Step porque en la aplicacion el elemento esta mal codificado y repite el nombre
    public prepaidHealthrow: ElementFinder


    constructor() {
        this.nameField = $("[name='name']")
        this.lastnameField = $("[name='last_name']")
        this.telephoneField = $("[name='telephone']")
        this.identificationTypeSelect = $("[name='identification_type']")
        this.identificationTypeOption = $("[value='Cédula de ciudadanía']")
        this.identification = $("[name='identification']")
        this.prepaidHealth = $("[name='prepaid']")
        this.save = $(".btn-primary")
        
        //Assertions
        this.message = $(".panel-body")
        this.table =$(".col-md-4")
        this.namerow = $(".patientName")
        this.lastnamerow = $(".patientLastName")
        this.Phonerow = $(".patientTelephone")
        this.identificationTypeSelectrow = $(".patientId")
        //this.identificationrow = $(".patientId") nos saltamos este Step porque en la aplicacion el elemento esta mal codificado y repite el nombre
        this.prepaidHealthrow = $(".fa.fa-fw.fa-check")
    }
}

