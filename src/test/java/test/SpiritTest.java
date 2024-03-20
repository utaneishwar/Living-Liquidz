package test;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagess.Spirit;
import utility.Excel_Reader;
public class SpiritTest extends BaseTest
{
 

	@Test(priority=4)
	public void selectProduct()
	{
       spirit.selectSpirits(); 
	
	}
	@Test(priority=5)
	public void SortByHighPrice() throws Exception, IOException 
	{
      spirit.sortDropdown(Excel_Reader.readData(1, 0)); 
		
	}
	

	@Test(priority=6)
	public void SortByAlphabates() throws Exception, IOException 
	{
    spirit.sortDropdown(Excel_Reader.readData(2, 0));
		
	}
	@Test(priority=7)
	public void verifyurlofpage() throws Exception, IOException
	{
	    String  url = Spirit.getcurrenturlofpage();
	    String urlfromexcel = Excel_Reader.readData(0, 0);
	    Assert.assertEquals(url, urlfromexcel);
	}
	
	
}
