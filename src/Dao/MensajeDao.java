package Dao;

import Entities.Mensaje;
import Util.Conexion;

public class MensajeDao 
extends Conexion<Mensaje> 
implements GenericDao<Mensaje>{
	
	public MensajeDao() {
		super(Mensaje.class);
	}

}
