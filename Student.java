package CRUD_mahasiswa;

public class Student {
    private String nim;
    private String name;
    private String address;
    private int semester;
    private int sks;
    private double ipk;

    public Student(String nim, String name, String address, int semester, int sks, double ipk) {
        this.nim = nim;
        this.name = name;
        this.address = address;
        this.semester = semester;
        this.sks = sks;
        this.ipk = ipk;
    }

    public String getNim() { return nim; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getSemester() { return semester; }
    public int getSks() { return sks; }
    public double getIpk() { return ipk; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setSemester(int semester) { this.semester = semester; }
    public void setSks(int sks) { this.sks = sks; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    @Override
    public String toString() {
        return nim + "," + name + "," + address + "," + semester + "," + sks + "," + ipk;
    }
}
