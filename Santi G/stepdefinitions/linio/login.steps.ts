import { browser, ElementFinder } from "protractor";
import { LoginPageObject } from "../../pages/linio/login.page";
import { Then } from "cucumber";
const { Given, When, setDefaultTimeout } = require("cucumber");
import * as chai from 'chai'
chai.use(require("chai-as-promised"))
const expect = chai.expect;
setDefaultTimeout(10000);

// declare module "cucumber" {
//     interface World {
//         page: LoginPageObject,
//         name: string;
//         count: number;
//     }
//   }

//let loginPage: LoginPageObject = new LoginPageObject();
//Mappear pasos de los features

// Given(/^the user is on the Linio page$/, async function () {
//     return await browser.get(LoginPageObject.url)
// });

// When(/^the user put mouse over the profile Icon$/, async function () {
//     const dropDown = await loginPage.perfilIcon;
//     browser.actions().mouseMove(dropDown).perform();
//     await browser.sleep(5000);
// });

// When(/^the user click on login$/, async function () {
//     await loginPage.iniciaSesión.click()
// });

// When(/the user enter his email Field "(.*?)"$/, async function (emailField) {
//     await loginPage.emailField.sendKeys(emailField)
// });

// When(/^the user enter his password Field "(.*?)"$/, async function (passWordField) {
//     await loginPage.passWordField.sendKeys(passWordField)
// });

// When(/^the user click on login Button$/, async function () {
//     await loginPage.loginButton.click()
// });

// When(/^the user wait$/, async function () {
//     await browser.sleep(3000)
// });

//Assertions
// Then(/^the user can see a message with the text "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.helloUser.getText()
//     expect(actualMessage).to.be.equals(expectedMessage)
// });

// When(/^the user put mouse over the profile Icon$/, async function () {
//     const dropDown = await loginPage.icon;
//     browser.actions().mouseMove(dropDown).perform();
//     await browser.sleep(3000);
// });

// Then(/^the user can see a table with some options$/, async function () {
//     let actualTable = await loginPage.table.isDisplayed()
//     expect(actualTable).to.be.true
// });

// Then(/^the first option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.firstOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// Then(/^the second option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.secondOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// Then(/^the third option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.thirdOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// Then(/^the fourth option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.fourthOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// Then(/^the fifth option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.fifthOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// Then(/^the last option is "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.lastOption.getText()
//     expect(actualMessage).to.contains(expectedMessage)
// });

// When(/^the user click on button cerrar Sesión$/, async function () {
//     await loginPage.logout.click()
// });

// //------------------------------------------------------------------------------
// Then(/^can see a Message with the text "(.*?)"$/, async function (expectedMessage) {
//     let actualMessage = await loginPage.invalidPassMessage.getText()
//     expect(actualMessage).to.be.equals(expectedMessage)
// });
// //------------------------------------------------------------------------------

// When(/^the user click on button olvidé mi contraseña$/, async function () {
//     await loginPage.forgotPassword.click()
// });

// When(/the user enter his e-mail2 "(.*?)"$/, async function (forgotEmail) {
//     await loginPage.forgotEmail.sendKeys(forgotEmail)
// });

// When(/^the user click on button no soy un robot$/, async function () {
//     await loginPage.notRobot.click()
// });

// When(/^the user click on button restablecer contraseña$/, async function () {
//     await loginPage.recoverPass.click()
// });
// //--------------------------------------------------------------------------------

// When(/^the user click on button crear cuenta$/, async function () {
//     await loginPage.newAccount.click()
// });

// //--------------------------------------------------------------------------------
// When(/the user enter his name "(.*?)"$/, async function (nameField) {
//     await loginPage.nameField.sendKeys(nameField)
// });

// When(/the user enter his lastname "(.*?)"$/, async function (lastNameField) {
//     await loginPage.lastNameField.sendKeys(lastNameField)
// });

// When(/the user enter his new e-mail "(.*?)"$/, async function (lastNameField) {
//     await loginPage.lastNameField.sendKeys(lastNameField)
// });

// When(/the user enter his new password "(.*?)"$/, async function (newPassword) {
//     await loginPage.newPassword.sendKeys(newPassword)
// });

// When(/^the user click on button acepto terminos$/, async function () {
//     await loginPage.acceptTerms.click()
// });

// When(/^the user await$/, async function () {
//     await browser.sleep(1000)
// });