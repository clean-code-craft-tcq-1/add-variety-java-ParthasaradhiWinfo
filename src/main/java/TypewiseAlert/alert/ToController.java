package TypewiseAlert.alert;


import TypewiseAlert.breach.BreachType;

public class ToController implements AlertStrategry {

	@Override
	public void sendAlert(BreachType breachType) {
		int header = 0xfeed;
		System.out.printf("%i : %i\n", header, breachType);

	}

}
