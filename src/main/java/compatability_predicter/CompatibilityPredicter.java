package compatability_predicter;

import json_files.ParseJson;

/**
 * Main class to run the program
 */
public class CompatibilityPredicter {

  public static void main(String[] args) {
    ParseJson parseJson = new ParseJson();

    //TODO: parse json file into to hashmaps for applicants and teams
    //TODO: calculate copatibility of applicants vs team members
    //TODO: return compatibility score
    System.out.println(parseJson.getData("team", "jsonfiles/team_and_aplicants.json"));
    System.out.println(parseJson.getData("applicants", "jsonfiles/team_and_aplicants.json"));
  }
}
