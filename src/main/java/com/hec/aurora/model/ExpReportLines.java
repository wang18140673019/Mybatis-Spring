package com.hec.aurora.model;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "EXP_REPORT_LINES")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpReportLines  extends BaseDTO {
    @Id
    @Column(name = "EXP_REPORT_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select EXP_REPORT_LINES_S.nextval from dual")
    private Integer expReportLineId;

    @Column(name = "LINE_NUMBER")
    private Integer line_number;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "PERIOD_NAME")
    private String period_name;
  
    @Column(name = "CURRENCY_CODE")
    private String currency_code;
    
    @Column(name = "EXCHANGE_RATE")
    private Integer exchange_rate;
    
    @Column(name = "EXPENSE_TYPE_ID")
    private Integer expense_type_id;
    
    @Column(name = "EXPENSE_ITEM_ID")
    private Integer expense_item_id;
    
    @Column(name = "PRICE")
    private Integer price;
    
    @Column(name = "PRIMARY_QUANTITY")
    private Integer primary_quantity;
    
    @Column(name = "REPORT_AMOUNT")
    private Double report_amount;
    
    @Column(name = "REPORT_FUNCTIONAL_AMOUNT")
    private Double report_functional_amount;
    
    @Column(name = "COMPANY_ID")
    private Integer company_id;
    
    @Column(name = "UNIT_ID")
    private Integer unit_id;
    
    @Column(name = "POSITION_ID")
    private Integer position_id;
    
    @Column(name = "RESPONSIBILITY_CENTER_ID")
    private Integer responsibility_center_id;
    
    @Column(name = "EMPLOYEE_ID")
    private Integer employee_id;
    
    @Column(name = "PAYEE_CATEGORY")
    private String payee_category;

    @Column(name = "PAYEE_ID")
    private Integer payee_id;
    
    @Column(name = "PAYMENT_FLAG")
    private String payment_flag;
    
    @Column(name = "ACCOUNT_NAME")
    private String account_name;
    
    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;
    
    @Column(name = "PAYMENT_TYPE_ID")
    private Integer payment_type_id;

    @Column(name = "PAYMENT_TYPE")
    private String payment_type;
    
    @Transient
    private String company_name;
    
    @Transient 
    private String unit_name;
    
    @Transient 
    private String expense_type_name;
    
    @Transient
    private String exp_req_item_name;
    
    @Transient
    private String responsibility_center_name;
    
    @Transient 
    private String position_name;
    
    @Transient
    private String employee_name;
    
    @Transient
    private String payee_category_name;
    
    @Transient 
    private String payee_name;
    
    @Transient 
    private String exp_req_item_id;
    
    @Column(name="TAX_TYPE_ID")
    private Integer tax_type_id;
    
    @Transient
    private String tax_type_desc;
    
    @Transient
    private Integer contract_header_id;
    
    @Transient
    private Integer payment_schedule_line_id;
    
    @Transient
    private String contract_header_code;
    
    @Transient
    private String payment_schedule_line_code;
    
    @Transient
    private Integer flag;
    
    @Transient
    private Date p_rep_date;
    
    @Transient
    private String details;
    
    @Transient 
    private Integer _id;
    
    @Transient 
    private String _status;

    
    
    
    
    
    
    //以下为之前就存在的
    @Column(name = "EXP_REPORT_HEADER_ID")
    private Integer expReportHeaderId;

    @Column(name = "CITY")
    private String city;

    @Column(name = "PLACE_TYPE_ID")
    private Integer placeTypeId;

    @Column(name = "PLACE_ID")
    private Integer placeId;

    @Column(name = "DATE_FROM")
    private Date dateFrom;

    @Column(name = "DATE_TO")
    private Date dateTo;

    @Column(name = "EXCHANGE_RATE_TYPE")
    private String exchangeRateType;

    @Column(name = "EXCHANGE_RATE_QUOTATION")
    private String exchangeRateQuotation;






    @Column(name = "BUDGET_ITEM_ID")
    private Integer budgetItemId;





    @Column(name = "PRIMARY_UOM")
    private String primaryUom;

    @Column(name = "SECONDARY_QUANTITY")
    private Integer secondaryQuantity;

    @Column(name = "SECONDARY_UOM")
    private String secondaryUom;





    @Column(name = "DISTRIBUTION_SET_ID")
    private Integer distributionSetId;



    @Column(name = "OPERATION_UNIT_ID")
    private Integer operationUnitId;












    @Column(name = "PARTNER_ID")
    private Integer partnerId;



    @Column(name = "REPORT_STATUS")
    private String reportStatus;

    @Column(name = "AUDIT_FLAG")
    private String auditFlag;

    @Column(name = "AUDIT_DATE")
    private Date auditDate;

    @Column(name = "WRITE_OFF_STATUS")
    private String writeOffStatus;

    @Column(name = "WRITE_OFF_COMLETED_DATE")
    private Date writeOffComletedDate;

    @Column(name = "ATTACHMENT_NUM")
    private Integer attachmentNum;

    @Column(name = "DIMENSION1_ID")
    private Integer dimension1Id;

    @Column(name = "DIMENSION2_ID")
    private Integer dimension2Id;

    @Column(name = "DIMENSION3_ID")
    private Integer dimension3Id;

    @Column(name = "DIMENSION4_ID")
    private Integer dimension4Id;

    @Column(name = "DIMENSION5_ID")
    private Integer dimension5Id;

    @Column(name = "DIMENSION6_ID")
    private Integer dimension6Id;

    @Column(name = "DIMENSION7_ID")
    private Integer dimension7Id;

    @Column(name = "DIMENSION8_ID")
    private Integer dimension8Id;

    @Column(name = "DIMENSION9_ID")
    private Integer dimension9Id;

    @Column(name = "DIMENSION10_ID")
    private Integer dimension10Id;

    @Column(name = "CREATED_BY")
    private Integer createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Integer lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;


    @Column(name = "TRAVELER_ID")
    private Integer travelerId;

    @Column(name = "VEHICLE_CODE")
    private String vehicleCode;

    @Column(name = "TRAVEL_DAYS")
    private Integer travelDays;

    @Column(name = "EMPLOYEE_LEVELS_ID")
    private Integer employeeLevelsId;

    @Column(name = "SPLIT_STATUS")
    private String splitStatus;

    @Column(name = "INVOICE_TYPE")
    private String invoiceType;

    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @Column(name = "INVOICE_STATUS")
    private String invoiceStatus;

    @Column(name = "TAX")
    private Integer tax;

    @Column(name = "NO_TAX_AMOUNT")
    private Integer noTaxAmount;

    @Column(name = "TAX_RATE")
    private Integer taxRate;

    @Column(name = "USAGE_TYPE")
    private String usageType;

    @Column(name = "USAGE_STATUS")
    private String usageStatus;

    @Column(name = "AUTHENTICATION_TIME")
    private Date authenticationTime;

    @Column(name = "ROLL_OUT_AMOUNT")
    private Integer rollOutAmount;

    @Column(name = "INVOICE_CODE")
    private String invoiceCode;

    @Column(name = "INVOICE_DATE")
    private Date invoiceDate;

    @Column(name = "INPUT_TAX_STRUCTURE_DETAIL")
    private String inputTaxStructureDetail;

    @Column(name = "INVOICE_AMOUNT")
    private Integer invoiceAmount;

    @Column(name = "MANUAL_ROLL_OUT_FLAG")
    private String manualRollOutFlag;

    @Column(name = "AUTHSTATUS")
    private String authstatus;

    @Column(name = "REVERSED_FLAG")
    private String reversedFlag;

    @Column(name = "REVERSED_BY")
    private Integer reversedBy;

	public Integer getExpReportLineId() {
		return expReportLineId;
	}

	public void setExpReportLineId(Integer expReportLineId) {
		this.expReportLineId = expReportLineId;
	}

	public Integer getLine_number() {
		return line_number;
	}

	public void setLine_number(Integer line_number) {
		this.line_number = line_number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeriod_name() {
		return period_name;
	}

	public void setPeriod_name(String period_name) {
		this.period_name = period_name;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public Integer getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(Integer exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public Integer getExpense_type_id() {
		return expense_type_id;
	}

	public void setExpense_type_id(Integer expense_type_id) {
		this.expense_type_id = expense_type_id;
	}

	public Integer getExpense_item_id() {
		return expense_item_id;
	}

	public void setExpense_item_id(Integer expense_item_id) {
		this.expense_item_id = expense_item_id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPrimary_quantity() {
		return primary_quantity;
	}

	public void setPrimary_quantity(Integer primary_quantity) {
		this.primary_quantity = primary_quantity;
	}

	public Double getReport_amount() {
		return report_amount;
	}

	public void setReport_amount(Double report_amount) {
		this.report_amount = report_amount;
	}

	public Double getReport_functional_amount() {
		return report_functional_amount;
	}

	public void setReport_functional_amount(Double report_functional_amount) {
		this.report_functional_amount = report_functional_amount;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Integer unit_id) {
		this.unit_id = unit_id;
	}

	public Integer getPosition_id() {
		return position_id;
	}

	public void setPosition_id(Integer position_id) {
		this.position_id = position_id;
	}

	public Integer getResponsibility_center_id() {
		return responsibility_center_id;
	}

	public void setResponsibility_center_id(Integer responsibility_center_id) {
		this.responsibility_center_id = responsibility_center_id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getPayee_category() {
		return payee_category;
	}

	public void setPayee_category(String payee_category) {
		this.payee_category = payee_category;
	}

	public Integer getPayee_id() {
		return payee_id;
	}

	public void setPayee_id(Integer payee_id) {
		this.payee_id = payee_id;
	}

	public String getPayment_flag() {
		return payment_flag;
	}

	public void setPayment_flag(String payment_flag) {
		this.payment_flag = payment_flag;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Integer getPayment_type_id() {
		return payment_type_id;
	}

	public void setPayment_type_id(Integer payment_type_id) {
		this.payment_type_id = payment_type_id;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public String getExpense_type_name() {
		return expense_type_name;
	}

	public void setExpense_type_name(String expense_type_name) {
		this.expense_type_name = expense_type_name;
	}

	public String getExp_req_item_name() {
		return exp_req_item_name;
	}

	public void setExp_req_item_name(String exp_req_item_name) {
		this.exp_req_item_name = exp_req_item_name;
	}

	public String getResponsibility_center_name() {
		return responsibility_center_name;
	}

	public void setResponsibility_center_name(String responsibility_center_name) {
		this.responsibility_center_name = responsibility_center_name;
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

	public String getPayee_category_name() {
		return payee_category_name;
	}

	public void setPayee_category_name(String payee_category_name) {
		this.payee_category_name = payee_category_name;
	}

	public String getPayee_name() {
		return payee_name;
	}

	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}

	public String getExp_req_item_id() {
		return exp_req_item_id;
	}

	public void setExp_req_item_id(String exp_req_item_id) {
		this.exp_req_item_id = exp_req_item_id;
	}

	public Integer getTax_type_id() {
		return tax_type_id;
	}

	public void setTax_type_id(Integer tax_type_id) {
		this.tax_type_id = tax_type_id;
	}

	public String getTax_type_desc() {
		return tax_type_desc;
	}

	public void setTax_type_desc(String tax_type_desc) {
		this.tax_type_desc = tax_type_desc;
	}

	public Integer getContract_header_id() {
		return contract_header_id;
	}

	public void setContract_header_id(Integer contract_header_id) {
		this.contract_header_id = contract_header_id;
	}

	public Integer getPayment_schedule_line_id() {
		return payment_schedule_line_id;
	}

	public void setPayment_schedule_line_id(Integer payment_schedule_line_id) {
		this.payment_schedule_line_id = payment_schedule_line_id;
	}

	public String getContract_header_code() {
		return contract_header_code;
	}

	public void setContract_header_code(String contract_header_code) {
		this.contract_header_code = contract_header_code;
	}

	public String getPayment_schedule_line_code() {
		return payment_schedule_line_code;
	}

	public void setPayment_schedule_line_code(String payment_schedule_line_code) {
		this.payment_schedule_line_code = payment_schedule_line_code;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getP_rep_date() {
		return p_rep_date;
	}

	public void setP_rep_date(Date p_rep_date) {
		this.p_rep_date = p_rep_date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String get_status() {
		return _status;
	}

	public void set_status(String _status) {
		this._status = _status;
	}

	public Integer getExpReportHeaderId() {
		return expReportHeaderId;
	}

	public void setExpReportHeaderId(Integer expReportHeaderId) {
		this.expReportHeaderId = expReportHeaderId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPlaceTypeId() {
		return placeTypeId;
	}

	public void setPlaceTypeId(Integer placeTypeId) {
		this.placeTypeId = placeTypeId;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
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

	public Integer getBudgetItemId() {
		return budgetItemId;
	}

	public void setBudgetItemId(Integer budgetItemId) {
		this.budgetItemId = budgetItemId;
	}

	public String getPrimaryUom() {
		return primaryUom;
	}

	public void setPrimaryUom(String primaryUom) {
		this.primaryUom = primaryUom;
	}

	public Integer getSecondaryQuantity() {
		return secondaryQuantity;
	}

	public void setSecondaryQuantity(Integer secondaryQuantity) {
		this.secondaryQuantity = secondaryQuantity;
	}

	public String getSecondaryUom() {
		return secondaryUom;
	}

	public void setSecondaryUom(String secondaryUom) {
		this.secondaryUom = secondaryUom;
	}

	public Integer getDistributionSetId() {
		return distributionSetId;
	}

	public void setDistributionSetId(Integer distributionSetId) {
		this.distributionSetId = distributionSetId;
	}

	public Integer getOperationUnitId() {
		return operationUnitId;
	}

	public void setOperationUnitId(Integer operationUnitId) {
		this.operationUnitId = operationUnitId;
	}

	public Integer getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
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

	public String getWriteOffStatus() {
		return writeOffStatus;
	}

	public void setWriteOffStatus(String writeOffStatus) {
		this.writeOffStatus = writeOffStatus;
	}

	public Date getWriteOffComletedDate() {
		return writeOffComletedDate;
	}

	public void setWriteOffComletedDate(Date writeOffComletedDate) {
		this.writeOffComletedDate = writeOffComletedDate;
	}

	public Integer getAttachmentNum() {
		return attachmentNum;
	}

	public void setAttachmentNum(Integer attachmentNum) {
		this.attachmentNum = attachmentNum;
	}

	public Integer getDimension1Id() {
		return dimension1Id;
	}

	public void setDimension1Id(Integer dimension1Id) {
		this.dimension1Id = dimension1Id;
	}

	public Integer getDimension2Id() {
		return dimension2Id;
	}

	public void setDimension2Id(Integer dimension2Id) {
		this.dimension2Id = dimension2Id;
	}

	public Integer getDimension3Id() {
		return dimension3Id;
	}

	public void setDimension3Id(Integer dimension3Id) {
		this.dimension3Id = dimension3Id;
	}

	public Integer getDimension4Id() {
		return dimension4Id;
	}

	public void setDimension4Id(Integer dimension4Id) {
		this.dimension4Id = dimension4Id;
	}

	public Integer getDimension5Id() {
		return dimension5Id;
	}

	public void setDimension5Id(Integer dimension5Id) {
		this.dimension5Id = dimension5Id;
	}

	public Integer getDimension6Id() {
		return dimension6Id;
	}

	public void setDimension6Id(Integer dimension6Id) {
		this.dimension6Id = dimension6Id;
	}

	public Integer getDimension7Id() {
		return dimension7Id;
	}

	public void setDimension7Id(Integer dimension7Id) {
		this.dimension7Id = dimension7Id;
	}

	public Integer getDimension8Id() {
		return dimension8Id;
	}

	public void setDimension8Id(Integer dimension8Id) {
		this.dimension8Id = dimension8Id;
	}

	public Integer getDimension9Id() {
		return dimension9Id;
	}

	public void setDimension9Id(Integer dimension9Id) {
		this.dimension9Id = dimension9Id;
	}

	public Integer getDimension10Id() {
		return dimension10Id;
	}

	public void setDimension10Id(Integer dimension10Id) {
		this.dimension10Id = dimension10Id;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getTravelerId() {
		return travelerId;
	}

	public void setTravelerId(Integer travelerId) {
		this.travelerId = travelerId;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public Integer getTravelDays() {
		return travelDays;
	}

	public void setTravelDays(Integer travelDays) {
		this.travelDays = travelDays;
	}

	public Integer getEmployeeLevelsId() {
		return employeeLevelsId;
	}

	public void setEmployeeLevelsId(Integer employeeLevelsId) {
		this.employeeLevelsId = employeeLevelsId;
	}

	public String getSplitStatus() {
		return splitStatus;
	}

	public void setSplitStatus(String splitStatus) {
		this.splitStatus = splitStatus;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Integer getNoTaxAmount() {
		return noTaxAmount;
	}

	public void setNoTaxAmount(Integer noTaxAmount) {
		this.noTaxAmount = noTaxAmount;
	}

	public Integer getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Integer taxRate) {
		this.taxRate = taxRate;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public String getUsageStatus() {
		return usageStatus;
	}

	public void setUsageStatus(String usageStatus) {
		this.usageStatus = usageStatus;
	}

	public Date getAuthenticationTime() {
		return authenticationTime;
	}

	public void setAuthenticationTime(Date authenticationTime) {
		this.authenticationTime = authenticationTime;
	}

	public Integer getRollOutAmount() {
		return rollOutAmount;
	}

	public void setRollOutAmount(Integer rollOutAmount) {
		this.rollOutAmount = rollOutAmount;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInputTaxStructureDetail() {
		return inputTaxStructureDetail;
	}

	public void setInputTaxStructureDetail(String inputTaxStructureDetail) {
		this.inputTaxStructureDetail = inputTaxStructureDetail;
	}

	public Integer getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Integer invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getManualRollOutFlag() {
		return manualRollOutFlag;
	}

	public void setManualRollOutFlag(String manualRollOutFlag) {
		this.manualRollOutFlag = manualRollOutFlag;
	}

	public String getAuthstatus() {
		return authstatus;
	}

	public void setAuthstatus(String authstatus) {
		this.authstatus = authstatus;
	}

	public String getReversedFlag() {
		return reversedFlag;
	}

	public void setReversedFlag(String reversedFlag) {
		this.reversedFlag = reversedFlag;
	}

	public Integer getReversedBy() {
		return reversedBy;
	}

	public void setReversedBy(Integer reversedBy) {
		this.reversedBy = reversedBy;
	}


}