import java.util.*;

class BrainFuck
{
    static Scanner sc = new Scanner(System.in);
    static int ptr;
    static int length = 30000;
    static byte arr[] = new byte[length];

    public static void main(String args[])
    {
        System.out.println("Input");
        String s = sc.nextLine();
        System.out.println("Output:");
        interpret(s);
    }
    public static void interpret(String s)
    {
        int c = 0;
        for (int i = 0; i < s.length(); i++)
            {
            if (s.charAt(i) == '>')
            {
                if (ptr == length - 1)
                    ptr = 0;
                else
                    ptr ++;
            }
            else if (s.charAt(i) == '<')
            {
                if (ptr == 0)
                    ptr = length - 1;
                else
                    ptr --;
            }
            else if (s.charAt(i) == '+')
                arr[ptr] ++;
            else if (s.charAt(i) == '-')
                arr[ptr] --;
            else if (s.charAt(i) == '.')
                System.out.print((char)(arr[ptr]));
            else if (s.charAt(i) == ',')
                arr[ptr] = (byte)(sc.next().charAt(0));
            else if (s.charAt(i) == '[')
            {
                if (arr[ptr] == 0)
                {
                    i++;
                    while (c > 0 || s.charAt(i) != ']')
                    {
                        if (s.charAt(i) == '[')
                            c++;
                        else if (s.charAt(i) == ']')
                            c--;
                        i ++;
                    }
                }
            }
            else if (s.charAt(i) == ']')
            {
                if (arr[ptr] != 0)
                {
                    i --;
                    while (c > 0 || s.charAt(i) != '[')
                    {
                        if (s.charAt(i) == ']')
                            c ++;
                        else if (s.charAt(i) == '[')
                            c --;
                        i --;
                    }
                    i --;
                }
            }
        }
    }
}
