import java.io.Reader;
import java.io.IOException;

public class CharStream {
    public static final char BLANK = ' ';
    private final Reader is;
    private boolean eof;
    private char nextChar;

    public CharStream(Reader ds) {
        this.is = ds;
        this.eof = false;
        this.nextChar = 0;
        advance(); // prefetch first character
    }

    public boolean isEOF() {
        return eof;
    }

    public char advance() {
        char currentChar = nextChar;

        try {
            int next = is.read();
            System.out.println("next: " + (char)next);


        return currentChar;
    }
}
