class tree{
    int data;
    tree left;
    tree right;

    tree(int data){
        this.data=data;
    }
}
class Binary{
    tree root ;
    Binary(int data){
        root = new tree(data);
    }
    public static void insert(tree root, int data){
        insertNode(root,data);
    }
    public static tree insertNode(tree root, int data)
    {
        if(root == null){
            return new tree(data);
        }
        if(data<root.data){
            root.left=insertNode(root.left,data);
        }
        else {
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    public static void inOrder(tree root){
        if(root == null)
        {
            return;
        }
        else {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
    public static void preOrder(tree root){
        if(root == null)
        {
            return;
        }
        else {
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }

    }
}



public class BinaryTrees {
    public static void main(String[] args){
        Binary bt = new Binary(10);
        bt.insert(bt.root,7);
        bt.insert(bt.root,20);
        bt.insert(bt.root,6);
        bt.insert(bt.root,15);
        bt.inOrder(bt.root);
        System.out.println();
        bt.preOrder(bt.root);
    }
}
