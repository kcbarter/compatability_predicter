package json_files;

import exceptions.FileNotFound;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Here ParseJson is responsible for parsing the json files.
 */
public class ParseJson {

  /**
   * Empty Constructor for Parse
   */
  ParseJson(){

  }

  /**
   * @param filename String of the Json filename to parse.
   * @return returns a JSONObject.
   */
  private JSONObject jsonObject(String filename) throws FileNotFoundException {
    FileReader reader = null;
    Object object = null;

    try{
      new FileReader(filename);
    } catch (FileNotFoundException e){
      throw new FileNotFound(e.getMessage());
    }
    try{
      object = new JSONParser().parse(reader);
    } catch (IOException | ParseException e){
      e.printStackTrace();
    }

    return (JSONObject) object;
  }

  /**
   * Here the method first gets the JSONObject. It then gets an HashMap based on the key provided
   * to the method. If the key is found it then loops over the JSONArray and adds the name and attributes
   * Map to a hashmap.
   *
   * @param key String keys in the json file to quickly gain access to the team and applicants arrays.
   * @param fileName The file name of the json file.
   * @return A Hashmap with each team members  applicants names going with a HashMap of their attributes.
   */
  public Map<String, Map<String, Integer>> getData(String key, String fileName)  {
    JSONObject jsonObject = null;
    Map<String, Map<String, Integer>> resultMap = new HashMap<>();
    try{
      jsonObject = jsonObject(fileName);
      JSONArray jsonArray = null;
      try{
        jsonArray = (JSONArray) jsonObject.get(key);
        if(jsonArray == null){
          throw new NullPointerException("No " + key + " found!");
        }


      }
      catch (NullPointerException e){
        e.getMessage();
      }
    }
    catch (FileNotFound e) {
      e.getMessage();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return resultMap;
  }
}
