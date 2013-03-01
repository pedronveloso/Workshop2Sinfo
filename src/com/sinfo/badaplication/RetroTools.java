package com.sinfo.badaplication;

import android.os.Build;
import android.widget.EditText;

public final class RetroTools {
	
	/**
	 * 
	 * @param et
	 * @return True if et is empty
	 */
	public static boolean validateFieldEmpty(final EditText et){
		if (Build.VERSION.SDK_INT<Build.VERSION_CODES.GINGERBREAD){
			return et.getText().toString().length()==0;
		} else{
			return et.getText().toString().isEmpty();
		}
	}

}
