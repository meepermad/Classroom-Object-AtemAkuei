public class Light {
  int lumens, watts;
  String type;
  boolean isOn;

  public void print(String message){
    System.out.print(message);
  }

  public void printLn(String message){
    System.out.println(message);
  }

  public Light() {
    lumens = 450;
    watts = 60;
    type = "Incacdescent";
    isOn = false;
  }

  public Light(String type){
    this();
    this.type = type;
  }
  
  public Light(int lumens, int watts, String type, boolean isOn){
    this.lumens = lumens;
    this.watts = watts;
    this.type = type;
    this.isOn = isOn;
  }

  public void turnOn(){
    isOn = true;
  }

  public void turnOff(){
    isOn = false;
  }

  public int getLumens(){
    return lumens;
  }

  public int getWatts(){
    return watts;
  }

  public String getType(){
    return type;
  }

  public boolean isOn(){
    return isOn;
  }

  public void setLumens(int lumens){
    this.lumens = lumens;
  }

  public void setWatts(int watts){
    this.watts = watts;
  }

  public void changeType(String type){
    this.type = type;
  }

  public void shine(){
    isOn = true;
  }

  public void breakLight(){
    isOn = true;
    type = "Broken";
  }

  public void uninstall(){
    isOn = false;
  }
  
  public String toString(){
    return("Lumens: " + lumens + " | Watts: " + watts + " | Type: " + type + " | Is it on? " + isOn);
  }
  
}