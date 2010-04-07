package com.cleverua.bb.fields;

import net.rim.device.api.ui.component.CheckboxField;

import com.cleverua.bb.utils.FieldDecorUtils;

public class CustomCheckBoxField extends CheckboxField {
    public CustomCheckBoxField() {
        super();
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomCheckBoxField(String label, boolean checked) {
        super(label, checked);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomCheckBoxField(String label, boolean checked, long style) {
        super(label, checked, style);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    protected void onFocus(int direction) {
        super.onFocus(direction);
        invalidate();
    }
    
    protected void onUnfocus() {
        super.onUnfocus();
        invalidate();
    }
}
