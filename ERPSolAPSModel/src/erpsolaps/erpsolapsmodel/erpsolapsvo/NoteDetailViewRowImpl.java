package erpsolaps.erpsolapsmodel.erpsolapsvo;

import erpsolaps.erpsolapsmodel.erpsolapseo.NoteDetailImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 30 11:54:01 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NoteDetailViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_NOTEDETAIL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SeqNo {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getSeqNo();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setSeqNo((Integer) value);
            }
        }
        ,
        NoteCode {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getNoteCode();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setNoteCode((String) value);
            }
        }
        ,
        RefDocument {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getRefDocument();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setRefDocument((String) value);
            }
        }
        ,
        Amount {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getAmount();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAmount((BigDecimal) value);
            }
        }
        ,
        Balance {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getBalance();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setBalance((BigDecimal) value);
            }
        }
        ,
        Createdby {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getCreatedby();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setCreatedby((String) value);
            }
        }
        ,
        Modifiedby {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getModifiedby();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setModifiedby((String) value);
            }
        }
        ,
        CreatedDate {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date) value);
            }
        }
        ,
        ModifiedDate {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getModifiedDate();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setModifiedDate((Date) value);
            }
        }
        ,
        DocTypeId {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getDocTypeId();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setDocTypeId((String) value);
            }
        }
        ,
        GlCode {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getGlCode();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setGlCode((String) value);
            }
        }
        ,
        Costcenter {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getCostcenter();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setCostcenter((String) value);
            }
        }
        ,
        RefDocumentType {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getRefDocumentType();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setRefDocumentType((String) value);
            }
        }
        ,
        FcurrAmount {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getFcurrAmount();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setFcurrAmount((BigDecimal) value);
            }
        }
        ,
        Gmoveid {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getGmoveid();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setGmoveid((String) value);
            }
        }
        ,
        GmBalance {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getGmBalance();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setGmBalance((BigDecimal) value);
            }
        }
        ,
        GmDocTypeId {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getGmDocTypeId();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setGmDocTypeId((String) value);
            }
        }
        ,
        Notecodeseq {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getNotecodeseq();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setNotecodeseq((Integer) value);
            }
        }
        ,
        txtCostCenterName {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.gettxtCostCenterName();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.settxtCostCenterName((String) value);
            }
        }
        ,
        txtGLDescription {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.gettxtGLDescription();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        txtSumAmount {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.gettxtSumAmount();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        VWCostCenterQVO {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getVWCostCenterQVO();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        VWChartOfAccountQVO {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getVWChartOfAccountQVO();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NoteMasterView {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getNoteMasterView();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AccVWCostCenterQVO {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getAccVWCostCenterQVO();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AccVWChartOfAccountQVO {
            public Object get(NoteDetailViewRowImpl obj) {
                return obj.getAccVWChartOfAccountQVO();
            }

            public void put(NoteDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public abstract Object get(NoteDetailViewRowImpl object);

        public abstract void put(NoteDetailViewRowImpl object, Object value);

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

    public static final int SEQNO = AttributesEnum.SeqNo.index();
    public static final int NOTECODE = AttributesEnum.NoteCode.index();
    public static final int REFDOCUMENT = AttributesEnum.RefDocument.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int GLCODE = AttributesEnum.GlCode.index();
    public static final int COSTCENTER = AttributesEnum.Costcenter.index();
    public static final int REFDOCUMENTTYPE = AttributesEnum.RefDocumentType.index();
    public static final int FCURRAMOUNT = AttributesEnum.FcurrAmount.index();
    public static final int GMOVEID = AttributesEnum.Gmoveid.index();
    public static final int GMBALANCE = AttributesEnum.GmBalance.index();
    public static final int GMDOCTYPEID = AttributesEnum.GmDocTypeId.index();
    public static final int NOTECODESEQ = AttributesEnum.Notecodeseq.index();
    public static final int TXTCOSTCENTERNAME = AttributesEnum.txtCostCenterName.index();
    public static final int TXTGLDESCRIPTION = AttributesEnum.txtGLDescription.index();
    public static final int TXTSUMAMOUNT = AttributesEnum.txtSumAmount.index();
    public static final int VWCOSTCENTERQVO = AttributesEnum.VWCostCenterQVO.index();
    public static final int VWCHARTOFACCOUNTQVO = AttributesEnum.VWChartOfAccountQVO.index();
    public static final int NOTEMASTERVIEW = AttributesEnum.NoteMasterView.index();
    public static final int ACCVWCOSTCENTERQVO = AttributesEnum.AccVWCostCenterQVO.index();
    public static final int ACCVWCHARTOFACCOUNTQVO = AttributesEnum.AccVWChartOfAccountQVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NoteDetailViewRowImpl() {
    }

    /**
     * Gets NoteDetail entity object.
     * @return the NoteDetail
     */
    public NoteDetailImpl getNoteDetail() {
        return (NoteDetailImpl) getEntity(ENTITY_NOTEDETAIL);
    }

    /**
     * Gets the attribute value for SEQ_NO using the alias name SeqNo.
     * @return the SEQ_NO
     */
    public Integer getSeqNo() {
        return (Integer) getAttributeInternal(SEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQ_NO using the alias name SeqNo.
     * @param value value to set the SEQ_NO
     */
    public void setSeqNo(Integer value) {
        setAttributeInternal(SEQNO, value);
    }

    /**
     * Gets the attribute value for NOTE_CODE using the alias name NoteCode.
     * @return the NOTE_CODE
     */
    public String getNoteCode() {
        return (String) getAttributeInternal(NOTECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_CODE using the alias name NoteCode.
     * @param value value to set the NOTE_CODE
     */
    public void setNoteCode(String value) {
        setAttributeInternal(NOTECODE, value);
    }

    /**
     * Gets the attribute value for REF_DOCUMENT using the alias name RefDocument.
     * @return the REF_DOCUMENT
     */
    public String getRefDocument() {
        return (String) getAttributeInternal(REFDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_DOCUMENT using the alias name RefDocument.
     * @param value value to set the REF_DOCUMENT
     */
    public void setRefDocument(String value) {
        setAttributeInternal(REFDOCUMENT, value);
    }

    /**
     * Gets the attribute value for AMOUNT using the alias name Amount.
     * @return the AMOUNT
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for AMOUNT using the alias name Amount.
     * @param value value to set the AMOUNT
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for BALANCE using the alias name Balance.
     * @return the BALANCE
     */
    public BigDecimal getBalance() {
        return (BigDecimal) getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for BALANCE using the alias name Balance.
     * @param value value to set the BALANCE
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
    }

    /**
     * Gets the attribute value for CREATEDBY using the alias name Createdby.
     * @return the CREATEDBY
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATEDBY using the alias name Createdby.
     * @param value value to set the CREATEDBY
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @return the MODIFIEDBY
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @param value value to set the MODIFIEDBY
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @return the DOC_TYPE_ID
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @param value value to set the DOC_TYPE_ID
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for GL_CODE using the alias name GlCode.
     * @return the GL_CODE
     */
    public String getGlCode() {
        return (String) getAttributeInternal(GLCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for GL_CODE using the alias name GlCode.
     * @param value value to set the GL_CODE
     */
    public void setGlCode(String value) {
        setAttributeInternal(GLCODE, value);
    }

    /**
     * Gets the attribute value for COSTCENTER using the alias name Costcenter.
     * @return the COSTCENTER
     */
    public String getCostcenter() {
        return (String) getAttributeInternal(COSTCENTER);
    }

    /**
     * Sets <code>value</code> as attribute value for COSTCENTER using the alias name Costcenter.
     * @param value value to set the COSTCENTER
     */
    public void setCostcenter(String value) {
        setAttributeInternal(COSTCENTER, value);
    }

    /**
     * Gets the attribute value for REF_DOCUMENT_TYPE using the alias name RefDocumentType.
     * @return the REF_DOCUMENT_TYPE
     */
    public String getRefDocumentType() {
        return (String) getAttributeInternal(REFDOCUMENTTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_DOCUMENT_TYPE using the alias name RefDocumentType.
     * @param value value to set the REF_DOCUMENT_TYPE
     */
    public void setRefDocumentType(String value) {
        setAttributeInternal(REFDOCUMENTTYPE, value);
    }

    /**
     * Gets the attribute value for FCURR_AMOUNT using the alias name FcurrAmount.
     * @return the FCURR_AMOUNT
     */
    public BigDecimal getFcurrAmount() {
        return (BigDecimal) getAttributeInternal(FCURRAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_AMOUNT using the alias name FcurrAmount.
     * @param value value to set the FCURR_AMOUNT
     */
    public void setFcurrAmount(BigDecimal value) {
        setAttributeInternal(FCURRAMOUNT, value);
    }

    /**
     * Gets the attribute value for GMOVEID using the alias name Gmoveid.
     * @return the GMOVEID
     */
    public String getGmoveid() {
        return (String) getAttributeInternal(GMOVEID);
    }

    /**
     * Sets <code>value</code> as attribute value for GMOVEID using the alias name Gmoveid.
     * @param value value to set the GMOVEID
     */
    public void setGmoveid(String value) {
        setAttributeInternal(GMOVEID, value);
    }

    /**
     * Gets the attribute value for GM_BALANCE using the alias name GmBalance.
     * @return the GM_BALANCE
     */
    public BigDecimal getGmBalance() {
        return (BigDecimal) getAttributeInternal(GMBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for GM_BALANCE using the alias name GmBalance.
     * @param value value to set the GM_BALANCE
     */
    public void setGmBalance(BigDecimal value) {
        setAttributeInternal(GMBALANCE, value);
    }

    /**
     * Gets the attribute value for GM_DOC_TYPE_ID using the alias name GmDocTypeId.
     * @return the GM_DOC_TYPE_ID
     */
    public String getGmDocTypeId() {
        return (String) getAttributeInternal(GMDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for GM_DOC_TYPE_ID using the alias name GmDocTypeId.
     * @param value value to set the GM_DOC_TYPE_ID
     */
    public void setGmDocTypeId(String value) {
        setAttributeInternal(GMDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for NOTECODESEQ using the alias name Notecodeseq.
     * @return the NOTECODESEQ
     */
    public Integer getNotecodeseq() {
        return (Integer) getAttributeInternal(NOTECODESEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTECODESEQ using the alias name Notecodeseq.
     * @param value value to set the NOTECODESEQ
     */
    public void setNotecodeseq(Integer value) {
        setAttributeInternal(NOTECODESEQ, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtCostCenterName.
     * @return the txtCostCenterName
     */
    public String gettxtCostCenterName() {
        return (String) getAttributeInternal(TXTCOSTCENTERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtCostCenterName.
     * @param value value to set the  txtCostCenterName
     */
    public void settxtCostCenterName(String value) {
        setAttributeInternal(TXTCOSTCENTERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtGLDescription.
     * @return the txtGLDescription
     */
    public String gettxtGLDescription() {
        return (String) getAttributeInternal(TXTGLDESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSumAmount.
     * @return the txtSumAmount
     */
    public BigDecimal gettxtSumAmount() {
        return (BigDecimal) getAttributeInternal(TXTSUMAMOUNT);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link VWCostCenterQVO.
     */
    public Row getVWCostCenterQVO() {
        return (Row) getAttributeInternal(VWCOSTCENTERQVO);
    }

    /**
     * Sets the master-detail link VWCostCenterQVO between this object and <code>value</code>.
     */
    public void setVWCostCenterQVO(Row value) {
        setAttributeInternal(VWCOSTCENTERQVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link VWChartOfAccountQVO.
     */
    public Row getVWChartOfAccountQVO() {
        return (Row) getAttributeInternal(VWCHARTOFACCOUNTQVO);
    }

    /**
     * Sets the master-detail link VWChartOfAccountQVO between this object and <code>value</code>.
     */
    public void setVWChartOfAccountQVO(Row value) {
        setAttributeInternal(VWCHARTOFACCOUNTQVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link NoteMasterView.
     */
    public Row getNoteMasterView() {
        return (Row) getAttributeInternal(NOTEMASTERVIEW);
    }

    /**
     * Sets the master-detail link NoteMasterView between this object and <code>value</code>.
     */
    public void setNoteMasterView(Row value) {
        setAttributeInternal(NOTEMASTERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWCostCenterQVO.
     */
    public RowSet getAccVWCostCenterQVO() {
        return (RowSet) getAttributeInternal(ACCVWCOSTCENTERQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWChartOfAccountQVO.
     */
    public RowSet getAccVWChartOfAccountQVO() {
        return (RowSet) getAttributeInternal(ACCVWCHARTOFACCOUNTQVO);
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

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getNoteMasterView().getAttribute("Submit").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }    
}
