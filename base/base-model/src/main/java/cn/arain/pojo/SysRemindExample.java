package cn.arain.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysRemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRemindExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRqIsNull() {
            addCriterion("RQ_ is null");
            return (Criteria) this;
        }

        public Criteria andRqIsNotNull() {
            addCriterion("RQ_ is not null");
            return (Criteria) this;
        }

        public Criteria andRqEqualTo(Integer value) {
            addCriterion("RQ_ =", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotEqualTo(Integer value) {
            addCriterion("RQ_ <>", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThan(Integer value) {
            addCriterion("RQ_ >", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQ_ >=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThan(Integer value) {
            addCriterion("RQ_ <", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThanOrEqualTo(Integer value) {
            addCriterion("RQ_ <=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqIn(List<Integer> values) {
            addCriterion("RQ_ in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotIn(List<Integer> values) {
            addCriterion("RQ_ not in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqBetween(Integer value1, Integer value2) {
            addCriterion("RQ_ between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotBetween(Integer value1, Integer value2) {
            addCriterion("RQ_ not between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andNrIsNull() {
            addCriterion("NR_ is null");
            return (Criteria) this;
        }

        public Criteria andNrIsNotNull() {
            addCriterion("NR_ is not null");
            return (Criteria) this;
        }

        public Criteria andNrEqualTo(String value) {
            addCriterion("NR_ =", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotEqualTo(String value) {
            addCriterion("NR_ <>", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThan(String value) {
            addCriterion("NR_ >", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThanOrEqualTo(String value) {
            addCriterion("NR_ >=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThan(String value) {
            addCriterion("NR_ <", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThanOrEqualTo(String value) {
            addCriterion("NR_ <=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLike(String value) {
            addCriterion("NR_ like", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotLike(String value) {
            addCriterion("NR_ not like", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrIn(List<String> values) {
            addCriterion("NR_ in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotIn(List<String> values) {
            addCriterion("NR_ not in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrBetween(String value1, String value2) {
            addCriterion("NR_ between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotBetween(String value1, String value2) {
            addCriterion("NR_ not between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID_ is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID_ is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID_ =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID_ <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID_ >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID_ >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID_ <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID_ <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID_ in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID_ not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID_ between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID_ not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID_ is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID_ is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Long value) {
            addCriterion("ROLEID_ =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Long value) {
            addCriterion("ROLEID_ <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Long value) {
            addCriterion("ROLEID_ >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLEID_ >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Long value) {
            addCriterion("ROLEID_ <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Long value) {
            addCriterion("ROLEID_ <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Long> values) {
            addCriterion("ROLEID_ in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Long> values) {
            addCriterion("ROLEID_ not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Long value1, Long value2) {
            addCriterion("ROLEID_ between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Long value1, Long value2) {
            addCriterion("ROLEID_ not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Long value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Long value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Long value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Long value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Long value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Long> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Long> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Long value1, Long value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Long value1, Long value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andIsremindIsNull() {
            addCriterion("ISREMIND is null");
            return (Criteria) this;
        }

        public Criteria andIsremindIsNotNull() {
            addCriterion("ISREMIND is not null");
            return (Criteria) this;
        }

        public Criteria andIsremindEqualTo(Short value) {
            addCriterion("ISREMIND =", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotEqualTo(Short value) {
            addCriterion("ISREMIND <>", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindGreaterThan(Short value) {
            addCriterion("ISREMIND >", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindGreaterThanOrEqualTo(Short value) {
            addCriterion("ISREMIND >=", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindLessThan(Short value) {
            addCriterion("ISREMIND <", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindLessThanOrEqualTo(Short value) {
            addCriterion("ISREMIND <=", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindIn(List<Short> values) {
            addCriterion("ISREMIND in", values, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotIn(List<Short> values) {
            addCriterion("ISREMIND not in", values, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindBetween(Short value1, Short value2) {
            addCriterion("ISREMIND between", value1, value2, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotBetween(Short value1, Short value2) {
            addCriterion("ISREMIND not between", value1, value2, "isremind");
            return (Criteria) this;
        }

        public Criteria andGe0101IsNull() {
            addCriterion("GE0101 is null");
            return (Criteria) this;
        }

        public Criteria andGe0101IsNotNull() {
            addCriterion("GE0101 is not null");
            return (Criteria) this;
        }

        public Criteria andGe0101EqualTo(Long value) {
            addCriterion("GE0101 =", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101NotEqualTo(Long value) {
            addCriterion("GE0101 <>", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101GreaterThan(Long value) {
            addCriterion("GE0101 >", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101GreaterThanOrEqualTo(Long value) {
            addCriterion("GE0101 >=", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101LessThan(Long value) {
            addCriterion("GE0101 <", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101LessThanOrEqualTo(Long value) {
            addCriterion("GE0101 <=", value, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101In(List<Long> values) {
            addCriterion("GE0101 in", values, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101NotIn(List<Long> values) {
            addCriterion("GE0101 not in", values, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101Between(Long value1, Long value2) {
            addCriterion("GE0101 between", value1, value2, "ge0101");
            return (Criteria) this;
        }

        public Criteria andGe0101NotBetween(Long value1, Long value2) {
            addCriterion("GE0101 not between", value1, value2, "ge0101");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}