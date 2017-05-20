package cn.arain.pojo;

public class SysOplogWithBLOBs extends SysOplog {
    private String method;

    private String desc;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}