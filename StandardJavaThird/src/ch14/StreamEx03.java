package ch14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) {
		Student03[] stuArr = {
				new Student03("이자바", 3, 300),
				new Student03("김자바", 1, 200),
				new Student03("안자바", 2, 100),
				new Student03("박자바", 2, 150),
				new Student03("소자바", 1, 200),
				new Student03("나자바", 3, 290),
				new Student03("감자바", 3, 180)
		};
		
		Stream<Student03> stuStream = Stream.of(stuArr);
		
		stuStream.sorted(Comparator.comparing(Student03::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
		
		stuStream = Stream.of(stuArr);		// 스트림을 다시 생성한다.
		IntStream stuScoreStream = stuStream.mapToInt(Student03::getTotalScore);
		
		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		System.out.println("count="+stat.getCount());
		System.out.println("sum="+stat.getSum());
		System.out.printf("average=%.2f%n", stat.getAverage());
		System.out.println("min="+ stat.getMin());
		System.out.println("max="+ stat.getMax());
	}

}


class Student03 implements Comparable<Student03> {
	String name;
	int ban;
	int totalScore;
	
	
	
	public Student03(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s , %d, %d", name, ban, totalScore).toString();
	}
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }

	@Override
	public int compareTo(Student03 s) {
		return s.totalScore - this.totalScore;
	}
	
}