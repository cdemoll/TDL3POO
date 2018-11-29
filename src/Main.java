import com.gravite.Bonjour;
import com.gravite.CalculateurChute;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Exercice 1.1
        System.out.println("Exercice 1.1 :\n");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Pascal");
        names.add("Michelle");
        names.add("Jérôme");

        Bonjour welcomer = new Bonjour();
        welcomer.printNames(names);

        System.out.print("\n\n");
        //Exercice 1.2
        System.out.println("Exercice 1.2 :\n");

        CalculateurChute fall = new CalculateurChute(10, -9.81);
        System.out.println("Position avant chute : " + fall.getPositionInitiale()
                            +"\nPosition après chute : " + fall.positionApresChute(0, 0));

    }
}
