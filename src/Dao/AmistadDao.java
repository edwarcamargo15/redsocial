package Dao;

import Entities.Amistad;
import Util.Conexion;

public class AmistadDao extends Conexion<Amistad> implements
GenericDao<Amistad>{
	
	public AmistadDao() {
		super(Amistad.class);
	}

}



