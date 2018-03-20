
public class StringManipulator{

    public String trimAndConcat(String word1, String word2){
        // trim() takes empty spaces
        String newString = word1.trim().concat(word2,trim());
        return newString;


    }

    public Integer getIndexOrNull(String word, Char serchingFor){
        // run through the word
        int result = word.indexOf(serchingFor);
        if(result < 1){
            return null;
        }else{
            return result;
        }
    }




}