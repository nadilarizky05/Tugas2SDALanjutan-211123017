import java.util.LinkedList;
public class Tugas2Lanjutan-2111523017 {
    public static void main(String[] args) {

        //DATA LINKEDLIST
        LinkedList <String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList <String> No_BP  = new LinkedList<>();
        LinkedList <String> Alamat = new LinkedList<>();

        Nama_Mahasiswa.add("Upin");
        Nama_Mahasiswa.add("Ipin");
        Nama_Mahasiswa.add("Mail");

        No_BP.add("1111");
        No_BP.add("2222");
        No_BP.add("3333");

        Alamat.add("Rumah Tok Dalang");
        Alamat.add("Rumah Opah");
        Alamat.add("Durian Runtuh");
        
        System.out.println(" ");
        System.out.println("DATA LINKEDLIST");
        System.out.println("================");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //ADD = MENAMBAH
        Nama_Mahasiswa.addFirst("Mei-Mei");
        No_BP.addFirst("4444");
        Alamat.addFirst("Tadika Mesra");

        Nama_Mahasiswa.addLast("Susanti");
        No_BP.addLast("5555");
        Alamat.addLast("Jaksel");

        System.out.println("MENERAPKAN FUNGSI ADD");
        System.out.println("======================");
        System.out.println("1. Tambahkan AddFirst Pada Nama, No_BP, dan Alamat");
        System.out.println("1. Tambahkan AddLast  Pada Nama, No_BP, dan Alamat");
        System.out.println(" "); 
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No_BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //SET = MENUMPUK
        Nama_Mahasiswa.set(3, "Jarjit");
        No_BP.set(3, "6666");
        Alamat.set(3, "Malaysia");

        System.out.println("MENERAPKAN FUNGSI SET");
        System.out.println("=======================");
        System.out.println("1. Set (Tumpuk) index ke-3 pada Nama, No_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No_BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");
 
        //REMOVE = HAPUS
        Nama_Mahasiswa.removeLast();
        Nama_Mahasiswa.remove(3);
        
        No_BP.removeLast();
        No_BP.remove(3);

        Alamat.removeLast();
        Alamat.remove(3);

        System.out.println("MENERAPKAN FUNGSI REMOVE");
        System.out.println("==========================");
        System.out.println("1. Hapus index ke-4 pada Nama, No_BP, dan Alamat");
        System.out.println("2. Hapus index terakhir pada Nama, No_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No_BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");
        
        //PUSH = MASUK DAN SELALU DIMULAI DI INDEX 0
        Nama_Mahasiswa.push("Fizi");
        No_BP.push("7777");
        Alamat.push("Malaysia");

        Nama_Mahasiswa.push("Ehsan");
        No_BP.push("8888");
        Alamat.push("Malaysia");

        System.out.println("MENERAPKAN FUNGSI PUSH");
        System.out.println("=========================");
        System.out.println("1. Push dua data baru berupa Nama, No_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No_BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //POP = MENGAMBIL DATA DI INDEX 0 / PALING ATAS
        Nama_Mahasiswa.pop();
        No_BP.pop();
        Alamat.pop();

        System.out.println("MENERAPKAN FUNGSI POP");
        System.out.println("=======================");
        System.out.println("1. Pop satu kali untuk data Nama, No_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No_BP\t: " + No_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //GET = AMBIL DATA 
        System.out.println("MENERAPKAN FUNGSI GET");
        System.out.println("========================");
        System.out.println("1. Tampilkan data mahasiswa di Get(1)");
        System.out.println(" ");
        System.out.println(Nama_Mahasiswa.get(1));
        System.out.println(No_BP.get(1));
        System.out.println(Alamat.get(1));
        System.out.println(" ");

        //SIZE = INTERVAL ATAU PANJANG DATA
        System.out.println("MENERAPKAN FUNGSI SIZE");
        System.out.println("========================");
        System.out.println("Jumlah Akhir Data Mahasiswa: " + Nama_Mahasiswa.size());
        System.out.println(" ");
        
    }
}




