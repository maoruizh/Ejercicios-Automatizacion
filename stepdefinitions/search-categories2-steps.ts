import { browser } from "protractor";
import {SearchPageObject } from "../pages/search-categories2-page";
const { Given, When, setDefaultTimeout } = require("cucumber");
import * as chai from 'chai'
import { Category } from "../pages/components/category";
chai.use(require("chai-as-promised"))
const expect = chai.expect;
setDefaultTimeout(10000);

let search: SearchPageObject = new SearchPageObject();
let category: Category = null;

//Mappear pasos de los features
Given(/^the user is on the Falabella page$/, async () => {
    return await browser.get(SearchPageObject.url)
});

When(/^the user click on button categorias$/, async () => {
    await search.categoryButton.click()  
});

When(/^the user click on category "(.*)"$/, async (categoryName) => {
    category = await search.menu.findCategory(categoryName)
    await category.name.click()
});

When(/^the user click on item "(.*)" inside "(.*)"$/, async (itemName, subcategoryName) => {
    let subCategory = await category.findSubCategory(subcategoryName)
    let item = await subCategory.findItem(itemName)
    await item.click()
});

When(/^the user wait$/, async () => {
    await browser.sleep(3000)
});