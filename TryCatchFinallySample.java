import java.util.logging.*;

public class TryCatchFinallySample {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
        logger.setLevel(Level.INFO);
        try {
            logger.warning("WARNING");
            Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            logger.severe("SEVERE");
        } finally {
            logger.info("INFO");
        }
    }
}
