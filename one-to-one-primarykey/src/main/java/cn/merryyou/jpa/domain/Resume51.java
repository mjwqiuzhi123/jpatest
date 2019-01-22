package cn.merryyou.jpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 来自智联的实体信息
 *
 * @param
 * @author majunwei01
 * @date 2019-1-3 11:55
 * @return
 */
@Entity(name = "resume_spider_51job")
@Data
public class Resume51 implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String resumeId;//简历ID
    //private String resume_source;//简历来源
    private String headBaseInfo;//简历头部基本信息
    private String currentWorkExperience;//最近工作信息
    private String topEducation;//最高学历信息
    private String personalInfo;//个人基本信息
    private String currentWages;//目前收入
    private String jobIntention;//求职意向
    private String workExperience;//工作经验
    private String projectExperience;//项目经验
    private String educationExperience;//教育经历
    private String inShSituation;//在校情况
    private String skill;//技能特长
    private String headImgContent;//头像内容
    private String resumeUrl;//简历详情url
    private String resumeUpdated;//简历更新时间

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getHeadBaseInfo() {
        return headBaseInfo;
    }

    public void setHeadBaseInfo(String headBaseInfo) {
        this.headBaseInfo = headBaseInfo;
    }

    public String getCurrentWorkExperience() {
        return currentWorkExperience;
    }

    public void setCurrentWorkExperience(String currentWorkExperience) {
        this.currentWorkExperience = currentWorkExperience;
    }

    public String getTopEducation() {
        return topEducation;
    }

    public void setTopEducation(String topEducation) {
        this.topEducation = topEducation;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(String personalInfo) {
        this.personalInfo = personalInfo;
    }

    public String getCurrentWages() {
        return currentWages;
    }

    public void setCurrentWages(String currentWages) {
        this.currentWages = currentWages;
    }

    public String getJobIntention() {
        return jobIntention;
    }

    public void setJobIntention(String jobIntention) {
        this.jobIntention = jobIntention;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience;
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience;
    }

    public String getInShSituation() {
        return inShSituation;
    }

    public void setInShSituation(String inShSituation) {
        this.inShSituation = inShSituation;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getHeadImgContent() {
        return headImgContent;
    }

    public void setHeadImgContent(String headImgContent) {
        this.headImgContent = headImgContent;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public String getResumeUpdated() {
        return resumeUpdated;
    }

    public void setResumeUpdated(String resumeUpdated) {
        this.resumeUpdated = resumeUpdated;
    }
}
