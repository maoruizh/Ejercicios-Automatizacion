import { $, ElementFinder } from "protractor";
//URL
//Elementos de la pagina
export class ProductDetailsPageObject {
    static url = "https://www.linio.com.co/";

    // Scenario: Add to Cart
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
        this.product = $(".product-card.swiper-slide [alt='TV Samsung 65\" 4K UHD Smart Tv 65RU7100']") //se una el backslash para que el sistema entineda que las comillas hacen parte del selector
        this.nextImage = $("#image-container .swiper-button-next")
        this.seeMore= $(".panel-footer.link-base-sm")
        this.seeLess= $("#panel-features .link-base-sm.panel-close-link")
        this.productDetails= $("#panel-details")
        this.seeLess2= $("#panel-details .link-base-sm.panel-close-link")
        this.increaseQuantity= $("#selected-option-product-quantity")
        this.quantity= $(".select-dropdown-list-item[data-value='2']")
        this.addToCart= $("#buy-now")
        
        //Assertions
        this.message = $(".added-product.highlight")
      
    }
}