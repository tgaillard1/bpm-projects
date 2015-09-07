package com.redhat.jboss.hr.rewards;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(47d73902cb4d266c542979398b730b46)
 */
@org.kie.api.definition.type.Label(value = "Employee")
public class Employee extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Award")
    @org.kie.api.definition.type.Position(value = 2)
    private com.redhat.jboss.hr.rewards.Award award;
    
    @org.kie.api.definition.type.Label(value = "Department")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String dept;
    
    @org.kie.api.definition.type.Label(value = "Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;

    public Employee() {
    }

    public Employee(java.lang.String name, java.lang.String dept, com.redhat.jboss.hr.rewards.Award award) {
        this.name = name;
        this.dept = dept;
        this.award = award;
    }


    
    public com.redhat.jboss.hr.rewards.Award getAward() {
        return this.award;
    }

    public void setAward(com.redhat.jboss.hr.rewards.Award award) {
        this.award = award;
    }
    
    public java.lang.String getDept() {
        return this.dept;
    }

    public void setDept(java.lang.String dept) {
        this.dept = dept;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}