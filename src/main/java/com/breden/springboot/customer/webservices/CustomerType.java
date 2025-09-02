/**
 * CustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class CustomerType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String operation;

    private String cmAddr;

    private String adName;

    private String adLine1;

    private String adLine2;

    private String adLine3;

    private String adCity;

    private String adState;

    private String adZip;

    private java.lang.Integer adFormat;

    private String adCtry;

    private String adCounty;

    private String adAttn;

    private String adPhone;

    private String adExt;

    private String adFax;

    private String adAttn2;

    private String adPhone2;

    private String adExt2;

    private String adFax2;

    private java.util.Date adDate;

    private String cmSort;

    private String cmSlspsn;

    private java.lang.Boolean multSlspsn;

    private String cmShipvia;

    private String cmArAcct;

    private String cmArSub;

    private String cmArCc;

    private String cmResale;

    private String cmRmks;

    private String cmType;

    private String cmRegion;

    private String cmCurr;

    private String cmScurr;

    private String cmSite;

    private String cmLang;

    private String[] cmSlspsn1;

    private String cmPrList2;

    private String cmPrList;

    private java.lang.Boolean cmFixPr;

    private String cmClass;

    private String cmSic;

    private java.lang.Boolean cmPartial;

    private java.lang.Boolean cmQadl01;

    private java.lang.Boolean priceListFailed;

    private java.lang.Boolean discListFailed;

    private java.lang.Boolean adTaxable;

    private String adTaxZone;

    private String adTaxc;

    private String adTaxUsage;

    private java.lang.Boolean adTaxIn;

    private String adGstId;

    private String adPstId;

    private String adMisc1Id;

    private String adMisc2Id;

    private String adMisc3Id;

    private java.lang.Boolean adTxInCity;

    private String adTimezone;

    private java.lang.Boolean cmQad06;

    private java.math.BigDecimal cmCrLimit;

    private String cmCrTerms;

    private java.lang.Boolean cmCrHold;

    private String cmCrRating;

    private String cmDb;

    private java.lang.Boolean cmPoReqd;

    private java.math.BigDecimal cmDiscPct;

    private java.lang.Boolean cmFin;

    private java.lang.Boolean cmStmt;

    private String cmStmtCyc;

    private java.lang.Boolean cmDun;

    private String cmBill;

    private java.util.Date cmCrReview;

    private java.util.Date cmCrUpdate;

    private String cmFrList;

    private java.math.BigDecimal cmFrMinWt;

    private String cmFrTerms;

    private String btbType;

    private java.lang.Integer cmShipLt;

    private java.lang.Boolean cmBtbMthd;

    private java.lang.Boolean cmBtbCr;

    private com.breden.springboot.customer.webservices.BankAccountsType[] bankAccounts;

    public CustomerType() {
    }

    public CustomerType(
           String operation,
           String cmAddr,
           String adName,
           String adLine1,
           String adLine2,
           String adLine3,
           String adCity,
           String adState,
           String adZip,
           java.lang.Integer adFormat,
           String adCtry,
           String adCounty,
           String adAttn,
           String adPhone,
           String adExt,
           String adFax,
           String adAttn2,
           String adPhone2,
           String adExt2,
           String adFax2,
           java.util.Date adDate,
           String cmSort,
           String cmSlspsn,
           java.lang.Boolean multSlspsn,
           String cmShipvia,
           String cmArAcct,
           String cmArSub,
           String cmArCc,
           String cmResale,
           String cmRmks,
           String cmType,
           String cmRegion,
           String cmCurr,
           String cmScurr,
           String cmSite,
           String cmLang,
           String[] cmSlspsn1,
           String cmPrList2,
           String cmPrList,
           java.lang.Boolean cmFixPr,
           String cmClass,
           String cmSic,
           java.lang.Boolean cmPartial,
           java.lang.Boolean cmQadl01,
           java.lang.Boolean priceListFailed,
           java.lang.Boolean discListFailed,
           java.lang.Boolean adTaxable,
           String adTaxZone,
           String adTaxc,
           String adTaxUsage,
           java.lang.Boolean adTaxIn,
           String adGstId,
           String adPstId,
           String adMisc1Id,
           String adMisc2Id,
           String adMisc3Id,
           java.lang.Boolean adTxInCity,
           String adTimezone,
           java.lang.Boolean cmQad06,
           java.math.BigDecimal cmCrLimit,
           String cmCrTerms,
           java.lang.Boolean cmCrHold,
           String cmCrRating,
           String cmDb,
           java.lang.Boolean cmPoReqd,
           java.math.BigDecimal cmDiscPct,
           java.lang.Boolean cmFin,
           java.lang.Boolean cmStmt,
           String cmStmtCyc,
           java.lang.Boolean cmDun,
           String cmBill,
           java.util.Date cmCrReview,
           java.util.Date cmCrUpdate,
           String cmFrList,
           java.math.BigDecimal cmFrMinWt,
           String cmFrTerms,
           String btbType,
           java.lang.Integer cmShipLt,
           java.lang.Boolean cmBtbMthd,
           java.lang.Boolean cmBtbCr,
           com.breden.springboot.customer.webservices.BankAccountsType[] bankAccounts) {
           this.operation = operation;
           this.cmAddr = cmAddr;
           this.adName = adName;
           this.adLine1 = adLine1;
           this.adLine2 = adLine2;
           this.adLine3 = adLine3;
           this.adCity = adCity;
           this.adState = adState;
           this.adZip = adZip;
           this.adFormat = adFormat;
           this.adCtry = adCtry;
           this.adCounty = adCounty;
           this.adAttn = adAttn;
           this.adPhone = adPhone;
           this.adExt = adExt;
           this.adFax = adFax;
           this.adAttn2 = adAttn2;
           this.adPhone2 = adPhone2;
           this.adExt2 = adExt2;
           this.adFax2 = adFax2;
           this.adDate = adDate;
           this.cmSort = cmSort;
           this.cmSlspsn = cmSlspsn;
           this.multSlspsn = multSlspsn;
           this.cmShipvia = cmShipvia;
           this.cmArAcct = cmArAcct;
           this.cmArSub = cmArSub;
           this.cmArCc = cmArCc;
           this.cmResale = cmResale;
           this.cmRmks = cmRmks;
           this.cmType = cmType;
           this.cmRegion = cmRegion;
           this.cmCurr = cmCurr;
           this.cmScurr = cmScurr;
           this.cmSite = cmSite;
           this.cmLang = cmLang;
           this.cmSlspsn1 = cmSlspsn1;
           this.cmPrList2 = cmPrList2;
           this.cmPrList = cmPrList;
           this.cmFixPr = cmFixPr;
           this.cmClass = cmClass;
           this.cmSic = cmSic;
           this.cmPartial = cmPartial;
           this.cmQadl01 = cmQadl01;
           this.priceListFailed = priceListFailed;
           this.discListFailed = discListFailed;
           this.adTaxable = adTaxable;
           this.adTaxZone = adTaxZone;
           this.adTaxc = adTaxc;
           this.adTaxUsage = adTaxUsage;
           this.adTaxIn = adTaxIn;
           this.adGstId = adGstId;
           this.adPstId = adPstId;
           this.adMisc1Id = adMisc1Id;
           this.adMisc2Id = adMisc2Id;
           this.adMisc3Id = adMisc3Id;
           this.adTxInCity = adTxInCity;
           this.adTimezone = adTimezone;
           this.cmQad06 = cmQad06;
           this.cmCrLimit = cmCrLimit;
           this.cmCrTerms = cmCrTerms;
           this.cmCrHold = cmCrHold;
           this.cmCrRating = cmCrRating;
           this.cmDb = cmDb;
           this.cmPoReqd = cmPoReqd;
           this.cmDiscPct = cmDiscPct;
           this.cmFin = cmFin;
           this.cmStmt = cmStmt;
           this.cmStmtCyc = cmStmtCyc;
           this.cmDun = cmDun;
           this.cmBill = cmBill;
           this.cmCrReview = cmCrReview;
           this.cmCrUpdate = cmCrUpdate;
           this.cmFrList = cmFrList;
           this.cmFrMinWt = cmFrMinWt;
           this.cmFrTerms = cmFrTerms;
           this.btbType = btbType;
           this.cmShipLt = cmShipLt;
           this.cmBtbMthd = cmBtbMthd;
           this.cmBtbCr = cmBtbCr;
           this.bankAccounts = bankAccounts;
    }


    /**
     * Gets the operation value for this CustomerType.
     * 
     * @return operation
     */
    public String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CustomerType.
     * 
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }


    /**
     * Gets the cmAddr value for this CustomerType.
     * 
     * @return cmAddr
     */
    public String getCmAddr() {
        return cmAddr;
    }


    /**
     * Sets the cmAddr value for this CustomerType.
     * 
     * @param cmAddr
     */
    public void setCmAddr(String cmAddr) {
        this.cmAddr = cmAddr;
    }


    /**
     * Gets the adName value for this CustomerType.
     * 
     * @return adName
     */
    public String getAdName() {
        return adName;
    }


    /**
     * Sets the adName value for this CustomerType.
     * 
     * @param adName
     */
    public void setAdName(String adName) {
        this.adName = adName;
    }


    /**
     * Gets the adLine1 value for this CustomerType.
     * 
     * @return adLine1
     */
    public String getAdLine1() {
        return adLine1;
    }


    /**
     * Sets the adLine1 value for this CustomerType.
     * 
     * @param adLine1
     */
    public void setAdLine1(String adLine1) {
        this.adLine1 = adLine1;
    }


    /**
     * Gets the adLine2 value for this CustomerType.
     * 
     * @return adLine2
     */
    public String getAdLine2() {
        return adLine2;
    }


    /**
     * Sets the adLine2 value for this CustomerType.
     * 
     * @param adLine2
     */
    public void setAdLine2(String adLine2) {
        this.adLine2 = adLine2;
    }


    /**
     * Gets the adLine3 value for this CustomerType.
     * 
     * @return adLine3
     */
    public String getAdLine3() {
        return adLine3;
    }


    /**
     * Sets the adLine3 value for this CustomerType.
     * 
     * @param adLine3
     */
    public void setAdLine3(String adLine3) {
        this.adLine3 = adLine3;
    }


    /**
     * Gets the adCity value for this CustomerType.
     * 
     * @return adCity
     */
    public String getAdCity() {
        return adCity;
    }


    /**
     * Sets the adCity value for this CustomerType.
     * 
     * @param adCity
     */
    public void setAdCity(String adCity) {
        this.adCity = adCity;
    }


    /**
     * Gets the adState value for this CustomerType.
     * 
     * @return adState
     */
    public String getAdState() {
        return adState;
    }


    /**
     * Sets the adState value for this CustomerType.
     * 
     * @param adState
     */
    public void setAdState(String adState) {
        this.adState = adState;
    }


    /**
     * Gets the adZip value for this CustomerType.
     * 
     * @return adZip
     */
    public String getAdZip() {
        return adZip;
    }


    /**
     * Sets the adZip value for this CustomerType.
     * 
     * @param adZip
     */
    public void setAdZip(String adZip) {
        this.adZip = adZip;
    }


    /**
     * Gets the adFormat value for this CustomerType.
     * 
     * @return adFormat
     */
    public java.lang.Integer getAdFormat() {
        return adFormat;
    }


    /**
     * Sets the adFormat value for this CustomerType.
     * 
     * @param adFormat
     */
    public void setAdFormat(java.lang.Integer adFormat) {
        this.adFormat = adFormat;
    }


    /**
     * Gets the adCtry value for this CustomerType.
     * 
     * @return adCtry
     */
    public String getAdCtry() {
        return adCtry;
    }


    /**
     * Sets the adCtry value for this CustomerType.
     * 
     * @param adCtry
     */
    public void setAdCtry(String adCtry) {
        this.adCtry = adCtry;
    }


    /**
     * Gets the adCounty value for this CustomerType.
     * 
     * @return adCounty
     */
    public String getAdCounty() {
        return adCounty;
    }


    /**
     * Sets the adCounty value for this CustomerType.
     * 
     * @param adCounty
     */
    public void setAdCounty(String adCounty) {
        this.adCounty = adCounty;
    }


    /**
     * Gets the adAttn value for this CustomerType.
     * 
     * @return adAttn
     */
    public String getAdAttn() {
        return adAttn;
    }


    /**
     * Sets the adAttn value for this CustomerType.
     * 
     * @param adAttn
     */
    public void setAdAttn(String adAttn) {
        this.adAttn = adAttn;
    }


    /**
     * Gets the adPhone value for this CustomerType.
     * 
     * @return adPhone
     */
    public String getAdPhone() {
        return adPhone;
    }


    /**
     * Sets the adPhone value for this CustomerType.
     * 
     * @param adPhone
     */
    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone;
    }


    /**
     * Gets the adExt value for this CustomerType.
     * 
     * @return adExt
     */
    public String getAdExt() {
        return adExt;
    }


    /**
     * Sets the adExt value for this CustomerType.
     * 
     * @param adExt
     */
    public void setAdExt(String adExt) {
        this.adExt = adExt;
    }


    /**
     * Gets the adFax value for this CustomerType.
     * 
     * @return adFax
     */
    public String getAdFax() {
        return adFax;
    }


    /**
     * Sets the adFax value for this CustomerType.
     * 
     * @param adFax
     */
    public void setAdFax(String adFax) {
        this.adFax = adFax;
    }


    /**
     * Gets the adAttn2 value for this CustomerType.
     * 
     * @return adAttn2
     */
    public String getAdAttn2() {
        return adAttn2;
    }


    /**
     * Sets the adAttn2 value for this CustomerType.
     * 
     * @param adAttn2
     */
    public void setAdAttn2(String adAttn2) {
        this.adAttn2 = adAttn2;
    }


    /**
     * Gets the adPhone2 value for this CustomerType.
     * 
     * @return adPhone2
     */
    public String getAdPhone2() {
        return adPhone2;
    }


    /**
     * Sets the adPhone2 value for this CustomerType.
     * 
     * @param adPhone2
     */
    public void setAdPhone2(String adPhone2) {
        this.adPhone2 = adPhone2;
    }


    /**
     * Gets the adExt2 value for this CustomerType.
     * 
     * @return adExt2
     */
    public String getAdExt2() {
        return adExt2;
    }


    /**
     * Sets the adExt2 value for this CustomerType.
     * 
     * @param adExt2
     */
    public void setAdExt2(String adExt2) {
        this.adExt2 = adExt2;
    }


    /**
     * Gets the adFax2 value for this CustomerType.
     * 
     * @return adFax2
     */
    public String getAdFax2() {
        return adFax2;
    }


    /**
     * Sets the adFax2 value for this CustomerType.
     * 
     * @param adFax2
     */
    public void setAdFax2(String adFax2) {
        this.adFax2 = adFax2;
    }


    /**
     * Gets the adDate value for this CustomerType.
     * 
     * @return adDate
     */
    public java.util.Date getAdDate() {
        return adDate;
    }


    /**
     * Sets the adDate value for this CustomerType.
     * 
     * @param adDate
     */
    public void setAdDate(java.util.Date adDate) {
        this.adDate = adDate;
    }


    /**
     * Gets the cmSort value for this CustomerType.
     * 
     * @return cmSort
     */
    public String getCmSort() {
        return cmSort;
    }


    /**
     * Sets the cmSort value for this CustomerType.
     * 
     * @param cmSort
     */
    public void setCmSort(String cmSort) {
        this.cmSort = cmSort;
    }


    /**
     * Gets the cmSlspsn value for this CustomerType.
     * 
     * @return cmSlspsn
     */
    public String getCmSlspsn() {
        return cmSlspsn;
    }


    /**
     * Sets the cmSlspsn value for this CustomerType.
     * 
     * @param cmSlspsn
     */
    public void setCmSlspsn(String cmSlspsn) {
        this.cmSlspsn = cmSlspsn;
    }


    /**
     * Gets the multSlspsn value for this CustomerType.
     * 
     * @return multSlspsn
     */
    public java.lang.Boolean getMultSlspsn() {
        return multSlspsn;
    }


    /**
     * Sets the multSlspsn value for this CustomerType.
     * 
     * @param multSlspsn
     */
    public void setMultSlspsn(java.lang.Boolean multSlspsn) {
        this.multSlspsn = multSlspsn;
    }


    /**
     * Gets the cmShipvia value for this CustomerType.
     * 
     * @return cmShipvia
     */
    public String getCmShipvia() {
        return cmShipvia;
    }


    /**
     * Sets the cmShipvia value for this CustomerType.
     * 
     * @param cmShipvia
     */
    public void setCmShipvia(String cmShipvia) {
        this.cmShipvia = cmShipvia;
    }


    /**
     * Gets the cmArAcct value for this CustomerType.
     * 
     * @return cmArAcct
     */
    public String getCmArAcct() {
        return cmArAcct;
    }


    /**
     * Sets the cmArAcct value for this CustomerType.
     * 
     * @param cmArAcct
     */
    public void setCmArAcct(String cmArAcct) {
        this.cmArAcct = cmArAcct;
    }


    /**
     * Gets the cmArSub value for this CustomerType.
     * 
     * @return cmArSub
     */
    public String getCmArSub() {
        return cmArSub;
    }


    /**
     * Sets the cmArSub value for this CustomerType.
     * 
     * @param cmArSub
     */
    public void setCmArSub(String cmArSub) {
        this.cmArSub = cmArSub;
    }


    /**
     * Gets the cmArCc value for this CustomerType.
     * 
     * @return cmArCc
     */
    public String getCmArCc() {
        return cmArCc;
    }


    /**
     * Sets the cmArCc value for this CustomerType.
     * 
     * @param cmArCc
     */
    public void setCmArCc(String cmArCc) {
        this.cmArCc = cmArCc;
    }


    /**
     * Gets the cmResale value for this CustomerType.
     * 
     * @return cmResale
     */
    public String getCmResale() {
        return cmResale;
    }


    /**
     * Sets the cmResale value for this CustomerType.
     * 
     * @param cmResale
     */
    public void setCmResale(String cmResale) {
        this.cmResale = cmResale;
    }


    /**
     * Gets the cmRmks value for this CustomerType.
     * 
     * @return cmRmks
     */
    public String getCmRmks() {
        return cmRmks;
    }


    /**
     * Sets the cmRmks value for this CustomerType.
     * 
     * @param cmRmks
     */
    public void setCmRmks(String cmRmks) {
        this.cmRmks = cmRmks;
    }


    /**
     * Gets the cmType value for this CustomerType.
     * 
     * @return cmType
     */
    public String getCmType() {
        return cmType;
    }


    /**
     * Sets the cmType value for this CustomerType.
     * 
     * @param cmType
     */
    public void setCmType(String cmType) {
        this.cmType = cmType;
    }


    /**
     * Gets the cmRegion value for this CustomerType.
     * 
     * @return cmRegion
     */
    public String getCmRegion() {
        return cmRegion;
    }


    /**
     * Sets the cmRegion value for this CustomerType.
     * 
     * @param cmRegion
     */
    public void setCmRegion(String cmRegion) {
        this.cmRegion = cmRegion;
    }


    /**
     * Gets the cmCurr value for this CustomerType.
     * 
     * @return cmCurr
     */
    public String getCmCurr() {
        return cmCurr;
    }


    /**
     * Sets the cmCurr value for this CustomerType.
     * 
     * @param cmCurr
     */
    public void setCmCurr(String cmCurr) {
        this.cmCurr = cmCurr;
    }


    /**
     * Gets the cmScurr value for this CustomerType.
     * 
     * @return cmScurr
     */
    public String getCmScurr() {
        return cmScurr;
    }


    /**
     * Sets the cmScurr value for this CustomerType.
     * 
     * @param cmScurr
     */
    public void setCmScurr(String cmScurr) {
        this.cmScurr = cmScurr;
    }


    /**
     * Gets the cmSite value for this CustomerType.
     * 
     * @return cmSite
     */
    public String getCmSite() {
        return cmSite;
    }


    /**
     * Sets the cmSite value for this CustomerType.
     * 
     * @param cmSite
     */
    public void setCmSite(String cmSite) {
        this.cmSite = cmSite;
    }


    /**
     * Gets the cmLang value for this CustomerType.
     * 
     * @return cmLang
     */
    public String getCmLang() {
        return cmLang;
    }


    /**
     * Sets the cmLang value for this CustomerType.
     * 
     * @param cmLang
     */
    public void setCmLang(String cmLang) {
        this.cmLang = cmLang;
    }


    /**
     * Gets the cmSlspsn1 value for this CustomerType.
     * 
     * @return cmSlspsn1
     */
    public String[] getCmSlspsn1() {
        return cmSlspsn1;
    }


    /**
     * Sets the cmSlspsn1 value for this CustomerType.
     * 
     * @param cmSlspsn1
     */
    public void setCmSlspsn1(String[] cmSlspsn1) {
        this.cmSlspsn1 = cmSlspsn1;
    }

    public String getCmSlspsn1(int i) {
        return this.cmSlspsn1[i];
    }

    public void setCmSlspsn1(int i, String _value) {
        this.cmSlspsn1[i] = _value;
    }


    /**
     * Gets the cmPrList2 value for this CustomerType.
     * 
     * @return cmPrList2
     */
    public String getCmPrList2() {
        return cmPrList2;
    }


    /**
     * Sets the cmPrList2 value for this CustomerType.
     * 
     * @param cmPrList2
     */
    public void setCmPrList2(String cmPrList2) {
        this.cmPrList2 = cmPrList2;
    }


    /**
     * Gets the cmPrList value for this CustomerType.
     * 
     * @return cmPrList
     */
    public String getCmPrList() {
        return cmPrList;
    }


    /**
     * Sets the cmPrList value for this CustomerType.
     * 
     * @param cmPrList
     */
    public void setCmPrList(String cmPrList) {
        this.cmPrList = cmPrList;
    }


    /**
     * Gets the cmFixPr value for this CustomerType.
     * 
     * @return cmFixPr
     */
    public java.lang.Boolean getCmFixPr() {
        return cmFixPr;
    }


    /**
     * Sets the cmFixPr value for this CustomerType.
     * 
     * @param cmFixPr
     */
    public void setCmFixPr(java.lang.Boolean cmFixPr) {
        this.cmFixPr = cmFixPr;
    }


    /**
     * Gets the cmClass value for this CustomerType.
     * 
     * @return cmClass
     */
    public String getCmClass() {
        return cmClass;
    }


    /**
     * Sets the cmClass value for this CustomerType.
     * 
     * @param cmClass
     */
    public void setCmClass(String cmClass) {
        this.cmClass = cmClass;
    }


    /**
     * Gets the cmSic value for this CustomerType.
     * 
     * @return cmSic
     */
    public String getCmSic() {
        return cmSic;
    }


    /**
     * Sets the cmSic value for this CustomerType.
     * 
     * @param cmSic
     */
    public void setCmSic(String cmSic) {
        this.cmSic = cmSic;
    }


    /**
     * Gets the cmPartial value for this CustomerType.
     * 
     * @return cmPartial
     */
    public java.lang.Boolean getCmPartial() {
        return cmPartial;
    }


    /**
     * Sets the cmPartial value for this CustomerType.
     * 
     * @param cmPartial
     */
    public void setCmPartial(java.lang.Boolean cmPartial) {
        this.cmPartial = cmPartial;
    }


    /**
     * Gets the cmQadl01 value for this CustomerType.
     * 
     * @return cmQadl01
     */
    public java.lang.Boolean getCmQadl01() {
        return cmQadl01;
    }


    /**
     * Sets the cmQadl01 value for this CustomerType.
     * 
     * @param cmQadl01
     */
    public void setCmQadl01(java.lang.Boolean cmQadl01) {
        this.cmQadl01 = cmQadl01;
    }


    /**
     * Gets the priceListFailed value for this CustomerType.
     * 
     * @return priceListFailed
     */
    public java.lang.Boolean getPriceListFailed() {
        return priceListFailed;
    }


    /**
     * Sets the priceListFailed value for this CustomerType.
     * 
     * @param priceListFailed
     */
    public void setPriceListFailed(java.lang.Boolean priceListFailed) {
        this.priceListFailed = priceListFailed;
    }


    /**
     * Gets the discListFailed value for this CustomerType.
     * 
     * @return discListFailed
     */
    public java.lang.Boolean getDiscListFailed() {
        return discListFailed;
    }


    /**
     * Sets the discListFailed value for this CustomerType.
     * 
     * @param discListFailed
     */
    public void setDiscListFailed(java.lang.Boolean discListFailed) {
        this.discListFailed = discListFailed;
    }


    /**
     * Gets the adTaxable value for this CustomerType.
     * 
     * @return adTaxable
     */
    public java.lang.Boolean getAdTaxable() {
        return adTaxable;
    }


    /**
     * Sets the adTaxable value for this CustomerType.
     * 
     * @param adTaxable
     */
    public void setAdTaxable(java.lang.Boolean adTaxable) {
        this.adTaxable = adTaxable;
    }


    /**
     * Gets the adTaxZone value for this CustomerType.
     * 
     * @return adTaxZone
     */
    public String getAdTaxZone() {
        return adTaxZone;
    }


    /**
     * Sets the adTaxZone value for this CustomerType.
     * 
     * @param adTaxZone
     */
    public void setAdTaxZone(String adTaxZone) {
        this.adTaxZone = adTaxZone;
    }


    /**
     * Gets the adTaxc value for this CustomerType.
     * 
     * @return adTaxc
     */
    public String getAdTaxc() {
        return adTaxc;
    }


    /**
     * Sets the adTaxc value for this CustomerType.
     * 
     * @param adTaxc
     */
    public void setAdTaxc(String adTaxc) {
        this.adTaxc = adTaxc;
    }


    /**
     * Gets the adTaxUsage value for this CustomerType.
     * 
     * @return adTaxUsage
     */
    public String getAdTaxUsage() {
        return adTaxUsage;
    }


    /**
     * Sets the adTaxUsage value for this CustomerType.
     * 
     * @param adTaxUsage
     */
    public void setAdTaxUsage(String adTaxUsage) {
        this.adTaxUsage = adTaxUsage;
    }


    /**
     * Gets the adTaxIn value for this CustomerType.
     * 
     * @return adTaxIn
     */
    public java.lang.Boolean getAdTaxIn() {
        return adTaxIn;
    }


    /**
     * Sets the adTaxIn value for this CustomerType.
     * 
     * @param adTaxIn
     */
    public void setAdTaxIn(java.lang.Boolean adTaxIn) {
        this.adTaxIn = adTaxIn;
    }


    /**
     * Gets the adGstId value for this CustomerType.
     * 
     * @return adGstId
     */
    public String getAdGstId() {
        return adGstId;
    }


    /**
     * Sets the adGstId value for this CustomerType.
     * 
     * @param adGstId
     */
    public void setAdGstId(String adGstId) {
        this.adGstId = adGstId;
    }


    /**
     * Gets the adPstId value for this CustomerType.
     * 
     * @return adPstId
     */
    public String getAdPstId() {
        return adPstId;
    }


    /**
     * Sets the adPstId value for this CustomerType.
     * 
     * @param adPstId
     */
    public void setAdPstId(String adPstId) {
        this.adPstId = adPstId;
    }


    /**
     * Gets the adMisc1Id value for this CustomerType.
     * 
     * @return adMisc1Id
     */
    public String getAdMisc1Id() {
        return adMisc1Id;
    }


    /**
     * Sets the adMisc1Id value for this CustomerType.
     * 
     * @param adMisc1Id
     */
    public void setAdMisc1Id(String adMisc1Id) {
        this.adMisc1Id = adMisc1Id;
    }


    /**
     * Gets the adMisc2Id value for this CustomerType.
     * 
     * @return adMisc2Id
     */
    public String getAdMisc2Id() {
        return adMisc2Id;
    }


    /**
     * Sets the adMisc2Id value for this CustomerType.
     * 
     * @param adMisc2Id
     */
    public void setAdMisc2Id(String adMisc2Id) {
        this.adMisc2Id = adMisc2Id;
    }


    /**
     * Gets the adMisc3Id value for this CustomerType.
     * 
     * @return adMisc3Id
     */
    public String getAdMisc3Id() {
        return adMisc3Id;
    }


    /**
     * Sets the adMisc3Id value for this CustomerType.
     * 
     * @param adMisc3Id
     */
    public void setAdMisc3Id(String adMisc3Id) {
        this.adMisc3Id = adMisc3Id;
    }


    /**
     * Gets the adTxInCity value for this CustomerType.
     * 
     * @return adTxInCity
     */
    public java.lang.Boolean getAdTxInCity() {
        return adTxInCity;
    }


    /**
     * Sets the adTxInCity value for this CustomerType.
     * 
     * @param adTxInCity
     */
    public void setAdTxInCity(java.lang.Boolean adTxInCity) {
        this.adTxInCity = adTxInCity;
    }


    /**
     * Gets the adTimezone value for this CustomerType.
     * 
     * @return adTimezone
     */
    public String getAdTimezone() {
        return adTimezone;
    }


    /**
     * Sets the adTimezone value for this CustomerType.
     * 
     * @param adTimezone
     */
    public void setAdTimezone(String adTimezone) {
        this.adTimezone = adTimezone;
    }


    /**
     * Gets the cmQad06 value for this CustomerType.
     * 
     * @return cmQad06
     */
    public java.lang.Boolean getCmQad06() {
        return cmQad06;
    }


    /**
     * Sets the cmQad06 value for this CustomerType.
     * 
     * @param cmQad06
     */
    public void setCmQad06(java.lang.Boolean cmQad06) {
        this.cmQad06 = cmQad06;
    }


    /**
     * Gets the cmCrLimit value for this CustomerType.
     * 
     * @return cmCrLimit
     */
    public java.math.BigDecimal getCmCrLimit() {
        return cmCrLimit;
    }


    /**
     * Sets the cmCrLimit value for this CustomerType.
     * 
     * @param cmCrLimit
     */
    public void setCmCrLimit(java.math.BigDecimal cmCrLimit) {
        this.cmCrLimit = cmCrLimit;
    }


    /**
     * Gets the cmCrTerms value for this CustomerType.
     * 
     * @return cmCrTerms
     */
    public String getCmCrTerms() {
        return cmCrTerms;
    }


    /**
     * Sets the cmCrTerms value for this CustomerType.
     * 
     * @param cmCrTerms
     */
    public void setCmCrTerms(String cmCrTerms) {
        this.cmCrTerms = cmCrTerms;
    }


    /**
     * Gets the cmCrHold value for this CustomerType.
     * 
     * @return cmCrHold
     */
    public java.lang.Boolean getCmCrHold() {
        return cmCrHold;
    }


    /**
     * Sets the cmCrHold value for this CustomerType.
     * 
     * @param cmCrHold
     */
    public void setCmCrHold(java.lang.Boolean cmCrHold) {
        this.cmCrHold = cmCrHold;
    }


    /**
     * Gets the cmCrRating value for this CustomerType.
     * 
     * @return cmCrRating
     */
    public String getCmCrRating() {
        return cmCrRating;
    }


    /**
     * Sets the cmCrRating value for this CustomerType.
     * 
     * @param cmCrRating
     */
    public void setCmCrRating(String cmCrRating) {
        this.cmCrRating = cmCrRating;
    }


    /**
     * Gets the cmDb value for this CustomerType.
     * 
     * @return cmDb
     */
    public String getCmDb() {
        return cmDb;
    }


    /**
     * Sets the cmDb value for this CustomerType.
     * 
     * @param cmDb
     */
    public void setCmDb(String cmDb) {
        this.cmDb = cmDb;
    }


    /**
     * Gets the cmPoReqd value for this CustomerType.
     * 
     * @return cmPoReqd
     */
    public java.lang.Boolean getCmPoReqd() {
        return cmPoReqd;
    }


    /**
     * Sets the cmPoReqd value for this CustomerType.
     * 
     * @param cmPoReqd
     */
    public void setCmPoReqd(java.lang.Boolean cmPoReqd) {
        this.cmPoReqd = cmPoReqd;
    }


    /**
     * Gets the cmDiscPct value for this CustomerType.
     * 
     * @return cmDiscPct
     */
    public java.math.BigDecimal getCmDiscPct() {
        return cmDiscPct;
    }


    /**
     * Sets the cmDiscPct value for this CustomerType.
     * 
     * @param cmDiscPct
     */
    public void setCmDiscPct(java.math.BigDecimal cmDiscPct) {
        this.cmDiscPct = cmDiscPct;
    }


    /**
     * Gets the cmFin value for this CustomerType.
     * 
     * @return cmFin
     */
    public java.lang.Boolean getCmFin() {
        return cmFin;
    }


    /**
     * Sets the cmFin value for this CustomerType.
     * 
     * @param cmFin
     */
    public void setCmFin(java.lang.Boolean cmFin) {
        this.cmFin = cmFin;
    }


    /**
     * Gets the cmStmt value for this CustomerType.
     * 
     * @return cmStmt
     */
    public java.lang.Boolean getCmStmt() {
        return cmStmt;
    }


    /**
     * Sets the cmStmt value for this CustomerType.
     * 
     * @param cmStmt
     */
    public void setCmStmt(java.lang.Boolean cmStmt) {
        this.cmStmt = cmStmt;
    }


    /**
     * Gets the cmStmtCyc value for this CustomerType.
     * 
     * @return cmStmtCyc
     */
    public String getCmStmtCyc() {
        return cmStmtCyc;
    }


    /**
     * Sets the cmStmtCyc value for this CustomerType.
     * 
     * @param cmStmtCyc
     */
    public void setCmStmtCyc(String cmStmtCyc) {
        this.cmStmtCyc = cmStmtCyc;
    }


    /**
     * Gets the cmDun value for this CustomerType.
     * 
     * @return cmDun
     */
    public java.lang.Boolean getCmDun() {
        return cmDun;
    }


    /**
     * Sets the cmDun value for this CustomerType.
     * 
     * @param cmDun
     */
    public void setCmDun(java.lang.Boolean cmDun) {
        this.cmDun = cmDun;
    }


    /**
     * Gets the cmBill value for this CustomerType.
     * 
     * @return cmBill
     */
    public String getCmBill() {
        return cmBill;
    }


    /**
     * Sets the cmBill value for this CustomerType.
     * 
     * @param cmBill
     */
    public void setCmBill(String cmBill) {
        this.cmBill = cmBill;
    }


    /**
     * Gets the cmCrReview value for this CustomerType.
     * 
     * @return cmCrReview
     */
    public java.util.Date getCmCrReview() {
        return cmCrReview;
    }


    /**
     * Sets the cmCrReview value for this CustomerType.
     * 
     * @param cmCrReview
     */
    public void setCmCrReview(java.util.Date cmCrReview) {
        this.cmCrReview = cmCrReview;
    }


    /**
     * Gets the cmCrUpdate value for this CustomerType.
     * 
     * @return cmCrUpdate
     */
    public java.util.Date getCmCrUpdate() {
        return cmCrUpdate;
    }


    /**
     * Sets the cmCrUpdate value for this CustomerType.
     * 
     * @param cmCrUpdate
     */
    public void setCmCrUpdate(java.util.Date cmCrUpdate) {
        this.cmCrUpdate = cmCrUpdate;
    }


    /**
     * Gets the cmFrList value for this CustomerType.
     * 
     * @return cmFrList
     */
    public String getCmFrList() {
        return cmFrList;
    }


    /**
     * Sets the cmFrList value for this CustomerType.
     * 
     * @param cmFrList
     */
    public void setCmFrList(String cmFrList) {
        this.cmFrList = cmFrList;
    }


    /**
     * Gets the cmFrMinWt value for this CustomerType.
     * 
     * @return cmFrMinWt
     */
    public java.math.BigDecimal getCmFrMinWt() {
        return cmFrMinWt;
    }


    /**
     * Sets the cmFrMinWt value for this CustomerType.
     * 
     * @param cmFrMinWt
     */
    public void setCmFrMinWt(java.math.BigDecimal cmFrMinWt) {
        this.cmFrMinWt = cmFrMinWt;
    }


    /**
     * Gets the cmFrTerms value for this CustomerType.
     * 
     * @return cmFrTerms
     */
    public String getCmFrTerms() {
        return cmFrTerms;
    }


    /**
     * Sets the cmFrTerms value for this CustomerType.
     * 
     * @param cmFrTerms
     */
    public void setCmFrTerms(String cmFrTerms) {
        this.cmFrTerms = cmFrTerms;
    }


    /**
     * Gets the btbType value for this CustomerType.
     * 
     * @return btbType
     */
    public String getBtbType() {
        return btbType;
    }


    /**
     * Sets the btbType value for this CustomerType.
     * 
     * @param btbType
     */
    public void setBtbType(String btbType) {
        this.btbType = btbType;
    }


    /**
     * Gets the cmShipLt value for this CustomerType.
     * 
     * @return cmShipLt
     */
    public java.lang.Integer getCmShipLt() {
        return cmShipLt;
    }


    /**
     * Sets the cmShipLt value for this CustomerType.
     * 
     * @param cmShipLt
     */
    public void setCmShipLt(java.lang.Integer cmShipLt) {
        this.cmShipLt = cmShipLt;
    }


    /**
     * Gets the cmBtbMthd value for this CustomerType.
     * 
     * @return cmBtbMthd
     */
    public java.lang.Boolean getCmBtbMthd() {
        return cmBtbMthd;
    }


    /**
     * Sets the cmBtbMthd value for this CustomerType.
     * 
     * @param cmBtbMthd
     */
    public void setCmBtbMthd(java.lang.Boolean cmBtbMthd) {
        this.cmBtbMthd = cmBtbMthd;
    }


    /**
     * Gets the cmBtbCr value for this CustomerType.
     * 
     * @return cmBtbCr
     */
    public java.lang.Boolean getCmBtbCr() {
        return cmBtbCr;
    }


    /**
     * Sets the cmBtbCr value for this CustomerType.
     * 
     * @param cmBtbCr
     */
    public void setCmBtbCr(java.lang.Boolean cmBtbCr) {
        this.cmBtbCr = cmBtbCr;
    }


    /**
     * Gets the bankAccounts value for this CustomerType.
     * 
     * @return bankAccounts
     */
    public com.breden.springboot.customer.webservices.BankAccountsType[] getBankAccounts() {
        return bankAccounts;
    }


    /**
     * Sets the bankAccounts value for this CustomerType.
     * 
     * @param bankAccounts
     */
    public void setBankAccounts(com.breden.springboot.customer.webservices.BankAccountsType[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public com.breden.springboot.customer.webservices.BankAccountsType getBankAccounts(int i) {
        return this.bankAccounts[i];
    }

    public void setBankAccounts(int i, com.breden.springboot.customer.webservices.BankAccountsType _value) {
        this.bankAccounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerType)) return false;
        CustomerType other = (CustomerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.cmAddr==null && other.getCmAddr()==null) || 
             (this.cmAddr!=null &&
              this.cmAddr.equals(other.getCmAddr()))) &&
            ((this.adName==null && other.getAdName()==null) || 
             (this.adName!=null &&
              this.adName.equals(other.getAdName()))) &&
            ((this.adLine1==null && other.getAdLine1()==null) || 
             (this.adLine1!=null &&
              this.adLine1.equals(other.getAdLine1()))) &&
            ((this.adLine2==null && other.getAdLine2()==null) || 
             (this.adLine2!=null &&
              this.adLine2.equals(other.getAdLine2()))) &&
            ((this.adLine3==null && other.getAdLine3()==null) || 
             (this.adLine3!=null &&
              this.adLine3.equals(other.getAdLine3()))) &&
            ((this.adCity==null && other.getAdCity()==null) || 
             (this.adCity!=null &&
              this.adCity.equals(other.getAdCity()))) &&
            ((this.adState==null && other.getAdState()==null) || 
             (this.adState!=null &&
              this.adState.equals(other.getAdState()))) &&
            ((this.adZip==null && other.getAdZip()==null) || 
             (this.adZip!=null &&
              this.adZip.equals(other.getAdZip()))) &&
            ((this.adFormat==null && other.getAdFormat()==null) || 
             (this.adFormat!=null &&
              this.adFormat.equals(other.getAdFormat()))) &&
            ((this.adCtry==null && other.getAdCtry()==null) || 
             (this.adCtry!=null &&
              this.adCtry.equals(other.getAdCtry()))) &&
            ((this.adCounty==null && other.getAdCounty()==null) || 
             (this.adCounty!=null &&
              this.adCounty.equals(other.getAdCounty()))) &&
            ((this.adAttn==null && other.getAdAttn()==null) || 
             (this.adAttn!=null &&
              this.adAttn.equals(other.getAdAttn()))) &&
            ((this.adPhone==null && other.getAdPhone()==null) || 
             (this.adPhone!=null &&
              this.adPhone.equals(other.getAdPhone()))) &&
            ((this.adExt==null && other.getAdExt()==null) || 
             (this.adExt!=null &&
              this.adExt.equals(other.getAdExt()))) &&
            ((this.adFax==null && other.getAdFax()==null) || 
             (this.adFax!=null &&
              this.adFax.equals(other.getAdFax()))) &&
            ((this.adAttn2==null && other.getAdAttn2()==null) || 
             (this.adAttn2!=null &&
              this.adAttn2.equals(other.getAdAttn2()))) &&
            ((this.adPhone2==null && other.getAdPhone2()==null) || 
             (this.adPhone2!=null &&
              this.adPhone2.equals(other.getAdPhone2()))) &&
            ((this.adExt2==null && other.getAdExt2()==null) || 
             (this.adExt2!=null &&
              this.adExt2.equals(other.getAdExt2()))) &&
            ((this.adFax2==null && other.getAdFax2()==null) || 
             (this.adFax2!=null &&
              this.adFax2.equals(other.getAdFax2()))) &&
            ((this.adDate==null && other.getAdDate()==null) || 
             (this.adDate!=null &&
              this.adDate.equals(other.getAdDate()))) &&
            ((this.cmSort==null && other.getCmSort()==null) || 
             (this.cmSort!=null &&
              this.cmSort.equals(other.getCmSort()))) &&
            ((this.cmSlspsn==null && other.getCmSlspsn()==null) || 
             (this.cmSlspsn!=null &&
              this.cmSlspsn.equals(other.getCmSlspsn()))) &&
            ((this.multSlspsn==null && other.getMultSlspsn()==null) || 
             (this.multSlspsn!=null &&
              this.multSlspsn.equals(other.getMultSlspsn()))) &&
            ((this.cmShipvia==null && other.getCmShipvia()==null) || 
             (this.cmShipvia!=null &&
              this.cmShipvia.equals(other.getCmShipvia()))) &&
            ((this.cmArAcct==null && other.getCmArAcct()==null) || 
             (this.cmArAcct!=null &&
              this.cmArAcct.equals(other.getCmArAcct()))) &&
            ((this.cmArSub==null && other.getCmArSub()==null) || 
             (this.cmArSub!=null &&
              this.cmArSub.equals(other.getCmArSub()))) &&
            ((this.cmArCc==null && other.getCmArCc()==null) || 
             (this.cmArCc!=null &&
              this.cmArCc.equals(other.getCmArCc()))) &&
            ((this.cmResale==null && other.getCmResale()==null) || 
             (this.cmResale!=null &&
              this.cmResale.equals(other.getCmResale()))) &&
            ((this.cmRmks==null && other.getCmRmks()==null) || 
             (this.cmRmks!=null &&
              this.cmRmks.equals(other.getCmRmks()))) &&
            ((this.cmType==null && other.getCmType()==null) || 
             (this.cmType!=null &&
              this.cmType.equals(other.getCmType()))) &&
            ((this.cmRegion==null && other.getCmRegion()==null) || 
             (this.cmRegion!=null &&
              this.cmRegion.equals(other.getCmRegion()))) &&
            ((this.cmCurr==null && other.getCmCurr()==null) || 
             (this.cmCurr!=null &&
              this.cmCurr.equals(other.getCmCurr()))) &&
            ((this.cmScurr==null && other.getCmScurr()==null) || 
             (this.cmScurr!=null &&
              this.cmScurr.equals(other.getCmScurr()))) &&
            ((this.cmSite==null && other.getCmSite()==null) || 
             (this.cmSite!=null &&
              this.cmSite.equals(other.getCmSite()))) &&
            ((this.cmLang==null && other.getCmLang()==null) || 
             (this.cmLang!=null &&
              this.cmLang.equals(other.getCmLang()))) &&
            ((this.cmSlspsn1==null && other.getCmSlspsn1()==null) || 
             (this.cmSlspsn1!=null &&
              java.util.Arrays.equals(this.cmSlspsn1, other.getCmSlspsn1()))) &&
            ((this.cmPrList2==null && other.getCmPrList2()==null) || 
             (this.cmPrList2!=null &&
              this.cmPrList2.equals(other.getCmPrList2()))) &&
            ((this.cmPrList==null && other.getCmPrList()==null) || 
             (this.cmPrList!=null &&
              this.cmPrList.equals(other.getCmPrList()))) &&
            ((this.cmFixPr==null && other.getCmFixPr()==null) || 
             (this.cmFixPr!=null &&
              this.cmFixPr.equals(other.getCmFixPr()))) &&
            ((this.cmClass==null && other.getCmClass()==null) || 
             (this.cmClass!=null &&
              this.cmClass.equals(other.getCmClass()))) &&
            ((this.cmSic==null && other.getCmSic()==null) || 
             (this.cmSic!=null &&
              this.cmSic.equals(other.getCmSic()))) &&
            ((this.cmPartial==null && other.getCmPartial()==null) || 
             (this.cmPartial!=null &&
              this.cmPartial.equals(other.getCmPartial()))) &&
            ((this.cmQadl01==null && other.getCmQadl01()==null) || 
             (this.cmQadl01!=null &&
              this.cmQadl01.equals(other.getCmQadl01()))) &&
            ((this.priceListFailed==null && other.getPriceListFailed()==null) || 
             (this.priceListFailed!=null &&
              this.priceListFailed.equals(other.getPriceListFailed()))) &&
            ((this.discListFailed==null && other.getDiscListFailed()==null) || 
             (this.discListFailed!=null &&
              this.discListFailed.equals(other.getDiscListFailed()))) &&
            ((this.adTaxable==null && other.getAdTaxable()==null) || 
             (this.adTaxable!=null &&
              this.adTaxable.equals(other.getAdTaxable()))) &&
            ((this.adTaxZone==null && other.getAdTaxZone()==null) || 
             (this.adTaxZone!=null &&
              this.adTaxZone.equals(other.getAdTaxZone()))) &&
            ((this.adTaxc==null && other.getAdTaxc()==null) || 
             (this.adTaxc!=null &&
              this.adTaxc.equals(other.getAdTaxc()))) &&
            ((this.adTaxUsage==null && other.getAdTaxUsage()==null) || 
             (this.adTaxUsage!=null &&
              this.adTaxUsage.equals(other.getAdTaxUsage()))) &&
            ((this.adTaxIn==null && other.getAdTaxIn()==null) || 
             (this.adTaxIn!=null &&
              this.adTaxIn.equals(other.getAdTaxIn()))) &&
            ((this.adGstId==null && other.getAdGstId()==null) || 
             (this.adGstId!=null &&
              this.adGstId.equals(other.getAdGstId()))) &&
            ((this.adPstId==null && other.getAdPstId()==null) || 
             (this.adPstId!=null &&
              this.adPstId.equals(other.getAdPstId()))) &&
            ((this.adMisc1Id==null && other.getAdMisc1Id()==null) || 
             (this.adMisc1Id!=null &&
              this.adMisc1Id.equals(other.getAdMisc1Id()))) &&
            ((this.adMisc2Id==null && other.getAdMisc2Id()==null) || 
             (this.adMisc2Id!=null &&
              this.adMisc2Id.equals(other.getAdMisc2Id()))) &&
            ((this.adMisc3Id==null && other.getAdMisc3Id()==null) || 
             (this.adMisc3Id!=null &&
              this.adMisc3Id.equals(other.getAdMisc3Id()))) &&
            ((this.adTxInCity==null && other.getAdTxInCity()==null) || 
             (this.adTxInCity!=null &&
              this.adTxInCity.equals(other.getAdTxInCity()))) &&
            ((this.adTimezone==null && other.getAdTimezone()==null) || 
             (this.adTimezone!=null &&
              this.adTimezone.equals(other.getAdTimezone()))) &&
            ((this.cmQad06==null && other.getCmQad06()==null) || 
             (this.cmQad06!=null &&
              this.cmQad06.equals(other.getCmQad06()))) &&
            ((this.cmCrLimit==null && other.getCmCrLimit()==null) || 
             (this.cmCrLimit!=null &&
              this.cmCrLimit.equals(other.getCmCrLimit()))) &&
            ((this.cmCrTerms==null && other.getCmCrTerms()==null) || 
             (this.cmCrTerms!=null &&
              this.cmCrTerms.equals(other.getCmCrTerms()))) &&
            ((this.cmCrHold==null && other.getCmCrHold()==null) || 
             (this.cmCrHold!=null &&
              this.cmCrHold.equals(other.getCmCrHold()))) &&
            ((this.cmCrRating==null && other.getCmCrRating()==null) || 
             (this.cmCrRating!=null &&
              this.cmCrRating.equals(other.getCmCrRating()))) &&
            ((this.cmDb==null && other.getCmDb()==null) || 
             (this.cmDb!=null &&
              this.cmDb.equals(other.getCmDb()))) &&
            ((this.cmPoReqd==null && other.getCmPoReqd()==null) || 
             (this.cmPoReqd!=null &&
              this.cmPoReqd.equals(other.getCmPoReqd()))) &&
            ((this.cmDiscPct==null && other.getCmDiscPct()==null) || 
             (this.cmDiscPct!=null &&
              this.cmDiscPct.equals(other.getCmDiscPct()))) &&
            ((this.cmFin==null && other.getCmFin()==null) || 
             (this.cmFin!=null &&
              this.cmFin.equals(other.getCmFin()))) &&
            ((this.cmStmt==null && other.getCmStmt()==null) || 
             (this.cmStmt!=null &&
              this.cmStmt.equals(other.getCmStmt()))) &&
            ((this.cmStmtCyc==null && other.getCmStmtCyc()==null) || 
             (this.cmStmtCyc!=null &&
              this.cmStmtCyc.equals(other.getCmStmtCyc()))) &&
            ((this.cmDun==null && other.getCmDun()==null) || 
             (this.cmDun!=null &&
              this.cmDun.equals(other.getCmDun()))) &&
            ((this.cmBill==null && other.getCmBill()==null) || 
             (this.cmBill!=null &&
              this.cmBill.equals(other.getCmBill()))) &&
            ((this.cmCrReview==null && other.getCmCrReview()==null) || 
             (this.cmCrReview!=null &&
              this.cmCrReview.equals(other.getCmCrReview()))) &&
            ((this.cmCrUpdate==null && other.getCmCrUpdate()==null) || 
             (this.cmCrUpdate!=null &&
              this.cmCrUpdate.equals(other.getCmCrUpdate()))) &&
            ((this.cmFrList==null && other.getCmFrList()==null) || 
             (this.cmFrList!=null &&
              this.cmFrList.equals(other.getCmFrList()))) &&
            ((this.cmFrMinWt==null && other.getCmFrMinWt()==null) || 
             (this.cmFrMinWt!=null &&
              this.cmFrMinWt.equals(other.getCmFrMinWt()))) &&
            ((this.cmFrTerms==null && other.getCmFrTerms()==null) || 
             (this.cmFrTerms!=null &&
              this.cmFrTerms.equals(other.getCmFrTerms()))) &&
            ((this.btbType==null && other.getBtbType()==null) || 
             (this.btbType!=null &&
              this.btbType.equals(other.getBtbType()))) &&
            ((this.cmShipLt==null && other.getCmShipLt()==null) || 
             (this.cmShipLt!=null &&
              this.cmShipLt.equals(other.getCmShipLt()))) &&
            ((this.cmBtbMthd==null && other.getCmBtbMthd()==null) || 
             (this.cmBtbMthd!=null &&
              this.cmBtbMthd.equals(other.getCmBtbMthd()))) &&
            ((this.cmBtbCr==null && other.getCmBtbCr()==null) || 
             (this.cmBtbCr!=null &&
              this.cmBtbCr.equals(other.getCmBtbCr()))) &&
            ((this.bankAccounts==null && other.getBankAccounts()==null) || 
             (this.bankAccounts!=null &&
              java.util.Arrays.equals(this.bankAccounts, other.getBankAccounts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getCmAddr() != null) {
            _hashCode += getCmAddr().hashCode();
        }
        if (getAdName() != null) {
            _hashCode += getAdName().hashCode();
        }
        if (getAdLine1() != null) {
            _hashCode += getAdLine1().hashCode();
        }
        if (getAdLine2() != null) {
            _hashCode += getAdLine2().hashCode();
        }
        if (getAdLine3() != null) {
            _hashCode += getAdLine3().hashCode();
        }
        if (getAdCity() != null) {
            _hashCode += getAdCity().hashCode();
        }
        if (getAdState() != null) {
            _hashCode += getAdState().hashCode();
        }
        if (getAdZip() != null) {
            _hashCode += getAdZip().hashCode();
        }
        if (getAdFormat() != null) {
            _hashCode += getAdFormat().hashCode();
        }
        if (getAdCtry() != null) {
            _hashCode += getAdCtry().hashCode();
        }
        if (getAdCounty() != null) {
            _hashCode += getAdCounty().hashCode();
        }
        if (getAdAttn() != null) {
            _hashCode += getAdAttn().hashCode();
        }
        if (getAdPhone() != null) {
            _hashCode += getAdPhone().hashCode();
        }
        if (getAdExt() != null) {
            _hashCode += getAdExt().hashCode();
        }
        if (getAdFax() != null) {
            _hashCode += getAdFax().hashCode();
        }
        if (getAdAttn2() != null) {
            _hashCode += getAdAttn2().hashCode();
        }
        if (getAdPhone2() != null) {
            _hashCode += getAdPhone2().hashCode();
        }
        if (getAdExt2() != null) {
            _hashCode += getAdExt2().hashCode();
        }
        if (getAdFax2() != null) {
            _hashCode += getAdFax2().hashCode();
        }
        if (getAdDate() != null) {
            _hashCode += getAdDate().hashCode();
        }
        if (getCmSort() != null) {
            _hashCode += getCmSort().hashCode();
        }
        if (getCmSlspsn() != null) {
            _hashCode += getCmSlspsn().hashCode();
        }
        if (getMultSlspsn() != null) {
            _hashCode += getMultSlspsn().hashCode();
        }
        if (getCmShipvia() != null) {
            _hashCode += getCmShipvia().hashCode();
        }
        if (getCmArAcct() != null) {
            _hashCode += getCmArAcct().hashCode();
        }
        if (getCmArSub() != null) {
            _hashCode += getCmArSub().hashCode();
        }
        if (getCmArCc() != null) {
            _hashCode += getCmArCc().hashCode();
        }
        if (getCmResale() != null) {
            _hashCode += getCmResale().hashCode();
        }
        if (getCmRmks() != null) {
            _hashCode += getCmRmks().hashCode();
        }
        if (getCmType() != null) {
            _hashCode += getCmType().hashCode();
        }
        if (getCmRegion() != null) {
            _hashCode += getCmRegion().hashCode();
        }
        if (getCmCurr() != null) {
            _hashCode += getCmCurr().hashCode();
        }
        if (getCmScurr() != null) {
            _hashCode += getCmScurr().hashCode();
        }
        if (getCmSite() != null) {
            _hashCode += getCmSite().hashCode();
        }
        if (getCmLang() != null) {
            _hashCode += getCmLang().hashCode();
        }
        if (getCmSlspsn1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmSlspsn1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmSlspsn1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmPrList2() != null) {
            _hashCode += getCmPrList2().hashCode();
        }
        if (getCmPrList() != null) {
            _hashCode += getCmPrList().hashCode();
        }
        if (getCmFixPr() != null) {
            _hashCode += getCmFixPr().hashCode();
        }
        if (getCmClass() != null) {
            _hashCode += getCmClass().hashCode();
        }
        if (getCmSic() != null) {
            _hashCode += getCmSic().hashCode();
        }
        if (getCmPartial() != null) {
            _hashCode += getCmPartial().hashCode();
        }
        if (getCmQadl01() != null) {
            _hashCode += getCmQadl01().hashCode();
        }
        if (getPriceListFailed() != null) {
            _hashCode += getPriceListFailed().hashCode();
        }
        if (getDiscListFailed() != null) {
            _hashCode += getDiscListFailed().hashCode();
        }
        if (getAdTaxable() != null) {
            _hashCode += getAdTaxable().hashCode();
        }
        if (getAdTaxZone() != null) {
            _hashCode += getAdTaxZone().hashCode();
        }
        if (getAdTaxc() != null) {
            _hashCode += getAdTaxc().hashCode();
        }
        if (getAdTaxUsage() != null) {
            _hashCode += getAdTaxUsage().hashCode();
        }
        if (getAdTaxIn() != null) {
            _hashCode += getAdTaxIn().hashCode();
        }
        if (getAdGstId() != null) {
            _hashCode += getAdGstId().hashCode();
        }
        if (getAdPstId() != null) {
            _hashCode += getAdPstId().hashCode();
        }
        if (getAdMisc1Id() != null) {
            _hashCode += getAdMisc1Id().hashCode();
        }
        if (getAdMisc2Id() != null) {
            _hashCode += getAdMisc2Id().hashCode();
        }
        if (getAdMisc3Id() != null) {
            _hashCode += getAdMisc3Id().hashCode();
        }
        if (getAdTxInCity() != null) {
            _hashCode += getAdTxInCity().hashCode();
        }
        if (getAdTimezone() != null) {
            _hashCode += getAdTimezone().hashCode();
        }
        if (getCmQad06() != null) {
            _hashCode += getCmQad06().hashCode();
        }
        if (getCmCrLimit() != null) {
            _hashCode += getCmCrLimit().hashCode();
        }
        if (getCmCrTerms() != null) {
            _hashCode += getCmCrTerms().hashCode();
        }
        if (getCmCrHold() != null) {
            _hashCode += getCmCrHold().hashCode();
        }
        if (getCmCrRating() != null) {
            _hashCode += getCmCrRating().hashCode();
        }
        if (getCmDb() != null) {
            _hashCode += getCmDb().hashCode();
        }
        if (getCmPoReqd() != null) {
            _hashCode += getCmPoReqd().hashCode();
        }
        if (getCmDiscPct() != null) {
            _hashCode += getCmDiscPct().hashCode();
        }
        if (getCmFin() != null) {
            _hashCode += getCmFin().hashCode();
        }
        if (getCmStmt() != null) {
            _hashCode += getCmStmt().hashCode();
        }
        if (getCmStmtCyc() != null) {
            _hashCode += getCmStmtCyc().hashCode();
        }
        if (getCmDun() != null) {
            _hashCode += getCmDun().hashCode();
        }
        if (getCmBill() != null) {
            _hashCode += getCmBill().hashCode();
        }
        if (getCmCrReview() != null) {
            _hashCode += getCmCrReview().hashCode();
        }
        if (getCmCrUpdate() != null) {
            _hashCode += getCmCrUpdate().hashCode();
        }
        if (getCmFrList() != null) {
            _hashCode += getCmFrList().hashCode();
        }
        if (getCmFrMinWt() != null) {
            _hashCode += getCmFrMinWt().hashCode();
        }
        if (getCmFrTerms() != null) {
            _hashCode += getCmFrTerms().hashCode();
        }
        if (getBtbType() != null) {
            _hashCode += getBtbType().hashCode();
        }
        if (getCmShipLt() != null) {
            _hashCode += getCmShipLt().hashCode();
        }
        if (getCmBtbMthd() != null) {
            _hashCode += getCmBtbMthd().hashCode();
        }
        if (getCmBtbCr() != null) {
            _hashCode += getCmBtbCr().hashCode();
        }
        if (getBankAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "CustomerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adCtry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adCtry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAttn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adAttn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adFax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adFax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAttn2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adAttn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adPhone2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adPhone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExt2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adExt2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adFax2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adFax2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmSort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmSort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmSlspsn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmSlspsn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multSlspsn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "multSlspsn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmShipvia");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmShipvia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmArAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmArAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmArSub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmArSub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmArCc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmArCc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmResale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmResale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmRmks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmRmks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCurr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCurr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmScurr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmScurr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmLang");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmSlspsn1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmSlspsn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmPrList2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmPrList2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmPrList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmPrList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFixPr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmFixPr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmPartial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmPartial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmQadl01");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmQadl01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceListFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "priceListFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discListFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "discListFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTaxZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTaxZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTaxc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTaxc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTaxUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTaxUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTaxIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTaxIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGstId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adGstId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adPstId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adPstId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adMisc1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adMisc1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adMisc2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adMisc2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adMisc3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adMisc3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTxInCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTxInCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTimezone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adTimezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmQad06");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmQad06"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrRating");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmDb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmDb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmPoReqd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmPoReqd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmDiscPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmDiscPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmStmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmStmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmStmtCyc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmStmtCyc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmDun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmDun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrReview");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrReview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmCrUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmCrUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFrList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmFrList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFrMinWt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmFrMinWt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFrTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmFrTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("btbType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "btbType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmShipLt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmShipLt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmBtbMthd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmBtbMthd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmBtbCr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmBtbCr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "bankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "BankAccountsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
