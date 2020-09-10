package pt1;

public abstract class Paperdecorator implements PaperInterface { 
	//used for additional services to paper such as lamination
	public String getDetails() {
		return getDetails();
	}
	public double cost() {
		return cost();
	}
	public String additionalInformation() {
		return additionalInformation();
	}
}
