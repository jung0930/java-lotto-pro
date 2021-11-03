package lotto.domain.startegy.generationstrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class AutoNumberGenerationStrategy implements NumberGenerationStrategy {

    private static final int LIMIT_SIZE = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private static final List<Integer> lottoNumber =
            IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER)
                    .boxed()
                    .collect(Collectors.toList());

    public List<Integer> generateLottoNumbers() {
        Collections.shuffle(lottoNumber);
        List<Integer> pickedNumber = new ArrayList<>();

        for (int i = 0; i < LIMIT_SIZE; i++) {
            pickedNumber.add(lottoNumber.get(i));
        }

        Collections.sort(pickedNumber);

        return pickedNumber;
    }

}
