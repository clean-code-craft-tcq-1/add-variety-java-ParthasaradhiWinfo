package TypewiseAlert.cooling;

import TypewiseAlert.breach.BreachStrategy;
import TypewiseAlert.breach.BreachType;

public class PassiveCooling implements CoolingStrategy {

	private BreachStrategy breachStrategy;
	
	public PassiveCooling(BreachStrategy breachStrategy) {
		this.breachStrategy = breachStrategy;
	}
	
	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 35;
		
		return breachStrategy.limitType(temperatureInC, lowerLimit, upperLimit);
	}

}
