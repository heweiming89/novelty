package cn.heweiming.novelty.service;

import cn.heweiming.novelty.bean.Paging;
import cn.heweiming.novelty.bean.Person;

public interface PersonService {

	Paging<Person> findPersonPaging(int startIndex, int pageSize);

}
