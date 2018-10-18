/**
 * @file: Fish.class
 * @brief: Contains distinct fish characteristics
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package models;

/**
 * This class is for Fish
 */
public class Fish  {

    /**
     * Variable to store fish name
     */
    private String mFishName;

    /**
     * Variable to store fish size
     */
    private String mFishSize;

    /**
     * Variable to store fish color
     */
    private String mFishColor;

    /**
     * Variable to store other distinct fish behaviour
     */
    private String mOtherFeatures;

    /**
     * Function to get fish name
     * @return String: name of he fish
     */
    public String getFishName() {
        return mFishName;
    }

    /**
     * Function to set fish name
     * @param fishName: Name of fish
     */
    public void setFishName(String fishName) {
        this.mFishName = fishName;
    }

    /**
     * Function to get fish size
     * @return String: Size of fish
     */
    public String getFishSize() {
        return mFishSize;
    }

    /**
     * Funcion to set fish size
     * @param fishSize: Size of fish
     */
    public void setFishSize(String fishSize) {
        this.mFishSize = fishSize;
    }

    /**
     * Function to get fish color
     * @return String: Color of fish
     */
    public String getFishcolor() {
        return mFishColor;
    }

    /**
     * Function to set fish color
     * @param fishColor: Color of fish
     */
    public void setFishColor(String fishColor) {
        this.mFishColor = fishColor;
    }

    /**
     * Function to get other features
     * @return String: Other fish features
     */
    public String getOtherFeatures() {
        return mOtherFeatures;
    }

    /**
     * Function to set other peculiar fish feature
     * @param otherFeatures: Other fish features
     */
    public void setOtherFeatures(String otherFeatures) {
        this.mOtherFeatures = otherFeatures;
    }

    /**
     * Function used to print the class items
     * @return String: String value of items
     */
    @Override
    public String toString() {
        return "models.Fish{" +
                "mFishName='" + mFishName + '\'' +
                ", mFishSize='" + mFishSize + '\'' +
                ", mFishcolor='" + mFishColor + '\'' +
                ", mOtherFeatures='" + mOtherFeatures + '\'' +
                '}';
    }
}
