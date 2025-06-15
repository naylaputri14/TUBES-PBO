public class Theater {
    String id;
    String namaTheater;

    public Theater(String id, String namaTheater) {
        this.id = id;
        this.namaTheater = namaTheater;
    }

    public String getId() {
        return id;
    }

    public String getNamaTheater() {
        return namaTheater;
    }

    public String toString() {
        return id + " - " + namaTheater;
    }
}
