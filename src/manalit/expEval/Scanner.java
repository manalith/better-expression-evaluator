package manalit.expEval;

public class Scanner {
    String text;
    int index;

    public Scanner(String text) {
        this.text = text;
        index = -1;
    }

    public char next()throws Exception{
        index++;
        if (index >= text.length())
            throw new StringIndexOutOfBoundsException();
        if (isWhileSpace())
            return next();
        return this.text.charAt(index);
    }

    private boolean isWhileSpace() {
        return this.text.charAt(index) == ' ';
    }
}
