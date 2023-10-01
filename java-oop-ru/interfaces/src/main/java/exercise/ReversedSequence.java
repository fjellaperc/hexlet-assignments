package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String input;
    public ReversedSequence(String input) {
        this.input = input;
    }

    @Override
    public int length() {
        return input.length();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(input);
        return result.reverse().toString();
    }

    @Override
    public char charAt(int index) {
        return input.charAt(index);
    }

    @Override
    public String subSequence(int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }
}
// END
