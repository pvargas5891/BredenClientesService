/**
 * CustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices23;

public class CustomerType  implements java.io.Serializable {
    private java.lang.String cmAddr;

    private java.lang.String adName;

    private java.lang.String adLine1;

    private java.lang.String adLine2;

    private java.lang.String adLine3;

    private java.lang.String adCity;

    private java.lang.String adState;

    private java.lang.String adCtry;

    private java.lang.String adCounty;

    private java.lang.String adAttn;

    private java.lang.String adPhone;

    private java.lang.String adFax;

    private java.lang.String adAttn2;

    private java.lang.String adPhone2;

    private java.lang.String adFax2;

    private java.lang.String cmSort;

    private java.lang.String cmSlspsn;

    private java.lang.Boolean multSlspsn;

    private java.lang.String cmShipvia;

    private java.lang.String cmArAcct;

    private java.lang.String cmArSub;

    private java.lang.String cmArCc;

    private java.lang.String cmResale;

    private java.lang.String cmRmks;

    private java.lang.String cmType;

    private java.lang.String cmRegion;

    private java.lang.String cmCurr;

    private java.lang.String cmSite;

    private java.lang.String cmLang;

    private java.lang.String cmClass;

    private java.lang.String cmSic;

    private java.lang.Boolean adTaxable;

    private java.lang.String adTaxZone;

    private java.lang.String adTaxc;

    private java.lang.String adTaxUsage;

    private java.lang.String adTaxIn;

    private java.lang.String adGstId;

    private java.lang.String adPstId;

    private java.math.BigDecimal cmCrLimit;

    private java.lang.String cmCrTerms;

    private java.lang.Boolean cmCrHold;

    private java.lang.String cmCrRating;

    private java.lang.String cmDb;

    private java.lang.Boolean cmPoReqd;

    private java.lang.String cmBill;

    private java.lang.String cmFrList;

    private java.lang.String cmFrMinWt;

    private java.lang.String cmFrTerms;

    private java.lang.String cmTerritorio;

    private java.lang.Boolean cmAnticipo;

    private java.lang.String cm_chr01;

    private java.lang.String cm_chr02;

    private java.lang.String cm_chr03;

    private java.lang.String cm_chr04;

    private java.lang.String cm_chr05;

    public CustomerType() {
    }

    public CustomerType(
           java.lang.String cmAddr,
           java.lang.String adName,
           java.lang.String adLine1,
           java.lang.String adLine2,
           java.lang.String adLine3,
           java.lang.String adCity,
           java.lang.String adState,
           java.lang.String adCtry,
           java.lang.String adCounty,
           java.lang.String adAttn,
           java.lang.String adPhone,
           java.lang.String adFax,
           java.lang.String adAttn2,
           java.lang.String adPhone2,
           java.lang.String adFax2,
           java.lang.String cmSort,
           java.lang.String cmSlspsn,
           java.lang.Boolean multSlspsn,
           java.lang.String cmShipvia,
           java.lang.String cmArAcct,
           java.lang.String cmArSub,
           java.lang.String cmArCc,
           java.lang.String cmResale,
           java.lang.String cmRmks,
           java.lang.String cmType,
           java.lang.String cmRegion,
           java.lang.String cmCurr,
           java.lang.String cmSite,
           java.lang.String cmLang,
           java.lang.String cmClass,
           java.lang.String cmSic,
           java.lang.Boolean adTaxable,
           java.lang.String adTaxZone,
           java.lang.String adTaxc,
           java.lang.String adTaxUsage,
           java.lang.String adTaxIn,
           java.lang.String adGstId,
           java.lang.String adPstId,
           java.math.BigDecimal cmCrLimit,
           java.lang.String cmCrTerms,
           java.lang.Boolean cmCrHold,
           java.lang.String cmCrRating,
           java.lang.String cmDb,
           java.lang.Boolean cmPoReqd,
           java.lang.String cmBill,
           java.lang.String cmFrList,
           java.lang.String cmFrMinWt,
           java.lang.String cmFrTerms,
           java.lang.String cmTerritorio,
           java.lang.Boolean cmAnticipo,
           java.lang.String cm_chr01,
           java.lang.String cm_chr02,
           java.lang.String cm_chr03,
           java.lang.String cm_chr04,
           java.lang.String cm_chr05) {
           this.cmAddr = cmAddr;
           this.adName = adName;
           this.adLine1 = adLine1;
           this.adLine2 = adLine2;
           this.adLine3 = adLine3;
           this.adCity = adCity;
           this.adState = adState;
           this.adCtry = adCtry;
           this.adCounty = adCounty;
           this.adAttn = adAttn;
           this.adPhone = adPhone;
           this.adFax = adFax;
           this.adAttn2 = adAttn2;
           this.adPhone2 = adPhone2;
           this.adFax2 = adFax2;
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
           this.cmSite = cmSite;
           this.cmLang = cmLang;
           this.cmClass = cmClass;
           this.cmSic = cmSic;
           this.adTaxable = adTaxable;
           this.adTaxZone = adTaxZone;
           this.adTaxc = adTaxc;
           this.adTaxUsage = adTaxUsage;
           this.adTaxIn = adTaxIn;
           this.adGstId = adGstId;
           this.adPstId = adPstId;
           this.cmCrLimit = cmCrLimit;
           this.cmCrTerms = cmCrTerms;
           this.cmCrHold = cmCrHold;
           this.cmCrRating = cmCrRating;
           this.cmDb = cmDb;
           this.cmPoReqd = cmPoReqd;
           this.cmBill = cmBill;
           this.cmFrList = cmFrList;
           this.cmFrMinWt = cmFrMinWt;
           this.cmFrTerms = cmFrTerms;
           this.cmTerritorio = cmTerritorio;
           this.cmAnticipo = cmAnticipo;
           this.cm_chr01 = cm_chr01;
           this.cm_chr02 = cm_chr02;
           this.cm_chr03 = cm_chr03;
           this.cm_chr04 = cm_chr04;
           this.cm_chr05 = cm_chr05;
    }


    /**
     * Gets the cmAddr value for this CustomerType.
     * 
     * @return cmAddr
     */
    public java.lang.String getCmAddr() {
        return cmAddr;
    }


    /**
     * Sets the cmAddr value for this CustomerType.
     * 
     * @param cmAddr
     */
    public void setCmAddr(java.lang.String cmAddr) {
        this.cmAddr = cmAddr;
    }


    /**
     * Gets the adName value for this CustomerType.
     * 
     * @return adName
     */
    public java.lang.String getAdName() {
        return adName;
    }


    /**
     * Sets the adName value for this CustomerType.
     * 
     * @param adName
     */
    public void setAdName(java.lang.String adName) {
        this.adName = adName;
    }


    /**
     * Gets the adLine1 value for this CustomerType.
     * 
     * @return adLine1
     */
    public java.lang.String getAdLine1() {
        return adLine1;
    }


    /**
     * Sets the adLine1 value for this CustomerType.
     * 
     * @param adLine1
     */
    public void setAdLine1(java.lang.String adLine1) {
        this.adLine1 = adLine1;
    }


    /**
     * Gets the adLine2 value for this CustomerType.
     * 
     * @return adLine2
     */
    public java.lang.String getAdLine2() {
        return adLine2;
    }


    /**
     * Sets the adLine2 value for this CustomerType.
     * 
     * @param adLine2
     */
    public void setAdLine2(java.lang.String adLine2) {
        this.adLine2 = adLine2;
    }


    /**
     * Gets the adLine3 value for this CustomerType.
     * 
     * @return adLine3
     */
    public java.lang.String getAdLine3() {
        return adLine3;
    }


    /**
     * Sets the adLine3 value for this CustomerType.
     * 
     * @param adLine3
     */
    public void setAdLine3(java.lang.String adLine3) {
        this.adLine3 = adLine3;
    }


    /**
     * Gets the adCity value for this CustomerType.
     * 
     * @return adCity
     */
    public java.lang.String getAdCity() {
        return adCity;
    }


    /**
     * Sets the adCity value for this CustomerType.
     * 
     * @param adCity
     */
    public void setAdCity(java.lang.String adCity) {
        this.adCity = adCity;
    }


    /**
     * Gets the adState value for this CustomerType.
     * 
     * @return adState
     */
    public java.lang.String getAdState() {
        return adState;
    }


    /**
     * Sets the adState value for this CustomerType.
     * 
     * @param adState
     */
    public void setAdState(java.lang.String adState) {
        this.adState = adState;
    }


    /**
     * Gets the adCtry value for this CustomerType.
     * 
     * @return adCtry
     */
    public java.lang.String getAdCtry() {
        return adCtry;
    }


    /**
     * Sets the adCtry value for this CustomerType.
     * 
     * @param adCtry
     */
    public void setAdCtry(java.lang.String adCtry) {
        this.adCtry = adCtry;
    }


    /**
     * Gets the adCounty value for this CustomerType.
     * 
     * @return adCounty
     */
    public java.lang.String getAdCounty() {
        return adCounty;
    }


    /**
     * Sets the adCounty value for this CustomerType.
     * 
     * @param adCounty
     */
    public void setAdCounty(java.lang.String adCounty) {
        this.adCounty = adCounty;
    }


    /**
     * Gets the adAttn value for this CustomerType.
     * 
     * @return adAttn
     */
    public java.lang.String getAdAttn() {
        return adAttn;
    }


    /**
     * Sets the adAttn value for this CustomerType.
     * 
     * @param adAttn
     */
    public void setAdAttn(java.lang.String adAttn) {
        this.adAttn = adAttn;
    }


    /**
     * Gets the adPhone value for this CustomerType.
     * 
     * @return adPhone
     */
    public java.lang.String getAdPhone() {
        return adPhone;
    }


    /**
     * Sets the adPhone value for this CustomerType.
     * 
     * @param adPhone
     */
    public void setAdPhone(java.lang.String adPhone) {
        this.adPhone = adPhone;
    }


    /**
     * Gets the adFax value for this CustomerType.
     * 
     * @return adFax
     */
    public java.lang.String getAdFax() {
        return adFax;
    }


    /**
     * Sets the adFax value for this CustomerType.
     * 
     * @param adFax
     */
    public void setAdFax(java.lang.String adFax) {
        this.adFax = adFax;
    }


    /**
     * Gets the adAttn2 value for this CustomerType.
     * 
     * @return adAttn2
     */
    public java.lang.String getAdAttn2() {
        return adAttn2;
    }


    /**
     * Sets the adAttn2 value for this CustomerType.
     * 
     * @param adAttn2
     */
    public void setAdAttn2(java.lang.String adAttn2) {
        this.adAttn2 = adAttn2;
    }


    /**
     * Gets the adPhone2 value for this CustomerType.
     * 
     * @return adPhone2
     */
    public java.lang.String getAdPhone2() {
        return adPhone2;
    }


    /**
     * Sets the adPhone2 value for this CustomerType.
     * 
     * @param adPhone2
     */
    public void setAdPhone2(java.lang.String adPhone2) {
        this.adPhone2 = adPhone2;
    }


    /**
     * Gets the adFax2 value for this CustomerType.
     * 
     * @return adFax2
     */
    public java.lang.String getAdFax2() {
        return adFax2;
    }


    /**
     * Sets the adFax2 value for this CustomerType.
     * 
     * @param adFax2
     */
    public void setAdFax2(java.lang.String adFax2) {
        this.adFax2 = adFax2;
    }


    /**
     * Gets the cmSort value for this CustomerType.
     * 
     * @return cmSort
     */
    public java.lang.String getCmSort() {
        return cmSort;
    }


    /**
     * Sets the cmSort value for this CustomerType.
     * 
     * @param cmSort
     */
    public void setCmSort(java.lang.String cmSort) {
        this.cmSort = cmSort;
    }


    /**
     * Gets the cmSlspsn value for this CustomerType.
     * 
     * @return cmSlspsn
     */
    public java.lang.String getCmSlspsn() {
        return cmSlspsn;
    }


    /**
     * Sets the cmSlspsn value for this CustomerType.
     * 
     * @param cmSlspsn
     */
    public void setCmSlspsn(java.lang.String cmSlspsn) {
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
    public java.lang.String getCmShipvia() {
        return cmShipvia;
    }


    /**
     * Sets the cmShipvia value for this CustomerType.
     * 
     * @param cmShipvia
     */
    public void setCmShipvia(java.lang.String cmShipvia) {
        this.cmShipvia = cmShipvia;
    }


    /**
     * Gets the cmArAcct value for this CustomerType.
     * 
     * @return cmArAcct
     */
    public java.lang.String getCmArAcct() {
        return cmArAcct;
    }


    /**
     * Sets the cmArAcct value for this CustomerType.
     * 
     * @param cmArAcct
     */
    public void setCmArAcct(java.lang.String cmArAcct) {
        this.cmArAcct = cmArAcct;
    }


    /**
     * Gets the cmArSub value for this CustomerType.
     * 
     * @return cmArSub
     */
    public java.lang.String getCmArSub() {
        return cmArSub;
    }


    /**
     * Sets the cmArSub value for this CustomerType.
     * 
     * @param cmArSub
     */
    public void setCmArSub(java.lang.String cmArSub) {
        this.cmArSub = cmArSub;
    }


    /**
     * Gets the cmArCc value for this CustomerType.
     * 
     * @return cmArCc
     */
    public java.lang.String getCmArCc() {
        return cmArCc;
    }


    /**
     * Sets the cmArCc value for this CustomerType.
     * 
     * @param cmArCc
     */
    public void setCmArCc(java.lang.String cmArCc) {
        this.cmArCc = cmArCc;
    }


    /**
     * Gets the cmResale value for this CustomerType.
     * 
     * @return cmResale
     */
    public java.lang.String getCmResale() {
        return cmResale;
    }


    /**
     * Sets the cmResale value for this CustomerType.
     * 
     * @param cmResale
     */
    public void setCmResale(java.lang.String cmResale) {
        this.cmResale = cmResale;
    }


    /**
     * Gets the cmRmks value for this CustomerType.
     * 
     * @return cmRmks
     */
    public java.lang.String getCmRmks() {
        return cmRmks;
    }


    /**
     * Sets the cmRmks value for this CustomerType.
     * 
     * @param cmRmks
     */
    public void setCmRmks(java.lang.String cmRmks) {
        this.cmRmks = cmRmks;
    }


    /**
     * Gets the cmType value for this CustomerType.
     * 
     * @return cmType
     */
    public java.lang.String getCmType() {
        return cmType;
    }


    /**
     * Sets the cmType value for this CustomerType.
     * 
     * @param cmType
     */
    public void setCmType(java.lang.String cmType) {
        this.cmType = cmType;
    }


    /**
     * Gets the cmRegion value for this CustomerType.
     * 
     * @return cmRegion
     */
    public java.lang.String getCmRegion() {
        return cmRegion;
    }


    /**
     * Sets the cmRegion value for this CustomerType.
     * 
     * @param cmRegion
     */
    public void setCmRegion(java.lang.String cmRegion) {
        this.cmRegion = cmRegion;
    }


    /**
     * Gets the cmCurr value for this CustomerType.
     * 
     * @return cmCurr
     */
    public java.lang.String getCmCurr() {
        return cmCurr;
    }


    /**
     * Sets the cmCurr value for this CustomerType.
     * 
     * @param cmCurr
     */
    public void setCmCurr(java.lang.String cmCurr) {
        this.cmCurr = cmCurr;
    }


    /**
     * Gets the cmSite value for this CustomerType.
     * 
     * @return cmSite
     */
    public java.lang.String getCmSite() {
        return cmSite;
    }


    /**
     * Sets the cmSite value for this CustomerType.
     * 
     * @param cmSite
     */
    public void setCmSite(java.lang.String cmSite) {
        this.cmSite = cmSite;
    }


    /**
     * Gets the cmLang value for this CustomerType.
     * 
     * @return cmLang
     */
    public java.lang.String getCmLang() {
        return cmLang;
    }


    /**
     * Sets the cmLang value for this CustomerType.
     * 
     * @param cmLang
     */
    public void setCmLang(java.lang.String cmLang) {
        this.cmLang = cmLang;
    }


    /**
     * Gets the cmClass value for this CustomerType.
     * 
     * @return cmClass
     */
    public java.lang.String getCmClass() {
        return cmClass;
    }


    /**
     * Sets the cmClass value for this CustomerType.
     * 
     * @param cmClass
     */
    public void setCmClass(java.lang.String cmClass) {
        this.cmClass = cmClass;
    }


    /**
     * Gets the cmSic value for this CustomerType.
     * 
     * @return cmSic
     */
    public java.lang.String getCmSic() {
        return cmSic;
    }


    /**
     * Sets the cmSic value for this CustomerType.
     * 
     * @param cmSic
     */
    public void setCmSic(java.lang.String cmSic) {
        this.cmSic = cmSic;
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
    public java.lang.String getAdTaxZone() {
        return adTaxZone;
    }


    /**
     * Sets the adTaxZone value for this CustomerType.
     * 
     * @param adTaxZone
     */
    public void setAdTaxZone(java.lang.String adTaxZone) {
        this.adTaxZone = adTaxZone;
    }


    /**
     * Gets the adTaxc value for this CustomerType.
     * 
     * @return adTaxc
     */
    public java.lang.String getAdTaxc() {
        return adTaxc;
    }


    /**
     * Sets the adTaxc value for this CustomerType.
     * 
     * @param adTaxc
     */
    public void setAdTaxc(java.lang.String adTaxc) {
        this.adTaxc = adTaxc;
    }


    /**
     * Gets the adTaxUsage value for this CustomerType.
     * 
     * @return adTaxUsage
     */
    public java.lang.String getAdTaxUsage() {
        return adTaxUsage;
    }


    /**
     * Sets the adTaxUsage value for this CustomerType.
     * 
     * @param adTaxUsage
     */
    public void setAdTaxUsage(java.lang.String adTaxUsage) {
        this.adTaxUsage = adTaxUsage;
    }


    /**
     * Gets the adTaxIn value for this CustomerType.
     * 
     * @return adTaxIn
     */
    public java.lang.String getAdTaxIn() {
        return adTaxIn;
    }


    /**
     * Sets the adTaxIn value for this CustomerType.
     * 
     * @param adTaxIn
     */
    public void setAdTaxIn(java.lang.String adTaxIn) {
        this.adTaxIn = adTaxIn;
    }


    /**
     * Gets the adGstId value for this CustomerType.
     * 
     * @return adGstId
     */
    public java.lang.String getAdGstId() {
        return adGstId;
    }


    /**
     * Sets the adGstId value for this CustomerType.
     * 
     * @param adGstId
     */
    public void setAdGstId(java.lang.String adGstId) {
        this.adGstId = adGstId;
    }


    /**
     * Gets the adPstId value for this CustomerType.
     * 
     * @return adPstId
     */
    public java.lang.String getAdPstId() {
        return adPstId;
    }


    /**
     * Sets the adPstId value for this CustomerType.
     * 
     * @param adPstId
     */
    public void setAdPstId(java.lang.String adPstId) {
        this.adPstId = adPstId;
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
    public java.lang.String getCmCrTerms() {
        return cmCrTerms;
    }


    /**
     * Sets the cmCrTerms value for this CustomerType.
     * 
     * @param cmCrTerms
     */
    public void setCmCrTerms(java.lang.String cmCrTerms) {
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
    public java.lang.String getCmCrRating() {
        return cmCrRating;
    }


    /**
     * Sets the cmCrRating value for this CustomerType.
     * 
     * @param cmCrRating
     */
    public void setCmCrRating(java.lang.String cmCrRating) {
        this.cmCrRating = cmCrRating;
    }


    /**
     * Gets the cmDb value for this CustomerType.
     * 
     * @return cmDb
     */
    public java.lang.String getCmDb() {
        return cmDb;
    }


    /**
     * Sets the cmDb value for this CustomerType.
     * 
     * @param cmDb
     */
    public void setCmDb(java.lang.String cmDb) {
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
     * Gets the cmBill value for this CustomerType.
     * 
     * @return cmBill
     */
    public java.lang.String getCmBill() {
        return cmBill;
    }


    /**
     * Sets the cmBill value for this CustomerType.
     * 
     * @param cmBill
     */
    public void setCmBill(java.lang.String cmBill) {
        this.cmBill = cmBill;
    }


    /**
     * Gets the cmFrList value for this CustomerType.
     * 
     * @return cmFrList
     */
    public java.lang.String getCmFrList() {
        return cmFrList;
    }


    /**
     * Sets the cmFrList value for this CustomerType.
     * 
     * @param cmFrList
     */
    public void setCmFrList(java.lang.String cmFrList) {
        this.cmFrList = cmFrList;
    }


    /**
     * Gets the cmFrMinWt value for this CustomerType.
     * 
     * @return cmFrMinWt
     */
    public java.lang.String getCmFrMinWt() {
        return cmFrMinWt;
    }


    /**
     * Sets the cmFrMinWt value for this CustomerType.
     * 
     * @param cmFrMinWt
     */
    public void setCmFrMinWt(java.lang.String cmFrMinWt) {
        this.cmFrMinWt = cmFrMinWt;
    }


    /**
     * Gets the cmFrTerms value for this CustomerType.
     * 
     * @return cmFrTerms
     */
    public java.lang.String getCmFrTerms() {
        return cmFrTerms;
    }


    /**
     * Sets the cmFrTerms value for this CustomerType.
     * 
     * @param cmFrTerms
     */
    public void setCmFrTerms(java.lang.String cmFrTerms) {
        this.cmFrTerms = cmFrTerms;
    }


    /**
     * Gets the cmTerritorio value for this CustomerType.
     * 
     * @return cmTerritorio
     */
    public java.lang.String getCmTerritorio() {
        return cmTerritorio;
    }


    /**
     * Sets the cmTerritorio value for this CustomerType.
     * 
     * @param cmTerritorio
     */
    public void setCmTerritorio(java.lang.String cmTerritorio) {
        this.cmTerritorio = cmTerritorio;
    }


    /**
     * Gets the cmAnticipo value for this CustomerType.
     * 
     * @return cmAnticipo
     */
    public java.lang.Boolean getCmAnticipo() {
        return cmAnticipo;
    }


    /**
     * Sets the cmAnticipo value for this CustomerType.
     * 
     * @param cmAnticipo
     */
    public void setCmAnticipo(java.lang.Boolean cmAnticipo) {
        this.cmAnticipo = cmAnticipo;
    }


    /**
     * Gets the cm_chr01 value for this CustomerType.
     * 
     * @return cm_chr01
     */
    public java.lang.String getCm_chr01() {
        return cm_chr01;
    }


    /**
     * Sets the cm_chr01 value for this CustomerType.
     * 
     * @param cm_chr01
     */
    public void setCm_chr01(java.lang.String cm_chr01) {
        this.cm_chr01 = cm_chr01;
    }


    /**
     * Gets the cm_chr02 value for this CustomerType.
     * 
     * @return cm_chr02
     */
    public java.lang.String getCm_chr02() {
        return cm_chr02;
    }


    /**
     * Sets the cm_chr02 value for this CustomerType.
     * 
     * @param cm_chr02
     */
    public void setCm_chr02(java.lang.String cm_chr02) {
        this.cm_chr02 = cm_chr02;
    }


    /**
     * Gets the cm_chr03 value for this CustomerType.
     * 
     * @return cm_chr03
     */
    public java.lang.String getCm_chr03() {
        return cm_chr03;
    }


    /**
     * Sets the cm_chr03 value for this CustomerType.
     * 
     * @param cm_chr03
     */
    public void setCm_chr03(java.lang.String cm_chr03) {
        this.cm_chr03 = cm_chr03;
    }


    /**
     * Gets the cm_chr04 value for this CustomerType.
     * 
     * @return cm_chr04
     */
    public java.lang.String getCm_chr04() {
        return cm_chr04;
    }


    /**
     * Sets the cm_chr04 value for this CustomerType.
     * 
     * @param cm_chr04
     */
    public void setCm_chr04(java.lang.String cm_chr04) {
        this.cm_chr04 = cm_chr04;
    }


    /**
     * Gets the cm_chr05 value for this CustomerType.
     * 
     * @return cm_chr05
     */
    public java.lang.String getCm_chr05() {
        return cm_chr05;
    }


    /**
     * Sets the cm_chr05 value for this CustomerType.
     * 
     * @param cm_chr05
     */
    public void setCm_chr05(java.lang.String cm_chr05) {
        this.cm_chr05 = cm_chr05;
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
            ((this.adFax==null && other.getAdFax()==null) || 
             (this.adFax!=null &&
              this.adFax.equals(other.getAdFax()))) &&
            ((this.adAttn2==null && other.getAdAttn2()==null) || 
             (this.adAttn2!=null &&
              this.adAttn2.equals(other.getAdAttn2()))) &&
            ((this.adPhone2==null && other.getAdPhone2()==null) || 
             (this.adPhone2!=null &&
              this.adPhone2.equals(other.getAdPhone2()))) &&
            ((this.adFax2==null && other.getAdFax2()==null) || 
             (this.adFax2!=null &&
              this.adFax2.equals(other.getAdFax2()))) &&
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
            ((this.cmSite==null && other.getCmSite()==null) || 
             (this.cmSite!=null &&
              this.cmSite.equals(other.getCmSite()))) &&
            ((this.cmLang==null && other.getCmLang()==null) || 
             (this.cmLang!=null &&
              this.cmLang.equals(other.getCmLang()))) &&
            ((this.cmClass==null && other.getCmClass()==null) || 
             (this.cmClass!=null &&
              this.cmClass.equals(other.getCmClass()))) &&
            ((this.cmSic==null && other.getCmSic()==null) || 
             (this.cmSic!=null &&
              this.cmSic.equals(other.getCmSic()))) &&
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
            ((this.cmBill==null && other.getCmBill()==null) || 
             (this.cmBill!=null &&
              this.cmBill.equals(other.getCmBill()))) &&
            ((this.cmFrList==null && other.getCmFrList()==null) || 
             (this.cmFrList!=null &&
              this.cmFrList.equals(other.getCmFrList()))) &&
            ((this.cmFrMinWt==null && other.getCmFrMinWt()==null) || 
             (this.cmFrMinWt!=null &&
              this.cmFrMinWt.equals(other.getCmFrMinWt()))) &&
            ((this.cmFrTerms==null && other.getCmFrTerms()==null) || 
             (this.cmFrTerms!=null &&
              this.cmFrTerms.equals(other.getCmFrTerms()))) &&
            ((this.cmTerritorio==null && other.getCmTerritorio()==null) || 
             (this.cmTerritorio!=null &&
              this.cmTerritorio.equals(other.getCmTerritorio()))) &&
            ((this.cmAnticipo==null && other.getCmAnticipo()==null) || 
             (this.cmAnticipo!=null &&
              this.cmAnticipo.equals(other.getCmAnticipo()))) &&
            ((this.cm_chr01==null && other.getCm_chr01()==null) || 
             (this.cm_chr01!=null &&
              this.cm_chr01.equals(other.getCm_chr01()))) &&
            ((this.cm_chr02==null && other.getCm_chr02()==null) || 
             (this.cm_chr02!=null &&
              this.cm_chr02.equals(other.getCm_chr02()))) &&
            ((this.cm_chr03==null && other.getCm_chr03()==null) || 
             (this.cm_chr03!=null &&
              this.cm_chr03.equals(other.getCm_chr03()))) &&
            ((this.cm_chr04==null && other.getCm_chr04()==null) || 
             (this.cm_chr04!=null &&
              this.cm_chr04.equals(other.getCm_chr04()))) &&
            ((this.cm_chr05==null && other.getCm_chr05()==null) || 
             (this.cm_chr05!=null &&
              this.cm_chr05.equals(other.getCm_chr05())));
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
        if (getAdFax() != null) {
            _hashCode += getAdFax().hashCode();
        }
        if (getAdAttn2() != null) {
            _hashCode += getAdAttn2().hashCode();
        }
        if (getAdPhone2() != null) {
            _hashCode += getAdPhone2().hashCode();
        }
        if (getAdFax2() != null) {
            _hashCode += getAdFax2().hashCode();
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
        if (getCmSite() != null) {
            _hashCode += getCmSite().hashCode();
        }
        if (getCmLang() != null) {
            _hashCode += getCmLang().hashCode();
        }
        if (getCmClass() != null) {
            _hashCode += getCmClass().hashCode();
        }
        if (getCmSic() != null) {
            _hashCode += getCmSic().hashCode();
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
        if (getCmBill() != null) {
            _hashCode += getCmBill().hashCode();
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
        if (getCmTerritorio() != null) {
            _hashCode += getCmTerritorio().hashCode();
        }
        if (getCmAnticipo() != null) {
            _hashCode += getCmAnticipo().hashCode();
        }
        if (getCm_chr01() != null) {
            _hashCode += getCm_chr01().hashCode();
        }
        if (getCm_chr02() != null) {
            _hashCode += getCm_chr02().hashCode();
        }
        if (getCm_chr03() != null) {
            _hashCode += getCm_chr03().hashCode();
        }
        if (getCm_chr04() != null) {
            _hashCode += getCm_chr04().hashCode();
        }
        if (getCm_chr05() != null) {
            _hashCode += getCm_chr05().hashCode();
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
        elemField.setFieldName("adFax2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "adFax2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cmBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cmTerritorio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmTerritorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmAnticipo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmAnticipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cm_chr01");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cm_chr01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cm_chr02");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cm_chr02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cm_chr03");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cm_chr03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cm_chr04");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cm_chr04"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cm_chr05");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cm_chr05"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
           java.lang.String mechType, 
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
