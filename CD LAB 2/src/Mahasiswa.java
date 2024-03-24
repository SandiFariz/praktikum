
public class Mahasiswa {
	String[] nama = new String[50];
	String[] nim = new String[50]; 
	String[] jurusan = new String[50];
	
	public String tampilDataMahasiswa(){
		System.out.println(tampilUniversitas());
		for (int i = 0; i < nama.length; i++) {
            if (nama[i] != null) {
                System.out.print("Nama: " + nama[i]);
                System.out.print(", Nim: "+nim[i]);
                System.out.println(", Jurusan: "+jurusan[i]);
            }
		}
		return null;
	}
	
	public static String tampilUniversitas(){
		String universitas = "Universitas Muhammadiyah Malang";
		return universitas;
	}
}
