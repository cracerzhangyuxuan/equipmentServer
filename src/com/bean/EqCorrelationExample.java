package com.bean;

import java.util.ArrayList;
import java.util.List;

public class EqCorrelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EqCorrelationExample() {
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

        public Criteria andEqCoIdIsNull() {
            addCriterion("eq_co_id is null");
            return (Criteria) this;
        }

        public Criteria andEqCoIdIsNotNull() {
            addCriterion("eq_co_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqCoIdEqualTo(Integer value) {
            addCriterion("eq_co_id =", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdNotEqualTo(Integer value) {
            addCriterion("eq_co_id <>", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdGreaterThan(Integer value) {
            addCriterion("eq_co_id >", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eq_co_id >=", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdLessThan(Integer value) {
            addCriterion("eq_co_id <", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdLessThanOrEqualTo(Integer value) {
            addCriterion("eq_co_id <=", value, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdIn(List<Integer> values) {
            addCriterion("eq_co_id in", values, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdNotIn(List<Integer> values) {
            addCriterion("eq_co_id not in", values, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdBetween(Integer value1, Integer value2) {
            addCriterion("eq_co_id between", value1, value2, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqCoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eq_co_id not between", value1, value2, "eqCoId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdIsNull() {
            addCriterion("eq_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andEqParentIdIsNotNull() {
            addCriterion("eq_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqParentIdEqualTo(Integer value) {
            addCriterion("eq_parent_id =", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdNotEqualTo(Integer value) {
            addCriterion("eq_parent_id <>", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdGreaterThan(Integer value) {
            addCriterion("eq_parent_id >", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eq_parent_id >=", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdLessThan(Integer value) {
            addCriterion("eq_parent_id <", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("eq_parent_id <=", value, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdIn(List<Integer> values) {
            addCriterion("eq_parent_id in", values, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdNotIn(List<Integer> values) {
            addCriterion("eq_parent_id not in", values, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdBetween(Integer value1, Integer value2) {
            addCriterion("eq_parent_id between", value1, value2, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eq_parent_id not between", value1, value2, "eqParentId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdIsNull() {
            addCriterion("eq_child_id is null");
            return (Criteria) this;
        }

        public Criteria andEqChildIdIsNotNull() {
            addCriterion("eq_child_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqChildIdEqualTo(Integer value) {
            addCriterion("eq_child_id =", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdNotEqualTo(Integer value) {
            addCriterion("eq_child_id <>", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdGreaterThan(Integer value) {
            addCriterion("eq_child_id >", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eq_child_id >=", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdLessThan(Integer value) {
            addCriterion("eq_child_id <", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("eq_child_id <=", value, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdIn(List<Integer> values) {
            addCriterion("eq_child_id in", values, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdNotIn(List<Integer> values) {
            addCriterion("eq_child_id not in", values, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdBetween(Integer value1, Integer value2) {
            addCriterion("eq_child_id between", value1, value2, "eqChildId");
            return (Criteria) this;
        }

        public Criteria andEqChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eq_child_id not between", value1, value2, "eqChildId");
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