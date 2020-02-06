import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class AddDoctorPageObject {
    static url = "http://evening-woodland-2196.herokuapp.com/mao/addDoctor";
    public nameField: ElementFinder;
    public lastnameField: ElementFinder;
    public telephoneField: ElementFinder;
    public identificationTypeSelect: ElementFinder;
    public identificationTypeOption: ElementFinder;
    public identification: ElementFinder;
    public save: ElementFinder;
    public message: ElementFinder;
    public errormessage: ElementFinder;
    public table: ElementFinder;
    public namerow: ElementFinder;
    public lastnamerow: ElementFinder;
    public Phonerow: ElementFinder;
    public identificationTypeSelectrow: ElementFinder;
    public identificationrow: ElementFinder;

    constructor() {
        this.nameField = $("#name")
        this.lastnameField = $("#last_name")
        this.telephoneField = $("#telephone")
        this.identificationTypeSelect = $("#identification_type")
        this.identificationTypeOption = $("[value='Cédula de ciudadanía']")
        this.identification = $("#identification")
        this.save = $(".btn-primary")
        this.message = $(".panel-body")
        this.errormessage = $(".text-danger")
        this.table = $(".table.table-bordered.table-striped")
        this.namerow = $("#firstName")
        this.lastnamerow = $("#lastName")
        this.Phonerow = $("#telephone")
        this.identificationTypeSelectrow = $("#identificationType")
        this.identificationrow = $("#doctorId")
    }
}
