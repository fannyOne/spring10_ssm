package com.bean;
// default package



/**
 * Position entity. @author MyEclipse Persistence Tools
 */

public class Position  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String nameCn;
     private String nameEn;


    // Constructors

    /** default constructor */
    public Position() {
    }

    
    /** full constructor */
    public Position(String nameCn, String nameEn) {
        this.nameCn = nameCn;
        this.nameEn = nameEn;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCn() {
        return this.nameCn;
    }
    
    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }


	@Override
	public String toString() {
		return "Position [id=" + id + ", nameCn=" + nameCn + ", nameEn="
				+ nameEn + "]";
	}
   








}