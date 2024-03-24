import java.util.Scanner;

public class Main {
	 static void menu() {
		System.out.println("Menu:");
		System.out.println("1. Tambah Data Mahasiswa");
		System.out.println("2. Tampilkan Data Mahasiswa");
		System.out.println("3. Keluar");
		System.out.print("Pilihan Anda: ");
	}

	public static void main(String[] args) {
		int choose;
		int idx = 0;
		String nim = "";
		Mahasiswa data = new Mahasiswa();
		Scanner scanner = new Scanner(System.in);
		
		do {
		menu();
		choose = scanner.nextInt();
		scanner.nextLine();
			
		switch(choose) {
		case 1:
			System.out.print("Masukan nama mahasiswa: ");
			String nama = scanner.nextLine();
			
			do {
				System.out.print("Masukan NIM mahasiswa: ");
				nim =scanner.nextLine();
					if(nim.length() != 15) {
						System.out.println("NIM harus 15 digit");
					}
			}while(nim.length()!=15);
				
			System.out.print("Masukan jurusan mahasiswa: ");
			String jurusan = scanner.nextLine();
			
			data.nama[idx] = nama;
			data.nim[idx] = nim;
			data.jurusan[idx] = jurusan;
			idx++;
			break;
		case 2:
				data.tampilDataMahasiswa();
			break;
		case 3:
			System.out.println("terima kasih");
			break;
		}
		}while(choose!=3);
		scanner.close();
	}
}
