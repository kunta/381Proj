package com.example.project381;

public class Document {

	String fileName;
	String text;
	String extension;
	
	public Document() {}
	
	public Document(String f, String ext) {
		fileName = f;
		extension = ext;
	}
	
	public Document(String t, String ext, String f) {
		fileName = f;
		text = t;
		extension = ext;
	}
	
	public String getText() {
		return text;
	}
	
	public String getExtension() {
		return extension;
	}
	
	public void setString(String newText) {
		text = newText;
	}
	
	public void setExtension(String newExt) {
		extension = newExt;
	}
	
	public void setFileName(String newFileName) {
		fileName = newFileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
}
