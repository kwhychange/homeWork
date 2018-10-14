import java.util.ArrayList;

public class StatsObj {
    private ArrayList<String> letters = new ArrayList<>();
    private int mostOccurance = 0;

    public void add(String word) {
        String listWord = "";
        for (String letter : letters) {
            listWord += letter;
        }
        if (listWord.indexOf(word) == -1) {
            mostOccurance++;
        }
        this.letters.add(word);
    }

    public int getCountOf(String letter) {
        int count = 0;
        for (String character : letters) {
            if (character.equals(letter)) {
                count++;
            }
        }
        return count;
    }

    public int getTotalCount() {
        return letters.size();
    }

    public int getUniqueVals() {
        return this.mostOccurance;
    }

    public String getMostFreq() {
        return getMostFreq(letters);
    }

    public ArrayList<String> getTop3MostFreq() {
        ArrayList<String> current = (ArrayList<String>) letters.clone();
        ArrayList<String> top3 = new ArrayList<>();
        top3.add(getMostFreq());
        remove(top3.get(0), current);
        top3.add(getMostFreq(current));
        remove(top3.get(1), current);
        top3.add(getMostFreq(current));
        return top3;
    }

    public ArrayList<String> getTopNMostFreq(int n) {
        ArrayList<String> current = (ArrayList<String>) letters.clone();
        ArrayList<String> topN = new ArrayList<>();
        topN.add(getMostFreq());
        remove(topN.get(0), current);
        for (int i = 0; i < n - 1; i++) {
            topN.add(getMostFreq(current));
            remove(topN.get(i + 1), current);
        }
        return topN;
    }

    public ArrayList<String> remove(String Freq, ArrayList<String> current) {
        for (int i = 0; i < current.size(); i++) {
            if (current.get(i).equals(Freq)) {
                current.remove(i);
                i = -1;
            }
        }
        return current;
    }

    private String getMostFreq(ArrayList<String> current) {
        String freqLetter = "";
        int max = 0;
        for (String character : current) {
            if (getCountOf(character) > max) {
                max = getCountOf(character);
                freqLetter = character;
            }
        }
        return freqLetter;
    }

    public static boolean abcTest(String input) {
        if (input.indexOf(".abc") >= 0) {
            return false;
        } else if (input.indexOf("abc") >= 0) {
            return true;
        }
        return false;
    }

    public static String alternateStrings(String input1, String input2) {
        String alternate = "";
        for (int i = 0; i < Math.max(input1.length(), input2.length()); i++) {
            if (i < input1.length()) {
                alternate += input1.substring(i, i + 1);
            }
            if (i < input2.length()) {
                alternate += input2.substring(i, i + 1);
            }
        }
        return alternate;
    }
}
