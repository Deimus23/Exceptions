package CheckedError.Yes;
import java.io.IOException;

public class Checked extends IOException {

    public Checked(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
