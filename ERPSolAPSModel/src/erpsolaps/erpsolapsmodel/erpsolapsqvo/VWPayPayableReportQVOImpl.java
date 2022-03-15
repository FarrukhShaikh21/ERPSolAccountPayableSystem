package erpsolaps.erpsolapsmodel.erpsolapsqvo;

import erpsolaps.erpsolapsmodel.erpsolapsqvo.common.VWPayPayableReportQVO;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 15 17:02:28 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VWPayPayableReportQVOImpl extends ViewObjectImpl implements VWPayPayableReportQVO {
    /**
     * This is the default constructor (do not remove).
     */
    public VWPayPayableReportQVOImpl() {
    }
    
    public void doSetPayableReportDefaults() {
        ViewObject vo=getApplicationModule().findViewObject("QvoLAPSoc");
              if (vo!=null) {
                  vo.remove();
             }
              vo=getApplicationModule().createViewObjectFromQueryStmt("QvoLImsoc", "select locationid, location_description from all_locations where locationid='"+ERPSolGlobClassModel.doGetUserLocationCode()+"'");
              vo.executeQuery();
              this.first().setAttribute("Locationid", vo.first().getAttribute(0));
              this.first().setAttribute("txtLocationName", vo.first().getAttribute(1));
              this.first().setAttribute("txtCompanyId", ERPSolGlobClassModel.doGetUserCompanyCode());
              this.first().setAttribute("txtFromDate", this.first().getAttribute("txtDefaultDate"));
              this.first().setAttribute("txtToDate", this.first().getAttribute("txtDefaultDate"));
              vo.remove();
    }
}

