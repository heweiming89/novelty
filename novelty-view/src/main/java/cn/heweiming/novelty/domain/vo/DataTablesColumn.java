package cn.heweiming.novelty.domain.vo;

public class DataTablesColumn {

	private String data;
	private String name;
	private Boolean orderable;
	private Search search;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOrderable() {
		return orderable;
	}

	public void setOrderable(Boolean orderable) {
		this.orderable = orderable;
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public static class Search {
		private Boolean regex;
		private String value;

		public Boolean getRegex() {
			return regex;
		}

		public void setRegex(Boolean regex) {
			this.regex = regex;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

}
