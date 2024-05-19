package practice;

import java.util.function.Function;

public class FunctionImplSample {

	public static void main(String[] args) {
		Function<Integer, Integer> f = new FunctionImpl();
        System.out.println(f.apply(2));
    }

    private static class FunctionImpl implements Function<Integer, Integer> {

    	@Override
        public Integer apply(Integer i) {
            return i * 2;
        }

	}

}
