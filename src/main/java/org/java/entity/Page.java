package org.java.entity;

import java.io.Serializable;

public class Page implements Serializable {

	private Integer index=1;
	private Integer size=3;
	private Integer count;
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public Integer getMaxPage(){
		return count%size==0?count/size:count/size+1;
	}
}
