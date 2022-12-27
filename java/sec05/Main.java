public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("同じ");
        } else {
            System.out.println("違う");
        }
        System.out.println("End");

        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMarker.getInstance().getNextTicketNumber());
        }

        System.out.println("Start");
        Triple a1 = Triple.getInstance("ALPHA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple c2 = Triple.getInstance("GAMMA");
        isSameTriple(a1, a2);
        isSameTriple(b1, b2);
        isSameTriple(c1, c2);
        System.out.println("End");
    }

    public static void isSameTriple(Triple obj1, Triple obj2) {
        if (obj1 == obj2) {
            System.out.println("同じ");
        } else {
            System.out.println("違う");
        }
    }

    public static void isSameTripleEnum(Triple obj1, Triple obj2) {
        if (obj1 == obj2) {
            System.out.println("同じ");
        } else {
            System.out.println("違う");
        }
    }
}
