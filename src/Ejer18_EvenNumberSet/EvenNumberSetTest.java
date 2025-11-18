package Ejer18_EvenNumberSet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class EvenNumberSetTest {

	@Test
	void testAddOnlyEvenNumbers() {
		Set<Integer> set = new EvenNumberSet(); 
		assertTrue(set.add(2));
		assertTrue(set.add(4));
		assertFalse(set.add(3)); //No se agrega
		assertEquals(2, set.size());
	}
	
	@Test
	void testNoDuplicates() {
		Set<Integer> set = new EvenNumberSet();
		assertTrue(set.add(2));
		assertFalse(set.add(2)); //No se agrega porque es un duplicado
		assertEquals(1, set.size());
	}
	
	
	@Test
	void testAddOnlyEvens() {
		Set<Integer> set = new EvenNumberSet();
		set.addAll(List.of(1,2,3,4,5,6));
		assertEquals(Set.of(2,4,6),set);
	}
}
