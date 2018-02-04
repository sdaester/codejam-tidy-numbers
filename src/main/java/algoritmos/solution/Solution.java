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
      n -=1;
    }
    return n;
  }
}
