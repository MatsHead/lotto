package pl.akademiakodu.lotto;

import java.util.List;

public interface LottoGenerator {
    List<Integer> generate();
    String generateDescription();

}
