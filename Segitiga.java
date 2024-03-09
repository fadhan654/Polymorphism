public class Segitiga {
    protected String nama;
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public Segitiga(String nama, double sisi1, double sisi2, double sisi3) {
        this.nama = nama;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2.0;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    public String getNama() {
        return nama;
    }
}
