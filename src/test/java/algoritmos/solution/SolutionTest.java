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
  public void oneDigitIsTidy(){
    assertThat(solution.isTidy(7)).isTrue();
  }

  @Test
  public void twoDigitAscendingIsTidy(){
    assertThat(solution.isTidy(17)).isTrue();
  }

  @Test
  public void twoDigitAscendingIsUntidy(){
    assertThat(solution.isTidy(10)).isFalse();
  }


  @Test
  public void sameDigitIsTidy(){
    assertThat(solution.isTidy(22)).isTrue();
  }

  @Test
  public void decrescenseDigitIsUntidy(){
    assertThat(solution.isTidy(32)).isFalse();
  }


  @Test
  public void lasTidy132(){
    assertThat(solution.lastTidy(132)).isEqualTo(129);
  }

  @Test
  public void isTidy132(){
    assertThat(solution.isTidy(132)).isFalse();
  }

  @Test
  public void isTidy219(){
    assertThat(solution.isTidy(219)).isFalse();
  }

  @Test
  public void lasTidy220(){
    assertThat(solution.lastTidy(220)).isEqualTo(199);
  }

  @Test
  public void lasTidy999(){
    assertThat(solution.lastTidy(1000)).isEqualTo(999);
  }

  @Test
  public void lasTidy7(){
    assertThat(solution.lastTidy(7)).isEqualTo(7);
  }

  @Test
  public void lasTidy111111111111111110(){
    assertThat(solution.lastTidy(111111111111111110L)).isEqualTo(99999999999999999L);
  }


  @Test
  public void lasTidy56481(){
    assertThat(solution.lastTidy(56481)).isEqualTo(55999);
  }

  @Test
  public void lasTidy56729(){
    assertThat(solution.lastTidy(56729)).isEqualTo(56699);
  }

  @Test
  public void firsDigit2Digits(){
    assertThat(solution.firstDigit(10)).isEqualTo(1);
  }

  @Test
  public void firsDigit3Digits(){
    assertThat(solution.firstDigit(310)).isEqualTo(3);
  }
}
