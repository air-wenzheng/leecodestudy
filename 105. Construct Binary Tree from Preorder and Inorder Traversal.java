 public static void FindFullNodes(TreeNode root, int depth) {
        // do the traversal and print all the nodes which has left and right
        // child

        if (root != null & depth<2) {

            if (depth<1)   System.out.print(root.val + " ");

            if (root.left != null)
                System.out.print(root.left.val + " ");
            else System.out.print("null" + " ");
            if (root.right != null)
                System.out.print(root.right.val + " ");
            else System.out.print("null" + " ");
        }
    }

    public static void main(String[] args) {
        // write your code here
        // Instantiating the outer class
        // Animals classA = new Animals();
        // Accessing the display_Inner() method.
        // classA.display_Inner();

         int[] preorder = new int[] {3,9, 20,15, 7};
         int[] inorder = new int[]{9, 3, 15, 20, 7};
         int[] postorder = new int[]{9, 15, 7, 20, 3};

        System.out.println("pre order BST:");
        for (int i =0; i<preorder.length; i++){
            System.out.print(preorder[i]+ " " );
        }
        System.out.println("");
        System.out.println("inorder BST:");
        for (int i =0; i<inorder.length; i++){
            System.out.print(inorder[i]+ " " );
        }
        System.out.println("");
        
        System.out.println("Solution to Leecode 106:");
        TreeNode output1 =  buildTreeInPost(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);

        FindFullNodes(output1,0);
        System.out.println("");

    }


}

