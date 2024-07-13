package helpers;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ArraySyntaxConverter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("convertedArrayStrings.txt", StandardCharsets.UTF_8);
        writer.println("Arrays: ");
        while (true){
            System.out.println("Type in the Array: \n");
            String input = sc.next();

            if (input.equals("exit")){
                writer.close();
                break;
            }

            writer.println(convertToArrayWithCurlyBraces(input));
        }
        sc.close();
    }

    public static String convertToArrayWithCurlyBraces(String s) {
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        return s;
    }
}
