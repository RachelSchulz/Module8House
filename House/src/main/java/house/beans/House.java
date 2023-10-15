/**
* Rachel Schulz - rsgoodrich
* CIS175 - Fall 2023
* Oct 15, 2023
*/
package house.beans;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private String address;
	private String city;
	private String state;
	private int numBedroom;
	private int numBath;

	
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public House(String address, String city, String state) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
	}



	public House(String address, String city, String state, int numBedroom, int numBath) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.numBedroom = numBedroom;
		this.numBath = numBath;

	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getNumBedroom() {
		return numBedroom;
	}



	public void setNumBedroom(int numBedroom) {
		this.numBedroom = numBedroom;
	}



	public int getNumBath() {
		return numBath;
	}



	public void setNumBath(int numBath) {
		this.numBath = numBath;
	}



	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", city=" + city + ", state=" + state + ", numBedroom="
				+ numBedroom + ", numBath=" + numBath + "]";
	}





	
}
