package com.example.rk_personal.LLD.designPatterns.creationalPatterns.singletonPattern;


import lombok.Data;
//used to generate single instance of the class
@Data
public class DBConnection {

    private DBConnection() {
        // Private constructor to prevent instantiation from outside this class
    }

    /* eager initialization */
//    private static DBConnection instance = new DBConnection();
//    public static DBConnection getInstance() {
//        return instance;
//    }

    /* lazy initialization */
//    private static DBConnection instance;
//    public static DBConnection getInstance() {
//        if (instance == null) {
//            instance = new DBConnection();
//        }
//        return instance;
//    }


    /* above two are not thread safe */

    /* synchronized */
//    private static DBConnection instance;
//    public synchronized static DBConnection getInstance() {
//        if (instance == null) {
//            instance = new DBConnection();
//        }
//        return instance;
//    }


    /* double locking */
//    private static DBConnection instance;
//    public static DBConnection getInstance() {
//        if (instance == null) {
//            synchronized (DBConnection.class) {
//                if (instance == null) {
//                    instance = new DBConnection();
//                }
//            }
//        }
//        return instance;
//    }

}
