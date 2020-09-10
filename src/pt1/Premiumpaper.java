package pt1;

public class Premiumpaper implements PaperInterface {
	public String getDetails() {
		return "Special paper for flyers and large printouts";
	}
	public double cost() {
		return 20.00;
	}
}