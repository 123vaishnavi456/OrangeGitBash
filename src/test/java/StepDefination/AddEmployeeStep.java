package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddEmployeePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStep extends BaseClass {

	static AddEmployeePage addEmp;
	@When("user should click on Add Employee button")
	public void user_should_click_on_add_employee_button() {

		 addEmp= new AddEmployeePage();
		 addEmp.clickAddEmployeeBtn();
	}
	@When("user enter firstName as {string} and lastName as {string}")
	public void user_enter_first_name_as_and_last_name_as(String Fname, String Lname) {
		addEmp.addEmployeeFunctionality(Fname, Lname);
	}
	@Then("user should click on save button")
	public void user_should_click_on_save_button() {
		addEmp.clickOnSaveBtn();
	}
}
