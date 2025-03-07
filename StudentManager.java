package CRUD_mahasiswa;

import java.util.*;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = FileHandler.readFromFile();
    }

    public void addStudent(String nim, String name, String address, int semester, int sks, double ipk) {
        students.add(new Student(nim, name, address, semester, sks, ipk));
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Tidak ada data.");
            return;
        }
        System.out.println("\nData Mahasiswa:");
        for (Student s : students) {
            System.out.printf("%s | %s | %s | Semester: %d | SKS: %d | IPK: %.2f\n",
                    s.getNim(), s.getName(), s.getAddress(), s.getSemester(), s.getSks(), s.getIpk());
        }
    }

    public void updateStudent(String nim) {
        for (Student s : students) {
            if (s.getNim().equals(nim)) {
                Scanner input = new Scanner(System.in);
                System.out.print("Nama baru: ");
                s.setName(input.nextLine());
                System.out.print("Alamat baru: ");
                s.setAddress(input.nextLine());
                System.out.print("Semester baru: ");
                s.setSemester(input.nextInt());
                System.out.print("SKS baru: ");
                s.setSks(input.nextInt());
                System.out.print("IPK baru: ");
                s.setIpk(input.nextDouble());
                System.out.println("Data berhasil diperbarui.");
                return;
            }
        }
        System.out.println("NIM tidak ditemukan.");
    }

    public void deleteStudent(String nim) {
        students.removeIf(s -> s.getNim().equals(nim));
        System.out.println("Data berhasil dihapus.");
    }

    public void saveData() {
        FileHandler.writeToFile(students);
    }
}
