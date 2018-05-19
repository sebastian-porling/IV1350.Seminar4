package integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;

import static org.junit.Assert.*;

class ItemDTOTest {
    private ItemDTO itemToTest;

    @BeforeEach
    void setUp() {
        this.itemToTest = new ItemDTO(new Amount(20), "Paprika", new Amount(5));
    }

    @AfterEach
    void tearDown() {
        this.itemToTest = null;
    }

    @Test
    void testToString() {
        Amount price = new Amount(10);
        Amount tax = new Amount(5);
        String itemName = "Tomat";
        ItemDTO itemDTO = new ItemDTO(price, itemName, tax);
        String expectedString = "item name: " + itemName + "\t" + "price: " + price + "\t" + "tax amount: " + tax + "\t";
        String resultString = itemDTO.toString();
        assertEquals("ItemDTO String is not the same as other String with same content.", expectedString, resultString);
    }

    @Test
    void testToStringWithEmptyItemNameAndZeroAmounts() {
        Amount price = new Amount(0);
        Amount tax = new Amount(0);
        String itemName = "";
        ItemDTO itemDTO = new ItemDTO(price, itemName, tax);
        String expectedString = "item name: " + itemName + "\t" + "price: " + price + "\t" + "tax amount: " + tax + "\t";
        String resultString = itemDTO.toString();
        assertEquals("ItemDTO String is not the same as other String with same content.", expectedString, resultString);
    }

    @Test
    void testToStringWithEmptyItemNameAndMaximumAndMinimum() {
        Amount price = new Amount(Integer.MAX_VALUE);
        Amount tax = new Amount(Integer.MIN_VALUE);
        String itemName = "";
        ItemDTO itemDTO = new ItemDTO(price, itemName, tax);
        String expectedString = "item name: " + itemName + "\t" + "price: " + price + "\t" + "tax amount: " + tax + "\t";
        String resultString = itemDTO.toString();
        assertEquals("ItemDTO String is not the same as other String with same content.", expectedString, resultString);
    }

    @Test
    void testToStringNotEqualStrings() {
        Amount price = new Amount(10);
        Amount tax = new Amount(5);
        String itemName = "Tomat";
        ItemDTO itemDTO = new ItemDTO(price, itemName, tax);
        String expectedString = "item nme: " + itemName + "\t" + "prie: " + price + "\t" + "tx amunt: " + tax + "\t";
        String resultString = itemDTO.toString();
        assertNotEquals("ItemDTO String is not the same as other String with same content.", expectedString, resultString);
    }

    @Test
    void testEquals() {
        Amount price = new Amount(20);
        Amount tax = new Amount(5);
        String itemName = "Paprika";
        ItemDTO otherItemDTO = new ItemDTO(price, itemName, tax);
        boolean expectedResult = true;
        boolean result = itemToTest.equals(otherItemDTO);
        assertEquals("ItemDTOs instances with the same state are not equal.", expectedResult, result);
    }

    @Test
    void testNotEquals() {
        Amount price = new Amount(10);
        Amount tax = new Amount(2);
        String itemName = "Apelsin";
        ItemDTO otherItemDTO = new ItemDTO(price, itemName, tax);
        boolean expectedResult = false;
        boolean result = itemToTest.equals(otherItemDTO);
        assertEquals("ItemDTOs instances with the different state are equal.", expectedResult, result);
    }

    @Test
    void testEqualsJavaObject() {
        Object otherObject = new Object();
        boolean expectedResult = false;
        boolean result = itemToTest.equals(otherObject);
        assertEquals("ItemDTO instance equal to java.lang.Object.", expectedResult, result);
    }

    @Test
    void testEqualsNull() {
        Object otherObject = null;
        boolean expectedResult = false;
        boolean result = itemToTest.equals(otherObject);
        assertEquals("ItemDTO instance equal to null", expectedResult, result);
    }


}