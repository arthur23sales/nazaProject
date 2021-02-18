package com.nazareno.janga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nazareno.janga.enums.GenderEnum;

@Entity
@Table(name="member")
public class Member implements Serializable {

	private static final long serialVersionUID = 1234567L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(nullable = false)
    private String name;
	
	@Column
    private String address;

	@Temporal(TemporalType.DATE)
	@Column
	private Date birthDate;

	@Temporal(TemporalType.DATE)
	@Column
	private Date conversionDate;

	@Temporal(TemporalType.DATE)
	@Column
	private Date baptismDate;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date receivedMemberDate;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date removalDate;

	@Column
    private String naturaless;
	
	@Column
    private GenderEnum gender;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@Column
	private String reasonForLeave;

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(Date conversionDate) {
		this.conversionDate = conversionDate;
	}

	public Date getBaptismDate() {
		return baptismDate;
	}

	public void setBaptismDate(Date baptismDate) {
		this.baptismDate = baptismDate;
	}

	public Date getReceivedMemberDate() {
		return receivedMemberDate;
	}

	public void setReceivedMemberDate(Date receivedMemberDate) {
		this.receivedMemberDate = receivedMemberDate;
	}

	public Date getRemovalDate() {
		return removalDate;
	}

	public void setRemovalDate(Date removalDate) {
		this.removalDate = removalDate;
	}

	public String getNaturaless() {
		return naturaless;
	}

	public void setNaturaless(String naturaless) {
		this.naturaless = naturaless;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReasonForLeave() {
		return reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((baptismDate == null) ? 0 : baptismDate.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((conversionDate == null) ? 0 : conversionDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((naturaless == null) ? 0 : naturaless.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((reasonForLeave == null) ? 0 : reasonForLeave.hashCode());
		result = prime * result + ((receivedMemberDate == null) ? 0 : receivedMemberDate.hashCode());
		result = prime * result + ((removalDate == null) ? 0 : removalDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (baptismDate == null) {
			if (other.baptismDate != null)
				return false;
		} else if (!baptismDate.equals(other.baptismDate))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (conversionDate == null) {
			if (other.conversionDate != null)
				return false;
		} else if (!conversionDate.equals(other.conversionDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (naturaless == null) {
			if (other.naturaless != null)
				return false;
		} else if (!naturaless.equals(other.naturaless))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (reasonForLeave == null) {
			if (other.reasonForLeave != null)
				return false;
		} else if (!reasonForLeave.equals(other.reasonForLeave))
			return false;
		if (receivedMemberDate == null) {
			if (other.receivedMemberDate != null)
				return false;
		} else if (!receivedMemberDate.equals(other.receivedMemberDate))
			return false;
		if (removalDate == null) {
			if (other.removalDate != null)
				return false;
		} else if (!removalDate.equals(other.removalDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate
				+ ", conversionDate=" + conversionDate + ", baptismDate=" + baptismDate + ", receivedMemberDate="
				+ receivedMemberDate + ", removalDate=" + removalDate + ", naturaless=" + naturaless + ", gender="
				+ gender + ", phone=" + phone + ", email=" + email + ", reasonForLeave=" + reasonForLeave + "]";
	}
	
	
	 
	
	
	
	
	

}

