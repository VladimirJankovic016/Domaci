package rs.ac.ni.pmf.oop2;

public class Database_Storer implements Storer {
    @Override
    public void store(final String s) {
        System.out.println("Database storing: " + s);
    }
}