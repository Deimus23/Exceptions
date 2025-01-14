package Error;

public class ErrorEjemplocontr {
    public static void main(String[] args) {
        try{
            int[]arr=new int[Integer.MAX_VALUE];
        }catch (Error e){
            System.err.println("Fatal error : "+e);
        }
    }
}
