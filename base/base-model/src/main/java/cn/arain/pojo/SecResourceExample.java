package cn.arain.pojo;

import java.util.ArrayList;
import java.util.List;

public class SecResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecResourceExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID_ like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID_ not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID_ is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID_ is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID_ =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID_ <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID_ >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID_ >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID_ <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID_ <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID_ like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID_ not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID_ in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID_ not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID_ between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID_ not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE_ =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE_ <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE_ >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE_ <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE_ like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE_ not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE_ in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE_ not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE_ between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE_ not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED_ is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED_ is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Short value) {
            addCriterion("ENABLED_ =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Short value) {
            addCriterion("ENABLED_ <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Short value) {
            addCriterion("ENABLED_ >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLED_ >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Short value) {
            addCriterion("ENABLED_ <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Short value) {
            addCriterion("ENABLED_ <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Short> values) {
            addCriterion("ENABLED_ in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Short> values) {
            addCriterion("ENABLED_ not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Short value1, Short value2) {
            addCriterion("ENABLED_ between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Short value1, Short value2) {
            addCriterion("ENABLED_ not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("ORDER_ is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("ORDER_ is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Short value) {
            addCriterion("ORDER_ =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Short value) {
            addCriterion("ORDER_ <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Short value) {
            addCriterion("ORDER_ >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_ >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Short value) {
            addCriterion("ORDER_ <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_ <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Short> values) {
            addCriterion("ORDER_ in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Short> values) {
            addCriterion("ORDER_ not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Short value1, Short value2) {
            addCriterion("ORDER_ between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_ not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andTableIsNull() {
            addCriterion("TABLE_ is null");
            return (Criteria) this;
        }

        public Criteria andTableIsNotNull() {
            addCriterion("TABLE_ is not null");
            return (Criteria) this;
        }

        public Criteria andTableEqualTo(String value) {
            addCriterion("TABLE_ =", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotEqualTo(String value) {
            addCriterion("TABLE_ <>", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThan(String value) {
            addCriterion("TABLE_ >", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_ >=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThan(String value) {
            addCriterion("TABLE_ <", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThanOrEqualTo(String value) {
            addCriterion("TABLE_ <=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLike(String value) {
            addCriterion("TABLE_ like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotLike(String value) {
            addCriterion("TABLE_ not like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableIn(List<String> values) {
            addCriterion("TABLE_ in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotIn(List<String> values) {
            addCriterion("TABLE_ not in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableBetween(String value1, String value2) {
            addCriterion("TABLE_ between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotBetween(String value1, String value2) {
            addCriterion("TABLE_ not between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andPkIsNull() {
            addCriterion("PK_ is null");
            return (Criteria) this;
        }

        public Criteria andPkIsNotNull() {
            addCriterion("PK_ is not null");
            return (Criteria) this;
        }

        public Criteria andPkEqualTo(String value) {
            addCriterion("PK_ =", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotEqualTo(String value) {
            addCriterion("PK_ <>", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThan(String value) {
            addCriterion("PK_ >", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ >=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThan(String value) {
            addCriterion("PK_ <", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThanOrEqualTo(String value) {
            addCriterion("PK_ <=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLike(String value) {
            addCriterion("PK_ like", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotLike(String value) {
            addCriterion("PK_ not like", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkIn(List<String> values) {
            addCriterion("PK_ in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotIn(List<String> values) {
            addCriterion("PK_ not in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkBetween(String value1, String value2) {
            addCriterion("PK_ between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotBetween(String value1, String value2) {
            addCriterion("PK_ not between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("SEQ_ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ_ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(String value) {
            addCriterion("SEQ_ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(String value) {
            addCriterion("SEQ_ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(String value) {
            addCriterion("SEQ_ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(String value) {
            addCriterion("SEQ_ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(String value) {
            addCriterion("SEQ_ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLike(String value) {
            addCriterion("SEQ_ like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotLike(String value) {
            addCriterion("SEQ_ not like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<String> values) {
            addCriterion("SEQ_ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<String> values) {
            addCriterion("SEQ_ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(String value1, String value2) {
            addCriterion("SEQ_ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(String value1, String value2) {
            addCriterion("SEQ_ not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andTable2IsNull() {
            addCriterion("TABLE2_ is null");
            return (Criteria) this;
        }

        public Criteria andTable2IsNotNull() {
            addCriterion("TABLE2_ is not null");
            return (Criteria) this;
        }

        public Criteria andTable2EqualTo(String value) {
            addCriterion("TABLE2_ =", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2NotEqualTo(String value) {
            addCriterion("TABLE2_ <>", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2GreaterThan(String value) {
            addCriterion("TABLE2_ >", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2GreaterThanOrEqualTo(String value) {
            addCriterion("TABLE2_ >=", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2LessThan(String value) {
            addCriterion("TABLE2_ <", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2LessThanOrEqualTo(String value) {
            addCriterion("TABLE2_ <=", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2Like(String value) {
            addCriterion("TABLE2_ like", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2NotLike(String value) {
            addCriterion("TABLE2_ not like", value, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2In(List<String> values) {
            addCriterion("TABLE2_ in", values, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2NotIn(List<String> values) {
            addCriterion("TABLE2_ not in", values, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2Between(String value1, String value2) {
            addCriterion("TABLE2_ between", value1, value2, "table2");
            return (Criteria) this;
        }

        public Criteria andTable2NotBetween(String value1, String value2) {
            addCriterion("TABLE2_ not between", value1, value2, "table2");
            return (Criteria) this;
        }

        public Criteria andPk2IsNull() {
            addCriterion("PK2_ is null");
            return (Criteria) this;
        }

        public Criteria andPk2IsNotNull() {
            addCriterion("PK2_ is not null");
            return (Criteria) this;
        }

        public Criteria andPk2EqualTo(String value) {
            addCriterion("PK2_ =", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2NotEqualTo(String value) {
            addCriterion("PK2_ <>", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2GreaterThan(String value) {
            addCriterion("PK2_ >", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2GreaterThanOrEqualTo(String value) {
            addCriterion("PK2_ >=", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2LessThan(String value) {
            addCriterion("PK2_ <", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2LessThanOrEqualTo(String value) {
            addCriterion("PK2_ <=", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2Like(String value) {
            addCriterion("PK2_ like", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2NotLike(String value) {
            addCriterion("PK2_ not like", value, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2In(List<String> values) {
            addCriterion("PK2_ in", values, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2NotIn(List<String> values) {
            addCriterion("PK2_ not in", values, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2Between(String value1, String value2) {
            addCriterion("PK2_ between", value1, value2, "pk2");
            return (Criteria) this;
        }

        public Criteria andPk2NotBetween(String value1, String value2) {
            addCriterion("PK2_ not between", value1, value2, "pk2");
            return (Criteria) this;
        }

        public Criteria andSeq2IsNull() {
            addCriterion("SEQ2_ is null");
            return (Criteria) this;
        }

        public Criteria andSeq2IsNotNull() {
            addCriterion("SEQ2_ is not null");
            return (Criteria) this;
        }

        public Criteria andSeq2EqualTo(String value) {
            addCriterion("SEQ2_ =", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2NotEqualTo(String value) {
            addCriterion("SEQ2_ <>", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2GreaterThan(String value) {
            addCriterion("SEQ2_ >", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2GreaterThanOrEqualTo(String value) {
            addCriterion("SEQ2_ >=", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2LessThan(String value) {
            addCriterion("SEQ2_ <", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2LessThanOrEqualTo(String value) {
            addCriterion("SEQ2_ <=", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2Like(String value) {
            addCriterion("SEQ2_ like", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2NotLike(String value) {
            addCriterion("SEQ2_ not like", value, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2In(List<String> values) {
            addCriterion("SEQ2_ in", values, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2NotIn(List<String> values) {
            addCriterion("SEQ2_ not in", values, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2Between(String value1, String value2) {
            addCriterion("SEQ2_ between", value1, value2, "seq2");
            return (Criteria) this;
        }

        public Criteria andSeq2NotBetween(String value1, String value2) {
            addCriterion("SEQ2_ not between", value1, value2, "seq2");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR_ is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR_ is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR_ =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR_ <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR_ >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR_ <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR_ like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR_ not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR_ in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR_ not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR_ between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_ not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("RANK_ is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("RANK_ is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Short value) {
            addCriterion("RANK_ =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Short value) {
            addCriterion("RANK_ <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Short value) {
            addCriterion("RANK_ >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Short value) {
            addCriterion("RANK_ >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Short value) {
            addCriterion("RANK_ <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Short value) {
            addCriterion("RANK_ <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Short> values) {
            addCriterion("RANK_ in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Short> values) {
            addCriterion("RANK_ not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Short value1, Short value2) {
            addCriterion("RANK_ between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Short value1, Short value2) {
            addCriterion("RANK_ not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE_ is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE_ is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Short value) {
            addCriterion("CODE_ =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Short value) {
            addCriterion("CODE_ <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Short value) {
            addCriterion("CODE_ >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("CODE_ >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Short value) {
            addCriterion("CODE_ <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Short value) {
            addCriterion("CODE_ <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Short> values) {
            addCriterion("CODE_ in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Short> values) {
            addCriterion("CODE_ not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Short value1, Short value2) {
            addCriterion("CODE_ between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Short value1, Short value2) {
            addCriterion("CODE_ not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNull() {
            addCriterion("ORGTYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNotNull() {
            addCriterion("ORGTYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeEqualTo(String value) {
            addCriterion("ORGTYPE_ =", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotEqualTo(String value) {
            addCriterion("ORGTYPE_ <>", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThan(String value) {
            addCriterion("ORGTYPE_ >", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE_ >=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThan(String value) {
            addCriterion("ORGTYPE_ <", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE_ <=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLike(String value) {
            addCriterion("ORGTYPE_ like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotLike(String value) {
            addCriterion("ORGTYPE_ not like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIn(List<String> values) {
            addCriterion("ORGTYPE_ in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotIn(List<String> values) {
            addCriterion("ORGTYPE_ not in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeBetween(String value1, String value2) {
            addCriterion("ORGTYPE_ between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotBetween(String value1, String value2) {
            addCriterion("ORGTYPE_ not between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("NID_ is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID_ is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(String value) {
            addCriterion("NID_ =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(String value) {
            addCriterion("NID_ <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(String value) {
            addCriterion("NID_ >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(String value) {
            addCriterion("NID_ >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(String value) {
            addCriterion("NID_ <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(String value) {
            addCriterion("NID_ <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(String value) {
            addCriterion("NID_ like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(String value) {
            addCriterion("NID_ not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<String> values) {
            addCriterion("NID_ in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<String> values) {
            addCriterion("NID_ not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(String value1, String value2) {
            addCriterion("NID_ between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(String value1, String value2) {
            addCriterion("NID_ not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
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