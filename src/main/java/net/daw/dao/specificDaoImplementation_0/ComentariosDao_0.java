/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao.specificDaoImplementation_0;

import net.daw.dao.specificDaoImplementation_1.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import net.daw.bean.beanImplementation.FacturaBean;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;


public class ComentariosDao_0 extends GenericDaoImplementation implements DaoInterface {

    public ComentariosDao_0(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, ob, oUsuarioBeanSession);

    }


    @Override
    public int remove(int id) throws Exception {
        throw new Exception("Error en Dao remove de " + ob + ": No autorizado");
    }
    
    @Override
    public BeanInterface create(BeanInterface oBean) throws Exception {
        throw new Exception("Error en Dao create de " + ob + ": No autorizado");
    }

    @Override
    public int update(BeanInterface oBean) throws Exception {
        throw new Exception("Error en Dao update de " + ob + ": No autorizado");
    }
    
    @Override
    public int getcountX(int idajena) throws Exception {//hacer private, consultar desde el pojo y no poder preguntar desde fuera del servidor
        //String strSQL = "";

        strSQL_getcount = "SELECT COUNT(id) FROM " + ob + " WHERE id_noticia=" + idajena;

        //se cambia la query y se llama al getcount normal para devolverlo
        return super.getcount();
    }
    
    @Override
    public ArrayList<BeanInterface> getpageX(int iRpp, int iPage, int idajena, HashMap<String, String> hmOrder, Integer expand) throws Exception {
        strSQL_WhereGetpagex = " WHERE id_noticia=?";
        return super.getpageX(iRpp, iPage, idajena, hmOrder, expand);

    }

}
