import java.util.Scanner;

public class MainTugas24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tugas24[] mahasiswa = {
            new Tugas24("Ahmad", "220101001", 2022, 78, 82),
            new Tugas24("Budi", "220101002", 2022, 85, 88),
            new Tugas24("Cindy", "220101003", 2021, 90, 87),
            new Tugas24("Dian", "220101004", 2021, 76, 79),
            new Tugas24("Eko", "220101005", 2023, 92, 95),
            new Tugas24("Fajar", "220101006", 2020, 88, 85),
            new Tugas24("Gina", "220101007", 2023, 80, 83),
            new Tugas24("Hadi", "220101008", 2020, 82, 84)
        };

        int highestUTS = Tugas24.nilaiUTSTertinggiDC(mahasiswa, 0, mahasiswa.length - 1);
        int lowestUTS = Tugas24.nilaiUTSTerendahDC(mahasiswa, 0, mahasiswa.length - 1);
        double avgUAS = Tugas24.rataRataUASBF(mahasiswa);

        System.out.println("\nNilai UTS Tertinggi (DC): " + highestUTS);
        System.out.println("\nNilai UTS Terendah (DC): " + lowestUTS);
        System.out.println("\nRata-rata Nilai UAS (BF): " + avgUAS);
        System.out.println();

        input.close();
    }
}
