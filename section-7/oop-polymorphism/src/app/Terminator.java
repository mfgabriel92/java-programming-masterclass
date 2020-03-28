package app;

public class Terminator extends Movie {
    public Terminator() {
        super("Terminator");
    }

	@Override
	public String plot() {
        return "Plot of " + super.getName();
	}
}