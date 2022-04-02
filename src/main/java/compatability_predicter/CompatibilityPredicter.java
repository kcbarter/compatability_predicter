package compatability_predicter;

import json_files.ParseJson;

public class CompatibilityPredicter {

  public static void main(String[] args) {
    ParseJson parseJson = new ParseJson();

    System.out.println(parseJson.getData("team", "jsonfiles/team_and_aplicants.json"));
    System.out.println(parseJson.getData("applicants", "jsonfiles/team_and_aplicants.json"));
  }
}
