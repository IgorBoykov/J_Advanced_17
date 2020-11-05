package task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private int level;

	@Column
	private int institutes;

	@Column
	private int students;

	@Column
	private String address;

	public Univercity() {
		
	}
	
	
	public Univercity(int level, int institutes, int students, String address) {
		this.level = level;
		this.institutes = institutes;
		this.students = students;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getInstitutes() {
		return institutes;
	}

	public void setInstitutes(int institutes) {
		this.institutes = institutes;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", level=" + level + ", institutes=" + institutes + ", students=" + students
				+ ", address=" + address + "]";
	}

}
