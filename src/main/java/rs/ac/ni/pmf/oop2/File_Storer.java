package rs.ac.ni.pmf.oop2;

public class File_Storer implements Storer {
    @Override
    public void store(final String s) {
        System.out.println("File storing: " + s);
    }
}