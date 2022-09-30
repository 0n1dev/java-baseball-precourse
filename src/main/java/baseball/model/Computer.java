package baseball.model;

import static baseball.constants.BaseballConstants.*;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

	private final BaseballNumbers numbers;

	public Computer() {
		this.numbers = new BaseballNumbers(this.generateRandomNumbers());
	}

	private List<Integer> generateRandomNumbers() {
		return Randoms.pickUniqueNumbersInRange(MIN_BALL_NUMBER, MAX_BALL_NUMBER, MAX_BALL_COUNT);
	}
}
