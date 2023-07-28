package src.actitime.textscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Eventmodule {
	@Test
	public void createEvent() {
			Reporter.log("createEvent",true);
		}
		@Test
		public void modifyEvent() {
			Reporter.log("modifyEvent",true);
		}
		@Test
		public void deleteEvent() {
			Reporter.log("deleteEvent",true);
		}

}
