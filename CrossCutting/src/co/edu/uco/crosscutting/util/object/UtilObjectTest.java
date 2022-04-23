package co.edu.uco.crosscutting.util.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilObjectTest {
    @Test
    void validateIfObjectIsNull(){
        //Arrange=Preparar los datos necesarios para la prueba
        Object values = null;
        //Act= Ejecutar la prueba
        boolean result= UtilObject.getUtilObject().isNull(values);
        //Assert= evaluar resultados de la prueba  contra lo realmente esperado
        assertTrue(result);

    }
    @Test
    void validateIfObjectIsNotNull(){
        //Arrange
        Object values = new Object();
        //Act
        boolean result= UtilObject.getUtilObject().isNull(values);
        //Assert
        assertFalse(result);
    }
    @Test
    void validateIfNotNullObjectIsEqualsToOriginal(){
        //Arrange
        Object values = new Object();
        Object defaultValue = new Object();
        //Act
        Object result= UtilObject.getUtilObject().getDefault(values,defaultValue);
        //Assert
        assertTrue(values.equals(result));
    }

    @Test
    void validateIfObjectIsEqualsToDefaultObjectWhenOriginalObjectsIsNull(){
        //Arrange
        Object values = new Object();
        Object defaultValue = new Object();
        //Act
        Object result= UtilObject.getUtilObject().getDefault(values,defaultValue);
        //Assert
        assertTrue(values.equals(result));
    }

}