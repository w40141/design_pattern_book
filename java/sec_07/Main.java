public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
        
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text");
        System.out.println("Usage: java Main html");
    }
}
