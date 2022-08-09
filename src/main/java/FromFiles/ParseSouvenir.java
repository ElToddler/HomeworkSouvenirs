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

    }
}
