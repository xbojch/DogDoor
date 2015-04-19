public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside...");
    recognizer.recognize("Woof");

    System.out.println("\nFido goes outside.");
    System.out.println("\nFido's all done...");

    try {
        Thread.sleep(10000);
    }
    catch (InterruptedException e) {
      System.out.println("Something went wrong :)");
    }

    System.out.println("\nFido scratches the door from the outside and barks");

    recognizer.recognize("Woof");

    System.out.println("\nFido's back inside...");
  }
}
