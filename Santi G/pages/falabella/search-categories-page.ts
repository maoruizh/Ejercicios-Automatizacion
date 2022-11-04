import { $, $$, ElementFinder, ElementArrayFinder } from "protractor";
//URL
//Elementos de la pagina
export class SearchPageObject {
  static url = "https://www.falabella.com.co/falabella-co/";

  public categorias: ElementFinder;
  public tecnologia: ElementFinder;
  public samsungWatch: ElementArrayFinder;
  public active: ElementArrayFinder;

  //Assertions

  constructor() {
    this.categorias = $("#hamburgerMenu")
    this.tecnologia = $("#item-1")
    this.samsungWatch = $$(".SecondLevelItems_submenuElements__3l4ER .ThirdLevelItems_submenuElementLi__n49I5.gs_copied")
    this.active = $$("#testId-pod-displaySubTitle-prod9580135")
  }
}
