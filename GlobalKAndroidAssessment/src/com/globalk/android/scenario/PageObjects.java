package com.globalk.android.scenario;

import com.globalk.android.base.BaseSetup;


public class PageObjects extends BaseSetup {
	
	protected AndroidDriver driver;

	public PageObjects(AndroidDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
