import { browser, ElementFinder } from "protractor";
import { LoginPageObject } from "../../pages/linio/login.page";
import { Then } from "cucumber";
const { Given, When, setDefaultTimeout } = require("cucumber");
import * as chai from 'chai'
import { ProductDetailsPageObject } from "../../pages/linio/productDetails.page";
chai.use(require("chai-as-promised"))
const expect = chai.expect;
setDefaultTimeout(10000);

let pDetailPage: ProductDetailsPageObject = new ProductDetailsPageObject();
//Mappear pasos de los features

Given(/^the user is on the Linio page$/, async () => {
    return await browser.get(LoginPageObject.url)
});

When(/^the user click on an product$/, async () => {
    await pDetailPage.product.click()
});

When(/^the user click on next image$/, async () => {
    await pDetailPage.nextImage.click()
});

When(/^the user click on see more$/, async () => {
    await pDetailPage.seeMore.click()
});

When(/^the user click on see less$/, async () => {
    await pDetailPage.seeLess.click()
});

When(/^the user click on product details$/, async () => {
    await pDetailPage.productDetails.click()
});

When(/^the user click on see less2$/, async () => {
    await pDetailPage.seeLess2.click()
});

When(/^the user click on increase quantity$/, async () => {
    await browser.executeScript('window.scrollTo(0,0);') //este paso permite hacer scrollUp o llevar la pantalla al inicio
    await pDetailPage.increaseQuantity.click()
});

When(/^the user click on number 2$/, async () => {
    await pDetailPage.quantity.click()
});

When(/^the user click on add to cart$/, async () => {
    await pDetailPage.addToCart.click()
});

When(/^the user wait$/, async () => {
    await browser.sleep(3000)
});

//Assertions
Then(/^can see a Message with the text "(.*?)"$/, async (expectedMessage) => {
    let actualMessage = await pDetailPage.message.getText()
    expect(actualMessage).to.be.equals(expectedMessage)
});

//------------------------------------------------------------------------------
// Then(/^can see a Message with the text "(.*?)"$/, async (expectedMessage) => {
//     let actualMessage = await loginPage.invalidPassMessage.getText()
//     expect(actualMessage).to.be.equals(expectedMessage)
// });
// //------------------------------------------------------------------------------

// When(/^the user click on button olvidé mi contraseña$/, async () => {
//     await loginPage.forgotPassword.click()
// });

// When(/the user enter his e-mail2 "(.*?)"$/, async (forgotEmail) => {
//     await loginPage.forgotEmail.sendKeys(forgotEmail)
// });

// When(/^the user click on button no soy un robot$/, async () => {
//     await loginPage.notRobot.click()
// });

// When(/^the user click on button restablecer contraseña$/, async () => {
//     await loginPage.recoverPass.click()
// });
// //--------------------------------------------------------------------------------

// When(/^the user click on button crear cuenta$/, async () => {
//     await loginPage.newAccount.click()
// });

// //--------------------------------------------------------------------------------
// When(/the user enter his name "(.*?)"$/, async (nameField) => {
//     await loginPage.nameField.sendKeys(nameField)
// });

// When(/the user enter his lastname "(.*?)"$/, async (lastNameField) => {
//     await loginPage.lastNameField.sendKeys(lastNameField)
// });

// When(/the user enter his new e-mail "(.*?)"$/, async (lastNameField) => {
//     await loginPage.lastNameField.sendKeys(lastNameField)
// });

// When(/the user enter his new password "(.*?)"$/, async (newPassword) => {
//     await loginPage.newPassword.sendKeys(newPassword)
// });

// When(/^the user click on button acepto terminos$/, async () => {
//     await loginPage.acceptTerms.click()
// });

// When(/^the user await$/, async () => {
//     await browser.sleep(1000)
// });