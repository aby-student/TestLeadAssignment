package com.assignment.testLead.EmployeeDB;

import org.apache.http.entity.ContentType;

public class EmployeeStepDefs {

	Response response;

	@When("^User calls employee database API$")
	public void user_calls_employee_database_API() {
		response = given().when().get("http://dummy.restapiexample.com/api/v1/employees").then()
				.contentType(ContentType.JSON).extract().response();
	}

	@When("^User calls employee database API using \"(.*)\"$")
	public void getEmployeeDetailsbyID(String ID) {
		requestURL = "http://dummy.restapiexample.com/api/v1/employees/" + ID;
		response = given().when().get(requestURL).then().contentType(ContentType.JSON).extract().response();

	}

	@Then("^All employee details are returned$")
	public void all_employee_details_are_returned() {
		assertNotNull(response);
	}
	
	@Then("^Employee details is returned$")
	public void validateEmployeeDetails()
	{
		assertNotNull(response);
	}

}
