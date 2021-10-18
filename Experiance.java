
/**
 * This is the experience stub we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */
import java.util.ArrayList;
public class Experiance {
  ArrayList<String>volunteerExperience;
    ArrayList<String>workExperience;
    ArrayList<String>pastEmployers;
    ArrayList<String>pastPositions;
    String experienceDescription;
/**
*this method will initialize each of the variables we
*@volunteerExperiance will initialize volunteer Experiance
*@workExperiance will initialize work Experiance
*@pastEmployers will initialize past employers
*/
public Experiance(ArrayList<String> volunteerExperience, ArrayList<String> workExperience, ArrayList<String> pastEmployers) {

volunteerExperience = volunteerExperience;
workExperience = workExperience;
pastEmployers = pastEmployers;
}
/**
*thhis method will get the the volunteer experiance
*/
public ArrayList<String> getVolunteerExperiance() {
    return volunteerExperience;
}
/**
*this method will get the work experiance 
*/
  public ArrayList<String> getWorkExperiance() {
    return workExperience;
}
   /**
*this method will get the pastEmployers 
*/
  public ArrayList<String> getpastEmployers() {
    return pastEmployers;
}
     /**
*this method will get the past positions 
*/
  public ArrayList<String> getpastPositions() {
    return pastPositions;
}
     /**
*this method will get the experience description
*/
  public String getExperianceDescription() {
    return "";
}



}