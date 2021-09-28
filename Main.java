public class Main {
    public static void main(String[] args) {
        Enigma enigma = new Enigma();
        enigma.parseArgs(args);
        enigma.execute();
    }
}
