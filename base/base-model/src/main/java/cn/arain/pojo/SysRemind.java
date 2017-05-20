package cn.arain.pojo;

public class SysRemind {
    private Long id;

    private Integer rq;

    private String nr;

    private Long userid;

    private Long roleid;

    private Long orgid;

    private Short isremind;

    private Long ge0101;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRq() {
        return rq;
    }

    public void setRq(Integer rq) {
        this.rq = rq;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr == null ? null : nr.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Short getIsremind() {
        return isremind;
    }

    public void setIsremind(Short isremind) {
        this.isremind = isremind;
    }

    public Long getGe0101() {
        return ge0101;
    }

    public void setGe0101(Long ge0101) {
        this.ge0101 = ge0101;
    }
}