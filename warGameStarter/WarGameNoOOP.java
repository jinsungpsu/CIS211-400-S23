public class WarGameNoOOP {
    public static void main(String[] args) {
        int[] p1 = new int[26];
        int[] p2 = new int[26];

        // simplify the game quite a bit
        // don't worry about adding cards BACK into the
        // winner deck (per round)
        for (int i = 0; i < 26; i++) {
            p1[i] = i;
            p2[i] = i+26;
        }

    }
}
