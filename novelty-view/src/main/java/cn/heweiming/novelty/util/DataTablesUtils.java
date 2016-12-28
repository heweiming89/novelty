package cn.heweiming.novelty.util;

import cn.heweiming.novelty.bean.Paging;
import cn.heweiming.novelty.domain.vo.DataTablesResponse;

public class DataTablesUtils {

	public static final String DT_RowId = "DT_RowId";

	private DataTablesUtils() {

	}

	public static DataTablesResponse hanlerPagingToDtResponse(Paging<?> paging, DataTablesResponse dtResponse) {
		dtResponse.setRecordsTotal(paging.getTotal());
		dtResponse.setRecordsFiltered(paging.getTotal());
		dtResponse.setData(paging.getData());
		return dtResponse;
	}

}
