import java.io.BufferedReader;
import java.io.FileReader;

public class Tugas2yusuf {
    public static void main(String[] args) {
        String namaFile = "Heart Prediction Quantum Dataset.csv";
        DataCSV[] listCriminas = new DataCSV[99999];

        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String line;
            br.readLine(); // Skip header
            int idx = 0;

            while ((line = br.readLine()) != null) {
                String[] file = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                if (file.length < 7) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                DataCSV data = new DataCSV();
                try {
                    data.setAge(Integer.parseInt(file[0].trim()));
                    data.setGender(Integer.parseInt(file[1].trim()));
                    data.setBloodPressure(Integer.parseInt(file[2].trim()));
                    data.setCholesterol(Integer.parseInt(file[3].trim()));
                    data.setHeartRate(Integer.parseInt(file[4].trim()));
                    data.setQuantumPatternFeature(Double.parseDouble(file[5].trim()));
                    data.setHeartDisease(Integer.parseInt(file[6].trim()));
                } catch (NumberFormatException e) {
                    System.out.println("Parsing error for line: " + line + " - " + e.getMessage());
                    continue;
                }

                if (idx < listCriminas.length) {
                    listCriminas[idx] = data;
                    idx++;
                } else {
                    System.out.println("Array limit reached. Cannot add more data.");
                    break;
                }
            }
            System.out.println("<<================================================================================================>>");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (DataCSV data : listCriminas) {
            if (data != null) {
                data.print();
                System.out.println();
            }
        }
        System.out.println("<<================================================================================================>>");
    }
}