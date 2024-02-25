import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.next();
        String jenisKelamin = "";
        if (jenisKelaminInput.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        }

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate tanggalSekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, tanggalSekarang);

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur : " + umur.getYears() + " tahun " + umur.getMonths() + " bulan ");

        scanner.close();
    }
}
