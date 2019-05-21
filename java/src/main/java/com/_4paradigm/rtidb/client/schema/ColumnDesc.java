package com._4paradigm.rtidb.client.schema;

public class ColumnDesc {

	private ColumnType type;
	private String name;
	private boolean addTsIndex;
	private boolean tsCol;
	public boolean isAddTsIndex() {
		return addTsIndex;
	}
	public void setAddTsIndex(boolean addTsIndex) {
		this.addTsIndex = addTsIndex;
	}
	public ColumnType getType() {
		return type;
	}
	public void setType(ColumnType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTsCol() {
		return tsCol;
	}
	public void setTsCol(boolean isTsCol) {
		this.tsCol = isTsCol;
	}
}
