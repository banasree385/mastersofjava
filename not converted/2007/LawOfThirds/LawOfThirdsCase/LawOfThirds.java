/**
 * The Law of Thirds states that the cash flow generated by a fully assigned 
 * employee can be divided into 3 equal parts :
 * - Salary.
 * - Overhead.
 * - Profit.
 * Using this knowledge you can estimate the salary based on the generated
 * cash flow. Also you can estimate the profitability of the company.
 */
public interface LawOfThirds {

	/**
	 * Estimates your salary using the law of thirds.
	 * @param hoursAWeek the nr of hours a week you're working.
	 * @param tariff your hourly tariff. 
	 * @return your monthly salary.
	 */
	public double getEstimatedSalary(int hoursAWeek,double tariff);
	
	/**
	 * determines if the company is making a profit using the Law Of Thirds.
	 * @param nrEmployees the nr of employees in the company.
	 * @param nrOfAssignedEmployees the nr of employees actually making money.
	 * @return true if the company is making a profit.
	 */
	public boolean isMakingProfit(int nrEmployees,int nrOfAssignedEmployees);
	
}
