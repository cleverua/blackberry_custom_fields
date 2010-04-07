package com.cleverua.bb.fields;

import net.rim.device.api.ui.component.EditField;

import com.cleverua.bb.utils.FieldDecorUtils;

public class CustomEditField extends EditField {
    public CustomEditField() {
        super();
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomEditField(long style) {
        super(style);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomEditField(String label) {
        super(label, null);
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
