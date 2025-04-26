
public class notes13 {
    public static void main(String[] args) {
        int amount = 1260;
        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < notes.length; i++) {
    int count = amount / notes[i];
    if (count > 0) {
        System.out.println(notes[i] + " : " + count);
        amount %= notes[i];
    }
}
    }
}
