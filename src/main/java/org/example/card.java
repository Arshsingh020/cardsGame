package org.example;

import java.util.Arrays;
import java.util.List;

public class card {
    // there are "instance " when you created an instance of your class
    // the system will reserve space in memory to store these items
    private String faceName;
    private String suit;
    /**
     * this the constructor.  it is called when we want to instanitaite (create an instance) of our object.
     * it looks like a methods, but does not have a return type and must have the
     * exact same name as the class
     */
    public card(String faceNumber, String suit)
    {
        this.faceName = faceNumber;
        this.suit = suit;

    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getvaildFaceName(){
        return Arrays.asList("2", "3", "4", "5" ,"6","7","8","9","10","jack","queen","king","ace");
    }

    public static List<String> getvaildsuits(){
        return Arrays.asList("hearts" , "diamonds", "spades", "clubs");
    }

    public void setFaceName(String faceName) {
        if (faceName.equals("king"))
        this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + "must be in list of " + "king");
    }


    public String toString(){
        return faceName + " of " + suit;
    }
}
