package com.java.chargeb;

import java.io.IOException;
import java.util.*;

class Results {

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

        //List<Long> fl = new ArrayList<Long>();

        Collections.sort(cars);

        long min_result = cars.get(k-1)-cars.get(0)+1L;

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

                long res= (mx-mi)+1l;

                if (res<min_result)
                {
                    min_result = res;
                }
            }

            index++;

        }

        //OptionalLong result = fl.stream().mapToLong(v -> v).min();


        return min_result;

    }

}

class Solutions {
    public static void main(String[] args) throws IOException {


        List<Long> cars = new ArrayList<Long>();

        cars.add(6L);
        cars.add(2L);
        cars.add(12L);
        cars.add(7L);

        long result = Results.carParkingRoof(cars, 3);

        System.out.println(result);


    }
}

