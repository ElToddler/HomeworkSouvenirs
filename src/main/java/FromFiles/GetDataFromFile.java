package FromFiles;


import MainClasses.Souvenir;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetDataFromFile {
    String SouvenirJson= new String(Files.readAllBytes(Paths.get("souvenir.json")));
    Gson gson = new Gson();
    Souvenir[] carInfoArray =gson.fromJson(SouvenirJson, Souvenir[].class);

    public GetDataFromFile() throws IOException {
    }
}
