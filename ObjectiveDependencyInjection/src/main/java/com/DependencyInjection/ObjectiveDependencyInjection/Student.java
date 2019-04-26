package com.DependencyInjection.ObjectiveDependencyInjection;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Student {
	
	private List<String> sName;
	private Set<Integer> sId;

	public List<String> getsName() {
		return sName;
	}

	public Set<Integer> getsId() {
		return sId;
	}

	public void setsId(Set<Integer> sId) {
		this.sId = sId;
	}

	public void setsName(List<String> sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + "]";
	}
	
	public void sData() {
		Iterator<String> itr = sName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void sIdentityNumber() {
		Iterator<Integer> itr = sId.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
