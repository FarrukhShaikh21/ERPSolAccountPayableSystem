package erpsolaps.erpsolapsmodel.erpsolapsvo;

import erpsolaps.erpsolapsmodel.erpsolapsvo.common.NoteMasterView;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsViewObjectImpl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 30 09:58:24 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NoteMasterViewImpl extends ERPSolGlobalsViewObjectImpl implements NoteMasterView {
    /**
     * This is the default constructor (do not remove).
     */
    public NoteMasterViewImpl() {
    }
    
    public void doSuperviseNote() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=pkg_payable.func_submit_note('"+this.getCurrentRow().getAttribute("NoteCode")+"','"+ERPSolGlobClassModel.doGetUserCode()+"'); END;", 1);
        System.out.println("begin ?:=pkg_payable.func_submit_note('"+this.getCurrentRow().getAttribute("NoteCode")+"','"+ERPSolGlobClassModel.doGetUserCode()+"'); END;");
        try {
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            this.getCurrentRow().refresh(Row.REFRESH_WITH_DB_FORGET_CHANGES);
            
            if (!cs.getString(1).equals("ERPSOLSUCCESS")) {
    //               this.getCurrentRow().setAttribute("Submit", "N");
               this.getDBTransaction().commit();
                throw new JboException("Unable to supervise due to "+cs.getString(1));
               
           }
            this.getCurrentRow().setAttribute("Submit", "Y");
            this.getDBTransaction().commit();
        } catch (SQLException e) {
    //            this.getCurrentRow().setAttribute("Submit", "N");
            this.getDBTransaction().commit();
            System.out.println(e.getMessage()+ "this is message");
            throw new JboException("Unable to supervise ");
        }
        finally{
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }
    }
}

