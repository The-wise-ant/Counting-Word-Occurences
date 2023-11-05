/**
 * The Content class represents a piece of text (a paragraph) and provides methods to count the occurrences of a given word within it.
 */
public class Content {

    // Private instance variable to store the paragraph of text
    private String paragraph;

    /**
     * Constructor to initialize the content with a given paragraph.
     *
     * @param p The paragraph of text.
     */
    public Content(String p) {
        this.paragraph = p;
    }

    /**
     * Count the occurrences of a specific word in the paragraph.
     *
     * @param word The word to count.
     * @return The number of occurrences of the word in the paragraph.
     */
    public int getCount(String word) {
        String trimmed = paragraph.trim();
        int count = 0, wl = word.length();
        int tl = trimmed.length();

        if (tl < wl) {
            return 0;
        }

        if (tl == wl && trimmed.substring(0, wl).equals(word)) {
            return 1;
        }

        if (trimmed.substring(0, wl).equals(word)) {
            count++;
        }

        if (trimmed.substring(tl - wl).equals(word) && trimmed.charAt(tl - wl - 1) == ' ') {
            count++;
        }

        for (int i = wl; i < tl - wl; i++) {
            if (trimmed.substring(i, i + wl).equals(word) &&
                trimmed.charAt(i + wl) == ' ' &&
                trimmed.charAt(i - 1) == ' ') {
                count++;
            }
        }
        return count;
    }
}
