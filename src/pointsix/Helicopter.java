package pointsix;

import java.util.List;

/**
 * Created by Антон on 15.03.2016.
 */
public class Helicopter {
    private List<String> crewList;
    private String mark;

    public void setCrew(List<String> crewList){

        this.crewList = crewList;

    }


    public void setMark(String mark){

        this.mark = mark;
    }


    public void printCrew(){

        int count = 1;
        for (String passenger : crewList){
            System.out.println("Passenger " + count + " "  + getMark() +  " " + passenger);
            count++;
        }
    }


    public String getMark(){

        return mark;
    }
}
