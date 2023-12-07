package SemDz2;

public class Frontender extends Developer implements FrontAction{
    @Override
    public void front() {
        System.out.println("Sleep");
    }

    @Override
    public void developGUI() {
        System.out.println("FrontEnder GUI method");
    }
}