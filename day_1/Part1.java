package day_1;

import java.nio.file.Files;
import java.nio.file.Path;

public class Part1 {

    public static void main(String[] args) throws java.io.IOException {
        String input = Files.readString(Path.of("C:/Repos/AoC_2025/day_1/input.txt"));
        
        int pw = getPassword(input, 50);

        System.out.println(pw);
    }

    private static int getPassword(String s, int dialVal){
        int count = 0;
        int degree = 0;

        String[] rotations = s.split("\n");

        for (String rot : rotations){
            rot.trim();
        }

        for(String rot : rotations){

            if(rot.startsWith("R")){
                degree  = Integer.parseInt(rot.split("R")[1]);
                dialVal = (dialVal + degree) % 100;
            } else {
                degree  = Integer.parseInt(rot.split("L")[1]);
                dialVal = (dialVal - degree) % 100;
            }

            if (dialVal == 0) count++;
        }
        return count;
    }
}
