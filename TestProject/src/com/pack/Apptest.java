package com.pack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.pack.MainClass;

public class Apptest {
	static MainClass obj=null;
@BeforeAll
public static void before1()
{
	obj=new MainClass();
}
	@Test
	@DisplayName("Adding 2 nos")
	public void testAddMeth()
	{
		
		int actual=obj.addMeth(5, 6);
		int expected=11;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testcheckString()
	{
		
		boolean b=obj.checkString("Anil");
		assertTrue(b);
		
	}
	@ParameterizedTest
	@ValueSource(strings= {"ram","annu","banu"})
	public void testcheckString(String str)
	{
		
		boolean b=obj.checkString(str);
		assertTrue(b);
		
	}

public boolean checkString(String s)
	{
		if(s.length()%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	@Disabled
	public void methUnderTesting()
	{
		System.out.println("hello");
		
	}
	
}
