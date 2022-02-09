package erpsolaps.erpsolapsmodel.erpsolapseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Feb 06 16:11:49 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PaymentDetailImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SeqNo {
            public Object get(PaymentDetailImpl obj) {
                return obj.getSeqNo();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setSeqNo((Integer) value);
            }
        }
        ,
        PaymentCode {
            public Object get(PaymentDetailImpl obj) {
                return obj.getPaymentCode();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setPaymentCode((String) value);
            }
        }
        ,
        PmtAmount {
            public Object get(PaymentDetailImpl obj) {
                return obj.getPmtAmount();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setPmtAmount((BigDecimal) value);
            }
        }
        ,
        Balance {
            public Object get(PaymentDetailImpl obj) {
                return obj.getBalance();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setBalance((BigDecimal) value);
            }
        }
        ,
        Createdby {
            public Object get(PaymentDetailImpl obj) {
                return obj.getCreatedby();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setCreatedby((String) value);
            }
        }
        ,
        Modifiedby {
            public Object get(PaymentDetailImpl obj) {
                return obj.getModifiedby();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setModifiedby((String) value);
            }
        }
        ,
        CreatedDate {
            public Object get(PaymentDetailImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setCreatedDate((Date) value);
            }
        }
        ,
        InvoiceCode {
            public Object get(PaymentDetailImpl obj) {
                return obj.getInvoiceCode();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setInvoiceCode((String) value);
            }
        }
        ,
        ModifiedDate {
            public Object get(PaymentDetailImpl obj) {
                return obj.getModifiedDate();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setModifiedDate((Date) value);
            }
        }
        ,
        TaxCode {
            public Object get(PaymentDetailImpl obj) {
                return obj.getTaxCode();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setTaxCode((BigDecimal) value);
            }
        }
        ,
        InvoiceType {
            public Object get(PaymentDetailImpl obj) {
                return obj.getInvoiceType();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setInvoiceType((String) value);
            }
        }
        ,
        Taxamt {
            public Object get(PaymentDetailImpl obj) {
                return obj.getTaxamt();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setTaxamt((BigDecimal) value);
            }
        }
        ,
        Taxexempt {
            public Object get(PaymentDetailImpl obj) {
                return obj.getTaxexempt();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setTaxexempt((String) value);
            }
        }
        ,
        FcurrPmtAmount {
            public Object get(PaymentDetailImpl obj) {
                return obj.getFcurrPmtAmount();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setFcurrPmtAmount((BigDecimal) value);
            }
        }
        ,
        FcurrTaxamt {
            public Object get(PaymentDetailImpl obj) {
                return obj.getFcurrTaxamt();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setFcurrTaxamt((BigDecimal) value);
            }
        }
        ,
        FcurrBalance {
            public Object get(PaymentDetailImpl obj) {
                return obj.getFcurrBalance();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setFcurrBalance((BigDecimal) value);
            }
        }
        ,
        FcurrStaxAmt {
            public Object get(PaymentDetailImpl obj) {
                return obj.getFcurrStaxAmt();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setFcurrStaxAmt((BigDecimal) value);
            }
        }
        ,
        StaxAmt {
            public Object get(PaymentDetailImpl obj) {
                return obj.getStaxAmt();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setStaxAmt((BigDecimal) value);
            }
        }
        ,
        SalesTaxCode {
            public Object get(PaymentDetailImpl obj) {
                return obj.getSalesTaxCode();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setSalesTaxCode((BigDecimal) value);
            }
        }
        ,
        Paymentseq {
            public Object get(PaymentDetailImpl obj) {
                return obj.getPaymentseq();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setPaymentseq((BigDecimal) value);
            }
        }
        ,
        txtNetPayment {
            public Object get(PaymentDetailImpl obj) {
                return obj.gettxtNetPayment();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.settxtNetPayment((BigDecimal) value);
            }
        }
        ,
        PaymentMaster {
            public Object get(PaymentDetailImpl obj) {
                return obj.getPaymentMaster();
            }

            public void put(PaymentDetailImpl obj, Object value) {
                obj.setPaymentMaster((PaymentMasterImpl) value);
            }
        }
        ;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public abstract Object get(PaymentDetailImpl object);

        public abstract void put(PaymentDetailImpl object, Object value);

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
    public static final int PAYMENTCODE = AttributesEnum.PaymentCode.index();
    public static final int PMTAMOUNT = AttributesEnum.PmtAmount.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int INVOICECODE = AttributesEnum.InvoiceCode.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int INVOICETYPE = AttributesEnum.InvoiceType.index();
    public static final int TAXAMT = AttributesEnum.Taxamt.index();
    public static final int TAXEXEMPT = AttributesEnum.Taxexempt.index();
    public static final int FCURRPMTAMOUNT = AttributesEnum.FcurrPmtAmount.index();
    public static final int FCURRTAXAMT = AttributesEnum.FcurrTaxamt.index();
    public static final int FCURRBALANCE = AttributesEnum.FcurrBalance.index();
    public static final int FCURRSTAXAMT = AttributesEnum.FcurrStaxAmt.index();
    public static final int STAXAMT = AttributesEnum.StaxAmt.index();
    public static final int SALESTAXCODE = AttributesEnum.SalesTaxCode.index();
    public static final int PAYMENTSEQ = AttributesEnum.Paymentseq.index();
    public static final int TXTNETPAYMENT = AttributesEnum.txtNetPayment.index();
    public static final int PAYMENTMASTER = AttributesEnum.PaymentMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PaymentDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolaps.erpsolapsmodel.erpsolapseo.PaymentDetail");
    }


    /**
     * Gets the attribute value for SeqNo, using the alias name SeqNo.
     * @return the value of SeqNo
     */
    public Integer getSeqNo() {
        return (Integer) getAttributeInternal(SEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SeqNo.
     * @param value value to set the SeqNo
     */
    public void setSeqNo(Integer value) {
        setAttributeInternal(SEQNO, value);
    }

    /**
     * Gets the attribute value for PaymentCode, using the alias name PaymentCode.
     * @return the value of PaymentCode
     */
    public String getPaymentCode() {
        return (String) getAttributeInternal(PAYMENTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentCode.
     * @param value value to set the PaymentCode
     */
    public void setPaymentCode(String value) {
        setAttributeInternal(PAYMENTCODE, value);
    }

    /**
     * Gets the attribute value for PmtAmount, using the alias name PmtAmount.
     * @return the value of PmtAmount
     */
    public BigDecimal getPmtAmount() {
        return (BigDecimal) getAttributeInternal(PMTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for PmtAmount.
     * @param value value to set the PmtAmount
     */
    public void setPmtAmount(BigDecimal value) {
        setAttributeInternal(PMTAMOUNT, value);
    }

    /**
     * Gets the attribute value for Balance, using the alias name Balance.
     * @return the value of Balance
     */
    public BigDecimal getBalance() {
        return (BigDecimal) getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Balance.
     * @param value value to set the Balance
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
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
     * Gets the attribute value for InvoiceCode, using the alias name InvoiceCode.
     * @return the value of InvoiceCode
     */
    public String getInvoiceCode() {
        return (String) getAttributeInternal(INVOICECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceCode.
     * @param value value to set the InvoiceCode
     */
    public void setInvoiceCode(String value) {
        setAttributeInternal(INVOICECODE, value);
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
     * Gets the attribute value for InvoiceType, using the alias name InvoiceType.
     * @return the value of InvoiceType
     */
    public String getInvoiceType() {
        return (String) getAttributeInternal(INVOICETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceType.
     * @param value value to set the InvoiceType
     */
    public void setInvoiceType(String value) {
        setAttributeInternal(INVOICETYPE, value);
    }

    /**
     * Gets the attribute value for Taxamt, using the alias name Taxamt.
     * @return the value of Taxamt
     */
    public BigDecimal getTaxamt() {
        return (BigDecimal) getAttributeInternal(TAXAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Taxamt.
     * @param value value to set the Taxamt
     */
    public void setTaxamt(BigDecimal value) {
        setAttributeInternal(TAXAMT, value);
    }

    /**
     * Gets the attribute value for Taxexempt, using the alias name Taxexempt.
     * @return the value of Taxexempt
     */
    public String getTaxexempt() {
        return (String) getAttributeInternal(TAXEXEMPT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Taxexempt.
     * @param value value to set the Taxexempt
     */
    public void setTaxexempt(String value) {
        setAttributeInternal(TAXEXEMPT, value);
    }

    /**
     * Gets the attribute value for FcurrPmtAmount, using the alias name FcurrPmtAmount.
     * @return the value of FcurrPmtAmount
     */
    public BigDecimal getFcurrPmtAmount() {
        return (BigDecimal) getAttributeInternal(FCURRPMTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrPmtAmount.
     * @param value value to set the FcurrPmtAmount
     */
    public void setFcurrPmtAmount(BigDecimal value) {
        setAttributeInternal(FCURRPMTAMOUNT, value);
    }

    /**
     * Gets the attribute value for FcurrTaxamt, using the alias name FcurrTaxamt.
     * @return the value of FcurrTaxamt
     */
    public BigDecimal getFcurrTaxamt() {
        return (BigDecimal) getAttributeInternal(FCURRTAXAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrTaxamt.
     * @param value value to set the FcurrTaxamt
     */
    public void setFcurrTaxamt(BigDecimal value) {
        setAttributeInternal(FCURRTAXAMT, value);
    }

    /**
     * Gets the attribute value for FcurrBalance, using the alias name FcurrBalance.
     * @return the value of FcurrBalance
     */
    public BigDecimal getFcurrBalance() {
        return (BigDecimal) getAttributeInternal(FCURRBALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrBalance.
     * @param value value to set the FcurrBalance
     */
    public void setFcurrBalance(BigDecimal value) {
        setAttributeInternal(FCURRBALANCE, value);
    }

    /**
     * Gets the attribute value for FcurrStaxAmt, using the alias name FcurrStaxAmt.
     * @return the value of FcurrStaxAmt
     */
    public BigDecimal getFcurrStaxAmt() {
        return (BigDecimal) getAttributeInternal(FCURRSTAXAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrStaxAmt.
     * @param value value to set the FcurrStaxAmt
     */
    public void setFcurrStaxAmt(BigDecimal value) {
        setAttributeInternal(FCURRSTAXAMT, value);
    }

    /**
     * Gets the attribute value for StaxAmt, using the alias name StaxAmt.
     * @return the value of StaxAmt
     */
    public BigDecimal getStaxAmt() {
        return (BigDecimal) getAttributeInternal(STAXAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for StaxAmt.
     * @param value value to set the StaxAmt
     */
    public void setStaxAmt(BigDecimal value) {
        setAttributeInternal(STAXAMT, value);
    }

    /**
     * Gets the attribute value for SalesTaxCode, using the alias name SalesTaxCode.
     * @return the value of SalesTaxCode
     */
    public BigDecimal getSalesTaxCode() {
        return (BigDecimal) getAttributeInternal(SALESTAXCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesTaxCode.
     * @param value value to set the SalesTaxCode
     */
    public void setSalesTaxCode(BigDecimal value) {
        setAttributeInternal(SALESTAXCODE, value);
    }

    /**
     * Gets the attribute value for Paymentseq, using the alias name Paymentseq.
     * @return the value of Paymentseq
     */
    public BigDecimal getPaymentseq() {
        return (BigDecimal) getAttributeInternal(PAYMENTSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Paymentseq.
     * @param value value to set the Paymentseq
     */
    public void setPaymentseq(BigDecimal value) {
        setAttributeInternal(PAYMENTSEQ, value);
    }


    /**
     * Gets the attribute value for txtNetPayment, using the alias name txtNetPayment.
     * @return the value of txtNetPayment
     */
    public BigDecimal gettxtNetPayment() {
        return (BigDecimal) getAttributeInternal(TXTNETPAYMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtNetPayment.
     * @param value value to set the txtNetPayment
     */
    public void settxtNetPayment(BigDecimal value) {
        setAttributeInternal(TXTNETPAYMENT, value);
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
     * @return the associated entity PaymentMasterImpl.
     */
    public PaymentMasterImpl getPaymentMaster() {
        return (PaymentMasterImpl) getAttributeInternal(PAYMENTMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity PaymentMasterImpl.
     */
    public void setPaymentMaster(PaymentMasterImpl value) {
        setAttributeInternal(PAYMENTMASTER, value);
    }


    /**
     * @param seqNo key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer seqNo) {
        return new Key(new Object[] { seqNo });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("SeqNo");
        setERPSolPKSeqName("PAYMENT_DETAIL_SEQ");
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
            populateAttributeAsChanged(PAYMENTCODE, getPaymentMaster().getAttribute("PaymentCode"));
       }
        if (operation!=DML_DELETE) {
           populateAttributeAsChanged(PMTAMOUNT, getFcurrPmtAmount());
           populateAttributeAsChanged(STAXAMT, getFcurrStaxAmt());
       }
        super.doDML(operation, e);
    }
}

