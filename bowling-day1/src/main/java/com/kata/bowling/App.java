package com.kata.bowling;

/**
 * Hello world!
 */
public class App {

    public int game(final String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '/') {
                result +=
                    10
                        - Integer.valueOf(String.valueOf(input
                            .charAt(i - 1)))
                        + Integer.valueOf(String.valueOf(input
                            .charAt(i + 1)));
            } else {
                result += Integer.valueOf(String.valueOf(input.charAt(i)));
            }
        }
        return result;
    }
}
