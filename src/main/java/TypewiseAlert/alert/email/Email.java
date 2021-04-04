package TypewiseAlert.alert.email;

import TypewiseAlert.breach.BreachType;

public class Email {

	private EmailStrategy emailStrategy;
	
	public Email(EmailStrategy emailStrategy) {
		this.emailStrategy = emailStrategy;
	}
	
	public void executeEmail() {
		this.emailStrategy.sendAlert();
	}
}
