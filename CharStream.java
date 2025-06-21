import java.io.Reader;

public class CharStream {
    public final static char
        BLANK=' ';
    private final Reader is;
    
    public CharStream(Reader ds) {
        this.is = ds;
        System.out.println("out");
        System.exit(1);
    }
    
}