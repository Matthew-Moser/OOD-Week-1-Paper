package pt1;

public class Lamination extends Paperdecorator {
	public String getDetails() {
		return "an extra process that can be applied to your paper. Send us your print and we can make sure your physical copy is protected!";
	}
	public double cost() {
		return 10.00;
	}
	public String additionalInformation() {
		return "Expect around 2-3 weeks for turn around time";
	}
}
