public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(String nama, double alas, double tinggi) {
        super(nama, alas, tinggi, Math.sqrt(alas*alas + tinggi*tinggi));
    }

    public double hitungLuas() {
        return 0.5 * sisi1 * sisi2; 
    }
}
