package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCgIdIsNull() {
            addCriterion("cg_id is null");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNotNull() {
            addCriterion("cg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCgIdEqualTo(Integer value) {
            addCriterion("cg_id =", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotEqualTo(Integer value) {
            addCriterion("cg_id <>", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThan(Integer value) {
            addCriterion("cg_id >", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cg_id >=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThan(Integer value) {
            addCriterion("cg_id <", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThanOrEqualTo(Integer value) {
            addCriterion("cg_id <=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdIn(List<Integer> values) {
            addCriterion("cg_id in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotIn(List<Integer> values) {
            addCriterion("cg_id not in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdBetween(Integer value1, Integer value2) {
            addCriterion("cg_id between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cg_id not between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgNameIsNull() {
            addCriterion("cg_name is null");
            return (Criteria) this;
        }

        public Criteria andCgNameIsNotNull() {
            addCriterion("cg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCgNameEqualTo(String value) {
            addCriterion("cg_name =", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotEqualTo(String value) {
            addCriterion("cg_name <>", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameGreaterThan(String value) {
            addCriterion("cg_name >", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cg_name >=", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLessThan(String value) {
            addCriterion("cg_name <", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLessThanOrEqualTo(String value) {
            addCriterion("cg_name <=", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLike(String value) {
            addCriterion("cg_name like", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotLike(String value) {
            addCriterion("cg_name not like", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameIn(List<String> values) {
            addCriterion("cg_name in", values, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotIn(List<String> values) {
            addCriterion("cg_name not in", values, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameBetween(String value1, String value2) {
            addCriterion("cg_name between", value1, value2, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotBetween(String value1, String value2) {
            addCriterion("cg_name not between", value1, value2, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgDateIsNull() {
            addCriterion("cg_date is null");
            return (Criteria) this;
        }

        public Criteria andCgDateIsNotNull() {
            addCriterion("cg_date is not null");
            return (Criteria) this;
        }

        public Criteria andCgDateEqualTo(Date value) {
            addCriterion("cg_date =", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotEqualTo(Date value) {
            addCriterion("cg_date <>", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateGreaterThan(Date value) {
            addCriterion("cg_date >", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cg_date >=", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateLessThan(Date value) {
            addCriterion("cg_date <", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateLessThanOrEqualTo(Date value) {
            addCriterion("cg_date <=", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateIn(List<Date> values) {
            addCriterion("cg_date in", values, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotIn(List<Date> values) {
            addCriterion("cg_date not in", values, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateBetween(Date value1, Date value2) {
            addCriterion("cg_date between", value1, value2, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotBetween(Date value1, Date value2) {
            addCriterion("cg_date not between", value1, value2, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgAdminIsNull() {
            addCriterion("cg_admin is null");
            return (Criteria) this;
        }

        public Criteria andCgAdminIsNotNull() {
            addCriterion("cg_admin is not null");
            return (Criteria) this;
        }

        public Criteria andCgAdminEqualTo(String value) {
            addCriterion("cg_admin =", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminNotEqualTo(String value) {
            addCriterion("cg_admin <>", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminGreaterThan(String value) {
            addCriterion("cg_admin >", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminGreaterThanOrEqualTo(String value) {
            addCriterion("cg_admin >=", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminLessThan(String value) {
            addCriterion("cg_admin <", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminLessThanOrEqualTo(String value) {
            addCriterion("cg_admin <=", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminLike(String value) {
            addCriterion("cg_admin like", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminNotLike(String value) {
            addCriterion("cg_admin not like", value, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminIn(List<String> values) {
            addCriterion("cg_admin in", values, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminNotIn(List<String> values) {
            addCriterion("cg_admin not in", values, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminBetween(String value1, String value2) {
            addCriterion("cg_admin between", value1, value2, "cgAdmin");
            return (Criteria) this;
        }

        public Criteria andCgAdminNotBetween(String value1, String value2) {
            addCriterion("cg_admin not between", value1, value2, "cgAdmin");
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