package FromFiles;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class GetDataFromFile {
    public static void main(String[] args){
        JSONParser jsonParser = new JSONParser();
         try(FileReader reader = new FileReader("souvenir.json")){
         Object obj = jsonParser.parse(reader);
            JSONArray souvenirs = (JSONArray) obj;
            souvenirs.forEach(souvenirList ->parseFile((JSONObject)souvenirList));
    } catch (IOException | ParseException e){
        e.printStackTrace();
    }
    }

 private static void parseFile(JSONObject souvenirList){
     JSONObject souvenir = (JSONObject) souvenirList.get("Сувенир");

     String souvenirName = (String) souvenir.get("Название_позиции");
     String souvenirManufacturer = (String) souvenir.get("Производитель");
     String souvenirManufacturingDate = (String) souvenir.get("Дата Выпуска");
     String souvenirPrice = (String) souvenir.get("Цена");
     System.out.println("Название_позиции: "+ souvenirName);
     System.out.println("Производитель: "+ souvenirManufacturer);
     System.out.println("Дата Выпуска: "+ souvenirManufacturingDate);
     System.out.println("Цена: "+ souvenirPrice);
 }

}
