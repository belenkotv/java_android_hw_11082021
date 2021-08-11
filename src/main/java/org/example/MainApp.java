package org.example;

import java.io.IOException;
import java.util.logging.*;

public class MainApp {
    public static final Logger logger = Logger.getLogger(org.example.MainApp.class.getName());
    public static void main(String[] args) throws IOException {
//        System.out.println("EVENT");
//        logger.log(Level.INFO, "EVENT");


        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
//        consoleHandler.setFilter(r -> r.getMessage().startsWith("event"));
//        consoleHandler.setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord r) {
//                return String.format(">>> MSG: %s LEVEL: %s ThreadID: %d\n",
//                        r.getMessage(), r.getLevel(), r.getThreadID());
//            }
//        });
//        Handler fileHandler = new FileHandler("1.log");
        Handler fileHandler = new FileHandler("1.log",true);

        fileHandler.setFormatter(new SimpleFormatter());

        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);


        logger.info("event info");
        logger.fine("event fine");
        logger.severe("event severe");



    }
}
