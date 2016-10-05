class Tree
{
   Tree left;
   Tree right;
   int key;
   public static int height(Tree root)
   {
      if(root == null)
         return 0;
      else
         return 1 + Math.max(height(root.left), height(root.right));
   }
   public static int size(Tree root)
   {
      if(root == null)
         return 0;
      else
         return 1 + size(root.left) + size(root.right);
   }
   public static void InOrder(Tree root)
   {
      if(root == null)
         return;
      InOrder(root.left);
      System.out.println(root.key);
      InOrder(root.right);
   }
   public static void PreOrder(Tree root)
   {
      if(root == null)
         return;
      System.out.println(root.key);
      PreOrder(root.left);
      PreOrder(root.right);
   }
   public static void PostOrder(Tree root)
   {
      if(root = null)
         return;
      PostOrder(root.left);
      PostOrder(root.right);
      System.out.println(root.key);
   }
   public static void LevelTraversal(Tree root)
   {
      if(root == null)
         return;
      Queue<int> q = new Queue<int>();
      Tree node;
      q.Enqueue(root);
      while(!(q.Empty())
            {
                node = q.Dequeue();
                System.out.println(node.key);
                if(node.left != null)
                   q.Enqueue(node.left);
                if(node.right != null)
                   q.Enqueue(node.right);
            }
   }
}
