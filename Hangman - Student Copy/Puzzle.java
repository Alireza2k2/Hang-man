import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{

    private String word;
    private String ans;
    private String guesses;
    public Puzzle(){
        word = "bruh";
        ans = "";
        guesses = "";
    }

    public void add(String s, String s2){
        s = s + s2;
    }

    public String getWord(){
        return word;
    }
    public boolean isUnsolved(){
        int n = 0;
        int i = 0;
        while( i<word.length()){
            if(ans.contains(word.substring(i,i+1))){
                n++;
            }
            i++;
        }
        if(i == word.length() && n < word.length()){
            return true;
        }else{
            return false;
        }
    }

    public void show(){
        String revealedLetters = new String();
        for(int i = 0; i<word.length(); i++){
            if(ans.contains(word.substring(i, i+1))){
                revealedLetters += word.substring(i, i+1);
            }else{
                revealedLetters += "_";   
            }
        }
        System.out.println("Word: " + revealedLetters);
        System.out.println("Guessed Letters: " + ans + guesses);
    }

    public boolean makeGuess(String guess){
        
        if(word.contains(guess)){
            ans = ans + guess;
            return true;
        }else{
            guesses = guesses + guess;
            return false;   
        }
    }
}
