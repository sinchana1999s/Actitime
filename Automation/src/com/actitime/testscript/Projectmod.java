package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Projectmod extends BaseClass
{

	
		@Test
		public void createproject()
		{
			Reporter.log("createproject",true);		
		}
		@Test
		public void modifyproject()
		{
			Reporter.log("modifyproject",true);		
		}
		@Test
		public void deleteproject()
		{
			Reporter.log("deleteproject",true);		
		}
		

}
