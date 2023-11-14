package rs.ac.ni.pmf.oop2;

public class Network_Storer implements Storer {
    @Override
    public void store(final String s) {
        System.out.println("Network storing: " + s);
    }
}