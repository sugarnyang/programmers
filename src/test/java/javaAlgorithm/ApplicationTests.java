package javaAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ApplicationTests {

	@Test
	void contextLoads() {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};

		System.out.println(solution(participant, completion));
	}

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[completion.length];
	}
}
