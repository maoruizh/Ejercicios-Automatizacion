import { $, ElementFinder } from "protractor";

export class SearchPageObject {
    public searchTextBox: ElementFinder;
    public searchButton: ElementFinder;

    constructor() {
        this.searchTextBox = $("input[name='q']");
        this.searchButton = $("input[value='Google Search']");
    }
}
