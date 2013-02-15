package mediastore;

import java.io.File;

/**
 * Name: Milton John
 * Section: 1
 * Program: Manager CLI Test Driver
 * Date: Feb 7, 2013
 */
/**
 * A class that tests the functionality of the Manager class via a text-based
 * interface.
 *
 * @author Milton John, Ryan Smith and Cole Arnold
 * @version 1.0 Feb 7, 2013
 *
 */
public class ManagerCLITestDriver {

    public static void main( String[] args ) {
        TextDatabase db = null;
        try {
            db = new TextDatabase( System.getProperty( "user.dir" ).concat( File.separator + ".." + File.separator + ".." + File.separator + "db" + File.separator ) );
        } catch ( Exception e ) {
            System.out.println( "An exception occured while parsing the database. (" + e.toString() + ")" );
            e.printStackTrace(); // this is what the @SupressWarnings is for
        }


        Customer cus = db.getCustomerFromID( 1 );
        try {
            cus.listCLI();
            cus.displayInfoCLI( 1 );
            cus.listCLI();
        } catch ( Exception e ) {
            System.out.println( "An exception occured testing the Manager class. (" + e.toString() + ")" );
            e.printStackTrace();
        }


    }
}
