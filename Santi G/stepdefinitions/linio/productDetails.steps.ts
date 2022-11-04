import { browser, ElementFinder } from "protractor";
import { ProductDetailsPageObject } from "../../pages/linio/productDetails.page";
import { Then } from "cucumber";
const { Given, When, setDefaultTimeout } = require("cucumber");
import * as chai from 'chai'
chai.use(require("chai-as-promised"))
const expect = chai.expect;
setDefaultTimeout(10000);

declare module "cucumber" {
    interface World {
        page: any,
        name: string;
        count: number;
    }
  }

//let pDetailPage: ProductDetailsPageObject = new ProductDetailsPageObject();
//Mappear pasos de los features

// Given(/^the user is on the "(.*?)" page$/, async function (field) {
//     this.page = new ProductDetailsPageObject();
//     return await browser.get(ProductDetailsPageObject.url)
// });

// When(/^the user click on "(.*?)"$/, async function (field) {
//     await this.page.product.click(Field)
// });

// When(/^the user click on next image$/, async function (field) {
//     await this.page.nextImage.click()
// });

// When(/^the user click on see more$/, async function () {
//     await this.page.seeMore.click()
// });

// When(/^the user click on see less$/, async function () {
//     await this.page.seeLess.click()
// });

// When(/^the user click on product details$/, async function () {
//     await this.page.productDetails.click()
// });

// When(/^the user click on see less2$/, async function () {
//     await this.page.seeLess2.click()
// });

// When(/^the user click on increase quantity$/, async function () {
//     await browser.executeScript('window.scrollTo(0,0);') //este paso permite hacer scrollUp o llevar la pantalla al inicio
//     await this.page.increaseQuantity.click()
// });

// When(/^the user click on number 2$/, async function () {
//     await this.page.quantity.click()
// });

// When(/^the user click on add to cart$/, async function () {
//     await this.page.addToCart.click()
// });

// //Assertions
// Then(/^can see a Message with the text "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await this.page.message.getText()
//     expect(actualMessage).to.be.equals(expectedMessage)
// });