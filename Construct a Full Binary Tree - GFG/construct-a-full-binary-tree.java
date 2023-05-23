//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int index=0;
    static Node help(int start,int end,int pre[],int preMirror[],int n){
        if(index>=n || start>end)return null;
        if(index==n-1 || start==end){
            Node temp = new Node(pre[index]);
            index++;
            return temp;
        }
        Node temp = new Node(pre[index]);
        index++;
        for(int i=start;i<=end;i++){
            if(pre[index]==preMirror[i]){
                temp.left = help(i,end,pre,preMirror,n);
                temp.right = help(start+1,i-1,pre,preMirror,n);
                break;
            }
        }
        return temp;
    }
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
        index=0;
        return help(0,size-1,pre,preM,size);
    }
    
}