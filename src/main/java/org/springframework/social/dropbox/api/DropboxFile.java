package org.springframework.social.dropbox.api;

import java.io.InputStream;
import java.io.Serializable;

/**
 * Dropbox file details	
 * 
 * @author Raghava J
 *
 */
public class DropboxFile implements Serializable
{
	private static final long serialVersionUID = 1L;
    
	private final String contentType;
	private final long Size;
	private final InputStream inputStream;

	public String getContentType() {
		return contentType;
	}
	public long getSize() {
		return Size;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	
	
	public DropboxFile(String contentType, long size, InputStream inputStream) {
		super();
		this.contentType = contentType;
		Size = size;
		this.inputStream = inputStream;
	}
}
