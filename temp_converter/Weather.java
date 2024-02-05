import org.junit.Assert;
import org.junit.Test;

public class Weather{

    private int temperature;


    public Weather(){
        temperature = 70;
    }

    public void set_temperature(int val){
        temperature = val;
    }


    public int convert_temperature(){
        return (temperature - 32) / (5 * 9);
    }

    @Test
    public boolean test_temperature(){
        Weather tw = new Weather();
        tw.set_temperature(50);
        int celcius = tw.convert_temperature();
        int expected = 10;
        Assert.assertEquals(expected, celcius);
        return true;
    }

}