import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeData(String data, String path) {
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try(FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.append(data);
            fileWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
