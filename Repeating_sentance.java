import java.util.Scanner;
public class Repeating_sentance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String input = sc.nextLine();
        String result = "";
        String word = "";

        input += " ";

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch != ' ')
            {
                word += ch;
            }
            else if (word != "")
            {
                result = word + " " + result;
                word = "";
            }
        }

        System.out.println("Output:" + result);
        sc.close();
    }
}

