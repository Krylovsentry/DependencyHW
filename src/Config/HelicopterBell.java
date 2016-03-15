package Config;

import pointsix.Helicopter;

import java.util.List;

/**
 * Created by Антон on 15.03.2016.
 */
public class HelicopterBell extends Helicopter {


    private String mark;
    private List<String> crewList;

    @Override
    public void setCrew(List<String> crewList) {
        this.crewList = crewList;
    }

    @Override
    public void setMark(String mark) {

        this.mark = mark;
    }

    @Override
    public void printCrew() {
        int count = 1;
        for (String passenger : crewList){
            System.out.println("Passenger " + count + " "  + getMark() +  " " + passenger);
            count++;
        }
    }

    @Override
    public String getMark() {
        return mark;
    }
}
