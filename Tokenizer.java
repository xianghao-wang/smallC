public class Tokenizer {
    private String source;
    private int row;
    private int column;
    private int position;
    private Token currentToken = null;

    private Token currentToken() {
        return currentToken;
    }

    private Token createToken(Token.Type type, String image) {
        return new Token(type, image, row, column);
    }


    public void next() {

    }


    public Tokenizer(String source) {
        this.source = source;
    }
}
