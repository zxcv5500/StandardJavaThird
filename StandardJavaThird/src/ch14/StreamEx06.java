package ch14;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class StreamEx06 {

	public static void main(String[] args) {
		Student06[] stuArr = {
			new Student06("이자바", 3, 300),	
			new Student06("김자바", 1, 200),	
			new Student06("안자바", 2, 100),	
			new Student06("박자바", 2, 150),	
			new Student06("소자바", 1, 200),	
			new Student06("나자바", 3, 290),	
			new Student06("감자바", 3, 180)	
		};
		
		// 학생 이름만 뽑아서 List<String>에 저장
		List<String> names = Stream.of(stuArr).map(Student06::getName)
												.collect(Collectors.toList());
		System.out.println(names);
		
		// 스트림을 배열로 변환
		Student06[] stuArr2 = Stream.of(stuArr).toArray(Student06[]::new);
		
		for (Student06 student06 : stuArr2) {
			System.out.println(student06);
		}
		
		// 스트림을 Map<String, Student06>로 변환. 학생 이름이 Key
		Map<String, Student06> stuMap = Stream.of(stuArr)
												.collect(Collectors.toMap(s->s.getName(), p->p));
		
		for (String name : stuMap.keySet()) {
			System.out.println(name + "- " + stuMap.get(name));
		}
		
		long count = Stream.of(stuArr).collect(counting());
		long totalScore = Stream.of(stuArr)
								.collect(reducing(0, Student06::getTotalScore, Integer::sum));
		System.out.println("totalScore=" + totalScore);
		
		totalScore = Stream.of(stuArr)
							.collect(reducing(0, Student06::getTotalScore, Integer::sum));
		System.out.println("totalScore=" + totalScore);
		
		Optional<Student06> topStudent = 
				Stream.of(stuArr)
						.collect(maxBy(Comparator.comparingInt(Student06::getTotalScore)));
		
		IntSummaryStatistics stat= Stream.of(stuArr)
										.collect(summarizingInt(Student06::getTotalScore));
		System.out.println(stat);
		
		String stuNames = Stream.of(stuArr)
								.map(Student06::getName)
								.collect(joining(",", "{", "}"));
		System.out.println(stuNames);		
	}
}

class Student06 implements Comparable<Student06> {
	String name;
	int ban;
	int totalScore;

	Student06(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	   return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName() { return name;}
	int getBan() { return ban;}
	int getTotalScore() { return totalScore;}

	public int compareTo(Student06 s) {
		return s.totalScore - this.totalScore;
	}
}
