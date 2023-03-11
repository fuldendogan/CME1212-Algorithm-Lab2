public class Main {

    public static void main(String[] args) {
        question1();

        question2();

        question3();
    }

    private static void question2() {
        Time hm = new Time("24:40");
        hm.convert();
    }

    private static void question1() {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(6, 4);
        //  p2 = new Point(8, 5);
        p2.setX(8);
        p2.setY(5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        double euclidean = getEuclidean(p1, p2);
        System.out.println(euclidean);
    }

    private static void question3() {
        SportCenter sp1 = new SportCenter("gymYaka");
        Member m1 = new Member("Fulden", "Dogan", 46, 155);
        Member m2 = new Member("Zeki", "Adali", 70, 175);
        Member m3 = new Member("test", "member", 155, 170);
        sp1.addMember(m1);
        sp1.addMember(m2);
        sp1.addMember(m3);
        sp1.printAllMembers();
        m1.weightStatus();
        m2.weightStatus();
        m3.weightStatus();
        sp1.search("Fulden","Dogan");
    }

    private static double getEuclidean(Point p1, Point p2) {
        double a = Math.pow(p1.getX() - p2.getX(), 2);
        double b = Math.pow(p1.getX() - p2.getX(), 2);

        return Math.sqrt(a + b);
    } // SORU 1






}
