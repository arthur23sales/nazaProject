package com.nazareno.janga.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="ministry")
public class Ministry implements Serializable{
	

		private static final long serialVersionUID = 1234568L;
		
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
		
		@Column(nullable = false)
	    private String name;
		
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(name = "member_ministry", joinColumns = { @JoinColumn(name = "member_id") }, inverseJoinColumns = {
				@JoinColumn(name = "ministry_id") })
		@Fetch(FetchMode.SELECT)
		@Cascade(CascadeType.ALL)
		@BatchSize(size = 25)
		private Set<Member> memberMinistry;

		@ManyToOne(fetch = FetchType.EAGER)
		@Cascade({ CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
		private Member leader;
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@Cascade({ CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
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
			Ministry other = (Ministry) obj;
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


		@Override
		public String toString() {
			return "Ministry [id=" + id + ", name=" + name + ", memberMinistry=" + memberMinistry + ", leader=" + leader
					+ ", secretary=" + secretary + "]";
		}
		
		
		

}
