package com.vegasTracker;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chris
 *
 */
@Service
@Transactional
public class StatsService {
	
	@Autowired
	private StatsRepository repository;
	
	public List<Stats> listAll() {
		return repository.findAll();
	}
	
	public void save(Stats stats) {
		repository.save(stats);
	}
	
	public Stats get(long id) {
		return repository.findById(id).get();
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}

}
