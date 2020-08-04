import java.util.Scanner;

public class QuickUnionUF {
    private int[] id;
    private int[] sz;
    private int count;//连通分量的数量

    public QuickUnionUF(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int findRoot(int p){
        while(p != id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }

    public void union(int p,int q){
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        if(pRoot == qRoot) return;

        if(sz[pRoot] < sz[qRoot]){
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }else{
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        count--;

    }

    public static void main(String[] args) {
        int N = 10;
        QuickUnionUF uf = new QuickUnionUF(N);
        Scanner in = new Scanner(System.in);
        System.out.println("initiated array");

    }
}
