import lookup.Expediter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pointsix.Helicopter;
import pointthree.ElectricHelicopter;

/**
 * Created by Антон on 15.03.2016.
 */
public class Main {



    public static void main(String[] args) {



        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Helicopter helicopter = (Helicopter) context.getBean("helicopter");
        Helicopter electricHelicopter = (Helicopter) context.getBean("electrichelicopter");
        Helicopter helicopterBell = (Helicopter)context.getBean("hellicopterbell");


        Expediter expediter = (Expediter) context.getBean("expediter");


        expediter.command();

        System.out.println("helicopter = " + helicopter);
        System.out.println("electricHelicopter = " + electricHelicopter);
        System.out.println("helicopterBell = " + helicopterBell);


        helicopter.printCrew();
        electricHelicopter.printCrew();
        helicopterBell.printCrew();
        System.out.println("Mark of helicopter: " + helicopter.getMark() + ". Mark of electric helicopter: " + electricHelicopter.getMark() + ". " + helicopterBell.getMark());


    }


}
