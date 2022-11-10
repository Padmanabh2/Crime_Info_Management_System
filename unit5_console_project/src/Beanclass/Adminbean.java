package Beanclass;

public class Adminbean {

	private int admin_id;
	private String admin_name;
	private String admin_email;
	private String admin_pwd;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	
	public Adminbean(int admin_id, String admin_name, String admin_email, String admin_pwd) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_email = admin_email;
		this.admin_pwd = admin_pwd;
	}
	
	public Adminbean() {}
	
	@Override
	public String toString() {
		return "Adminbean [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_email=" + admin_email
				+ ", admin_pwd=" + admin_pwd + "]";
	}

}
