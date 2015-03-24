public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside...");
    remote.pressButton();

    System.out.println("\nFido goes outside.");
    System.out.println("\nFido's all done...");

    try {
        Thread.sleep(10000);
    }
    catch (InterruptedException e) {
      System.out.println("Something went wrong :)");
    }

    System.out.println("\nFido scratches the door from the outside and barks");
    System.out.println("\nTodd presses the remotes button.");

    remote.pressButton();

    System.out.println("\nFido's back inside...");
  }
}
