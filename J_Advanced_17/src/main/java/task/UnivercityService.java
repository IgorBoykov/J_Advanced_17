package task;

import java.util.List;

public interface UnivercityService{

	Univercity save(Univercity univercuty);

	void deleteById(long id);
	
	List<Univercity> findAll();
}
