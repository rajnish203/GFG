import java.util.Stack;

class numberFollowingAPattern{
    static String printMinNumberForPattern(String S){
      int n=S.length(); 
      StringBuilder s=new StringBuilder();
      int current=1;
      Stack<Integer>stack=new Stack<>();
      for(int i=0;i<S.length();i++){
          if(S.charAt(i)=='I'){
              stack.push(current++);
              while(!stack.isEmpty()){
                  s.append(stack.pop());
              }
          }else{
              stack.push(current++);
          }
      }
      
      stack.push(current);
      while(!stack.isEmpty()){
          s.append(stack.pop());
      }
      
      
      return s.toString();
    }
}
