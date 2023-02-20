package Stack;

public class CountBracketReversal {
    public static int countBracketReversals(String input) {
        //Your code goes here
        saack s = new saack();
        char c1 = 'n';
        char c2 = 'n';
        int count =0;
        // s.push(input.charAt(0));

        if(input.length()%2 !=0 && input.length()!=0){
            return -1;
        }

        for(int i = 0;i<input.length();i++){

            if(input.charAt(i) =='{'){
                s.push(input.charAt(i));
            }
            else if(input.charAt(i) =='}' && s.top() =='{'){
                s.pop();
            }
            else if(input.charAt(i) =='}'  && s.size() ==0){
                s.push(input.charAt(i));
            }
            else if(input.charAt(i) =='}'  && s.size() !=0 && s.top()=='}'){
                s.push(input.charAt(i));
            }
        }
        while(s.size()!=0){
            c1 = (char)s.top();
            s.pop();
            c2 = (char)s.top();
            s.pop();

            if(c1=='{' && c2=='}'){
                count = count + 2;
            }
            else{
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "{{{}}{{";
        int ans = countBracketReversals(s);
        System.out.println(ans);
    }
}
