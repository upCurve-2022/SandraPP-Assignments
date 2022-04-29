
class node
{
	String data;
	node left,right;
	public node(String s)
	{
	    data=s;
		left=right=null;
	}
}
public class leafNodes {

	public static void main(String[] args) {
		node root=new node("a");
		root.left=new node("b");
		root.right=new node("f");
		root.left.left=new node("c");
		root.left.left.left=new node("d");
		root.left.right=new node("e");
		root.right.left=new node("g");
		root.right.right=new node("h");
		root.right.right.right=new node("k");
	    leafFind(root);
	}

	private static void leafFind(node root) {
		if(root==null)
            return;
		if(root.right==null && root.left==null)
		{
		System.out.println(root.data);
		}
		leafFind(root.left);
		leafFind(root.right);
	}

}
