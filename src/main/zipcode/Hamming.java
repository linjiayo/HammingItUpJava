package main.zipcode;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        verifyStringLen(s, s1);
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private void verifyStringLen(String s, String s1) throws IllegalArgumentException {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
