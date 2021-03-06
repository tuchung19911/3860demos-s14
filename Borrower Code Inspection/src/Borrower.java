/*
* Version of code used for Code Inspection
*/
public class Borrower extends Person
{
  float creditLimit;
  float currentBalance;
  double interestRate;
  int dayOfMonth;
  boolean activeAccIndicate;
 
  
  public Borrower()
  {
	  super();
	  creditLimit = 0;
	  currentBalance = 0;
	  interestRate = 0;
	  dayOfMonth = 0;
	  activeAccIndicate = false;
  }
  
 /*
  * constructs a borrower object that accepts  a name and address object as parameter.
  * @Name aName
  * @Address anAddress
  */
 public Borrower(Name aName, Address anAddress)
 {
  creditLimit=200;
  currentBalance=0;
  dayOfMonth=15;
  activeAccIndicate=true;
  interestRate=.21;
 }
 public float getCreditLimit() {
  return creditLimit;
 }
 public void setCreditLimit(float creditLimit) {
  this.creditLimit = creditLimit;
 }
 public float getCurrentBalance() {
  return currentBalance;
 }
 public void setCurrentBalance(float currentBalance) {
  this.currentBalance = currentBalance;
 }
 public double getInterestRate() {
  return interestRate;
 }
 public void setInterestRate(float interestRate) {
  this.interestRate = interestRate;
 }
 public int getDayOfMonth() {
  return dayOfMonth;
 }
 public void setDayOfMonth(int dayOfMonth) {
  this.dayOfMonth = dayOfMonth;
 }
 public boolean isActiveAccIndicate() {
  return activeAccIndicate;
 }
 public void setActiveAccIndicate(boolean activeAccIndicate) {
  this.activeAccIndicate = activeAccIndicate;
 }
 public String toString(Borrower anobject)
 {
  return "Credit Limit: " + creditLimit + '\n' + "Current Balance: " + currentBalance + '\n' + "Interest Rate: " + interestRate + "Day of Month: " + dayOfMonth + '\n' + "Active Account:" +  activeAccIndicate + '\n'; 

 }
 public boolean isTransactionAuthorized(double amount)
 {
  if (activeAccIndicate=true && amount < currentBalance && amount < -500 && amount < (creditLimit - currentBalance))
   return true;
  else if (activeAccIndicate=false && amount >0)
   return true;
  else
   return false;
   
   
 }

}
