package com.cleverua.bb.utils;

import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.XYEdges;
import net.rim.device.api.ui.decor.Background;
import net.rim.device.api.ui.decor.BackgroundFactory;
import net.rim.device.api.ui.decor.Border;
import net.rim.device.api.ui.decor.BorderFactory;

public class FieldDecorUtils {

    private final static int BORDER_SIZE    = 19;

    public final static Border INPUT_FIELD_BORDER = BorderFactory.createBitmapBorder(
        new XYEdges(BORDER_SIZE, BORDER_SIZE, BORDER_SIZE, BORDER_SIZE),
        Bitmap.getBitmapResource("resources/text_input_border.png")
    );
    
    public final static Border INPUT_FIELD_BORDER_FOCUSED = BorderFactory.createBitmapBorder(
        new XYEdges(BORDER_SIZE, BORDER_SIZE, BORDER_SIZE, BORDER_SIZE),
        Bitmap.getBitmapResource("resources/text_input_border_focused.png")
    );
   
    public final static Background INPUT_FIELD_BG = 
        BackgroundFactory.createSolidBackground(0x00EEEEEE);
    
    public final static Background INPUT_FIELD_BG_FOCUSED = 
        BackgroundFactory.createSolidBackground(0x00FFFFFF);
    
    public static final int[] VISUAL_STATES = {
        Field.VISUAL_STATE_NORMAL,
        Field.VISUAL_STATE_FOCUS,
        Field.VISUAL_STATE_ACTIVE,
        Field.VISUAL_STATE_DISABLED_FOCUS,
        Field.VISUAL_STATE_DISABLED
        };
    
    /**
     * Sets custom Border/Background to be used for the focused and unfocused visual states.
     * @param f - Field to be processed
     */
    public static void setVisualStateBorderAndBg(Field f) {
        final int length = VISUAL_STATES.length;
        for (int i = 0; i < length; i++) {
            final int visualState = VISUAL_STATES[i];
            if (visualState == Field.VISUAL_STATE_FOCUS) {
                f.setBorder(visualState, INPUT_FIELD_BORDER_FOCUSED);
                f.setBackground(visualState, INPUT_FIELD_BG_FOCUSED);
            } else {
                f.setBorder(visualState, INPUT_FIELD_BORDER);
                f.setBackground(visualState, INPUT_FIELD_BG);
            }
        }
    }
}
