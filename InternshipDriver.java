/**
 * This is the driver we will use to run the internship program.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */

//import random UUID tool
import java.util.UUID;

public class InternshipDriver {
    
    public static void main(String [] args) {
        
        /**
         * UUID generator section
         */
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();

        System.out.print(uuidString);
        /**
         * End UUID generator section
         */

        DataLoader.loadAdmins();

    }

}
