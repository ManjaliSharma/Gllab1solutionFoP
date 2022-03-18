package com.gl.labsolution1;

public class EmailApp {
	
	//Email Application Administration
	
	public class Email {
		
		private String firstName;
		private String lastName;
		
		//Parameterized constructor
		public Email (String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		/**
		 * @return - This is a getter method and it returns employee,s firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * @return - This is a setter method used to set employee's lastName
		 * *@harshit firstName
		 */
		public void setFirstName (String firstName) {
			this.firstName = firstName;
		}
		/**@return - This is a getter method and it returns employee's lastName
		 */
		public String getLastName() {
			return lastName;
		}
		
		/**@return - This is a setter method used to set employee's lastName
		 * *@harshit lastName
		 */
		public void setLastName (String lastName) {
			this.lastName = lastName;
		}
		
		public String toString () {
			return "Employee [firstName =" + fisrtName + ", lastName=" + lastName +"]";
		}
		}
		
		
		
	}


