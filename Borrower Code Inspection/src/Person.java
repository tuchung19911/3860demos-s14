/**
 * 
 */



/**
 * @author nnapier
 *
 */
public class Person {

	private Name name;
	private Address address;
	
	/** Construct a person with default proporties */
	public Person() 
	{
		System.out.println("Called no-arg on the Person");
		new Name("Bart", 'M', "Simpson");
		new Address ("100 Main", "Disney", "FL", "31411");
	}
	public Person(Name name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	
	/**
	 * @return the name
	 */
	public Name getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(Name name)
	{
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public Address getAddress()
	{
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public String toString() {
		return '\n' + name.getFullName() + '\n' 
					+ address.getFullAddress() + '\n'; 
		
	}
	
	
}
