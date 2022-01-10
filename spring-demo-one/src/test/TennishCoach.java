package test;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennishCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your bachhand volley";
	}

}
