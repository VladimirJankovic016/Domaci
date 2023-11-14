package rs.ac.ni.pmf.oop2;

public class Main {
    public static void main(String[] args) {
        TextParser tp = new TextParser();

        Encoder en = new Encoder_toLowerCase();
        //Encoder en = new Encoder_toUpperCase();
        tp.setEncoder(en);

        Storer st = new Database_Storer();
        //Storer st = new File_Storer();
        //Storer st = new Network_Storer();
        tp.setStorer(st);

        tp.parse("Testing text parser.");
    }
}
