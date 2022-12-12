public class Student {
    private String ten;
    private int tuoi;
    private String gender;
    private String diaChi;
    private double dtb;
    private int id;


    public Student() {
    }

    public Student(int id, String ten, int tuoi, String gender, String diaChi, double dtb) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gender = gender;
        this.diaChi = diaChi;
        this.dtb = dtb;
        this.id = id;
    }


    public String ten() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int tuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String gender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String diaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double dtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "id=" + id + ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gender='" + gender + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dtb=" + dtb +
                '}' ;
    }
}
