package MyImmutable;

public class Immutable {
    
    int x;

    public Immutable(int x) {
        this.x = x;
    }

    public Immutable change(int x){
        if(this.x == x){
            return this;
        }else{
            return new Immutable(x);
        }
    }

    public static void main(String[] args) {
        
        Immutable immutable = new Immutable(20);
        Immutable im = immutable.change(30);
        Immutable imm = immutable.change(20);
        System.out.println(immutable == imm);
        System.out.println(im == imm);
    }
}
