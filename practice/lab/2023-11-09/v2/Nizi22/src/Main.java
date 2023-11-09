public class Main {
    public static void main(String[] args) {
        String besedilo = "Danes je lepo vreme.";
        System.out.println(besedilo);
        System.out.println(besedilo.length());
        System.out.println(besedilo.charAt(9));
        //reverse string
        /*
        for (int i = besedilo.length() - 1; i >= 0; i--)
        {
            System.out.print(besedilo.charAt(i));
        }
        */
        //split string by " "

        String besede[] = besedilo.split(" ");

        /*
        for (String a : besede)
        {
            System.out.println(a);
        }
        */
        //oziroma
        /*
        for (int i = 0; i < besede.length; i++)
        {
            System.out.println(besede[i]);
        }
         */
        for (String a : besede)
        {
            for (int i = a.length() - 1; i >= 0; i--)
            {
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
    }
}