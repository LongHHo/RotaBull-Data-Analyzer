

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;

import java.util.Iterator;

public class rotabulldata2 {


    public static void main(String[] args) {

        Stack<Integer> time = new Stack<Integer>();
        Stack<Integer> flightTime = new Stack<Integer>();

        In in = new In();


        int diff;
        boolean high = true;

        while (in.hasNextLine()) {

            // use comma as separator
            String string = in.readLine();
            String[] array;
            array = string.split(",");

            if (array[1].equals(""))
                continue;
            if (Integer.parseInt(array[1]) < 3000) {
                if (time.isEmpty())
                    time.push(Integer.parseInt(array[19]));
                else {
                    diff = Math.abs(Integer.parseInt(array[19]) - time.peek());
                    time.pop();
                    time.push(Integer.parseInt(array[19]));
                    if (high) {
                        if (diff > 400) {
                            flightTime.push(diff);
                            high = false;
                        }

                    }
                }

            }

            if (Integer.parseInt(array[1]) > 30000)
                high = true;


        }


        System.out.println("Time positions of plane while it is down low: ");
        Iterator<Integer> iter = time.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Iterator<Integer> itera = flightTime.iterator();
        System.out.println("Time differences: ");
        while (itera.hasNext()) {
            System.out.println(itera.next());
        }

    }

}


