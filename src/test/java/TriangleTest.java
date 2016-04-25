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

  @Test
  public void isEquilateral_allSidesNotEqual_false() {
    Triangle testTriangle = new Triangle(2, 3, 2);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_exactlyTwoSidesEqual_true() {
    Triangle testTriangle = new Triangle(4, 2, 4);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isIsosceles_notExactlyTwoSidesEqual_false() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_noSidesEqual_true() {
    Triangle testTriangle = new Triangle(4, 3, 5);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isScalene_oneOrMoreSidesEqual_false() {
    Triangle testTriangle = new Triangle(4, 3, 4);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void isNotATriangle_sumOfAnyTwoSidesLessThanLengthOfThirdSide_true() {
    Triangle testTriangle = new Triangle(4, 3, 8);
    assertEquals(true, testTriangle.isNotATriangle());
  }
}
