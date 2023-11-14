package rs.ac.ni.pmf.oop2;

public class TextParser {
    Encoder encoder;
    Storer storer;

    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }
    public void setStorer(Storer storer) {
        this.storer = storer;
    }
    public void parse(String s){
        String s_copy = s;
        s_copy = encoder.encode(s_copy.trim());
        storer.store(s_copy);
    }
}