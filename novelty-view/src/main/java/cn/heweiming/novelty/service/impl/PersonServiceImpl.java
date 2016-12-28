package cn.heweiming.novelty.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import cn.heweiming.novelty.bean.Paging;
import cn.heweiming.novelty.bean.Person;
import cn.heweiming.novelty.domain.vo.Gender;
import cn.heweiming.novelty.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public Paging<Person> findPersonPaging(int startIndex, int pageSize) {
		Paging<Person> personPaging = new Paging<Person>();
		int total = 72;
		Random random = new Random();
		List<Person> data = new ArrayList<>(pageSize);
		for (int i = 1; i <= pageSize; i++) {
			int current = startIndex + i;
			if (i > total || current > total) {
				break;
			}
			Person person = new Person();
			person.setAge(current);
			person.setBirthday(new Date());
			Gender gender = null;
			switch (current % 5) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				gender = Gender.FEMALE.getEnumByCode(String.valueOf(current % 5));
				break;
			default:
				break;
			}
			person.setGender(gender);
			person.setName("姓名" + current);
			person.setNation("民族" + current);
			// person.setWeight(current);
			person.setMobilePhone("手机号码" + current);
			person.setIncome(random.nextDouble() * 1_000_000_000);
			data.add(person);
		}
		personPaging.setTotal(total);
		personPaging.setData(data);
		return personPaging;
	}

}
