package software.puna.maxit.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegsitDAO {
	@Autowired
	RegistInterface registInterface;
	public boolean saveData(RegistDTO registDTO)
	{
		RegistDTO t = registInterface.save(registDTO);
		 if(t.getRid()>0)
			 return true;
		return false;
		
	}

}
