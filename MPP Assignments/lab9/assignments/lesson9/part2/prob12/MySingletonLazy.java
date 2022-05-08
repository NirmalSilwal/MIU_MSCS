package lab9.assignments.lesson9.part2.prob12;

import java.util.Optional;

public class MySingletonLazy {

	private static MySingletonLazy instance = null;
	
	private MySingletonLazy() {}
	
	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElseGet(() -> new MySingletonLazy());
	}
}
