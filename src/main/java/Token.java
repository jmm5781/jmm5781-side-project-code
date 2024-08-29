import java.util.Objects;

public class Token {
    private char symbol;

    public Token(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return symbol == token.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
}
