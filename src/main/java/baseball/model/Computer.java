package baseball.model;

import static baseball.constants.BaseballConstants.*;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer extends Player {

	private Computer(List<Integer> numbers) {
		 super(numbers);
	}

	public static Computer create() {
		final List<Integer> numbers =
			Randoms.pickUniqueNumbersInRange(MIN_BALL_NUMBER, MAX_BALL_NUMBER, MAX_BALL_COUNT);

		return new Computer(numbers);
	}
}
