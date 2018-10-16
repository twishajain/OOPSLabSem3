import java.util.Scanner;
class lab9q1
{
        public static void main(String args[])
        {
                System.out.println("Enter a String");
                Scanner in = new Scanner(System.in);
                String str= in.nextLine();
                System.out.println("The number of characters: "+ str.length());

                int line=0;
                String lines[]=str.split("\\.",0);
                //System.out.println("TRIALThe number of lines: "+lines.length());
                for(String b:lines)
                        line++;
                System.out.println("The number of lines: "+line);

                int word=0;
                String words[]=str.split("[. ]",0);
                for(String a:words)
                        word++;
                System.out.println("The number of words: "+word);


                int vowels=0;
                for(int i=0;i<str.length();i++)
                {
                        if ((str.charAt(i) == 'a') ||
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') ||
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u'))
                                vowels++;
                }
                                System.out.println("The number of vowels: "+vowels);
        }
}
