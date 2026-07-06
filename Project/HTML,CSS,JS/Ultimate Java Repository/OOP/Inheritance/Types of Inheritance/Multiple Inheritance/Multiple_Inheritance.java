// -- Multiple Inheritance -- //

// Interface 1
interface Camera {
    void takePhoto();
}

// Interface 2
interface MusicPlayer {
    void playMusic();
}

// SubClass implementing both interfaces
  // This is how Java handles Multiple Inheritance
class SmartPhone implements Camera, MusicPlayer {
    
    @Override
    public void takePhoto() {
        System.out.println("Capturing a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    void makeCall() {
        System.out.println("Making a phone call...");
    }
}

// MAIN Method Class
public class Multiple_Inheritance {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        // Accessing methods from both "parents" (Interfaces)
        myPhone.takePhoto();   // From Interface 1
        myPhone.playMusic();   // From Interface 2
        myPhone.makeCall();    // From SmartPhone SubClass itself
    }
}
