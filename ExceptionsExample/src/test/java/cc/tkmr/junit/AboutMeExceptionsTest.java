package cc.tkmr.junit;


import cc.tkmr.AboutMeExceptions;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AboutMeExceptionsTest {

    @Test
    public void testGetNome_validName_returnsName() {
        Scanner scanner = new Scanner("John");
        String name = AboutMeExceptions.getNome(scanner);
        assertEquals("John", name);
    }

    @Test
    public void testGetNome_invalidName_throwsException() {
        Scanner scanner = new Scanner("Jo");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getNome(scanner));
    }

    @Test
    public void testGetNome_emptyName_throwsException() {
        Scanner scanner = new Scanner("");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getNome(scanner));
    }

    @Test
    public void testGetNome_nullName_throwsException() {
        Scanner scanner = null;
        assertThrows(NullPointerException.class, () -> AboutMeExceptions.getNome(scanner));
    }

    @Test
    public void testGetSobrenome_validSurname_returnsSurname() {
        Scanner scanner = new Scanner("Doe");
        String surname = AboutMeExceptions.getSobrenome(scanner);
        assertEquals("Doe", surname);
    }

    @Test
    public void testGetSobrenome_invalidSurname_throwsException() {
        Scanner scanner = new Scanner("Do");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getSobrenome(scanner));
    }

    @Test
    public void testGetIdade_validAge_returnsAge() {
        Scanner scanner = new Scanner("25");
        int age = AboutMeExceptions.getIdade(scanner);
        assertEquals(25, age);
    }

    @Test
    public void testGetIdade_invalidAge_throwsException() {
        Scanner scanner = new Scanner("9");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getIdade(scanner));
    }

    @Test
    public void testGetIdade_emptyAge_throwsException() {
        Scanner scanner = new Scanner("");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getIdade(scanner));
    }
    @Test
    public void testGetIdade_nullAge_throwsException() {
        Scanner scanner = null;
        assertThrows(NullPointerException.class, () -> AboutMeExceptions.getIdade(scanner));
    }

    @Test
    public void testGetAltura_validHeight_returnsHeight() {
        Scanner scanner = new Scanner("1.75");
        double height = AboutMeExceptions.getAltura(scanner);
        assertEquals(1.75, height, 0.01);
    }

    @Test
    public void testGetAltura_invalidHeight_throwsException() {
        Scanner scanner = new Scanner("-1");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getAltura(scanner));
    }

    @Test
    public void testGetAltura_emptyHeight_throwsException() {
        Scanner scanner = new Scanner("");
        assertThrows(NoSuchElementException.class, () -> AboutMeExceptions.getAltura(scanner));
    }

    @Test
    public void testGetAltura_nullHeight_throwsException() {
        Scanner scanner = null;
        assertThrows(NullPointerException.class, () -> AboutMeExceptions.getAltura(scanner));
    }
}
