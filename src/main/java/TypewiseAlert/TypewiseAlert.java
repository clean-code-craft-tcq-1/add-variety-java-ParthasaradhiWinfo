package TypewiseAlert;

import java.util.HashMap;
import java.util.Map;

import TypewiseAlert.alert.Alert;
import TypewiseAlert.alert.AlertTargetType;
import TypewiseAlert.alert.EmailAlerts;
import TypewiseAlert.alert.ToController;
import TypewiseAlert.breach.BreachStrategy;
import TypewiseAlert.breach.BreachType;
import TypewiseAlert.cooling.Cooling;
import TypewiseAlert.cooling.CoolingType;
import TypewiseAlert.cooling.HIActiveCooling;
import TypewiseAlert.cooling.MidActiveCooling;
import TypewiseAlert.cooling.PassiveCooling;

public class TypewiseAlert {

	private BreachStrategy breachStrategy;

	private Map<CoolingType, Cooling> coolingMap = new HashMap<>();

	private Map<AlertTargetType, Alert> alertMap = new HashMap<>();

	public TypewiseAlert(BreachStrategy breachStrategy) {
		this.breachStrategy = breachStrategy;

		this.coolingMap.put(CoolingType.PASSIVE_COOLING, new Cooling(new PassiveCooling(breachStrategy)));
		this.coolingMap.put(CoolingType.HI_ACTIVE_COOLING, new Cooling(new HIActiveCooling(breachStrategy)));
		this.coolingMap.put(CoolingType.MED_ACTIVE_COOLING, new Cooling(new MidActiveCooling(breachStrategy)));

		this.alertMap.put(AlertTargetType.TO_CONTROLLER, new Alert(new ToController()));
		this.alertMap.put(AlertTargetType.TO_EMAIL, new Alert(new EmailAlerts()));
	}

	public BreachType inferBreach(double value, double lowerLimit, double upperLimit) {

		return breachStrategy.limitType(value, lowerLimit, upperLimit);

	}

	public BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {

		return this.coolingMap.get(coolingType).executeCoolingStrategy(temperatureInC);
	}

	public class BatteryCharacter {
		public CoolingType coolingType;
		public String brand;
	}

	public void checkAndAlert(AlertTargetType alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

		BreachType breachType = classifyTemperatureBreach(batteryChar.coolingType, temperatureInC);
		this.alertMap.get(alertTarget).executeAlertStrategry(breachType);
	}
}
