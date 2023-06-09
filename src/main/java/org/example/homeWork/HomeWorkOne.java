package org.example.homeWork;

public class HomeWorkOne {
    public static void main(String[] args) {

        String str = "    the sky is         blue               ";
        System.out.println("reveversString(str) = " + reveversString(str));
    }

    /**
     * @param str String
     * @return String
     * @apiNote изменяет порядок слов в строке в обратном порядке
     */
    private static String reveversString(String str) {
        String strNew = "";
        char probel = ' ';
        String[] words = str.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            if (i != 0) strNew = strNew + words[i] + probel;
            else strNew = strNew + words[i];
        }
        return strNew;
    }
}


