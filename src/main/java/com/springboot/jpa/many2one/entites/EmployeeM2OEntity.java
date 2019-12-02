/**
 * 
 */
package com.springboot.jpa.many2one.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author broutu
 *
 */
@Entity
@Table(name = "EMP")
//@NamedQuery(name = "all-employees", query = "SELECT EE FROM EmployeeEntity EE")
public class EmployeeM2OEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "EMPNO")
	private int empNo;

	@Column(name = "ENAME")
	private String ename;

	@Column(name = "JOB")
	private String job;

	@Column(name = "MGR")
	private Integer mgr;

	@Column(name = "HIREDATE")
	private String hireDate;

	@Column(name = "SAL")
	private Integer salary;

	@Column(name = "COMM")
	private Integer commession;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
	private DepartmentM2OEntity departmentM2OEntity;

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

	/**
	 * @return the departmentM2OEntity
	 */
	public DepartmentM2OEntity getDepartmentM2OEntity() {
		return departmentM2OEntity;
	}

	/**
	 * @param departmentM2OEntity the departmentM2OEntity to set
	 */
	public void setDepartmentM2OEntity(DepartmentM2OEntity departmentM2OEntity) {
		this.departmentM2OEntity = departmentM2OEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeEntity [empNo=");
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
		builder.append(", departmentM2OEntity=");
		builder.append(departmentM2OEntity);
		builder.append("]");
		return builder.toString();
	}

}
