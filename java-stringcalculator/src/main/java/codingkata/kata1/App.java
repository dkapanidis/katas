package codingkata.kata1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public int MAX_NUMBER = 1000;

    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }

    public int add(final String numbers) {
        int result = 0;
        if (numbers.isEmpty()) {
            return result;
        } else {
            if (numbers.startsWith("//")) {
                String delimiter =
                    numbers.split("\n")[0].replaceAll("/", "");

                result = defaultAdd(numbers.substring(4).split(delimiter));
            } else {
                String[] numbersList = numbers.split("[,\n]");
                result = defaultAdd(numbersList);
            }
        }
        return result;
    }

    public int defaultAdd(final String[] numbersList) {
        validate(numbersList);
        int result = 0;
        for (int i = 0; i < numbersList.length; i++) {
            try {
                int number = Integer.valueOf(numbersList[i]);
                if (number < MAX_NUMBER) {
                    result += number;
                }
            } catch (NumberFormatException nfe) {
                continue;
            }
        }
        return result;
    }

    /**
     * @param numbers
     */
    private void validate(final String[] numbers) {
        List<String> negativeNumbers = new ArrayList<String>();

        for (String number : numbers) {
            if (number.trim().startsWith("-")) {
                negativeNumbers.add(number);
            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new RuntimeException("negatives not allowed: "
                + negativeNumbers.toString());
        }
    }
}
