package lists;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import reader.Repository;

public class TimeHigherList {
	ArrayList<Duration> listDuration;
	
	public TimeHigherList() {
		this.listDuration = new ArrayList<Duration>();
	}
	
	public List<Duration> listDuration() {
		
		for(int i = 0; i < Repository.timeList.size() - 1; i++) {
			LocalDateTime ldt1 = Repository.timeList.get(i).date;
			LocalDateTime ldt2 = Repository.timeList.get(i + 1).date;
			Duration d = Duration.between(ldt1, ldt2);
			listDuration.add(d);
		}
		return listDuration.stream().sorted(Comparator.comparingLong(Duration::toMillis).reversed()).limit(3).collect(Collectors.toList());
	}
}
