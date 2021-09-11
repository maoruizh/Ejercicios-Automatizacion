import { $, ElementFinder } from "protractor";
const  camelcase = require("camelcase");

//URL
//Elementos de la pagina
export class ProductDetailsPageObject {
    //static url = "https://www.linio.com.co/";
    public url = "https://www.linio.com.co/";

    // Scenario: Add to Cart
    public searchField: ElementFinder;
    public searchButton: ElementFinder;
    public product: ElementFinder;
    public nextImage: ElementFinder;
    public seeMore: ElementFinder;
    public seeLess: ElementFinder
    public productDetails: ElementFinder
    public seeLess2: ElementFinder
    public increaseQuantity: ElementFinder
    public quantity: ElementFinder
    public addToCart: ElementFinder
    
    //Assertions
    public message: ElementFinder;
   
    constructor() {
        // Scenario: Add to Cart
        this.searchField = $(".input-group input.form-control[name='q'][type='search']")
        this.searchButton = $(".input-group-btn")
        this.product = $(".image-container [alt='Celular Xiaomi Poco X3 Pro 256gb  8ram  48mp Bronce Metalico']")//se usa el backslash \ para que el sistema entineda que las comillas hacen parte del selector
        this.nextImage = $(".slider-next")
        this.seeMore= $(".panel-footer.link-base-sm")
        this.seeLess= $("#panel-features .link-base-sm.panel-close-link")
        this.productDetails= $("#panel-details")
        this.seeLess2= $("#panel-details .link-base-sm.panel-close-link")
        this.increaseQuantity= $(".select-dropdown.select-dropdown-product-quantity")
        this.quantity= $(".select-dropdown-list-item[data-value='2']")
        this.addToCart= $("#buy-now")
        
        //Assertions
        this.message = $(".added-product.highlight")
      
    }

    getField(name : string): ElementFinder {
        let field = this[camelcase(name)];
        if (!field) {
            throw "Field not found for name: " + name
        }
        return this[camelcase(name)];
    }
}

