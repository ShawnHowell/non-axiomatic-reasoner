package water.droplets;

import java.util.*;

public class Admin
{
    public void lexiconParser(String filename)
    {
        Scanner sc = new Scanner(new File(filename));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        // arr contains all the words, with repeats
        // lines contains all the lines in the corpus
        String[] arr = lines.toArray(new String[0]);
    }
}