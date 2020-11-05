package task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnivercityServiceImpl implements UnivercityService{

	@Autowired
	private UnivercityRepository univercityRepository;
	
	
	@Override
	public Univercity save(Univercity univercuty) {
		return univercityRepository.save(univercuty);
	}


	@Override
	public void deleteById(long id) {
		univercityRepository.deleteById(id);
		
	}

	@Override
	public List<Univercity> findAll() {
		return univercityRepository.findAll();
	}

}
