/**
 * This is the driver we will use to run the internship program.
 *
 * @author Siri, Maddie, Valerie, Ali
 */

//import random UUID tool
import java.util.UUID;
import java.util.Scanner;

public class InternshipDriver {
   
    public static void main(String [] args) {
       
        /**
         * UUID generator section
         */
        //UUID uuid = UUID.randomUUID();
        //String uuidString = uuid.toString();

        //System.out.print(uuidString); //this will be removed later
        /**
         * End UUID generator section
         */

         //Call the user interface


        InternshipUI internshipInterface = new InternshipUI();
        internshipInterface.run();

    }

}
