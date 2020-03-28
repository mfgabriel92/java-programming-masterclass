package app;

public class TheHulk extends Movie {
	public TheHulk() {
		super("The Hulk");
    }

	@Override
	public String plot() {
        return "Plot of " + super.getName();
	}
}