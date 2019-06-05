package entity;

public class EmplProj {
    private long employeeId;
    private long projectId;

    @Override
    public String toString() {
        return "EmplProjDAO{" +
                "employeeId=" + employeeId +
                ", projectId=" + projectId +
                '}';
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public EmplProj() {

    }
}
