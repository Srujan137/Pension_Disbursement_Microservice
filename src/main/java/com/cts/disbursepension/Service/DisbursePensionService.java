package com.cts.disbursepension.service;

import com.cts.disbursepension.model.PensionerDetail;
import com.cts.disbursepension.model.ProcessPensionInput;
import com.cts.disbursepension.model.ProcessPensionResponse;


public interface DisbursePensionService {

	
	public double findBankCharges(String bankType);

	public ProcessPensionResponse verifyPension(ProcessPensionInput processPensionInput);

	
	public boolean verifyPensionAmount(PensionerDetail pensionerDetail, double pensionAmount);

	
	public boolean verifyBankCharges(String bankType, double bankCharges);

	
	public PensionerDetail getPensionerDetail(String aadhaarNumber);

}
