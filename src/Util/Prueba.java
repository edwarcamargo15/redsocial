package Util;

import java.util.Date;

import Dao.UsuarioDao;
import Entities.Usuario;

public class Prueba {
	
	public static void main(String[] args) {
	
	Usuario u= new Usuario();
	
    u.setNombre("Edwar Yesid");
    u.setApellido("Camargo Roa");
    u.setUsuario("EdwarCamargo");
    u.setPass("xxxx");
    u.setEmail("eycamargoroa@gmail.com");
    u.setPais(1);
    Date da = new Date();
    u.setFechanacimiento(da);
    u.setFecharegistro(da);
	
	UsuarioDao eDao=new UsuarioDao();
	eDao.insert(u);
	}
	
}








