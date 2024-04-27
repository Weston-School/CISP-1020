
/**
 *
 * @author HMSH
 * Modified by Weston Hale 4/18/2024
 * Added toString Override
 */

public class Baggage {
    private String code;
    private String destination;

    public Baggage(String code, String destination) {
        this.code = code;
        this.destination = destination;
    }

    public String getCode() {
        return code;
    }

    public String getDestination() {
        return destination;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    // ToString Override Weston Hale 4/18/2024
    @Override
    public String toString() { 
        return "Baggage Code: " + this.code + ", Destination: " + this.destination;
    } 
}
