package co.com.tcs.bancolombia.certification.Mercadolibre.utils;

//esta clase se crea para hacer operaciones con la lista que tenemos del WebElementFacade (ordenar las lista, obtener los textos)
//en este caso vamos a crear un método que nos obtenga la lista de subcategorias pero en string

import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

public class OperationOnList {
    public static List<String> getListSubCategories(List<WebElementFacade> listSubCategories, List<String> stringList){
        //en esta línea tenemos el método List de tipo String el cual se llamó getListSubCategories y lo que hace es recibir la lista del WebElementFacade

      for (WebElementFacade webElementFacade:listSubCategories){ //aca se crea un for para recorrer la lista que se recibe del WebElementFacade
          stringList.add(webElementFacade.getTextValue()); // esto lo que hace es que obtiene el texto de la lista
      }
      return stringList;
    }
}
