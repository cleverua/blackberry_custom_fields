package com.cleverua.bb.fields;

import net.rim.device.api.ui.component.ObjectChoiceField;

import com.cleverua.bb.utils.FieldDecorUtils;

public class CustomObjectChoiceField extends ObjectChoiceField {
    public CustomObjectChoiceField() {
        super();
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomObjectChoiceField(String label, Object[] choices) {
        super(label, choices);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomObjectChoiceField(String label, Object[] choices, int initialIndex) {
        super(label, choices, initialIndex);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomObjectChoiceField(String label, Object[] choices, Object initialObject) {
        super(label, choices, initialObject);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public Object[] getChoicesWithoutSelected() {
        final int size = getSize();
        if (size == 0) {
            return null;
        }
        
        Object[] result = new Object[size - 1];
        final int selectedIndex = getSelectedIndex();
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != selectedIndex) {
                result[j++] = getChoice(i);
            }
        }
        return result;
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
