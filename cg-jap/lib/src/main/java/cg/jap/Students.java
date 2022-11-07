package cg.jap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private int rlno;
	@Column(name ="student_name",columnDefinition = "varchar(30)", nullable=false)
private String studentName;
	public int getRlno() {
		return rlno;
	}
	public void setRlno(int rlno) {
		this.rlno = rlno;
	}
	public String getStudentsName() {
		return studentName;
	}
	public void setStudentsName(String studentName) {
		this.studentName = studentName;
	}
}
	


