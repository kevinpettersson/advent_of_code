package day_2;

import java.nio.file.Files;
import java.nio.file.Path;

public class Day2 {

    public static void main(String[] args) throws java.io.IOException {
        String input = Files.readString(Path.of("C:/Repos/AoC_2025/2025/day_2/input.txt"));

        String[] ids = input.split(",");

    }

    private static int invalidIDs(String[] ids){
        int sum   = 0;
        int start = 0;
        int end   = 0;
        
        for(String id : ids){

            String[] id_range = id.split("-");
            start = Integer.parseInt(id_range[0]);
            end   = Integer.parseInt(id_range[1]);
            
            int l1 = id_range[0].length();
            int l2 = id_range[1].length();

            if(l1 % 2 == 0){
                String first_halve = id_range[0].substring((l1-1)/2);

            }

            if(l2 % 2 == 0){
                String second_halve = id_range[1].substring((l2-1)/2);
            }
        }
        return sum;
    }
    
}
