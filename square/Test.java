package square;
import java.io.*;
import java.util.ArrayList;
public class Test{
    private static ArrayList<Holder> rectArray = new ArrayList<Holder>();
    public static void main(String[] agrs){
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            String[] parsedLine = line.split(" ");
            //for (String str : parsedLine){
            //    System.out.print(str);
            //}
            //System.out.println();
            int x1 = Integer.parseInt(parsedLine[0]);
            int y1 = Integer.parseInt(parsedLine[1]);
            int x2 = Integer.parseInt(parsedLine[2]);
            int y2 = Integer.parseInt(parsedLine[3]);

            //System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);

            //to show propper state
            Holder tempHolder = new Holder(x1, y1, x2, y2);
            System.out.println(tempHolder);
            rectArray.add(tempHolder);

        }
        } catch (IOException e) {e.printStackTrace();}

        //TODO:logic

        for (int i = 0; i < rectArray.size(); i++){
            System.out.println(rectArray.get(i).getX1() + rectArray.get(i).getX2());
        }

    }
}
