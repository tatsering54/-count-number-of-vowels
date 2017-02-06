import java.util.Scanner;

public class AEIOU_Counter {

public static void main(String[] args) throws Exception {
    java.io.File file = new java.io.File("vowels.txt");

    Scanner input = new Scanner(file);
    String fileContent = "";
    while (input.hasNext())
    {
        fileContent += input.next() + " ";
    }
    input.close();

    char[] charArr = fileContent.toCharArray();
    int counter = 0;
    for (char c : charArr)
    {
        if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
        counter++;
    }
    System.out.println("The file " + file + " has AEIOU in order " + counter + " times");
}
}
