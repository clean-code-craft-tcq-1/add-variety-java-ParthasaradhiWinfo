package TypewiseAlert.cooling;

import TypewiseAlert.breach.BreachStrategy;
import TypewiseAlert.breach.BreachType;

public class HIActiveCooling implements CoolingStrategy {

	private BreachStrategy breachStrategy;

	public HIActiveCooling(BreachStrategy breachStrategy) {
		this.breachStrategy = breachStrategy;
	}

	@Override
	public BreachType classifyTemperatureBreach(double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 45;
		
		return breachStrategy.limitType(temperatureInC, lowerLimit, upperLimit);
	}

}
