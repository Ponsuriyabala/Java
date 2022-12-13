/**
 * 
 */
package HospitalSer;

/**
 * @author Administrator
 *
 */
public class Patient {

	private int id;
	private String name;
	private String it;
	private int ttD;
	private String ot;
	private int wt;
	
	
	public Patient(int id, String name, String it, int ttD, String ot, int wt) {
		this.id = id;
		this.name = name;
		this.it = it;
		this.ttD = ttD;
		this.ot = ot;
		this.wt = wt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public int getTtD() {
		return ttD;
	}

	public void setTtD(int ttD) {
		this.ttD = ttD;
	}

	public String getOt() {
		return ot;
	}

	public void setOt(String ot) {
		this.ot = ot;
	}

	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		this.wt = wt;
	}
}
