package app;

public class Smartphone implements Telephone {
    private String number;
    private boolean isRinging;

    public Smartphone(String number) {
        this(number, false);
        this.number = number;
    }

    public Smartphone(String number, boolean isRinging) {
        this.number = number;
        this.isRinging = isRinging;
    }

	@Override
	public void powerOn() {
	}

	@Override
	public void dial(String number) {
        System.out.println("Calling " + number);
	}

	@Override
	public void answer() {
        System.out.println("Answering call");
	}

	@Override
	public boolean isRinging() {
        return isRinging;
	}
}