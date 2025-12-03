package day_1;

import java.nio.file.Files;
import java.nio.file.Path;

public class Day1 {

    public static void main(String[] args) throws java.io.IOException {
        String input = Files.readString(Path.of("C:/Repos/AoC_2025/2025/day_1/input.txt"));

        String[] rotations = input.split("\n");

        for (String rot : rotations){
            rot.trim();
        }

        // PART 1
        int pw1 = Part1(rotations, 50);
        System.out.println(pw1);

        // PART 2
        int pw2 = Part2(rotations, 50);
        System.out.println(pw2);
    }

    // Counts the number of times the dial ends up at 0 after an rotation is done
    private static int Part1(String[] rotations, int dialVal){
        int count = 0;
        int degree = 0;

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

    // Counts the number of times a click makes the dial point to 0
    private static int Part2(String[] rotations, int dialVal){
        int count = 0;
        int clicks = 0;

        for(String rot : rotations){
            if(rot.startsWith("R")){
                clicks  = Integer.parseInt(rot.split("R")[1]);
                for(int i = 0; i < clicks; i++){
                    dialVal = (dialVal + 1) % 100;
                    if(dialVal == 0) count++;
                }

            } else {
                clicks  = Integer.parseInt(rot.split("L")[1]);
                for(int i = 0; i < clicks; i++){
                    dialVal = (dialVal - 1) % 100;
                    if(dialVal == 0) count++;
                }
            }
        }
        return count;
    }







}
