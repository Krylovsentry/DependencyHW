package lookup;

/**
 * Created by Антон on 15.03.2016.
 */
public abstract class Expediter {



    public void command(){

        Command command = createCommand();
        command.execute();
    }

    protected abstract Command createCommand();
}
