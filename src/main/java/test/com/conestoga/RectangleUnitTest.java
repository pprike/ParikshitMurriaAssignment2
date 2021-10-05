package com.conestoga;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleUnitTest {

    /************ Parameterized Constructor **/
    @Test
    public void ParameterizedConstructor_InvalidLength_ThrowsException() {
        //Arrange
        int length = -10;
        int width = 50;

        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            //Act
            Rectangle rectangle = new Rectangle(length, width);
        });
    }

    @Test
    public void ParameterizedConstructor_InvalidWidth_ThrowsException() {
        //Arrange
        int length = 10;
        int width = -50;

        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            //Act
            Rectangle rectangle = new Rectangle(length, width);
        });
    }


    /************  GET Area ***********/
    @Test
    public void GetArea_ValidValues_ReturnsAreaSuccessfully() {
        //Arrange
        int length = 10;
        int width = 12;
        int expectedArea = 10 * 12;
        Rectangle rectangle = new Rectangle(length, width);

        //Act
        int actualArea = rectangle.getArea();

        //Assert
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void GetArea_DefaultConstructor_ReturnsAreaSuccessfully() {
        //Arrange
        int expectedArea = 1 * 1;
        Rectangle rectangle = new Rectangle();

        //Act
        int actualArea = rectangle.getArea();

        //Assert
        assertEquals(expectedArea, actualArea);
    }


    /************ GET Perimeter ***********/
    @Test
    public void GetPerimeter_ValidValues_ReturnsPerimeterSuccessfully() {
        //Arrange
        int length = 10;
        int width = 12;
        int expectedPerimeter = 2 * (10 + 12);
        Rectangle rectangle = new Rectangle(length, width);

        //Act
        int actualPerimeter = rectangle.getPerimeter();

        //Assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void GetPerimeter_DefaultConstructor_ReturnsPerimeterSuccessfully() {
        //Arrange
        int expectedPerimeter =2 * (1 + 1);
        Rectangle rectangle = new Rectangle();

        //Act
        int actualPerimeter = rectangle.getPerimeter();

        //Assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }


    /************ GET width ***********/
    @Test
    public void GetWidth_ValidValue_ReturnsWidthSuccessfully() {
        //Arrange
        int expectedWidth = 10;
        Rectangle rectangle = new Rectangle(20, expectedWidth);

        //Act
        int width = rectangle.getWidth();

        //Assert
        assertEquals(expectedWidth, width);
    }

    @Test
    public void GetWidth_DefaultConstructor_ReturnsDefaultValue() {
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        int width = rectangle.getWidth();

        //Assert
        assertEquals(1,width);
    }


    /************ SET Width ***********/
    @Test
    public void SetWidth_ValidValue_SetsWidthSuccessfully() {
        //Arrange
        int width = 10;
        int newWidth = 15;
        Rectangle rectangle = new Rectangle(10, width);

        //Act
        rectangle.setWidth(newWidth);
        int actualWidth =  rectangle.getWidth();

        //Assert
        assertNotEquals(width, actualWidth);
        assertEquals(newWidth, actualWidth);
    }

    @Test
    public void SetWidth_UpdateDefaultWidth_SetsWidthSuccessfully() {
        //Arrange
        int defaultWidth = 1;
        int newWidth = 15;
        Rectangle rectangle = new Rectangle();

        //Act
        rectangle.setWidth(newWidth);
        int actualWidth =  rectangle.getWidth();

        //Assert
        assertNotEquals(defaultWidth, actualWidth);
        assertEquals(newWidth, actualWidth);
    }

    @Test
    public void SetWidth_InvalidValue_ThrowsException() {
        //Arrange
        int width = 10;
        int newWidth = -15;
        Rectangle rectangle = new Rectangle(10, width);

        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            //Act
            rectangle.setWidth(newWidth);
        });
    }


    /************ GET Length ***********/
    @Test
    public void GetLength_ValidValue_ReturnsLengthSuccessfully() {
        //Arrange
        int expectedLength = 90;
        Rectangle rectangle = new Rectangle(expectedLength, 100);

        //Act
        int actualLength = rectangle.getLength();

        //Assert
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void GetLength_DefaultConstructor_ReturnsDefaultValue() {
        //Arrange
        Rectangle rectangle = new Rectangle();

        //Act
        int length = rectangle.getLength();

        //Assert
        assertEquals(1, length);
    }


    /************ SET Length ***********/
    @Test
    public void SetLength_ValidValue_SetsLengthSuccessfully() {
        //Arrange
        int length = 100;
        int newLength = 150;
        Rectangle rectangle = new Rectangle(length, 30);

        //Act
        rectangle.setLength(newLength);
        int actualLength = rectangle.getLength();

        //Assert
        assertNotEquals(length, actualLength);
        assertEquals(newLength, actualLength);
    }

    @Test
    public void SetLength_UpdateDefaultLength_SetsLengthSuccessfully() {
        //Arrange
        int newLength = 150;
        int defaultLength = 1;
        Rectangle rectangle = new Rectangle();

        //Act
        rectangle.setLength(newLength);
        int actualLength = rectangle.getLength();

        //Assert
        assertNotEquals(defaultLength, actualLength);
        assertEquals(newLength, actualLength);
    }

    @Test
    public void SetLength_InvalidValue_ThrowsException() {
        //Arrange
        int length = 100;
        int newLength = -150;
        Rectangle rectangle = new Rectangle(length, 30);

        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            //Act
            rectangle.setLength(newLength);
        });
    }
}