import com.conestoga.model.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleUnitTest {
    @Test
    public void DefaultConstructor_BlankValue_SetsDefaultValues() {
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        int length = rectangle.getLength();
        int width = rectangle.getWidth();

        //Assert
        assertEquals(1, length);
        assertEquals(1,width);
    }

    @Test
    public void ParameterizedConstructor_ValidValue_SetsPassedValues() {
        //Arrange
        int expectedLength = 10;
        int expectedWidth = 50;

        //Act
        Rectangle rectangle = new Rectangle(expectedLength, expectedWidth);

        //Assert
        assertEquals(expectedLength, rectangle.getLength());
        assertEquals(expectedWidth, rectangle.getWidth());
    }

    @Test
    public void GetArea_ValidValues_ReturnsAreaSuccessfully() {
        //Arrange
        int length = 10;
        int width = 12;
        int expectedArea = 10 * 12;

        //Act
        Rectangle rectangle = new Rectangle(length, width);
        int actualArea = rectangle.getArea();

        //Assert
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void GetPerimeter_ValidValues_ReturnsPerimeterSuccessfully() {
        //Arrange
        int length = 10;
        int width = 12;
        int expectedPerimeter = 10 + 10 + 12 + 12;

        //Act
        Rectangle rectangle = new Rectangle(length, width);
        int actualPerimeter = rectangle.getPerimeter();

        //Assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void GetWidth_ValidValues_ReturnsWidthSuccessfully() {
        //Arrange
        int expectedWidth = 10;

        //Act
        Rectangle rectangle = new Rectangle(20, expectedWidth);

        //Assert
        assertEquals(expectedWidth, rectangle.getWidth());
    }

    @Test
    public void SetWidth_ValidValues_SetsWidthSuccessfully() {
        //Arrange
        int width = 10;
        int newWidth = 15;

        //Act
        Rectangle rectangle = new Rectangle(10, width);
        rectangle.setWidth(newWidth);

        //Assert
        assertNotEquals(width, rectangle.getWidth());
        assertEquals(newWidth, rectangle.getWidth());
    }

    @Test
    public void GetLength_ValidValues_ReturnsLengthSuccessfully() {
        //Arrange
        int expectedLength = 90;

        //Act
        Rectangle rectangle = new Rectangle(expectedLength, 100);

        //Assert
        assertEquals(expectedLength, rectangle.getLength());
    }

    @Test
    public void SetLength_ValidValues_SetsLengthSuccessfully() {
        //Arrange
        int length = 100;
        int newLength = 150;

        //Act
        Rectangle rectangle = new Rectangle(length, 30);
        rectangle.setLength(newLength);

        //Assert
        assertNotEquals(length, rectangle.getLength());
        assertEquals(newLength, rectangle.getLength());
    }
}