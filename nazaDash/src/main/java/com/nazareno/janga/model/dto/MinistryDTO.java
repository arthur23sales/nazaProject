package com.nazareno.janga.model.dto;

import java.util.Set;

import com.nazareno.janga.model.Member;

public class MinistryDTO {
	
    private Long id;
	
    private String name;
	
	private Set<Member> memberMinistry;

	private Member leader;
	
	private Member secretary;
	

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

	public Set<Member> getMemberMinistry() {
		return memberMinistry;
	}

	public void setMemberMinistry(Set<Member> memberMinistry) {
		this.memberMinistry = memberMinistry;
	}

	public Member getLeader() {
		return leader;
	}

	public void setLeader(Member leader) {
		this.leader = leader;
	}

	public Member getSecretary() {
		return secretary;
	}

	public void setSecretary(Member secretary) {
		this.secretary = secretary;
	}

	@Override
	public String toString() {
		return "MinistryDTO [id=" + id + ", name=" + name + ", memberMinistry=" + memberMinistry + ", leader=" + leader
				+ ", secretary=" + secretary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((leader == null) ? 0 : leader.hashCode());
		result = prime * result + ((memberMinistry == null) ? 0 : memberMinistry.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((secretary == null) ? 0 : secretary.hashCode());
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
		MinistryDTO other = (MinistryDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (leader == null) {
			if (other.leader != null)
				return false;
		} else if (!leader.equals(other.leader))
			return false;
		if (memberMinistry == null) {
			if (other.memberMinistry != null)
				return false;
		} else if (!memberMinistry.equals(other.memberMinistry))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (secretary == null) {
			if (other.secretary != null)
				return false;
		} else if (!secretary.equals(other.secretary))
			return false;
		return true;
	}
	
	
	

}
