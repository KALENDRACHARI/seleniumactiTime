package src.actitime.textscript;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Taskmodule {
	@Test
	public void createTask() {
			Reporter.log("createTask",true);
		}
		@Test
		public void modifyTask() {
			Reporter.log("modifyTask",true);
		}
		@Test
		public void deleteTask() {
			Reporter.log("deleteTask",true);
		}

}
