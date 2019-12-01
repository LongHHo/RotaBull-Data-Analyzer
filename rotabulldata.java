


import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;

public class rotabulldata {


    public static void main(String[] args) {


        BST<String, Integer> origin = new BST<String, Integer>();
        BST<String, Integer> sourceInfo = new BST<String, Integer>();
        StdDraw.setXscale(0, 3000);
        StdDraw.setYscale(-1000, 39000);
        In in = new In();


        StdDraw.clear(StdDraw.WHITE);
        int data = 0;
        while (in.hasNextLine()) {

            // use comma as separator
            String string = in.readLine();
            String[] array;
            array = string.split(",");

            if (!array[11].equals("")) {


                if (origin.contains(array[11]))
                    origin.put(array[11], origin.get(array[11]) + 1);

                else
                    origin.put(array[11], 1);
            }
            if (!array[13].equals("")) {


                if (sourceInfo.contains(array[13]))
                    sourceInfo.put(array[13], sourceInfo.get(array[13]) + 1);

                else
                    sourceInfo.put(array[13], 1);
            }

            StdDraw.setPenColor(Color.BLACK);
            if (!array[1].equals("")) {
                StdDraw.filledEllipse(data, Integer.parseInt(array[1]), 10, 120);
            }


            data++;
        }
        StdDraw.text(150, 10000, "10000");
        StdDraw.text(150, 20000, "20000");
        StdDraw.text(150, 30000, "30000");

        for (String string : origin.keys()) {
            System.out.println("Town: " + string + " Number of Times: "
                                       + origin.get(string));

        }
        for (String string : sourceInfo.keys()) {
            System.out.println("Source of Information: " + string + " Number of Data Points: "
                                       + sourceInfo.get(string));

        }

    }

}
