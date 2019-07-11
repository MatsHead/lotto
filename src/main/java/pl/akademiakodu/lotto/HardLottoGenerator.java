package pl.akademiakodu.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HardLottoGenerator implements LottoGenerator{
    @Override
    public List<Integer> generate() {
        Set<Integer> numbers = new TreeSet<>();

        while (numbers.size()<6){
            int number = (int)(Math.random()*49) + 1;
            numbers.add(number);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        return list;
    }

    @Override
    public String generateDescription() {
        return generate().toString();
    }

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new HardLottoGenerator();
        lottoGenerator.generate();

    }
}
