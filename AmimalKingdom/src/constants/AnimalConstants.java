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
    }
}
