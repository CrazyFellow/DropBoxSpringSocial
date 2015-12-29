package org.springframework.social.dropbox.api;

import java.io.Serializable;
import java.util.Date;

/**
 * File url can be shared or streamed as media
 * 
 * @author Raghava J
 *
 */
public class FileUrl implements Serializable
{
	private static final long serialVersionUID = 1L;
    
	private final String url;
	private final Date expires;
	public String getUrl() {
		return url;
	}
	public Date getExpires() {
		return expires;
	}
	
	public FileUrl(String url, Date expires) {
		super();
		this.url = url;
		this.expires = expires;
	}
}
