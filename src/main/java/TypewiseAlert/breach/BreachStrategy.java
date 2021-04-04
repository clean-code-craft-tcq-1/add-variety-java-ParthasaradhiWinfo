package TypewiseAlert.breach;

public interface BreachStrategy {

	public BreachType limitType(double value, double lowerLimit, double upperLimit);
	
}
