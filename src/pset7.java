public class ProblemSet7 {

    public static void main(String[] args) {
        System.out.println(new Staff().surroundMe("\u3165", "<<>>"));
    }

    public String surroundMe(String in, String out) {
        if (in == null) return null;
        if (out == null) return in;
        if (out.length() != 4) return in;

        String left = out.substring(0, 2);
        String right = out.substring(2);

        return left + in + right;
    }

    public String endsMeet(String text, int n) {
        if (text == null) return null;
        if (text.length() < 1) return text;
        if (text.length() > 10) return text;
        if (n < 1) return text;
        if (n > text.length()) return text;

        String left = text.substring(0, n);
        String right = text.substring(text.length() - n);

        return left + right;
    }


    public String middleMan(String text) {
        if (text == null) return text;
        if (text.length() < 3) return text;
        if (text.length() % 2 == 0) return text;

        int start = text.length() / 2 - 1;
        int end = start + 3;

        return text.substring(start, end);
    }


    public boolean isCentered(String text, String target) {
        if (text == null) return false;
        if (target == null) return false;
        if (text.length() < 3) return false;
        if (target.length() != 3) return false;
        if (text.length() % 2 == 0) return false;

        int start = text.length() / 2 - 1;
        int end = start + 3;
        String middle = text.substring(start, end);

        return middle.equals(target);
    }

    public int countMe(String text, char suffix) {
        if (text == null) return -1;
        if (Character.toUpperCase(suffix) < 'A' || Character.toUpperCase(suffix) > 'Z') return -1;

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i)) && i != 0) {
                if (text.charAt(i) != '\'' && text.charAt(i - 1) == suffix) {
                    count++;
                }
            } else if (Character.isSpaceChar(text.charAt(i)) && i != 0) {
                if (text.charAt(i - 1) == suffix) {
                    count++;
                }
            } else if (i == text.length() - 1 && text.charAt(i) == suffix) {
                count++;
            }
        }

        return count;
    }


    public int triplets(String text) {
        if (text == null) return -1;

        int count = 0;
        for (int i = 0; i < text.length() - 2; i++) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            char c = text.charAt(i + 2);

            if (a == b && b == c) {
                count++;
            }
        }

        return count;
    }


    public long addMe(String text) {
        if (text == null) return -1L;

        long sum = 0L;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum = sum + Integer.parseInt(text.substring(i, i + 1));
            }
        }

        return sum;
    }


    public long sequence(String text) {
        if (text == null) return -1L;
        if (text.isEmpty()) return 0L;

        long length = 1;
        long current = 1;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                current++;

                if (current > length) {
                    length = current;
                }
            } else {
                current = 1L;
            }
        }

        return length;
    }


    public String intertwine(String a, String b) {
        if (a == null) return null;
        if (b == null) return null;

        String mixed = "";
        int length = Math.min(a.length(), b.length());

        for (int i = 0; i < length; i++) {
            mixed = mixed + a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        mixed = mixed + (a.length() > length ? a.substring(length) : b.substring(length));

        return mixed;
    }

    public boolean isPalindrome(String text) {
        if (text == null) return false;

        for (int i = 0, j = text.length() - 1; i < j; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}