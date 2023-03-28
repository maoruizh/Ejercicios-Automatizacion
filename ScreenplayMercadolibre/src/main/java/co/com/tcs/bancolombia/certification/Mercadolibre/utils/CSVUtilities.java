package co.com.tcs.bancolombia.certification.Mercadolibre.utils;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilities {
    private static final Logger LOGGER = LoggerFactory.getLogger(CSVUtilities.class);

    public static List<String[]> readCSV(List<String[]> listVector) {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/test/resources/files/subcategorias.csv"))
                .withCSVParser(csvParser)
                .build()) {
            listVector = reader.readAll();
        } catch (IOException | CsvException e) {
            LOGGER.error("Error al leer csv", e);
        }
        return listVector;
    }

    public static List<String> getListSubcategories(String nameCategory) {
        int indexCategory = 0;
        List<String[]> listVector = new ArrayList<>();
        List<String> listSubCategories = new ArrayList<>();
        listVector = CSVUtilities.readCSV(listVector);
        indexCategory = getIndexCategory(listVector.get(0),indexCategory,nameCategory);

        for (int i = 1; i < listVector.size(); i++) {
            String[] dataCustomerFromCSV = listVector.get(i);
            listSubCategories.add(dataCustomerFromCSV[indexCategory]);
        }
        listSubCategories.removeAll(Arrays.asList("",null));
        return listSubCategories;
    }

    public static int getIndexCategory (String[] vector, int indexCategory, String nameCategory){
        for (int i = 0; i < vector.length; i++){
            if (vector[i].equals(nameCategory)){
                indexCategory = i;
            }
        }
        return indexCategory;
    }
}
