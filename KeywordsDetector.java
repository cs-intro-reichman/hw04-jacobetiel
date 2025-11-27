public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
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



    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String sentenceLower = lowerCase(sentence);
            boolean found = false;

            for (int j = 0; j < keywords.length; j++) {
                String keywordLower = lowerCase(keywords[j]);

                if (contains(sentenceLower, keywordLower)) {
                    System.out.println(sentence); 
                    found = true;
                    break;     
                }
            }
        }
    }
        
}


