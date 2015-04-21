public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("test"));
    door.addAllowedBark(new Bark("rowlf"));
    door.addAllowedBark(new Bark("rooowlf"));
    door.addAllowedBark(new Bark("rawlf"));
    door.addAllowedBark(new Bark("woof"));

    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);

    System.out.println("Bruce starts barking.");
    recognizer.recognize(new Bark("rowlf"));

    System.out.println("\nBruce has gone outside ...");

    try {
        Thread.sleep(10000);
    }
    catch (InterruptedException e) {
      System.out.println("Something went wrong :)");
    }

    System.out.println("\nBruce is all done ...");
    System.out.println("\n... but he is stuck outside!");

    //Simulate a bark (not Bruce)

    Bark smallDogBark = new Bark("yip");
    System.out.println("\nA small dog starts barking.");
    recognizer.recognize(smallDogBark);

    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {
      System.out.println("Something went wrong :)");
    }

    System.out.println("\nBruce starts barking.");
    recognizer.recognize(new Bark("rooowlf"));

    System.out.println("\nBruce's back inside...");
  }
}
