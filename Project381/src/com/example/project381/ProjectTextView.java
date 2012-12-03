package com.example.project381;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class ProjectTextView extends AutoCompleteTextView {

	private Language language;
	
	boolean lineNumbersEnabled;
	
	enum Language {
		C,
		JAVA,
		BASH,
		CPLUSPLUS,
		TCL,
		TEXT
	};
	
	String[] CLANGUAGE = new String[] {
            
        	// Headers
        	"#include", "<sdtio.h>", "return",
            
            // Key Words Reserved
        	"auto",
        	"_Bool",
        	"break",
        	"case",
        	"char",
        	"_Complex",
        	"const",
        	"continue",
        	"default",
        	"do",
        	"double",
        	"else",
        	"enum",
        	"extern",
        	"float",
        	"for",
        	"goto",
        	"if",
        	"_Imaginary",
        	"inline",
        	"int",
        	"long",
        	"register",
        	"restrict",
        	"return",
        	"short",
        	"signed",
        	"sizeof",
        	"static",
        	"struct",
        	"switch",
        	"typedef",
        	"union",
        	"unsigned",
        	"void",
        	"volatile",
        	"while",
        	
        	// Library Functions
        	
        	"strcat(dest, source)",
        	"strchr(s, c)",
        	"strcmp(a, b)",
        	"strcpy(dest, source)",
        	"strlen(st)",
        	"strncat(dest, source, n)",
        	"strncmp(a, b, n)",
        	"strrchr(s, c)",
        	"strcoll(s1, s2)",
        	"strcspn(s1, s2)",
        	"strerror(errno)",
        	"strncpy(dest, source, n)",
        	"strpbrk(s1, s2)",
        	"strspn(s1, s2)",
        	"strstr(st, subst)",
        	"strtok(s1, s2)",
        	"strxfrm(s1, s2, n)",
        	
        	// Standard Libraries
        	
        	"<assert.h>",
        	"<complex.h>",
        	"<ctype.h>",
        	"<errno.h>",
        	"<fenv.h>",
        	"<float.h>",
        	"<inttypes.h>",
        	"<iso646.h>",
        	"<limits.h>",
        	"<locale.h>",
        	"<math.h>",
        	"<setjmp.h>",
        	"<signal.h>",
        	"<stdalign.h>",
        	"<stdarg.h>",
        	"<stdatomic.h>",
        	"<stdbool.h>",
        	"<stddef.h>",
        	"<stdint.h>",
        	"<stdio.h>",
        	"<stdlib.h>",
        	"<stdnoreturn.h>",
        	"<string.h>",
        	"<tgmath.h>",
        	"<threads.h>",
        	"<time.h>",
        	"<uchar.h>",
        	"<wchar.h>",
        	"<wctype.h>"
        };
        
    String[] JAVALANGUAGE = new String[] {
    		//Key Words
        	"abstract",
        	"assert",
        	"boolean",
        	"break",
        	"byte",
        	"case",
        	"catch",
        	"char",
        	"class",
        	"const",
        	"continue",
        	"default",
        	"do",
        	"double",
        	"else",
        	"enum",
        	"extends",
        	"final",
        	"finally",
        	"float",
        	"for",
        	"goto",
        	"if",
        	"implements",
        	"import",
        	"instanceof",
        	"int",
        	"interface",
        	"long",
        	"native",
        	"new",
        	"package",
        	"private",
        	"protected",
        	"public",
        	"return",
        	"short",
        	"static",
        	"strictfp",
        	"super",
        	"switch",
        	"synchronized",
        	"this",
        	"throw",
        	"throws",
        	"transient",
        	"try",
        	"void",
        	"volatile",
        	"while"
        };
	
	Language currentLanguage;
	
	private String previous = "";
	private String seperator = " ";
	
	public ProjectTextView(final Context context, final AttributeSet attrs, final int defStyle) {
		super(context, attrs, defStyle);
		setThreshold(0);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_multiple_choice, CLANGUAGE);
        
		
		
        setAdapter(adapter);
	}   
	
	public ProjectTextView(final Context context, final AttributeSet attrs) {
		super(context, attrs);
		this.setThreshold(0);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_multiple_choice, CLANGUAGE);
        
        setAdapter(adapter);
	}
	public ProjectTextView(final Context context) {
		super(context);
		this.setThreshold(0);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_multiple_choice, CLANGUAGE);
        
        setAdapter(adapter);
	}
	
	/**
	 * This method filters out the existing text till the separator
	 * and launched the filtering process again
	 */	
	@Override
	protected void performFiltering(final CharSequence text, final int keyCode) {
		String filterText = text.toString().trim();
		previous = filterText.substring(0,filterText.lastIndexOf(getSeperator())+1);
		filterText = filterText.substring(filterText.lastIndexOf(getSeperator()) + 1);
		if(!TextUtils.isEmpty(filterText)){
			super.performFiltering(filterText, keyCode);
		}
	}
	
	/**
	 * After a selection, capture the new value and append to the existing
	 * text
	 */
	@Override
	protected void replaceText(final CharSequence text) {
		super.replaceText(previous+text+getSeperator());
	}
	public String getSeperator() {
		return seperator;
	}
	public void setSeperator(final String seperator) {
		this.seperator = seperator;
	}
	
	public String getLanguage() {
		return null;
	}
    
	public void setLanguage(Language l) {
		language = l;
	}
	
}
