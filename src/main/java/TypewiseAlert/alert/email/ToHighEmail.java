package TypewiseAlert.alert.email;

import TypewiseAlert.breach.BreachType;

public class ToHighEmail implements EmailStrategy {

	@Override
	public void sendAlert() {
		String recepient = "a.b@c.com";
		System.out.printf("To: %s\n", recepient);
		System.out.println("Hi, the temperature is too high\n");

	}

}
