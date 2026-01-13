import java.util.*;
class stackB{
  //Push at the bottom of the stack
  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    
    int top=s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }
  
  
  
  
  //Reverse a string using stack
  public static String reverseString(String str){
       Stack<Character> s=new Stack<>();
       int idx=0;
       while(idx<str.length()){
         s.push(str.charAt(idx));
         idx++;
       }
       
       StringBuilder result=new StringBuilder();
       while(!s.isEmpty()){
         //char curr=s.pop();
         result.append(s.pop());
       }
       return result.toString();
  }
  
  
  public static void main(String ar[]){
    Stack <Integer> s=new Stack<>();
    s.push(1);
    s.push(3);
    s.push(7);
    s.push(9);
    
    pushAtBottom(s, 4);
    while(!s.isEmpty()){
      System.out.println(s.pop());
    }
    
    
    String str="abc";
    String result=reverseString(str);
    System.out.println(result);
  }
}
