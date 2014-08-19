package com.mockigbirdgames.thesaurus.utils;

/**
 * Provides static methods for logging.
 * Created by ruslan on 19.08.14.
 */
public class Logger {

    private static final String TAG = "com.mockigbirdgames.thesaurus";

    public static void message(Object message) {
        System.out.println(TAG + ": " + String.valueOf(message));
    }
}
