package mosbach.dhbw.de.cftestbackend.model.Logik;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Dies ist eine Informationsnachricht.");
        logger.log(Level.SEVERE, "Dies ist eine Fehlermeldung.");
    }
}