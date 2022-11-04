import { ProductDetailsPageObject } from "../linio/productDetails.page";
import { LoginPageObject } from "../linio/login.page";

//page-mapping.ts
//Mapa (key , value)
export let pageMapping = {
    //"Product Details": new ProductDetailsPageObject(),
    "Login": new LoginPageObject (),
    "Linio": new ProductDetailsPageObject()
}