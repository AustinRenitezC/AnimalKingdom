/**
 * @file: AnimalConstants.class
 * @brief: Contains animal characteristics constants
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package constants;

/**
 * This class is for animal constants
 */
public class AnimalConstants {

    public final static String WALKING = "I am walking";
    public final static String SINGING = "I am singing";
    public final static String FLYING = "I am flying";

    /**
     * AnimalType constants
     */
    public interface AnimalType {
        int LAND_ANIMAL = 1;
        int BIRDS = 2;
    }

    /**
     * MovementType constants
     */
    public interface MovementType {
        int WALK = 1;
        int FLY = 2;
        int SWIM = 3;
        int CANNOT_FLY = 4;
        int NOT_DEFINED = 5;
    }

    /**
     * AnimalName constants
     */
    public interface AnimalName {
        String DUCK = "Duck";
        String CHICKEN = "Chicken";
        String ROOSTER = "Rooster";
        String PARROT = "Parrot";
        String CAT = "Cat";
        String DOG = "Dog";
    }

    /**
     * AnimalSound constants
     */
    public interface AnimalSound {
        String DUCK_SOUND = "Quack, quack";
        String CHICKEN_SOUND = "Cluck, cluck";
        String ROOSTER_SOUND = "Cock-a-doodle-doo";
        String MULTIPLE_SOUND = "Multiple sound";
        String DOG_SOUND = "Woof, woof";
        String CAT_SOUND = "Meow";
    }

    /**
     * Species constants
     */
    public interface Species {
        int DUCK = 1;
        int CHICKEN = 2;
        int PARROT = 3;
        int DOG = 4;
        int CAT = 5;
    }

    /**
     * NeighbourType constants
     */
    public interface NeighbourType {
        int LAND_ANIMAL = 1;
        int BIRDS = 2;
        int OBJECT = 3;
    }

    /**
     * ObjectName constants
     */
    public interface ObjectName {
        String PHONE = "Phone";
    }

    /**
     * ObjectSound constants
     */
    public interface ObjectSound {
        String RINGING = "Ring, ring";
    }
}
