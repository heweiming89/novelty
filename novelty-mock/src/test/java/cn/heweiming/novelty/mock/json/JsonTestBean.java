package cn.heweiming.novelty.mock.json;

public class JsonTestBean {

//	@JsonDeserialize(using = MyJsonDeserializer.class)
	private Integer i;

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "JsonTestBean [i=" + i + "]";
	}
}