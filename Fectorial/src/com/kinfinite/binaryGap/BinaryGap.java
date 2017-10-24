package com.kinfinite.binaryGap;

public class BinaryGap {

	static int currentCount = 0;

	public static void main(String[] args) {

		System.out.println(solution(Integer.parseInt(args[0])));
	}

	public static int solution(int N) {
		int count = 0;
		System.out.println(Integer.toBinaryString(N));
		count = Integer.toBinaryString(N).chars().reduce(0, (t, _char) -> findZeroInString.process(t, (char) _char));
		return count;
	}

	interface processBinary {

		public int process(int N, char _char);
	}

	private static processBinary findZeroInString = (finalCount, _char) -> {
		if (_char == '0') {
			currentCount++;
		} else {
			finalCount = currentCount > finalCount ? currentCount : finalCount;
			currentCount = 0;
		}
		return finalCount;
	};
}
