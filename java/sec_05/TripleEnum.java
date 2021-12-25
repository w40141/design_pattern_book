public enum TripleEnum {
    ALPHA, BETA, GAMMA;

    private TripleEnum() {
        System.out.println("The instance " + this + "is created by enum.");
    }

    public static TripleEnum getInstance(String name) {
        return valueOf(name);
    }
}
