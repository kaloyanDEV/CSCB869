package bulkcode.domain.enumeration;

/**
 * The Type enumeration.
 */
public enum Type {
	T1("ЕООД"), T2("ООД"), T3("АД"), T4("ЕТ");

	private String desc;

	private Type(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

}
