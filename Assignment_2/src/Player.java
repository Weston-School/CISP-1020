
/**
 *
 * @author HMSH
 * Modified by Weston Hale 4/18/2024
 * Added comepareTo Override
 */

public class Player implements Comparable<Player>{
    private String name;
    private double height;

    public Player(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // compareTo Override Weston Hale 4/18/2024
    @Override
    public int compareTo(Player otherPlayer) {
        return Double.compare(this.height, otherPlayer.height);
    }
    
    
}
