public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr = new String();
        char add;
        for (int i=0; i<str.length();i++){
            add = str.charAt(i);
            if (add == 32 || add >= 48 && add <= 57){
                newstr+= add;
                continue;
            }
            if (add < 97)
                add+=32;
            newstr+= add;
        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length()<str2.length())
            return false;
        String sub;
        for(int i=0; i<(str1.length()-str2.length()+1);i++){
            sub = str1.substring(i, str2.length()+i);
            if (str2.compareTo(sub)== 0)
                return true;
        }
        return false;
    }
}
