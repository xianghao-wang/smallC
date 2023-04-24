public class Token {
    public enum Type {
        // Keywords
        CONST, IF, ELSE, DO, WHILE, BREAK, RETURN, STRUCT, TYPEDEF,
        // Logical operators
        LOR, LAND, LNOT, LXOR,
        // Relation operators
        EQUAL, NOT_EQUAL, LT, LE, GT, GE,
        // Arithmetic operators
        PLUS, ADD, MUL, DIV, MOD,
        // Other operators
        ASSIGN, L_ROUND, R_ROUND, L_CURLY, R_CURLY, L_SQUARE, R_SQUARE,
        // Operands
        NUMBER, CHAR, ID,
        EOF
    }

    public int row;
    public int column;
    public Type type;
    public String image;

    public Token(Type type, String image, int row, int column) {
        this.type = type;
        this.image = image;
        this.row = row;
        this.column = column;
    }
}
