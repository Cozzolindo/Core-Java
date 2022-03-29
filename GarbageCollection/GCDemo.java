package GarbageCollection;

public class GCDemo {
    
    int objId;

    public GCDemo(int objId) {
        this.objId = objId;
        System.out.println(this + " Created");
    }

    public static void main(String[] args) {
        

        new GCDemo(1);
        new GCDemo(2);
        new GCDemo(3);
        for(int i = 0; i<=100; i++){
            System.gc();
        
        }
        
    }

    @Override
    protected void finalize(){
        System.out.println(this + " Cleaned" + objId);
    }
}
