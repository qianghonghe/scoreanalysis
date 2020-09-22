package cn.scoreanalysis.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andProfessionidIsNull() {
            addCriterion("professionid is null");
            return (Criteria) this;
        }

        public Criteria andProfessionidIsNotNull() {
            addCriterion("professionid is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionidEqualTo(Integer value) {
            addCriterion("professionid =", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotEqualTo(Integer value) {
            addCriterion("professionid <>", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidGreaterThan(Integer value) {
            addCriterion("professionid >", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("professionid >=", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidLessThan(Integer value) {
            addCriterion("professionid <", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidLessThanOrEqualTo(Integer value) {
            addCriterion("professionid <=", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidIn(List<Integer> values) {
            addCriterion("professionid in", values, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotIn(List<Integer> values) {
            addCriterion("professionid not in", values, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidBetween(Integer value1, Integer value2) {
            addCriterion("professionid between", value1, value2, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotBetween(Integer value1, Integer value2) {
            addCriterion("professionid not between", value1, value2, "professionid");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("gradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeId =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeId <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeId >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeId >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeId <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeId <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeId in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeId not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeId between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeId not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNull() {
            addCriterion("studentnumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNotNull() {
            addCriterion("studentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberEqualTo(String value) {
            addCriterion("studentnumber =", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotEqualTo(String value) {
            addCriterion("studentnumber <>", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThan(String value) {
            addCriterion("studentnumber >", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("studentnumber >=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThan(String value) {
            addCriterion("studentnumber <", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThanOrEqualTo(String value) {
            addCriterion("studentnumber <=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLike(String value) {
            addCriterion("studentnumber like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotLike(String value) {
            addCriterion("studentnumber not like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIn(List<String> values) {
            addCriterion("studentnumber in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotIn(List<String> values) {
            addCriterion("studentnumber not in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberBetween(String value1, String value2) {
            addCriterion("studentnumber between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotBetween(String value1, String value2) {
            addCriterion("studentnumber not between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentname is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentname is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentname =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentname <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentname >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentname >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentname <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentname <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentname like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentname not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentname in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentname not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentname between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentname not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentageIsNull() {
            addCriterion("studentage is null");
            return (Criteria) this;
        }

        public Criteria andStudentageIsNotNull() {
            addCriterion("studentage is not null");
            return (Criteria) this;
        }

        public Criteria andStudentageEqualTo(Integer value) {
            addCriterion("studentage =", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotEqualTo(Integer value) {
            addCriterion("studentage <>", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageGreaterThan(Integer value) {
            addCriterion("studentage >", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentage >=", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageLessThan(Integer value) {
            addCriterion("studentage <", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageLessThanOrEqualTo(Integer value) {
            addCriterion("studentage <=", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageIn(List<Integer> values) {
            addCriterion("studentage in", values, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotIn(List<Integer> values) {
            addCriterion("studentage not in", values, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageBetween(Integer value1, Integer value2) {
            addCriterion("studentage between", value1, value2, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotBetween(Integer value1, Integer value2) {
            addCriterion("studentage not between", value1, value2, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIsNull() {
            addCriterion("studentgender is null");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIsNotNull() {
            addCriterion("studentgender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgenderEqualTo(String value) {
            addCriterion("studentgender =", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotEqualTo(String value) {
            addCriterion("studentgender <>", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderGreaterThan(String value) {
            addCriterion("studentgender >", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderGreaterThanOrEqualTo(String value) {
            addCriterion("studentgender >=", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLessThan(String value) {
            addCriterion("studentgender <", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLessThanOrEqualTo(String value) {
            addCriterion("studentgender <=", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLike(String value) {
            addCriterion("studentgender like", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotLike(String value) {
            addCriterion("studentgender not like", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIn(List<String> values) {
            addCriterion("studentgender in", values, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotIn(List<String> values) {
            addCriterion("studentgender not in", values, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderBetween(String value1, String value2) {
            addCriterion("studentgender between", value1, value2, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotBetween(String value1, String value2) {
            addCriterion("studentgender not between", value1, value2, "studentgender");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateIsNull() {
            addCriterion("enrollmentdate is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateIsNotNull() {
            addCriterion("enrollmentdate is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentdate =", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentdate <>", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("enrollmentdate >", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentdate >=", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateLessThan(Date value) {
            addCriterionForJDBCDate("enrollmentdate <", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentdate <=", value, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateIn(List<Date> values) {
            addCriterionForJDBCDate("enrollmentdate in", values, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enrollmentdate not in", values, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollmentdate between", value1, value2, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollmentdate not between", value1, value2, "enrollmentdate");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardIsNull() {
            addCriterion("studentidentitycard is null");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardIsNotNull() {
            addCriterion("studentidentitycard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardEqualTo(String value) {
            addCriterion("studentidentitycard =", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardNotEqualTo(String value) {
            addCriterion("studentidentitycard <>", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardGreaterThan(String value) {
            addCriterion("studentidentitycard >", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("studentidentitycard >=", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardLessThan(String value) {
            addCriterion("studentidentitycard <", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardLessThanOrEqualTo(String value) {
            addCriterion("studentidentitycard <=", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardLike(String value) {
            addCriterion("studentidentitycard like", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardNotLike(String value) {
            addCriterion("studentidentitycard not like", value, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardIn(List<String> values) {
            addCriterion("studentidentitycard in", values, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardNotIn(List<String> values) {
            addCriterion("studentidentitycard not in", values, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardBetween(String value1, String value2) {
            addCriterion("studentidentitycard between", value1, value2, "studentidentitycard");
            return (Criteria) this;
        }

        public Criteria andStudentidentitycardNotBetween(String value1, String value2) {
            addCriterion("studentidentitycard not between", value1, value2, "studentidentitycard");
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