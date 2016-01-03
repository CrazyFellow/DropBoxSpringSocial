package org.springframework.social.dropbox.api;

import java.math.BigInteger;

public class DropboxUserProfile 
{
	private String country;
	private final String referralLink;
	private String displayName;
	private final String email;
	private BigInteger uid;
	private BigInteger sharedQuota;
	private BigInteger quota;
	private BigInteger normalQuota;
	
	public String getCountry() {
		return country;
	}

	public String getReferralLink() {
		return referralLink;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getEmail() {
		return email;
	}

	public BigInteger getUid() {
		return uid;
	}

	public BigInteger getSharedQuota() {
		return sharedQuota;
	}

	public BigInteger getQuota() {
		return quota;
	}

	public BigInteger getNormalQuota() {
		return normalQuota;
	}

	public DropboxUserProfile(String country, String referralLink,
			String displayName, String email, BigInteger uid,
			BigInteger sharedQuota, BigInteger quota, BigInteger normalQuota) 
	{
		this.country = country;
		this.referralLink = referralLink;
		this.displayName = displayName;
		this.email = email;
		this.uid = uid;
		this.sharedQuota = sharedQuota;
		this.quota = quota;
		this.normalQuota = normalQuota;
	}
}
