import { pageMapping } from "../../pages/Generics/page-mapping";
import { browser, ElementFinder } from "protractor";
import { Then } from "cucumber";
const { Given, When, setDefaultTimeout } = require("cucumber");
import * as chai from 'chai'
import { ProductDetailsPageObject } from "../../pages/linio/productDetails.page";

chai.use(require("chai-as-promised"))
const expect = chai.expect;
setDefaultTimeout(10000);


Given(/^the user is on the "(.*?)" page$/, async function (page) {
    this.page = getPage(page)
    return await browser.get(this.page.url)
});

function getPage (str) {
    return pageMapping[str];
}

When(/^the user wait$/, async function () {
    await browser.sleep(3000)
});

When(/^the user click on "(.*?)"$/, async function (field) {
    await this.page.getField(field).click()
});

When(/^the user ScrollUp$/, async function () {
    await browser.executeScript('window.scrollTo(0,0);')
});

When(/^the user put mouse over the "(.*?)"$/, async function (field) {
    let dropDown = await this.page.getField(field);
    browser.actions().mouseMove(dropDown).perform();
    await browser.sleep(5000);
});

When(/the user enter his "(.*?)" "(.*?)"$/, async function (field1, field2) {
    await this.page.getField(field1).sendKeys(field2)
});

Given(/^the user close page$/, async function () {
     await browser.getAllWindowHandles().then(function (handles) {
        browser.driver.switchTo().window(handles[1]);
        browser.driver.close();
        browser.driver.switchTo().window(handles[0]);
    });
});


// When(/^the user select "(.*?)"$/, async function (field) {
//     await this.page.municipality.click(field)
// });

//Assertions

Then(/^the user can see a message with the text "(.*?)" in "(.*?)"$/, async function (expected, ubication) {
    let actualMessage = await this.page.getField(ubication).getText()
    expect(actualMessage).to.have.string(expected)
});

Then(/^the user can see a table with "(.*?)"$/, async function (field) {
    let actualTable = await this.page.getField(field).isDisplayed(field)
    expect(actualTable).to.be.true
});





