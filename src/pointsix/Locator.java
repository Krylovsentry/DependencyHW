package pointsix;


import java.util.List;
import java.util.Map;

/**
 * Created by Антон on 15.03.2016.
 */
public class Locator {




    private static Helicopter helicopter = new Helicopter();

    private Locator(){

    }


    public Helicopter createHelicopter(){

        return helicopter;

    }





}
