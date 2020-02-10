import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class appointmentSchedulingPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/appointmentScheduling";
    
    public apointment: ElementFinder;
    public patientid: ElementFinder;
    public doctorid: ElementFinder;
    public observations: ElementFinder;
    public save: ElementFinder;

     //Assertions
        public message: ElementFinder;
        public tablemessage: ElementFinder;
        public datemessage: ElementFinder
        public doctoridmessage: ElementFinder
        public doctornamemessage: ElementFinder
        public patientidmessage: ElementFinder
        public patientnamemessage: ElementFinder
        public observationsmessage: ElementFinder

    constructor() {
        this.apointment = $("#datepicker")
        this.patientid = $("[placeholder='Ingrese el documento de identidad del paciente']")
        this.doctorid = $("[placeholder='Ingrese el documento de identidad del doctor']")
        this.observations = $("textarea.form-control")
        this.save = $(".btn-primary")

    //Assertions
        this.message = $(".panel-body")
        this.tablemessage =$(".col-md-4")
        this.datemessage =$("tr:nth-child(1) > td:nth-child(2)")
        this.doctoridmessage =$("tr:nth-child(2) > td:nth-child(2)")
        this.doctornamemessage =$("tr:nth-child(3) > td:nth-child(2)")
        this.patientidmessage =$("tr:nth-child(4) > td:nth-child(2)")
        this.patientnamemessage =$("tr:nth-child(5) > td:nth-child(2)")
        this.observationsmessage =$("tr:nth-child(6) > td:nth-child(2)")
    }
}
