package com.katas.bowling;

/**
 * Hello world!
 *
 */
public class App 
{
 public void App(){
 }
 public int game(String input) {
 int result = 0;
 for (int i=0; i< input.length(); i++){
   result+= pointsFor(input, i);
 }
	return result;
 }

 private int pointsFor(String input, int i) {
 int result = 0;
    if (input.charAt(i)=='/') {
     result -= convertToInt(input, i-1);
     result += 10;
     result += convertToInt(input, i+1);
    } else if (input.charAt(i)=='X') {
     result += 10;
     result += convertToInt(input, i+1);
     result += convertToInt(input, i+2);
    } else{
     result += convertToInt(input, i);
    }
    return result;
 }
 private int convertToInt (String input, int index){
    return Integer.valueOf(String.valueOf(input.charAt(index)));
 }
}
