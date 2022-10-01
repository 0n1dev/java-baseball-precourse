package baseball.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumbers {

    private final List<BaseballNumber> numbers= new ArrayList<>();

    public BaseballNumbers(List<Integer> numbers) {
        validateSize(numbers);

        for (Integer i : numbers) {
            BaseballNumber baseballNumber = new BaseballNumber(i);
            validateDuplicateNumber(baseballNumber);
            this.numbers.add(baseballNumber);
        }
    }

    private void validateSize(final List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("야구 게임 숫자 리스트는 3자리 숫자 입니다.");
        }
    }

    private void validateDuplicateNumber(final BaseballNumber baseballNumber) {
        if (numbers.contains(baseballNumber)) {
            throw new IllegalArgumentException("중복 된 숫자는 들어올 수 없습니다.");
        }
    }

    public List<BaseballNumber> getNumbers() {
        return numbers;
    }
}
