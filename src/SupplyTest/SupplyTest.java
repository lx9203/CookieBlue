package SupplyTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

import function.*;
import supply.*;

public class SupplyTest {
	private SupplyDAO sDao;
	
	@Before
	public void setUp() {
		sDao = new SupplyDAO();
		System.out.println("필드 초기화");
	}
	
	@Test
	public void countTest() {
		assertEquals(10, sDao.count("A"));
		System.out.println("count()");
	}
	
	@Test
	public void selectQuantity() {
		assertEquals(100, sDao.selectQuantity("A101"));
		System.out.println("selectQuantity()");
	}
	
	@Test
	public void searchsCode() {
		assertEquals("", sDao.searchsCode("A"));
		System.out.println("searchsCode()");
	}
	
	@Test
	public void searchsCodeBySupplier() {
		assertEquals("", sDao.searchsCodeBySupplier("A"));
		System.out.println("searchsCodeBySupplier()");
	}
	
	@Test
	public void sCodeCreate() {
		CustomerFunction fc = new CustomerFunction();
		assertEquals("2019-05-23", fc.sCodeCreate("A101"));
	}

	@After
	public void end() {
		System.out.println("테스트 완료");
	}
}
