/**
 * 
 */
package com.springboot.jpa.one2manyuni.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author broutu
 *
 */
@Entity
@Table(name = "DEPT")
public class DepartmentO2MUniEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "DEPTNO")
	private Integer deptNo;

	@Column(name = "DNAME")
	private String dname;

	@Column(name = "LOC")
	private String location;

	@OneToMany(fetch = FetchType.LAZY,  targetEntity=EmployeeO2MUniEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPTNO", referencedColumnName="DEPTNO")
	private List<EmployeeO2MUniEntity> employeeO2MUniEntites;

	/**
	 * @return the deptNo
	 */
	public Integer getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the employeeO2MUniEntites
	 */
	public List<EmployeeO2MUniEntity> getEmployeeO2MUniEntites() {
		return employeeO2MUniEntites;
	}

	/**
	 * @param employeeO2MUniEntites the employeeO2MUniEntites to set
	 */
	public void setEmployeeO2MUniEntites(List<EmployeeO2MUniEntity> employeeO2MUniEntites) {
		this.employeeO2MUniEntites = employeeO2MUniEntites;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmentO2MBiEntity [deptNo=");
		builder.append(deptNo);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", location=");
		builder.append(location);
		builder.append(", employeeO2MUniEntites=");
		builder.append(employeeO2MUniEntites);
		builder.append("]");
		return builder.toString();
	}

}
