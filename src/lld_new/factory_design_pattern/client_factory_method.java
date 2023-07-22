package lld_new.factory_design_pattern;

import lld_new.factory_design_pattern.factory_method_design_pattern.*;

public class client_factory_method {
    public static void main(String[] args) {
        Season summer = new Summer();
//        Bird birdInSummer = BirdFactory.createBird(summer);
        Bird birdInSummer = summer.createBird();//without factory class
        birdInSummer.sing(); // Output: Peacock: Sings a beautiful melody

        Season winter = new Winter();
        Bird birdInWinter = BirdFactory.createBird(winter);//with Factory class
        birdInWinter.sing(); // Output: Sparrow: Chirps softly

    }
}
