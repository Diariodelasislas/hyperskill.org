package asciimirror;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().replace("\\", "\\\\");
        File file = new File(option);
        ArrayList<String> list = new ArrayList<>();
        try (Scanner fi = new Scanner(file)) {
            int maxLength = 0;
            while (fi.hasNext()) {
                list.add(fi.nextLine());
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() > maxLength) {
                    maxLength = list.get(i).length();
                }
            }

            for (int i = 0; i < list.size(); i++) {
                String blank = "";
                if (list.get(i).length() < maxLength) {
                    for (int j = 0; j < maxLength - list.get(i).length(); j++) {
                        blank += " ";
                    }
                }

                String modifiedLine = list.get(i) + blank;
                StringBuilder reversedModifiedLine = new StringBuilder();
                System.out.print(modifiedLine);
                System.out.print(" | ");
                for (int k = 0; k < modifiedLine.length(); k++) {
                    char c = modifiedLine.charAt(k);
                    if(c == '<') {
                        reversedModifiedLine.append('>');
                    } else if (c == '>') {
                        reversedModifiedLine.append('<');
                    } else if(c == '[') {
                        reversedModifiedLine.append(']');
                    } else if (c == ']') {
                        reversedModifiedLine.append('[');
                    } else if(c == '{') {
                        reversedModifiedLine.append('}');
                    } else if (c == '}') {
                        reversedModifiedLine.append('{');
                    } else if(c == '(') {
                        reversedModifiedLine.append(')');
                    } else if (c == ')') {
                        reversedModifiedLine.append('(');
                    } else if(c == '\\') {
                        reversedModifiedLine.append('/');
                    } else if (c == '/') {
                        reversedModifiedLine.append('\\');
                    } else {
                        reversedModifiedLine.append(modifiedLine.charAt(k));
                    }
                }
                System.out.println(reversedModifiedLine.reverse());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}