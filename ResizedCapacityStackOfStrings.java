public class ResizedCapacityStackOfStrings {
    private String[] s;
    private int N = 0;//N is the pointer of null;

    public ResizedCapacityStackOfStrings(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        if(s.length == N) resize(2*s.length);
        s[N] = item;
        N++;
    }

    public String pop(){
        N--;
        String item = s[N];
        s[N] = null;
        if(N > 0 && N == s.length/4) resize(s.length/2);
        return item;
    }

    public void resize(int capacity){
        String copy[] = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }
}
