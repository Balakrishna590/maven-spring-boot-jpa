/**
 * 
 */
package com.springboot.jpa.empdept.response.models;

import java.io.Serializable;

/**
 * @author broutu
 *
 */
public class EmployeeResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empNo;

	private String ename;

	private String job;

	private Integer mgr;

	private String hireDate;

	private Integer salary;

	private Integer commession;

	private Integer deptNo;

	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}

	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the mgr
	 */
	public Integer getMgr() {
		return mgr;
	}

	/**
	 * @param mgr the mgr to set
	 */
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	/**
	 * @return the hireDate
	 */
	public String getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	/**
	 * @return the commession
	 */
	public Integer getCommession() {
		return commession;
	}

	/**
	 * @param commession the commession to set
	 */
	public void setCommession(Integer commession) {
		this.commession = commession;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeResponse [empNo=");
		builder.append(empNo);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", job=");
		builder.append(job);
		builder.append(", mgr=");
		builder.append(mgr);
		builder.append(", hireDate=");
		builder.append(hireDate);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", commession=");
		builder.append(commession);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append("]");
		return builder.toString();
	}

}
