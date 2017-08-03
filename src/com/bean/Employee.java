package com.bean;
// default package


public class Employee implements java.io.Serializable {
    private String sn;
    private Integer departmentId;
    private Position position;
    private String name; 
    private String password;  
    private String status;
   
   

	public Employee(String sn, String password) {
		super();
		this.sn = sn;
		this.password = password;
	}

	// Constructors

    /** default constructor */
    public Employee() {
    }

    // Property accessors

    public String getSn() {
        return this.sn;
    }
    
    public void setSn(String sn) {
        this.sn = sn;
    }

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Employee [sn=" + sn + ", departmentId=" + departmentId
				+ ", position=" + position + ", name=" + name + ", password="
				+ password + ", status=" + status + "]";
	}
    
    
}