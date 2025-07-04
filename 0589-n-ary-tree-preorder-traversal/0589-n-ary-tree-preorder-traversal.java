/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
     List<Integer> output=new ArrayList<Integer>();
     if(root==null) return output;

     Stack<Node> st=new Stack<>();
     st.push(root);

     while(!st.isEmpty()){
        Node node=st.pop();
        output.add(node.val);

        for (int i= node.children.size()-1; i>=0;i--){
            st.push(node.children.get(i));
        }
     } 

     return output;

    }
}