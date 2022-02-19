package com.study.springmvcCoursework.coursework5.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class LottoService {
	
	private List<Set<Integer>> lottos = new ArrayList<>();
	private Map<Integer,Long> numcount =new LinkedHashMap<Integer, Long>();
	
	public List<Set<Integer>> getLottos(){
		return lottos;
	}
	
	public void addLotto() {
		lottos.add(0,generateLotto());
	}
	
	public void updateLotto(int index) {
		lottos.set(index, generateLotto());
	}
	
	public void deleteLotto(int index) {
		lottos.remove(index);
	}
	
	private Set<Integer> generateLotto(){
		Random r = new Random();
		//樂透539: 1-39取出不重複的5個號碼
		Set<Integer> lotto = new LinkedHashSet<>();
		while(lotto.size()<5) {
			lotto.add(r.nextInt(39)+1);
		}
		return lotto;
	}
	
	//作業
	public void numcount(){
		if(lottos.isEmpty()) {
			numcount.clear();
		}else {
			Map<Integer,Long> finMap = lottos.stream().map(s->s.stream()).reduce((s1,s2)->Stream.concat(s1, s2)).get().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
			numcount = finMap.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().reversed()).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));		
		}
	}
	
	public Map<Integer,Long> getNumCount(){
		return numcount;
	}
}
