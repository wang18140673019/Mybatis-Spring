package com.hec.aurora.model;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "EXP_REPORT_HEADERS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpReportHeaders  extends BaseDTO {
    @Id
    @Column(name = "EXP_REPORT_HEADER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select EXP_REPORT_HEADERS_S.nextval from dual")
    private Integer exp_report_header_id;
    
    @Transient
    private Date sys_date;
    
    @Transient
    private String exp_report_position;
    
    @Transient
    private String usedes;
    
    @Transient
    private String adjustment_flag;
    
    @Transient
    private Double sum_amount;
    
    @Transient
    private Integer exp_report_position_id; 
    
    @Transient
    private String exp_report_create_by;
     
    @Transient
    private String functional_currency_code;
    
    @Transient
    private Integer responsibility_center_id;
   
    @Transient
    private Integer line_number;
    
    @Transient
    private String responsibility_center_name;
    
    @Column(name = "CURRENCY_CODE")
    private String exp_report_currency_code;

    @Column(name = "UNIT_ID")
    private Integer unit_id;

    @Transient
    private String payment_flag;
    
    @Transient
    private String budget_control_enabled;
    
    @Transient
    private String req_required_flag;

    @Column(name = "COMPANY_ID")
    private Integer company_id;

    @Transient
    private String exp_report_type_name;
    
    @Transient
    private String usedes_name;
    
    @Column(name = "EXP_REPORT_TYPE_ID")
    private Integer exp_report_type_id;
    
    @Transient 
    private String position_name;
    
    @Transient 
    private String employee_name;
    
    @Transient 
    private String unit_name;
    
    @Column(name = "EMPLOYEE_ID")
    private Integer employee_id;
    
    @Transient
    private String company_name;
    
    @Transient 
    private String exp_report_employee_name;
    
    @Column(name = "REPORT_DATE")
    private Date exp_report_data;
    
    @Transient
    private String exp_report_status;
    
    @Transient
    private String exp_report_currency_name;
    
    @Column(name = "POSITION_ID")
    private Short position_id;
    
    @Transient
    private String exp_report_payment_method;
    
    @Transient
    private String exp_report_payee_category_name;
    
    @Column(name = "PAYEE_CATEGORY")
    private String exp_report_payee_category;
    
    @Transient 
    private String exp_report_payee_name;
    
    @Transient
    private String bank_code;
    
    @Transient 
    private String bank_name;
    
    @Transient
    private String account_number;
    
    @Transient 
    private String account_name;

    @Column(name = "PAYEE_ID")
    private Short exp_report_payee_id;
    
    @Column(name = "EXCHANGE_RATE")
    private Integer exp_report_rate;
    
    @Column(name = "DESCRIPTION")
    private String exp_report_description;
    
    @Column(name = "ATTACHMENT_NUM")
    private Integer exp_report_attach_id;
    
    @Column(name="PAYMENT_METHOD_ID")
    private Integer payment_method_id;
    
    private String pmtplan;
    
    
    
    
    
    
    
    
    
    
    //下面为之前就有的字段
    @Column(name = "OPERATION_UNIT_ID")
    private Short operationUnitId;

    @Column(name = "EXP_REPORT_NUMBER")
    private String expReportNumber;

    @Column(name = "EXP_REPORT_BARCODE")
    private String expReportBarcode;


    @Column(name = "UNIT_ID")
    private Short unitId;


    @Column(name = "EXPENSE_USER_GROUP_ID")
    private Short expenseUserGroupId;



    @Column(name = "EXCHANGE_RATE_TYPE")
    private String exchangeRateType;

    @Column(name = "EXCHANGE_RATE_QUOTATION")
    private String exchangeRateQuotation;

    @Column(name = "EXCHANGE_RATE")
    private Short exchangeRate;

   

    @Column(name = "PERIOD_NAME")
    private String periodName;

    @Column(name = "REPORT_STATUS")
    private String reportStatus;

    @Column(name = "JE_CREATION_STATUS")
    private String jeCreationStatus;

    @Column(name = "AUDIT_FLAG")
    private String auditFlag;

    @Column(name = "AUDIT_DATE")
    private Date auditDate;

    @Column(name = "GLD_INTERFACE_FLAG")
    private String gldInterfaceFlag;

    @Column(name = "ATTACHMENT_NUM")
    private Short attachmentNum;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "WRITE_OFF_STATUS")
    private String writeOffStatus;

    @Column(name = "WRITE_OFF_COMPLETED_DATE")
    private Date writeOffCompletedDate;

    @Column(name = "AMORTIZATION_FLAG")
    private String amortizationFlag;

    @Column(name = "REVERSED_FLAG")
    private String reversedFlag;

    @Column(name = "SOURCE_EXP_REP_HEADER_ID")
    private Short sourceExpRepHeaderId;

    @Column(name = "SOURCE_TYPE")
    private String sourceType;

    @Column(name = "PAYMENT_METHOD_ID")
    private Short paymentMethodId;

    @Column(name = "CREATED_BY")
    private Short createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Short lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "JE_CREATION_DATE")
    private Date jeCreationDate;

    @Column(name = "DATE_FROM")
    private Date dateFrom;

    @Column(name = "DATE_TO")
    private Date dateTo;

    @Column(name = "REFUSED_SYSCODE")
    private String refusedSyscode;

    @Column(name = "POLICY_FLAG")
    private String policyFlag;

    @Column(name = "SPLIT_STATUS")
    private String splitStatus;

    @Column(name = "DESCRIPTION_DETAIL")
    private String descriptionDetail;

    @Column(name = "VAT_SPECIAL_INVOICE_INCLUDE")
    private String vatSpecialInvoiceInclude;

    @Column(name = "SOURCE_EXP_REPORT_HEADER_ID")
    private Short sourceExpReportHeaderId;

    @Column(name = "TAX_UPDATE_STATUS")
    private String taxUpdateStatus;

    @Column(name = "TAX_UPDATE_USER_ID")
    private Short taxUpdateUserId;

    @Column(name = "TAX_AUDIT_USER_ID")
    private Short taxAuditUserId;

    @Column(name = "TAX_REJECT_USER_ID")
    private Short taxRejectUserId;

    @Column(name = "REVERSED_TYPE")
    private String reversedType;


	public Integer getExp_report_header_id() {
		return exp_report_header_id;
	}

	public void setExp_report_header_id(Integer exp_report_header_id) {
		this.exp_report_header_id = exp_report_header_id;
	}

	public Date getSys_date() {
		return sys_date;
	}

	public void setSys_date(Date sys_date) {
		this.sys_date = sys_date;
	}

	public String getExp_report_position() {
		return exp_report_position;
	}

	public void setExp_report_position(String exp_report_position) {
		this.exp_report_position = exp_report_position;
	}

	public String getUsedes() {
		return usedes;
	}

	public void setUsedes(String usedes) {
		this.usedes = usedes;
	}

	public String getAdjustment_flag() {
		return adjustment_flag;
	}

	public void setAdjustment_flag(String adjustment_flag) {
		this.adjustment_flag = adjustment_flag;
	}

	public Double getSum_amount() {
		return sum_amount;
	}

	public void setSum_amount(Double sum_amount) {
		this.sum_amount = sum_amount;
	}

	public Integer getExp_report_position_id() {
		return exp_report_position_id;
	}

	public void setExp_report_position_id(Integer exp_report_position_id) {
		this.exp_report_position_id = exp_report_position_id;
	}

	public String getExp_report_create_by() {
		return exp_report_create_by;
	}

	public void setExp_report_create_by(String exp_report_create_by) {
		this.exp_report_create_by = exp_report_create_by;
	}

	public String getFunctional_currency_code() {
		return functional_currency_code;
	}

	public void setFunctional_currency_code(String functional_currency_code) {
		this.functional_currency_code = functional_currency_code;
	}

	public Integer getResponsibility_center_id() {
		return responsibility_center_id;
	}

	public void setResponsibility_center_id(Integer responsibility_center_id) {
		this.responsibility_center_id = responsibility_center_id;
	}

	public Integer getLine_number() {
		return line_number;
	}

	public void setLine_number(Integer line_number) {
		this.line_number = line_number;
	}

	public String getResponsibility_center_name() {
		return responsibility_center_name;
	}

	public void setResponsibility_center_name(String responsibility_center_name) {
		this.responsibility_center_name = responsibility_center_name;
	}

	public String getExp_report_currency_code() {
		return exp_report_currency_code;
	}

	public void setExp_report_currency_code(String exp_report_currency_code) {
		this.exp_report_currency_code = exp_report_currency_code;
	}

	public Integer getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Integer unit_id) {
		this.unit_id = unit_id;
	}

	public String getPayment_flag() {
		return payment_flag;
	}

	public void setPayment_flag(String payment_flag) {
		this.payment_flag = payment_flag;
	}

	public String getBudget_control_enabled() {
		return budget_control_enabled;
	}

	public void setBudget_control_enabled(String budget_control_enabled) {
		this.budget_control_enabled = budget_control_enabled;
	}

	public String getReq_required_flag() {
		return req_required_flag;
	}

	public void setReq_required_flag(String req_required_flag) {
		this.req_required_flag = req_required_flag;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public String getExp_report_type_name() {
		return exp_report_type_name;
	}

	public void setExp_report_type_name(String exp_report_type_name) {
		this.exp_report_type_name = exp_report_type_name;
	}

	public String getUsedes_name() {
		return usedes_name;
	}

	public void setUsedes_name(String usedes_name) {
		this.usedes_name = usedes_name;
	}

	public Integer getExp_report_type_id() {
		return exp_report_type_id;
	}

	public void setExp_report_type_id(Integer exp_report_type_id) {
		this.exp_report_type_id = exp_report_type_id;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getExp_report_employee_name() {
		return exp_report_employee_name;
	}

	public void setExp_report_employee_name(String exp_report_employee_name) {
		this.exp_report_employee_name = exp_report_employee_name;
	}

	public Date getExp_report_data() {
		return exp_report_data;
	}

	public void setExp_report_data(Date exp_report_data) {
		this.exp_report_data = exp_report_data;
	}

	public String getExp_report_status() {
		return exp_report_status;
	}

	public void setExp_report_status(String exp_report_status) {
		this.exp_report_status = exp_report_status;
	}

	public String getExp_report_currency_name() {
		return exp_report_currency_name;
	}

	public void setExp_report_currency_name(String exp_report_currency_name) {
		this.exp_report_currency_name = exp_report_currency_name;
	}

	public Short getPosition_id() {
		return position_id;
	}

	public void setPosition_id(Short position_id) {
		this.position_id = position_id;
	}

	public String getExp_report_payment_method() {
		return exp_report_payment_method;
	}

	public void setExp_report_payment_method(String exp_report_payment_method) {
		this.exp_report_payment_method = exp_report_payment_method;
	}

	public String getExp_report_payee_category_name() {
		return exp_report_payee_category_name;
	}

	public void setExp_report_payee_category_name(String exp_report_payee_category_name) {
		this.exp_report_payee_category_name = exp_report_payee_category_name;
	}

	public String getExp_report_payee_category() {
		return exp_report_payee_category;
	}

	public void setExp_report_payee_category(String exp_report_payee_category) {
		this.exp_report_payee_category = exp_report_payee_category;
	}

	public String getExp_report_payee_name() {
		return exp_report_payee_name;
	}

	public void setExp_report_payee_name(String exp_report_payee_name) {
		this.exp_report_payee_name = exp_report_payee_name;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public Short getExp_report_payee_id() {
		return exp_report_payee_id;
	}

	public void setExp_report_payee_id(Short exp_report_payee_id) {
		this.exp_report_payee_id = exp_report_payee_id;
	}

	public Integer getExp_report_rate() {
		return exp_report_rate;
	}

	public void setExp_report_rate(Integer exp_report_rate) {
		this.exp_report_rate = exp_report_rate;
	}

	public String getExp_report_description() {
		return exp_report_description;
	}

	public void setExp_report_description(String exp_report_description) {
		this.exp_report_description = exp_report_description;
	}

	public Integer getExp_report_attach_id() {
		return exp_report_attach_id;
	}

	public void setExp_report_attach_id(Integer exp_report_attach_id) {
		this.exp_report_attach_id = exp_report_attach_id;
	}

	public Integer getPayment_method_id() {
		return payment_method_id;
	}

	public void setPayment_method_id(Integer payment_method_id) {
		this.payment_method_id = payment_method_id;
	}

	public String getPmtplan() {
		return pmtplan;
	}

	public void setPmtplan(String pmtplan) {
		this.pmtplan = pmtplan;
	}

	public Short getOperationUnitId() {
		return operationUnitId;
	}

	public void setOperationUnitId(Short operationUnitId) {
		this.operationUnitId = operationUnitId;
	}

	public String getExpReportNumber() {
		return expReportNumber;
	}

	public void setExpReportNumber(String expReportNumber) {
		this.expReportNumber = expReportNumber;
	}

	public String getExpReportBarcode() {
		return expReportBarcode;
	}

	public void setExpReportBarcode(String expReportBarcode) {
		this.expReportBarcode = expReportBarcode;
	}

	public Short getUnitId() {
		return unitId;
	}

	public void setUnitId(Short unitId) {
		this.unitId = unitId;
	}

	public Short getExpenseUserGroupId() {
		return expenseUserGroupId;
	}

	public void setExpenseUserGroupId(Short expenseUserGroupId) {
		this.expenseUserGroupId = expenseUserGroupId;
	}

	public String getExchangeRateType() {
		return exchangeRateType;
	}

	public void setExchangeRateType(String exchangeRateType) {
		this.exchangeRateType = exchangeRateType;
	}

	public String getExchangeRateQuotation() {
		return exchangeRateQuotation;
	}

	public void setExchangeRateQuotation(String exchangeRateQuotation) {
		this.exchangeRateQuotation = exchangeRateQuotation;
	}

	public Short getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Short exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public String getJeCreationStatus() {
		return jeCreationStatus;
	}

	public void setJeCreationStatus(String jeCreationStatus) {
		this.jeCreationStatus = jeCreationStatus;
	}

	public String getAuditFlag() {
		return auditFlag;
	}

	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public String getGldInterfaceFlag() {
		return gldInterfaceFlag;
	}

	public void setGldInterfaceFlag(String gldInterfaceFlag) {
		this.gldInterfaceFlag = gldInterfaceFlag;
	}

	public Short getAttachmentNum() {
		return attachmentNum;
	}

	public void setAttachmentNum(Short attachmentNum) {
		this.attachmentNum = attachmentNum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWriteOffStatus() {
		return writeOffStatus;
	}

	public void setWriteOffStatus(String writeOffStatus) {
		this.writeOffStatus = writeOffStatus;
	}

	public Date getWriteOffCompletedDate() {
		return writeOffCompletedDate;
	}

	public void setWriteOffCompletedDate(Date writeOffCompletedDate) {
		this.writeOffCompletedDate = writeOffCompletedDate;
	}

	public String getAmortizationFlag() {
		return amortizationFlag;
	}

	public void setAmortizationFlag(String amortizationFlag) {
		this.amortizationFlag = amortizationFlag;
	}

	public String getReversedFlag() {
		return reversedFlag;
	}

	public void setReversedFlag(String reversedFlag) {
		this.reversedFlag = reversedFlag;
	}

	public Short getSourceExpRepHeaderId() {
		return sourceExpRepHeaderId;
	}

	public void setSourceExpRepHeaderId(Short sourceExpRepHeaderId) {
		this.sourceExpRepHeaderId = sourceExpRepHeaderId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Short getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Short paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public Short getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Short createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Short getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Short lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getJeCreationDate() {
		return jeCreationDate;
	}

	public void setJeCreationDate(Date jeCreationDate) {
		this.jeCreationDate = jeCreationDate;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getRefusedSyscode() {
		return refusedSyscode;
	}

	public void setRefusedSyscode(String refusedSyscode) {
		this.refusedSyscode = refusedSyscode;
	}

	public String getPolicyFlag() {
		return policyFlag;
	}

	public void setPolicyFlag(String policyFlag) {
		this.policyFlag = policyFlag;
	}

	public String getSplitStatus() {
		return splitStatus;
	}

	public void setSplitStatus(String splitStatus) {
		this.splitStatus = splitStatus;
	}

	public String getDescriptionDetail() {
		return descriptionDetail;
	}

	public void setDescriptionDetail(String descriptionDetail) {
		this.descriptionDetail = descriptionDetail;
	}

	public String getVatSpecialInvoiceInclude() {
		return vatSpecialInvoiceInclude;
	}

	public void setVatSpecialInvoiceInclude(String vatSpecialInvoiceInclude) {
		this.vatSpecialInvoiceInclude = vatSpecialInvoiceInclude;
	}

	public Short getSourceExpReportHeaderId() {
		return sourceExpReportHeaderId;
	}

	public void setSourceExpReportHeaderId(Short sourceExpReportHeaderId) {
		this.sourceExpReportHeaderId = sourceExpReportHeaderId;
	}

	public String getTaxUpdateStatus() {
		return taxUpdateStatus;
	}

	public void setTaxUpdateStatus(String taxUpdateStatus) {
		this.taxUpdateStatus = taxUpdateStatus;
	}

	public Short getTaxUpdateUserId() {
		return taxUpdateUserId;
	}

	public void setTaxUpdateUserId(Short taxUpdateUserId) {
		this.taxUpdateUserId = taxUpdateUserId;
	}

	public Short getTaxAuditUserId() {
		return taxAuditUserId;
	}

	public void setTaxAuditUserId(Short taxAuditUserId) {
		this.taxAuditUserId = taxAuditUserId;
	}

	public Short getTaxRejectUserId() {
		return taxRejectUserId;
	}

	public void setTaxRejectUserId(Short taxRejectUserId) {
		this.taxRejectUserId = taxRejectUserId;
	}

	public String getReversedType() {
		return reversedType;
	}

	public void setReversedType(String reversedType) {
		this.reversedType = reversedType;
	}



    

}