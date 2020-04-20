package Dao;

import Entities.Etiqueta;
import Util.Conexion;

public class EtiquetaDao
extends Conexion<Etiqueta> 
implements GenericDao<Etiqueta>{
		
		public EtiquetaDao() {
			super(Etiqueta.class);
		}
}
