import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class reseñasPageObject {
    static url = "https://www.linio.com.co/account/profile-edit";

    public misreseñasButton: ElementFinder;
    public calificarButton: ElementFinder;
    
    constructor() {
        this.misreseñasButton = $("")
        this.calificarButton = $("")
    }
}