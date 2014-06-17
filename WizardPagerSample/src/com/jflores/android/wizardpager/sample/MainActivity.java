package com.jflores.android.wizardpager.sample;

import com.jflores.android.wizardpager.AbsWizardPagerActivity;
import com.jflores.android.wizardpager.wizard.model.AbstractWizardModel;

public class MainActivity extends AbsWizardPagerActivity {


    private AbstractWizardModel mWizardModel = new SandwichWizardModel(this);

	@Override
	public AbstractWizardModel getWizardModel() {
		return mWizardModel;
	}


    
}
