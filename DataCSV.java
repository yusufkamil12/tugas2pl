public class DataCSV {
    private int age;
    private int gender;
    private int bloodPressure;
    private int cholesterol;
    private int heartRate;
    private double quantumPatternFeature;
    private int heartDisease;

    public DataCSV() {
    }

    public DataCSV(int age, int gender, int bloodPressure, int cholesterol, int heartRate, double quantumPatternFeature, int heartDisease) {
        this.age = age;
        this.gender = gender;
        this.bloodPressure = bloodPressure;
        this.cholesterol = cholesterol;
        this.heartRate = heartRate;
        this.quantumPatternFeature = quantumPatternFeature;
        this.heartDisease = heartDisease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getQuantumPatternFeature() {
        return quantumPatternFeature;
    }

    public void setQuantumPatternFeature(double quantumPatternFeature) {
        this.quantumPatternFeature = quantumPatternFeature;
    }

    public int getHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(int heartDisease) {
        this.heartDisease = heartDisease;
    }

    public void print() {
        System.out.println("Umur = " + age);
        System.out.println("Jenis kelamin = " + gender);
        System.out.println("Tekanan darah = " + bloodPressure);
        System.out.println("Kadar kolesterol = " + cholesterol);
        System.out.println("Detak jantung = " + heartRate);
        System.out.println("Hasil ekstraksi = " + quantumPatternFeature);
        System.out.println("Target = " + heartDisease);
    }
}