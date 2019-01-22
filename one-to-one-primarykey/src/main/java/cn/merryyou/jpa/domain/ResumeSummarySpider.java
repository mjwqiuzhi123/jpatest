package cn.merryyou.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 来自智联的实体信息
 *
 * @param
 * @author majunwei01
 * @date 2019-1-3 11:55
 * @return
 */
@Entity
@Data
public class ResumeSummarySpider implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String resumeId;//智联的简历ID
    private String resume_source;//简历来源
    private String userName;
    private String gender;
    private Integer age;
    private Integer workYears;//工作年限
    private String portraitUrl;//求职者头像
    private String jobTitle;//求职者当前职业(last_job)
    private String eduLevel;//最高学历
    private String resumeModifyDate;//简历最后更新时间
    private String desiredSalary;//期望薪资
    private String careerStatus;//当前在职状态
    private String desiredJobType;//期望职位类型
    private String desireCity;//期望工作城市
    private String schoolName;//毕业院校
    private String school_major;//专业
    private String schoolBeginDate;//入学时间
    private String schoolEndDate;//毕业时间
    private String resumeSummaryJson;//列表页完整JSON数据

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getResumeModifyDate() {
        return resumeModifyDate;
    }

    public void setResumeModifyDate(String resumeModifyDate) {
        this.resumeModifyDate = resumeModifyDate;
    }

    public String getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(String desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public String getCareerStatus() {
        return careerStatus;
    }

    public void setCareerStatus(String careerStatus) {
        this.careerStatus = careerStatus;
    }

    public String getDesiredJobType() {
        return desiredJobType;
    }

    public void setDesiredJobType(String desiredJobType) {
        this.desiredJobType = desiredJobType;
    }

    public String getDesireCity() {
        return desireCity;
    }

    public void setDesireCity(String desireCity) {
        this.desireCity = desireCity;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchool_major() {
        return school_major;
    }

    public void setSchool_major(String school_major) {
        this.school_major = school_major;
    }

    public String getSchoolBeginDate() {
        return schoolBeginDate;
    }

    public void setSchoolBeginDate(String schoolBeginDate) {
        this.schoolBeginDate = schoolBeginDate;
    }

    public String getSchoolEndDate() {
        return schoolEndDate;
    }

    public void setSchoolEndDate(String schoolEndDate) {
        this.schoolEndDate = schoolEndDate;
    }

    public String getResumeSummaryJson() {
        return resumeSummaryJson;
    }

    public void setResumeSummaryJson(String resumeSummaryJson) {
        this.resumeSummaryJson = resumeSummaryJson;
    }

    public ResumeSummarySpider() {
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getResume_source() {
        return resume_source;
    }

    public void setResume_source(String resume_source) {
        this.resume_source = resume_source;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Integer workYears) {
        this.workYears = workYears;
    }

    @Override
    public String toString() {
        return "ResumeSummarySpider{" +
                "resumeId='" + resumeId + '\'' +
                ", resume_source='" + resume_source + '\'' +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", workYears=" + workYears +
                '}';
    }
}
