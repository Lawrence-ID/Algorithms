import java.util.Scanner;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n){
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p,int q){
        if(id[p] == id[q])
            return;
        for (int i = 0; i < id.length; i++) {
            if(id[i] == id[p]){
                id[i] = id[q];
            }
        }
        printID();
    }

    public int find(int p){
        return id[p];
    }

    public void printID(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        QuickFindUF id = new QuickFindUF(10);
        int num1 = 0,num2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("initiation array");
        id.printID();
        System.out.println("Please input two numbers to union:");
        while(true){
            num1 = in.nextInt();
            num2 = in.nextInt();
            if(num1 == -1 || num2 == -1) break;
            id.union(num1,num2);

        }


    }
}
