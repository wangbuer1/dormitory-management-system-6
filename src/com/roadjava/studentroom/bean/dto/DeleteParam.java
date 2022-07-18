package com.roadjava.studentroom.bean.dto;
/**
 * @author zhaodaowen
  * 个人网站: http://www.roadjava.com/
  *  封装删除语句参数的类
 */
public class DeleteParam {
	private StringBuilder sql;
	private Long[] ids;
	
	public StringBuilder getSql() {
		return sql;
	}
	public void setSql(StringBuilder sql) {
		this.sql = sql;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	
	
}
