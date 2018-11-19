package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student08 {
	String name;
	boolean isMale;		// 성별
	int hak;			// 학년
	int ban;			// 반
	int score;
	
	public Student08(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남":"여", hak, ban, score);
	}
	
	// groupingBy() 사용
	enum Level { HIGH, MID, LOW }		// 성적을 상, 중, 하 세 단계로 분류
}

public class StreamEx08 {
	
	public static void main(String[] args) {
		Student08[] stuArr = {
				new Student08("나자바", true,  1, 1, 300),	
				new Student08("김지미", false, 1, 1, 250),	
				new Student08("김자바", true,  1, 1, 200),	
				new Student08("이지미", false, 1, 2, 150),	
				new Student08("남자바", true,  1, 2, 100),	
				new Student08("안지미", false, 1, 2,  50),	
				new Student08("황지미", false, 1, 3, 100),	
				new Student08("강지미", false, 1, 3, 150),	
				new Student08("이자바", true,  1, 3, 200),	
                           
				new Student08("나자바", true,  2, 1, 300),	
				new Student08("김지미", false, 2, 1, 250),	
				new Student08("김자바", true,  2, 1, 200),	
				new Student08("이지미", false, 2, 2, 150),	
				new Student08("남자바", true,  2, 2, 100),	
				new Student08("안지미", false, 2, 2,  50),	
				new Student08("황지미", false, 2, 3, 100),	
				new Student08("강지미", false, 2, 3, 150),	
				new Student08("이자바", true,  2, 3, 200)	
			};
		
		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		Map<Integer, List<Student08>> stuByBan = Stream.of(stuArr)
													.collect(groupingBy(Student08::getBan));
		for(List<Student08> ban : stuByBan.values()) {
			for(Student08 s: ban) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
		Map<Student08.Level, List<Student08>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					if (s.getScore() >= 200) return Student08.Level.HIGH;
					else if(s.getScore() >= 100) return Student08.Level.MID;
					else return Student08.Level.LOW;
				}));
		
		TreeSet<Student08.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Student08.Level key: keySet) {
			System.out.println("[" + key +"]");
			
			for(Student08 s : stuByLevel.get(key)) {
				System.out.println(s);
			}
			System.out.println();
		}
		
		System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수)%n");
		Map<Student08.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s->{
					if (s.getScore() >= 200) return Student08.Level.HIGH;
					else if (s.getScore() >= 100) return Student08.Level.MID;
					else return Student08.Level.LOW;
				}, counting()));
		
		for (Student08.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		System.out.println();
		
		
/*
		for(List<Student08> level : stuByLevel.values()) {
			System.out.println();
			for(Student08 s : level) {
				System.out.println(s);
			}
		}
*/
		System.out.printf("%n4. 다중 그룹화(학년별, 반별)%n");
		Map<Integer, Map<Integer, List<Student08>>> stuByHakAndBan =
				Stream.of(stuArr)
					.collect(groupingBy(Student08::getHak,
								groupingBy(Student08::getBan)
							));
		
		for(Map<Integer, List<Student08>> hak : stuByHakAndBan.values()) {
			for(List<Student08> ban : hak.values()) {
				System.out.println();
				for(Student08 s : ban) {
					System.out.println(s);
				}
			}
		}
		
		System.out.printf("%n5. 다중 그룹화 + 통계(학년별, 반별 1등)%n");
		Map<Integer, Map<Integer, Student08>> topStuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student08::getHak,
						groupingBy(Student08::getBan,
								collectingAndThen(
										maxBy(comparingInt(Student08::getScore)),
										Optional::get
								)
						)
				));
		
		for(Map<Integer, Student08> ban : topStuByHakAndBan.values()) {
			for (Student08 s : ban.values()) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");
		Map<String, Set<Student08.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s->s.getHak() + "-" + s.getBan(),
							mapping(s->{
								if (s.getScore() >= 200) return Student08.Level.HIGH;
								else if (s.getScore() >= 100) return Student08.Level.MID;
								else return Student08.Level.LOW;
							}, toSet())
						));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
		}
				
	}	// main의 끝

}
