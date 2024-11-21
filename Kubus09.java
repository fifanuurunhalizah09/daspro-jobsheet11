public class Kubus09 {
    public static int VolumeKubus(int s) {
        return s * s * s;
    }

    public static int PermukaanKubus(int s) {
        return 8 * s * s;
    }

    public static void main(String[] args) {
        int s = 2;
        int volKubus = VolumeKubus(s);
        int permukaanKubus = PermukaanKubus(s);
        System.out.println("Volume kubus dengan sisi " + s + " adalah: " + volKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + s + " adalah: " + permukaanKubus);
    }
}
