package cn.heweiming.novelty.editor;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class StringEditor extends PropertiesEditor {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue("StringEditor");
	}

	@Override
	public String getAsText() {
		return getValue().toString();
	}

}
