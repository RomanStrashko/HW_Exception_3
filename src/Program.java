import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        Parser parser = new Parser();
        String string = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> hashMap = parser.parsInputData();
        while (hashMap.size() != 4) {
            try {
                throw new DataException();
            } catch (DataException e) {
                hashMap = parser.parsInputData();
            }
        }

        string = hashMap.get("Фамилия") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(hashMap.get(str));
            sb.append(" ");
        }


        System.out.println(hashMap);
        String filePath = string;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);


    }
}
