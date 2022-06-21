package erpsolaps.erpsolapsmodel.erpsolapseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 21 10:18:32 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NoteMasterImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        NoteCode {
            public Object get(NoteMasterImpl obj) {
                return obj.getNoteCode();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setNoteCode((String) value);
            }
        }
        ,
        TaxCode {
            public Object get(NoteMasterImpl obj) {
                return obj.getTaxCode();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setTaxCode((BigDecimal) value);
            }
        }
        ,
        Supplierid {
            public Object get(NoteMasterImpl obj) {
                return obj.getSupplierid();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setSupplierid((String) value);
            }
        }
        ,
        DocTypeId {
            public Object get(NoteMasterImpl obj) {
                return obj.getDocTypeId();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setDocTypeId((String) value);
            }
        }
        ,
        Locationid {
            public Object get(NoteMasterImpl obj) {
                return obj.getLocationid();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setLocationid((String) value);
            }
        }
        ,
        Companyid {
            public Object get(NoteMasterImpl obj) {
                return obj.getCompanyid();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setCompanyid((String) value);
            }
        }
        ,
        EntryDate {
            public Object get(NoteMasterImpl obj) {
                return obj.getEntryDate();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setEntryDate((Date) value);
            }
        }
        ,
        TotalAmount {
            public Object get(NoteMasterImpl obj) {
                return obj.getTotalAmount();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setTotalAmount((BigDecimal) value);
            }
        }
        ,
        RefVoucher {
            public Object get(NoteMasterImpl obj) {
                return obj.getRefVoucher();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRefVoucher((String) value);
            }
        }
        ,
        Submit {
            public Object get(NoteMasterImpl obj) {
                return obj.getSubmit();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setSubmit((String) value);
            }
        }
        ,
        PostToIntFace {
            public Object get(NoteMasterImpl obj) {
                return obj.getPostToIntFace();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setPostToIntFace((String) value);
            }
        }
        ,
        PostToGl {
            public Object get(NoteMasterImpl obj) {
                return obj.getPostToGl();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setPostToGl((String) value);
            }
        }
        ,
        Createdby {
            public Object get(NoteMasterImpl obj) {
                return obj.getCreatedby();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setCreatedby((String) value);
            }
        }
        ,
        Modifiedby {
            public Object get(NoteMasterImpl obj) {
                return obj.getModifiedby();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setModifiedby((String) value);
            }
        }
        ,
        CreatedDate {
            public Object get(NoteMasterImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setCreatedDate((Date) value);
            }
        }
        ,
        ModifiedDate {
            public Object get(NoteMasterImpl obj) {
                return obj.getModifiedDate();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setModifiedDate((Date) value);
            }
        }
        ,
        NoteType {
            public Object get(NoteMasterImpl obj) {
                return obj.getNoteType();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setNoteType((String) value);
            }
        }
        ,
        Deptid {
            public Object get(NoteMasterImpl obj) {
                return obj.getDeptid();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setDeptid((String) value);
            }
        }
        ,
        ApPosted {
            public Object get(NoteMasterImpl obj) {
                return obj.getApPosted();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setApPosted((String) value);
            }
        }
        ,
        Remarks {
            public Object get(NoteMasterImpl obj) {
                return obj.getRemarks();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRemarks((String) value);
            }
        }
        ,
        AuditorCheck {
            public Object get(NoteMasterImpl obj) {
                return obj.getAuditorCheck();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setAuditorCheck((String) value);
            }
        }
        ,
        AuditRemarks {
            public Object get(NoteMasterImpl obj) {
                return obj.getAuditRemarks();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setAuditRemarks((String) value);
            }
        }
        ,
        IsMigrated {
            public Object get(NoteMasterImpl obj) {
                return obj.getIsMigrated();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setIsMigrated((String) value);
            }
        }
        ,
        MigratedDate {
            public Object get(NoteMasterImpl obj) {
                return obj.getMigratedDate();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setMigratedDate((Date) value);
            }
        }
        ,
        ExchangeRate {
            public Object get(NoteMasterImpl obj) {
                return obj.getExchangeRate();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setExchangeRate((BigDecimal) value);
            }
        }
        ,
        LocCurrcode {
            public Object get(NoteMasterImpl obj) {
                return obj.getLocCurrcode();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setLocCurrcode((String) value);
            }
        }
        ,
        ProjectId {
            public Object get(NoteMasterImpl obj) {
                return obj.getProjectId();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setProjectId((BigDecimal) value);
            }
        }
        ,
        RemarksRescue2 {
            public Object get(NoteMasterImpl obj) {
                return obj.getRemarksRescue2();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRemarksRescue2((String) value);
            }
        }
        ,
        Lcno {
            public Object get(NoteMasterImpl obj) {
                return obj.getLcno();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setLcno((String) value);
            }
        }
        ,
        RefVoucherNo {
            public Object get(NoteMasterImpl obj) {
                return obj.getRefVoucherNo();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRefVoucherNo((String) value);
            }
        }
        ,
        RefDoctypeid {
            public Object get(NoteMasterImpl obj) {
                return obj.getRefDoctypeid();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRefDoctypeid((String) value);
            }
        }
        ,
        RefDoctypeId {
            public Object get(NoteMasterImpl obj) {
                return obj.getRefDoctypeId();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setRefDoctypeId((String) value);
            }
        }
        ,
        Notecodeseq {
            public Object get(NoteMasterImpl obj) {
                return obj.getNotecodeseq();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setNotecodeseq((BigDecimal) value);
            }
        }
        ,
        txtSupplierName {
            public Object get(NoteMasterImpl obj) {
                return obj.gettxtSupplierName();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.settxtSupplierName((String) value);
            }
        }
        ,
        NoteDetail {
            public Object get(NoteMasterImpl obj) {
                return obj.getNoteDetail();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PuSuppliers {
            public Object get(NoteMasterImpl obj) {
                return obj.getPuSuppliers();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setPuSuppliers((PuSuppliersImpl) value);
            }
        }
        ,
        AllLocations {
            public Object get(NoteMasterImpl obj) {
                return obj.getAllLocations();
            }

            public void put(NoteMasterImpl obj, Object value) {
                obj.setAllLocations((EntityImpl) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(NoteMasterImpl object);

        public abstract void put(NoteMasterImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int NOTECODE = AttributesEnum.NoteCode.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int ENTRYDATE = AttributesEnum.EntryDate.index();
    public static final int TOTALAMOUNT = AttributesEnum.TotalAmount.index();
    public static final int REFVOUCHER = AttributesEnum.RefVoucher.index();
    public static final int SUBMIT = AttributesEnum.Submit.index();
    public static final int POSTTOINTFACE = AttributesEnum.PostToIntFace.index();
    public static final int POSTTOGL = AttributesEnum.PostToGl.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int NOTETYPE = AttributesEnum.NoteType.index();
    public static final int DEPTID = AttributesEnum.Deptid.index();
    public static final int APPOSTED = AttributesEnum.ApPosted.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int AUDITORCHECK = AttributesEnum.AuditorCheck.index();
    public static final int AUDITREMARKS = AttributesEnum.AuditRemarks.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int LOCCURRCODE = AttributesEnum.LocCurrcode.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int REMARKSRESCUE2 = AttributesEnum.RemarksRescue2.index();
    public static final int LCNO = AttributesEnum.Lcno.index();
    public static final int REFVOUCHERNO = AttributesEnum.RefVoucherNo.index();
    public static final int REFDOCTYPEID = AttributesEnum.RefDoctypeid.index();
    public static final int NOTECODESEQ = AttributesEnum.Notecodeseq.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int NOTEDETAIL = AttributesEnum.NoteDetail.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NoteMasterImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolaps.erpsolapsmodel.erpsolapseo.NoteMaster");
    }


    /**
     * Gets the attribute value for NoteCode, using the alias name NoteCode.
     * @return the value of NoteCode
     */
    public String getNoteCode() {
        return (String) getAttributeInternal(NOTECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteCode.
     * @param value value to set the NoteCode
     */
    public void setNoteCode(String value) {
        setAttributeInternal(NOTECODE, value);
    }

    /**
     * Gets the attribute value for TaxCode, using the alias name TaxCode.
     * @return the value of TaxCode
     */
    public BigDecimal getTaxCode() {
        return (BigDecimal) getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxCode.
     * @param value value to set the TaxCode
     */
    public void setTaxCode(BigDecimal value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for DocTypeId, using the alias name DocTypeId.
     * @return the value of DocTypeId
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocTypeId.
     * @param value value to set the DocTypeId
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for Companyid, using the alias name Companyid.
     * @return the value of Companyid
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Companyid.
     * @param value value to set the Companyid
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for EntryDate, using the alias name EntryDate.
     * @return the value of EntryDate
     */
    public Date getEntryDate() {
        return (Date) getAttributeInternal(ENTRYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EntryDate.
     * @param value value to set the EntryDate
     */
    public void setEntryDate(Date value) {
        setAttributeInternal(ENTRYDATE, value);
    }

    /**
     * Gets the attribute value for TotalAmount, using the alias name TotalAmount.
     * @return the value of TotalAmount
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) getAttributeInternal(TOTALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalAmount.
     * @param value value to set the TotalAmount
     */
    public void setTotalAmount(BigDecimal value) {
        setAttributeInternal(TOTALAMOUNT, value);
    }

    /**
     * Gets the attribute value for RefVoucher, using the alias name RefVoucher.
     * @return the value of RefVoucher
     */
    public String getRefVoucher() {
        return (String) getAttributeInternal(REFVOUCHER);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefVoucher.
     * @param value value to set the RefVoucher
     */
    public void setRefVoucher(String value) {
        setAttributeInternal(REFVOUCHER, value);
    }

    /**
     * Gets the attribute value for Submit, using the alias name Submit.
     * @return the value of Submit
     */
    public String getSubmit() {
        return (String) getAttributeInternal(SUBMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Submit.
     * @param value value to set the Submit
     */
    public void setSubmit(String value) {
        setAttributeInternal(SUBMIT, value);
    }

    /**
     * Gets the attribute value for PostToIntFace, using the alias name PostToIntFace.
     * @return the value of PostToIntFace
     */
    public String getPostToIntFace() {
        return (String) getAttributeInternal(POSTTOINTFACE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostToIntFace.
     * @param value value to set the PostToIntFace
     */
    public void setPostToIntFace(String value) {
        setAttributeInternal(POSTTOINTFACE, value);
    }

    /**
     * Gets the attribute value for PostToGl, using the alias name PostToGl.
     * @return the value of PostToGl
     */
    public String getPostToGl() {
        return (String) getAttributeInternal(POSTTOGL);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostToGl.
     * @param value value to set the PostToGl
     */
    public void setPostToGl(String value) {
        setAttributeInternal(POSTTOGL, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for NoteType, using the alias name NoteType.
     * @return the value of NoteType
     */
    public String getNoteType() {
        return (String) getAttributeInternal(NOTETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteType.
     * @param value value to set the NoteType
     */
    public void setNoteType(String value) {
        setAttributeInternal(NOTETYPE, value);
    }

    /**
     * Gets the attribute value for Deptid, using the alias name Deptid.
     * @return the value of Deptid
     */
    public String getDeptid() {
        return (String) getAttributeInternal(DEPTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Deptid.
     * @param value value to set the Deptid
     */
    public void setDeptid(String value) {
        setAttributeInternal(DEPTID, value);
    }

    /**
     * Gets the attribute value for ApPosted, using the alias name ApPosted.
     * @return the value of ApPosted
     */
    public String getApPosted() {
        return (String) getAttributeInternal(APPOSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApPosted.
     * @param value value to set the ApPosted
     */
    public void setApPosted(String value) {
        setAttributeInternal(APPOSTED, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for AuditorCheck, using the alias name AuditorCheck.
     * @return the value of AuditorCheck
     */
    public String getAuditorCheck() {
        return (String) getAttributeInternal(AUDITORCHECK);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuditorCheck.
     * @param value value to set the AuditorCheck
     */
    public void setAuditorCheck(String value) {
        setAttributeInternal(AUDITORCHECK, value);
    }

    /**
     * Gets the attribute value for AuditRemarks, using the alias name AuditRemarks.
     * @return the value of AuditRemarks
     */
    public String getAuditRemarks() {
        return (String) getAttributeInternal(AUDITREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuditRemarks.
     * @param value value to set the AuditRemarks
     */
    public void setAuditRemarks(String value) {
        setAttributeInternal(AUDITREMARKS, value);
    }

    /**
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for LocCurrcode, using the alias name LocCurrcode.
     * @return the value of LocCurrcode
     */
    public String getLocCurrcode() {
        return (String) getAttributeInternal(LOCCURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocCurrcode.
     * @param value value to set the LocCurrcode
     */
    public void setLocCurrcode(String value) {
        setAttributeInternal(LOCCURRCODE, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for RemarksRescue2, using the alias name RemarksRescue2.
     * @return the value of RemarksRescue2
     */
    public String getRemarksRescue2() {
        return (String) getAttributeInternal(REMARKSRESCUE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemarksRescue2.
     * @param value value to set the RemarksRescue2
     */
    public void setRemarksRescue2(String value) {
        setAttributeInternal(REMARKSRESCUE2, value);
    }

    /**
     * Gets the attribute value for Lcno, using the alias name Lcno.
     * @return the value of Lcno
     */
    public String getLcno() {
        return (String) getAttributeInternal(LCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lcno.
     * @param value value to set the Lcno
     */
    public void setLcno(String value) {
        setAttributeInternal(LCNO, value);
    }

    /**
     * Gets the attribute value for RefVoucherNo, using the alias name RefVoucherNo.
     * @return the value of RefVoucherNo
     */
    public String getRefVoucherNo() {
        return (String) getAttributeInternal(REFVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefVoucherNo.
     * @param value value to set the RefVoucherNo
     */
    public void setRefVoucherNo(String value) {
        setAttributeInternal(REFVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for RefDoctypeid, using the alias name RefDoctypeid.
     * @return the value of RefDoctypeid
     */
    public String getRefDoctypeid() {
        return (String) getAttributeInternal(REFDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefDoctypeid.
     * @param value value to set the RefDoctypeid
     */
    public void setRefDoctypeid(String value) {
        setAttributeInternal(REFDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for RefDoctypeId, using the alias name RefDoctypeId.
     * @return the value of RefDoctypeId
     */
    public String getRefDoctypeId() {
        return (String) getAttributeInternal(REFDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefDoctypeId.
     * @param value value to set the RefDoctypeId
     */
    public void setRefDoctypeId(String value) {
        setAttributeInternal(REFDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for Notecodeseq, using the alias name Notecodeseq.
     * @return the value of Notecodeseq
     */
    public BigDecimal getNotecodeseq() {
        return (BigDecimal) getAttributeInternal(NOTECODESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Notecodeseq.
     * @param value value to set the Notecodeseq
     */
    public void setNotecodeseq(BigDecimal value) {
        setAttributeInternal(NOTECODESEQ, value);
    }

    /**
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getNoteDetail() {
        return (RowIterator) getAttributeInternal(NOTEDETAIL);
    }

    /**
     * @return the associated entity PuSuppliersImpl.
     */
    public PuSuppliersImpl getPuSuppliers() {
        return (PuSuppliersImpl) getAttributeInternal(PUSUPPLIERS);
    }

    /**
     * Sets <code>value</code> as the associated entity PuSuppliersImpl.
     */
    public void setPuSuppliers(PuSuppliersImpl value) {
        setAttributeInternal(PUSUPPLIERS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllLocations() {
        return (EntityImpl) getAttributeInternal(ALLLOCATIONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllLocations(EntityImpl value) {
        setAttributeInternal(ALLLOCATIONS, value);
    }


    /**
     * @param notecodeseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal notecodeseq) {
        return new Key(new Object[] { notecodeseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
   setERPSolPKSeqName("NOTE_MASTER_SEQ");
   setERPSolPKColumnName("Notecodeseq");
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
           String pkValue =
                " fun_note_id('" + ERPSolGlobClassModel.doGetUserCompanyCode() + "','" +
                ERPSolGlobClassModel.doGetUserLocationCode() + "','B',TO_DATE('" + getEntryDate() + "','YYYY-MM-DD'))";
            String result =
                ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(NOTECODE, result);            

        }
        super.doDML(operation, e);
    }
}

