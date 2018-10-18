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
    }

    /**
     * AnimalName constants
     */
    public interface AnimalName {
        String DUCK = "Duck";
        String CHICKEN = "Chicken";
        String ROOSTER = "Rooster";
    }

    /**
     * AnimalSound constants
     */
    public interface AnimalSound {
        String DUCK_SOUND = "Quack, quack";
        String CHICKEN_SOUND = "Cluck, cluck";
        String ROOSTER_SOUND = "Cock-a-doodle-doo";
    }

    /**
     * Species constants
     */
    public interface Species {
        int DUCK = 1;
        int CHICKEN = 2;
    }
}
