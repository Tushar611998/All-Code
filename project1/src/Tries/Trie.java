package Tries;

public class Trie {

    private TrieNode root;
    private int numWord;
    public Trie(){
        root = new TrieNode('\0');
        numWord =0;
    }
    private boolean add(TrieNode root,String word){
        if(word.length()==0){
            if(root.isTerminating){
                return false;
            }else{
                root.isTerminating = true;
                return true;
            }

        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child,word.substring(1));
    }
    public void add(String word){
        if( add(root,word)){
            numWord++;
        }
    }
    public boolean search(TrieNode root,String word){
        if(word.length()==0){
            return root.isTerminating;
        }
         int childIndex = word.charAt(0)-'a';
         TrieNode child = root.children[childIndex];
         if(child==null){
             return false;
         }
         return search(child,word.substring(1));
    }
    private boolean remove(TrieNode root,String word){
        if(word.length()==0){
            if(root.isTerminating){
                root.isTerminating= false;
                return true;
            }else{
                return false;
            }
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null){
            return false;
        }
        boolean ans =remove(child,word.substring(1));
        if(!child.isTerminating && child.childCount==0){
            root.children[childIndex] = null;
            child =null;
            root.childCount--;
        }
        return ans;
    }
    public void remiove(String word){
        if(remove(root,word)){
            numWord--;
        }
    }
    public int countWords() {
        return numWord;


        // Write your code here
    }

    public static void main(String[] args) {
        String[]arr = {"that","this","the","and"};
        Trie ans = new Trie();
        for(int i = 0;i< arr.length;i++){
            ans.add(arr[i]);
        }
        int a =ans.countWords();
        System.out.println(a);
    }

}

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;
    public TrieNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}
