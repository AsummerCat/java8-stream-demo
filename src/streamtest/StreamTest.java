package streamtest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest {

	/**
	 * 集合遍历
	 *
	 * @throws Exception
	 */
	@Test // 遍历集合
	public void testName() throws Exception {

		List<Person> peoples = new ArrayList<>(Arrays.asList(
				new Person("name1", 12),
				new Person("name2", 13),
				new Person("name2", 14),
				new Person("name3", 15)
		));
		// 传统增强for
		for (Person people : peoples) {
			System.out.println(people.getName());
		}
		// 新特性ForEach
		peoples.forEach(people -> System.out.println(people.getName()));
	}

	/**
	 * 查找年龄大于18的人员
	 *
	 * @throws Exception
	 */
	@Test
	public void filterAge() throws Exception {

		List<Person> peoples = new ArrayList<>(Arrays.asList(
				new Person("name1", 12),
				new Person("name2", 13),
				new Person("name3", 33),
				new Person("name4", 21),
				new Person("name1", 22),
				new Person("name2", 15)
		));
		// 传统过滤
		List<Person> ps = new ArrayList<>();
		for (Person people : peoples) {
			if (people.getAge() > 18) {
				ps.add(people);
			}
		}
		// 新特性过滤
		List<Person> collect = peoples.stream().filter(person -> person.getAge() > 18).collect(toList());
		System.out.println(collect.toString());
	}

	/**
	 * 过滤获取属性
	 */
	@Test
	public void filterFailed() throws Exception {

		List<Person> peoples = new ArrayList<>(Arrays.asList(
				new Person("name1",12),
				new Person("name2",13),
				new Person("name3",33),
				new Person("name4",21),
				new Person("name1",22),
				new Person("name2",15)
		));

		List<String> collect = peoples.stream().map(Person::getName).collect(toList());
		System.out.println(collect.toString());

	}


	/**
	 * .分组统计
	 * @throws Exception
	 */
	@Test
	public void statistic() throws Exception {
		// 统计每个人房子数量
		List<String> list = new ArrayList<>();
		Stream<String> stream = list.stream();

		List<Person> peoples = new ArrayList<>(Arrays.asList(
				new Person("思聪","杭州",19,50),
				new Person("马云","北京",50,100),
				new Person("思聪","北京",19,20),
				new Person("温州大婶","西安",1,120),
				new Person("温州大婶","杭州",1,100),
				new Person("我",null,18,0),
				new Person("温州大婶","新西兰",1,200)
		));
		// 传统增强for 统计
		List<Integer> sum =new ArrayList<>();
		for (Person people : peoples) {
			//人生如此艰难，我还要继续。。。此处省略
		}
         //分组统计
		Map<String, List<Person>> map=  peoples.stream().collect(groupingBy(Person::getName));
		map.size();
	}


}
