/**
 * This is the driver we will use to run the internship program.
 *
 * @author Siri, Maddie, Valerie, Ali
 */

//import random UUID tool

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

        
        InternshipUI internshipInterface = new InternshipUI();
        internshipInterface.run();

    }

}//maddie