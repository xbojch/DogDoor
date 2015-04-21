/**
 * Created by bojan on 21.04.15.
 */
public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public boolean equals(Bark otherBark) {

        if (this.sound.equalsIgnoreCase(otherBark.getSound())) {
            return true;
        }

        return false;
    }
}
