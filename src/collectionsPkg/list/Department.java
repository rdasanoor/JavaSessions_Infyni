package collectionsPkg.list;

public class Department {

    private Integer deptId;
    private String department;

    public Department(Integer deptId, String department) {
        this.deptId = deptId;
        this.department = department;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
