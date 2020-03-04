public class Contact {
	private String name, adress, phone;
	
	public Contact(String name, String adress, String phone) {
		super();
		setName(name);
		setAdress(adress);
		setPhone(phone);
	}
	
	public Contact(String name, String adress) {
		super();
		setName(name);
		setAdress(adress);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact: \nName: " + name + "\nAdress: " + adress + "\nPhone: " + phone + ".";
	}

	
}
