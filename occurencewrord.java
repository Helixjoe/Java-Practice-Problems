import java.util.*;

class occurencewrord
{
    public static void main(String args[])
    {
        String s;
        Scanner inp = new Scanner(System.in);
        s = inp.nextLine();
        System.out.println(s);
        String words[] = s.split(" "); 
        int count=0;
        System.out.println("Enter word to find occurence");
        String word = inp.nextLine();
        for(int i=0;i<words.length;i++)
        {
                if(word.equals(words[i]))
                    count++;
        }
        System.out.println(count);
    }
}