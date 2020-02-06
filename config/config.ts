import * as path from "path";
import { browser, Config } from "protractor";
import { Reporter } from "../support/reporter";
const jsonReports = process.cwd() + "/reports/json";

export const config: Config = {
    // The address of a running selenium server.
    seleniumServerJar: require('selenium-standalone-jar').path,
    seleniumAddress: process.env.seleniumAddress || 'http://localhost:4444/wd/hub',
    chromeDriver: require('chromedriver').path,

    directConnect: true,

    SELENIUM_PROMISE_MANAGER: false,

    baseUrl: "http://www.google.com",

    capabilities: {
        browserName: "chrome",
    },

    framework: "custom",
    frameworkPath: require.resolve("protractor-cucumber-framework"),

    specs: [
        "../../features/*.feature",
    ],

    onPrepare: () => {
        browser.ignoreSynchronization = true;
        browser.manage().window().maximize();
        Reporter.createDirectory(jsonReports);
    },

    cucumberOpts: {
        compiler: "ts:ts-node/register",
        format: "json:./reports/json/cucumber_report.json",
        require: ["../../typeScript/stepdefinitions/*.js", "../../typeScript/support/*.js"],
        strict: true,
        tags: "@mao",
    },

    onComplete: () => {
        Reporter.createHTMLReport();
    },
};
