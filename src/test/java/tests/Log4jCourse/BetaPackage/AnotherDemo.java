package tests.Log4jCourse.BetaPackage;

import org.apache.logging.log4j.LogManager;

public class AnotherDemo {
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AnotherDemo.class.getName());
    public static void main(String[] args) {
        log.error("error from beta");
        log.info("info from beta");
        log.debug("debug from beta");
    }
}
