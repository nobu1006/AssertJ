package sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		Sample sample = new Sample();
		assertThat(sample.add(1, 1)).isEqualTo(2);
	}

}
