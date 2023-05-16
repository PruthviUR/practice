package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iacsd.Customer;
import com.iacsd.ServicePlan;
import static utils.CustomerValidationRules.validateAllInputs;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// create empty AL to hold customer refs
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " + "4. Change Password 5.Unsubscribe customer");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("customer registered....");

						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
		}

	}

}
