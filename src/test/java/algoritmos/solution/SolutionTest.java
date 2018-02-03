package algoritmos.solution;

import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setup(){
    solution = new Solution();
  }

  @Test
  public void foo(){
    //repace with real test case
    assertThat(solution.process(null)).isEqualTo("out");
  }

}
