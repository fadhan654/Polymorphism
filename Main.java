public class Main {
    public static void main(String[] args) {
        SegitigaSikuSiku ABC = new SegitigaSikuSiku("ABC", 3.0, 4.0);
        Segitiga BCD = new SegitigaSikuSiku("BCD", 3.0, 4.0);
        Segitiga CDE = new Segitiga("CDE", 3.0, 4.0, 5.0);

        System.out.println("Luas ABC: " + ABC.hitungLuas());
        System.out.println("Luas BCD: " + BCD.hitungLuas());
        System.out.println("Luas CDE: " + CDE.hitungLuas());
    }
}
