package HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.stream.Collectors;

public class homework6 {

    public static void main(String[] arg) {
        int[] arraySortSelect = new int[5000];
        for (int i = 0; i < arraySortSelect.length; i++) {
            arraySortSelect[i] = ((int) (Math.random() * 1988 - 1219));
        }
        ArrayList<Integer> arrayCollectionsSort = (ArrayList<Integer>) Arrays.stream(arraySortSelect).boxed().collect(Collectors.toList());
        System.out.println(Arrays.toString(new ArrayList[]{arrayCollectionsSort}));
        long startTime = new Date().getTime();
        Collections.sort(arrayCollectionsSort);
        long endTime = new Date().getTime();
        long finishTime = endTime - startTime;
        System.out.println(Arrays.toString(new ArrayList[]{arrayCollectionsSort}));
        System.out.println(finishTime + " мс затрачено на встроенную сортировку Java" + "\n ----------------------------------------------------------------");

        System.out.println(Arrays.toString(arraySortSelect));
        int lengthArray = arraySortSelect.length;
        long start = System.currentTimeMillis();
        for (int i = 0; i < lengthArray; i++) {
            int position = i;
            int min = arraySortSelect[i];
            for (int j = i + 1; j < lengthArray; j++) {
                if (arraySortSelect[j] < arraySortSelect[position]) {
                    position = j;
                    min = arraySortSelect[j];
                }
            }
            arraySortSelect[position] = arraySortSelect[i];
            arraySortSelect[i] = min;
        }
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arraySortSelect));
        System.out.println(end - start + " мс затрачено на сортировку выбором");
    }
}