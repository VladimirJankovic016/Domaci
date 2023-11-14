package rs.ac.ni.pmf.oop2;

public class Encoder_toLowerCase implements Encoder {
        @Override
        public String encode(final String s){
            System.out.println("Encoder_toLowerCase process.");
            return s.toLowerCase();
        }
    }