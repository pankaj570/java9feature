package com.java9feature;

/*
* in java 8 we can define default and static method in interface
* in java 9 we can define the static and private static method in Interface.
*benifits :
*it is focus on code reusability like hepper method in interface.
*
* */
public class PrivateMethodInInterface {
    public static void main(String[] args) {
        DBLogging.getInstance().info(MessageType.INFO, "Info message");
        DBLogging.getInstance().info(MessageType.ERROR, "Error message");
        DBLogging.getInstance().info(MessageType.WARN, "Warn message");
        DBLogging.getInstance().info(MessageType.FATAL, "Fatal message");
    }
}

enum MessageType {
    INFO, WARN, ERROR, FATAL;
}

interface DBLogging {

    public static DBLogging getInstance() {
        DBLogging dbLogging = new DBLoggingImpl();
        return dbLogging;
    }

    default void info(MessageType messageType, String message) {
        log(messageType, message);
    }

    default void error(MessageType messageType, String message) {
        log(messageType, message);
    }

    default void warn(MessageType messageType, String message) {
        log(messageType, message);
    }

    default void fatal(MessageType messageType, String message) {
        log(messageType, message);
    }

    // common code to reuse to log the messsage on server
    private void log(MessageType messageType, String messane) {
        if (checkMessageType(messageType)) {
            System.out.println(messageType + " Message Sending to Server...");
        } else {
            System.out.println("Message Type Invalid so we not sending message to server !");
        }
    }

    // validating the every message
    private static boolean checkMessageType(MessageType messageType) {
        if (messageType == MessageType.ERROR || messageType == MessageType.INFO || messageType == MessageType.FATAL || messageType == MessageType.WARN)
            return true;
        else return false;
    }
}

class DBLoggingImpl implements DBLogging {

}