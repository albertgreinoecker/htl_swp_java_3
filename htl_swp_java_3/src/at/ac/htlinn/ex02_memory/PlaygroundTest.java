package at.ac.htlinn.ex02_memory;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PlaygroundTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	private int cnt(Playground p, int currPair, int sizeX, int sizeY)
	{
		int cnt = 0;
		for (int i = 0; i < sizeX;i++)
		{
			for (int j = 0; j < sizeY;j++)
			{
				Card c = p.get(i, j);
				if (c instanceof RegularCard)
				{
					if (currPair == ((RegularCard)c).getValue())
					{
						cnt++;
					}
						
				}
			}			
		}
		return cnt;
	}
	
	@RepeatedTest(1000)
	void testPlayground() {
		int noPairs = 10;
		int sizeX = 5;
		int sizeY = 5;
		Playground p = new Playground(sizeX, sizeY, noPairs, 2);
		System.out.println(p);
		for (int i = 0; i < noPairs;i++)
		{
			Assert.assertEquals(cnt(p,i,sizeX, sizeY),2);
		}
	}

	@Test
	void testIsPair()
	{
		Playground p = null;
		try {
			p = PlaygroundIO.read("testdata/p1.txt",5,5);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(p);
		Assert.assertTrue(p.isPair(1, 0, 1, 1));
		Assert.assertFalse(p.isPair(0, 0, 0, 1));
		Assert.assertFalse(p.isPair(0, 2, 0, 1));
	}
}
