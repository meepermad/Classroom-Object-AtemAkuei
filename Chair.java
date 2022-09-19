public class Chair {
    private int height;
    private double position;
    private String color;
  
    public Chair() {
      height = 60; //inches
      position = 90; //degrees
      color = "blue";
    }
  
    public Chair(String color) {
      this.color = color;
      height = 60; //inches
      position = 90; //degrees
    }
  
    public Chair(int height, double position, String color) {
      this.height = height;
      this.position = position;
      this.color = color;
    }
  
    public String toString() {
      return "Chair color is: " + color + ", Chair height is " + height + " inches" + ", Chair position is " + position + " degrees.";
    }
  
    public void tellHeight() {
      System.out.println("Chair height is " + height + " inches.");
    }
  
    public void changeColor(String newColor) {
      color = newColor;
      System.out.println("Color is now " + color);
    }
    
    public void changeHeight(int newHeight) {
      height = newHeight;
      System.out.println("Height is now " + height + " inches.");
    }
  
    public void changePosition(double newPosition) {
      position = newPosition;
      System.out.println("Position is now " + position + " degrees.");
    }
  
    public void setHeight(int newHeight) {
      height = newHeight;
      System.out.println("Height is now " + height + " inches.");
    }
  
    public void setPosition(double newPosition) {
      position = newPosition;
      System.out.println("Position is now " + position + " degrees.");
    }
  
    public void setColor(String newColor) {
      color = newColor;
      System.out.println("Color is now " + color);
    }
  
    public int getHeight() {
      return height;
    }
  
    public double getPosition() {
      return position;
    }
  
    public String getColor() {
      return color;
    }
    
  }