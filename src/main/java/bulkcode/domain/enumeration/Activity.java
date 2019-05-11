package bulkcode.domain.enumeration;

/**
 * The Activity enumeration.
 */
public enum Activity {

	A1("Безхаберие"), A2("Бачкане");

	private String desc;

	private Activity(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

}
