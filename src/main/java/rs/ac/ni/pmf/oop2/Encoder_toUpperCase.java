package rs.ac.ni.pmf.oop2;

public class Encoder_toUpperCase implements Encoder {
        @Override
        public String encode(final String s){
            System.out.println("Encoder_toUpperCase process.");
            return s.toUpperCase();
    }
}