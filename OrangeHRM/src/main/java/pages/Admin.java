package pages;

import baseFunctions.Base;
import baseFunctions.Constants;
import pageObjects.Admin_PO;

public class Admin extends Base{

	Base base = new Base ();
	public void addUser ()
	{
		base.navigateToModule(Constants.ADMIN);
		base.click(Admin_PO.addBtn);
		base.selectValueFromAutosuggestionDropdown(Admin_PO.userRole, Admin_PO.userRoleDrpDwn, "Admin");
		base.selectValueFromAutosuggestionDropdown(Admin_PO.employeeName, Admin_PO.empDrowDown, "Odis");
		base.selectValueFromAutosuggestionDropdown(Admin_PO.empStatus, Admin_PO.empStatusDrpDwn, "Enabled");
		base.setValue(Admin_PO.userName, "Odis_4");
		base.setValue(Admin_PO.password, "Pankaj@123");
		base.setValue(Admin_PO.confirmPassword, "Pankaj@123");
		base.wait(Constants.med);
		base.click(Admin_PO.saveBtn);
		
			
	}
}
