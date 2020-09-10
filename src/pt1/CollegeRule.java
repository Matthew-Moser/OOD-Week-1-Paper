package pt1;

public class CollegeRule implements PaperInterface {

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "College ruled paper has 9⁄32 in (7.1 mm) spacing between horizontal lines, with a vertical margin drawn about 1 1⁄4 inches (32 mm) from the left-hand edge of the page";
		//description taken from wikipedia
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 6.00;
		//price is non-important
	}

}
