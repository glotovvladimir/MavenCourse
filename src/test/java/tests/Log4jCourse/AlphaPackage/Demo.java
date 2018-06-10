package tests.Log4jCourse.AlphaPackage;

import org.apache.logging.log4j.LogManager;

public class Demo {
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Demo.class.getName());
    public static void main(String[] args) {
        log.error("error message from alpha");
        log.info("info from alpha");
        log.debug("debug from alpha");
    }
}
