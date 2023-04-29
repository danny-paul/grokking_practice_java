package chapters.ch1;

public class Binary_Search {
    public static int bin_search(int[] arr, int search_value) {
        int upper_bound = arr.length - 1;
        int lower_bound = 0;
        int search_index;
        int found_index = -1;
        boolean continue_loop = true;

        do {
            search_index = ((upper_bound - lower_bound) / 2) + lower_bound;


            if (search_value == arr[search_index]) {
                //search value above midpoint
                continue_loop = false;
                found_index = search_index;
            } else if (search_value > arr[search_index]) {
                lower_bound = search_index + 1;
            } else {
                //search value below midpoint
                upper_bound = search_index - 1;
            }

        } while (continue_loop && !(upper_bound < lower_bound));

        return found_index;
    }
}