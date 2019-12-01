
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;

public class rotabulldata1 {


    public static void main(String[] args) {

        Stack<Integer> time = new Stack<Integer>();
        Stack<Integer> flightTime = new Stack<Integer>();
        StdDraw.setXscale(0, 70);
        StdDraw.setYscale(-120, -50);
        In in = new In();


        StdDraw.clear(StdDraw.WHITE);
        int data = 0;
        boolean check = true;
        boolean first = true;
        int diff;
        while (in.hasNextLine()) {

            // use comma as separator
            String string = in.readLine();
            String[] array;
            array = string.split(",");

            if (array[1].equals("0") && first) {
                first = false;
                continue;
            }

            if (array[1].equals("0")) {
                if (time.isEmpty())
                    time.push(Integer.parseInt(array[19]));
                else {
                    diff = Math.abs(Integer.parseInt(array[19]) - time.peek());
                    if (diff > 400) {
                        time.push(Integer.parseInt(array[19]));
                        flightTime.push(diff);
                    }

                }


            }


            StdDraw.setPenColor(Color.BLACK);
            if (array[1].equals("0")) {
                if (check) {
                    if (!array[8].equals("") && !array[9].equals("")) {
                        StdDraw.setPenColor(Color.BLUE);
                        StdDraw.filledCircle(Double.parseDouble(array[8]),
                                             Double.parseDouble(array[9]), 0.7);
                        check = false;
                    }

                }
                else {
                    if (!array[8].equals("") && !array[9].equals("")) {
                        StdDraw.setPenColor(Color.RED);
                        StdDraw.filledCircle(Double.parseDouble(array[8]),
                                             Double.parseDouble(array[9]), 0.7);
                        check = true;
                    }
                }

            }

            else if (!array[8].equals("") && !array[9].equals("")) {
                StdDraw.point(Double.parseDouble(array[8]), Double.parseDouble(array[9]));
            }


        }
        StdDraw.text(5, -100, "-100");
        StdDraw.text(5, -70, "-70");
        StdDraw.text(15, -53, "15");
        StdDraw.text(45, -53, "45");

        System.out.println("Time positions of plane while it is down low: ");
        while (time.iterator().hasNext()) {
            System.out.println(time.iterator().next());
        }

        System.out.println("Time differences: ");
        while (flightTime.iterator().hasNext()) {
            System.out.println(flightTime.iterator().next());
        }

    }

}


