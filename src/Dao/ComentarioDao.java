package Dao;

import Entities.Comentario;
import Entities.Publicacion;
import Util.Conexion;

public class ComentarioDao extends Conexion<Comentario>
implements GenericDao<Comentario>{

	public ComentarioDao() {
		super(Comentario.class);
	}
	
}

	
	