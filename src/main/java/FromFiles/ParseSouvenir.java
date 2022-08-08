package FromFiles;

import org.json.simple.JSONObject;

public class ParseSouvenir {
    private static void ParseSouvenir(JSONObject souvenirList){
        JSONObject souvenir = (JSONObject) souvenirList.get("Сувенир");
//parsing the file to be able to operate each of the fields
        String souvenirName = (String) souvenir.get("Название_позиции");
        String souvenirManufacturer = (String) souvenir.get("Производитель");
        String souvenirManufacturingDate = (String) souvenir.get("Дата Выпуска");
        String souvenirPrice = (String) souvenir.get("Цена");
        //printing it out
        System.out.println("Название_позиции: "+ souvenirName);
        System.out.println("Производитель: "+ souvenirManufacturer);
        System.out.println("Дата Выпуска: "+ souvenirManufacturingDate);
        System.out.println("Цена: "+ souvenirPrice);
    }
}
