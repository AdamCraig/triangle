import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isEquilateral_allSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }
}
