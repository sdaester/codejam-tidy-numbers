package algoritmos.solution;

import algoritmos.FromScannedLineToLine;
import algoritmos.ReadFile;

import java.util.Scanner;

public class Solution implements FromScannedLineToLine{
  public String process(Scanner in) {
    return "out";
  }

  public static void main(String[] args) {
    new ReadFile().process(new Solution());
  }

  public boolean isTidy(long number) {
    for(long i=number; i>=10 ; i = i/10){
      long lastDigit = i % 10;
      long previousDigit = i % 100 / 10;
      if(previousDigit > lastDigit){
        return false;
      }
    }
    return true;
  }

  public long lastTidy(long i) {
    long n = i;
    while (!isTidy(n)){
      n = optimizeNext(n);
    }
    return n;
  }

  private long optimizeNext(Long n) {

    char[] all = n.toString().toCharArray();

    for(int i =0 ; i < all.length; i++){
      int current = Character.getNumericValue(all[i]);
      int next = Character.getNumericValue(all[i+1]);
      if(current > next){
        String newNumber="";
        for(int j=0; j<i; j++){
          newNumber += all[j];
        }
        newNumber += current-1;
        for(int j=i+1; j<all.length; j++){
          newNumber += 9;
        }
        return Long.valueOf(newNumber);
      }
    }

    return n-1;
  }

  protected long firstDigit(long n) {
    long i;
    for (i = n; i >= 10 ; ) {
      i = i / 10;
    }
    return i;

  }
}
