package com.ab.runner;
public class PrimeNumber {
  public static void main(String[] args) {
    int n = 10;
    int j = 0;
    boolean isPrime = true;

    for(int i = 2;i < n; i++) {
      isPrime = true;
      for(j = 2; j <= i/2; j++) {
        if(i % j == 0 && i != j) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.println(i + " ");
      }
    }
  }
}
