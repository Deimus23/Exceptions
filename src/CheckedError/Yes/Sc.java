package CheckedError.Yes;

public class Sc {
   public boolean inputChar(String message,boolean exit) throws Checked {

       if (message.length() != 1) {
           throw new Checked("Invalid input or input stream closed.");
       } else {
           exit=true;
       }
       return exit;
   }
}
