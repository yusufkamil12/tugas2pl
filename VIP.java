
public class VIP extends DataCSV {
    // Konstruktor
    public VIP(int age, int gender, int bloodPressure, int cholesterol, int heartRate, double quantumPatternFeature, int heartDisease) {
        super(age, gender, bloodPressure, cholesterol, heartRate, quantumPatternFeature, heartDisease); // Memanggil konstruktor induk
    }

    // Method overloading untuk print
    public void print(String field) {
        // Implementasi method print yang di-overload
    }

    // Method overloading: print dengan opsi detail
    public void print(boolean detailed) {
        if (detailed) {
            super.print(); // Memanggil method print dari kelas induk
        } else {
            System.out.println("Umur = " + getAge() + ", Jenis kelamin = " + getGender() + ", Target = " + getHeartDisease());
        }
    }
}