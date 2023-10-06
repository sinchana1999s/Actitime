package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
public class Taskmod extends BaseClass

{
		@Test
		public void createtask()
		{
			Reporter.log("createtask",true);		
		}
		@Test
		public void modifytask()
		{
			Reporter.log("modifytask",true);		
		}
		@Test
		public void deletetask()
		{
			Reporter.log("deletetask",true);		
		}
		

}
