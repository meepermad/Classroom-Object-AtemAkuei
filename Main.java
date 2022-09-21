class Main {

  public void print(String message){
    System.out.print(message);
  }

  public void printLn(String message){
    System.out.println(message);
  }

  
    public static void main(String[] args) {
        Light l = new Light();
        Light l2 = new Light(20, 20, "LED", false);
        l.turnOn();

        Chair c1 = new Chair(10, 10, "Red");
        Light s1 = new Light(c1, 100, 100, "Chair Light", true, 8.5);

        s1.sit();

        System.out.println(l);
        System.out.println(l2);
      
    }
}