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

        System.out.println(l);
        System.out.println(l2);
      
    }
}