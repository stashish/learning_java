package Students;

import java.io.*;
import java.util.*;

public class CSVManager {
    private final String FILE_NAME = "students.csv";

    //load data from CSV
    public Map<Integer, Student> loadStudentsData() {
        Map <Integer, Student> sMap = new HashMap<>();
        File file = new File(FILE_NAME);

        if(!file.exists()) return sMap;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s_line;
            while((s_line = reader.readLine()) != null) {
                Student student = Student.fromCSV(s_line);
                sMap.put(student.getId(), student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sMap;
    }

    public void saveStudentsData(Map<Integer, Student> studentsMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for(Student s: studentsMap.values()){
                writer.write(s.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
