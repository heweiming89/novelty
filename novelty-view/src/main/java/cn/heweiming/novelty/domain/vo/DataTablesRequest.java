package cn.heweiming.novelty.domain.vo;

public class DataTablesRequest {

	private Integer draw;
	private Integer start;
	private Integer length;
//	private List<DataTablesColumn> columns;

//	public List<DataTablesColumn> getColumns() {
//		return columns;
//	}
//
//	public void setColumns(List<DataTablesColumn> columns) {
//		this.columns = columns;
//	}

	public Integer getDraw() {
		return draw;
	}

	public Integer getLength() {
		return length;
	}

	public Integer getStart() {
		return start;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

}
