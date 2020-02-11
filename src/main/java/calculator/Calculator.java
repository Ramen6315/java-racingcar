package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private String delimiter = ",|:";

    public static int calculation(List<Integer> numbers) {
        int result = 0;
        for (int i : numbers) {
            result = result + i;
        }
        return result;
    }

    public String[] splitString(String s) {
        return s.split(delimiter);
    }

    public String extractDelimiter(String s) {
        int index = s.indexOf('\n');

        return s.substring(2, index);
    }

    public List<Integer> extractExpression(String s) {
        String delimiter = extractDelimiter(s);
        int newLineIndex = s.indexOf('\n');
        String expression = s.substring(newLineIndex + 1);
        String[] splitExpression = expression.split(delimiter);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < splitExpression.length; i++) {
            result.add(Integer.parseInt(splitExpression[i]));
        }
        return result;
    }

    public void addDelimiter(String delimiter) {
        this.delimiter = this.delimiter + "|" + delimiter;
    }

    public boolean isSameDelimiter(String delimiter) {
        if (this.delimiter.equals(delimiter)) {
            return true;
        }
        return false;
    }
}
