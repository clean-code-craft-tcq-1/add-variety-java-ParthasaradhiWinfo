package TypewiseAlert.breach;

public class BreachStrategyImpl implements BreachStrategy   {

	@Override
	public BreachType limitType(double value, double lowerLimit, double upperLimit) {
		if(value < lowerLimit) {
	        return BreachType.TOO_LOW;
	      }
	      if(value > upperLimit) {
	        return BreachType.TOO_HIGH;
	      }
	      return BreachType.NORMAL;
	}

}
