package baseball.game;

import baseball.model.BaseballNumber;
import baseball.model.Result;
import java.util.List;

public class BaseballCompare {

    public Result compare(final List<BaseballNumber> inputPlayerNumbers, final List<BaseballNumber> resultPlayerNumbers) {
        validate(inputPlayerNumbers, resultPlayerNumbers);

        Result result = Result.nothing();
        for (int i = 0; i < inputPlayerNumbers.size(); i++) {
            result.add(this.compare(inputPlayerNumbers.get(i), resultPlayerNumbers.get(i), resultPlayerNumbers));
        }

        return result;
    }

    private void validate(List<BaseballNumber> inputPlayerNumbers, List<BaseballNumber> resultPlayerNumbers) {
        if (inputPlayerNumbers.size() != resultPlayerNumbers.size()) {
            throw new IllegalArgumentException("3자리 숫자만 입력이 가능합니다.");
        }
    }

    private Result compare(final BaseballNumber inputNumber, final BaseballNumber resultNumber, final List<BaseballNumber> resultPlayerNumbers) {
        if (inputNumber.equals(resultNumber)) {
            return Result.strike();
        }

        if (resultPlayerNumbers.contains(inputNumber)) {
            return Result.ball();
        }

        return Result.nothing();
    }
}
