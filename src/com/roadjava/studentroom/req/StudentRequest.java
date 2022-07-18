package com.roadjava.studentroom.req;

/**
 * @author zhaodaowen
  * 个人网站: http://www.roadjava.com/
  * 学生查询条件
 */
public class StudentRequest extends BaseRequest{
    private String studentNo;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
   
}
