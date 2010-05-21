package com.cleverua.bb.fields;

import net.rim.device.api.ui.container.VerticalFieldManager;

import com.cleverua.bb.utils.FieldDecorUtils;

public class CustomVerticalFieldManager extends VerticalFieldManager {

    public CustomVerticalFieldManager() {
        super();
        FieldDecorUtils.setBorderAndBg(this);
    }
    
    public CustomVerticalFieldManager(long style) {
        super(style);
        FieldDecorUtils.setBorderAndBg(this);
    }
}
