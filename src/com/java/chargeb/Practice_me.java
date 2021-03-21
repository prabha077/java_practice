package com.java.chargeb;

import sun.jvm.hotspot.types.CIntegerField;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Resultss {

    /*
     * Complete the 'carParkingRoof' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY cars
     *  2. INTEGER k
     */

    public static long carParkingRoof(List<Long> cars, int k) {

        int car_count = cars.size();

        List<Long> fl = new ArrayList<Long>();

        Collections.sort(cars);

        Iterator<Long> carItr = cars.iterator();

        int index=0;

        while(carItr.hasNext())
        {

            int current_index = index;

            int target_index = current_index+k-1;

            Long mi = carItr.next();

            if(target_index<car_count)
            {
                Long mx = cars.get(target_index);

                fl.add((mx-mi)+1L);
            }

            index++;

        }

        OptionalLong result = fl.stream().mapToLong(v -> v).min();


        return result.getAsLong();

    }

}

class Solutionss {
    public static void main(String[] args) throws IOException {


        List<Long> cars = new ArrayList<Long>();

        cars.add(2L);
        cars.add(10L);
        cars.add(8L);
        cars.add(17L);

        long result = Resultss.carParkingRoof(cars, 3);

        System.out.println(result);


    }
}

