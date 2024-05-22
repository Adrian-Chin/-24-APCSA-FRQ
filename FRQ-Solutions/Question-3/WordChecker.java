import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    boolean cool=false;
    for(int i=1; i<wordList.size(); i++){
      if(wordList.get(i).indexOf(wordList.get(i-1))>0){
        cool=true;
      }else{
        cool=false;
      }
    }
    return cool;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
     for (int i=0; i<wordList.size(); i++){
      if(wordList.get(i).indexOf(target)==0){
        result.add(wordList.get(i).substring(target.length()));
      }
    }
    return result;             
  }
}
