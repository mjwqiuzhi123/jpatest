package cn.merryyou.jpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 格式化后的实体类
 *
 * @param
 * @author majunwei01
 * @date 2019-1-3 11:54
 * @return
 */
@Entity
@Data
public class ResumeFormat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //职位ID
    private Integer jobId;
//    //职位代码
//    private String jobCode;
    //职位名称
    private String jobName;
    //候选人ID
    private Integer intervieweeId;
    //姓名
    private String name;
    //个人头像
    private String personalPic;
    //出生日期
    private String birthDate;
    //年龄
    private Integer age;
    //性别
    private Integer genderId;
    //手机号
    private String phoneNumber;
    // 邮箱
    private String mailbox;
    //居住地址
    private String liveAddress;
//    //居住地所属省份
//    private String liveAddressProvince;
    //国籍
    private String nationality;
    //民族
    private String nation;
    //籍贯
    private String nativeAddress;
//    //籍贯所属省份
//    private String nativeAddressProvince;
    //户口所在地
    private String location;
//    //户口所在地所属省份
//    private String locationProvince;
    //婚姻状况
    private String marriageStatus;
    //政治面貌
    private String politicsStatus;
    //证件类型
    private String idType;
    //证件号码
    private String idNumber;
    //学校类型
    private Boolean uniType;
    //毕业院校
    private String university;
    //学历
    private String education;
    //工作年限
    private Integer workYears;
    //最近公司
    private String lastCompany;
    //专业
    private String lastMajor;
    //最近职位
    private String lastJob;
    //目前薪资
    private Integer lastSalary;
    //期望薪资
    private String goalSalary;
    //简历来源,职位投递时必填
    private String resumeOrigin;
    //简历渠道,职位投递时必填
    private String resumePlace;
    //简历归属
    private String resumeOwner;
    //简历地址
    private String resumeUrl;
    //原始简历文件名
    private String resumeOriginFileName;
    //专业技能
    private String technicalAbility;
    //最低薪资
    private Integer minSalary;
    //最高薪资
    private Integer maxSalary;
    //期望行业
    private String goalCareer;
    //期望城市
    private String goalCity;
//    //期望城市所属省份
//    private String goalProvince;
    //期望职位(goal_job)码表
    private String jobIntention;
    //个人状态(在职/离职)码表
    private String personalStatus;
    //最后工作经历
    private String lastWorkExperience;
    //起止时间(work_start_end) 公司名称(company) 所属部门(department) 职位名称(job_name) 所在行业(business) 公司性质(company_quality) 公司规模(company_size) 汇报对象(report_leader) 下属人数(manage_fellows) 工作描述(job_describe)
    private String workExperience;
    //最后工作经验
    private String lastProjectExperience;
    //起止时间(project_start_end) 项目名称(project_name) 职务(job) 项目描述(project_describe) 个人职责(personal_duty)
    private String projectExperience;
    //最高教育经历
    private String lastEducationExperience;
    //起止时间(education_start_end) 学校名称(uni_name) 专业(major) 学历(education)
    private String educationExperience;
    //语种 听说(一般//良好//熟练//精通) 读写(一般//良好//熟练//精通
    private String language;
    //获得时间 证书名称
    private String certificate;
    //个人评价
    private String personalIntroduce;
    //投递日期
    private Date deliverDate;
    // 应聘状态
    private String applyStatus;
    //锁定状态
    private Boolean lockStatus;
    //猎头ID
    private Integer headHunterId;
    //用户id
    private String lockUserId;
    //HRID
    private String hrId;
    //锁定时间
    private String lockDate;
    //渠道简历ID
    private String channelResumeId;
    //渠道
    private String channel;
    //猎头推荐记录ID
    private Integer headhuntingRecommend;
    //应聘流程时间
    private String applyStatusMoment;
    //应聘流程结果
    private String applyStatusResult;
    //猎头推介评语
    private String introductionOfComments;
    //最后更新时间
    private Date updateDate;
    //0：未知；1：统招；2：自考
    private Integer studentType;
//    //简历唯一ID，初期用于页面展示
////    private Long resumeUnique;

    public String getGoalSalary() {
        return goalSalary;
    }

    public void setGoalSalary(String goalSalary) {
        this.goalSalary = goalSalary;
    }

    public String getLastMajor() {
        return lastMajor;
    }

    public void setLastMajor(String lastMajor) {
        this.lastMajor = lastMajor;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getApplyStatusMoment() {
        return applyStatusMoment;
    }

    public void setApplyStatusMoment(String applyStatusMoment) {
        this.applyStatusMoment = applyStatusMoment;
    }

    public String getApplyStatusResult() {
        return applyStatusResult;
    }

    public void setApplyStatusResult(String applyStatusResult) {
        this.applyStatusResult = applyStatusResult;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getIntervieweeId() {
        return intervieweeId;
    }

    public void setIntervieweeId(Integer intervieweeId) {
        this.intervieweeId = intervieweeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalPic() {
        return personalPic;
    }

    public void setPersonalPic(String personalPic) {
        this.personalPic = personalPic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeAddress() {
        return nativeAddress;
    }

    public void setNativeAddress(String nativeAddress) {
        this.nativeAddress = nativeAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Boolean getUniType() {
        return uniType;
    }

    public void setUniType(Boolean uniType) {
        this.uniType = uniType;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Integer workYears) {
        this.workYears = workYears;
    }

    public String getLastCompany() {
        return lastCompany;
    }

    public void setLastCompany(String lastCompany) {
        this.lastCompany = lastCompany;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }

    public Integer getLastSalary() {
        return lastSalary;
    }

    public void setLastSalary(Integer lastSalary) {
        this.lastSalary = lastSalary;
    }

    public String getResumeOrigin() {
        return resumeOrigin;
    }

    public void setResumeOrigin(String resumeOrigin) {
        this.resumeOrigin = resumeOrigin;
    }

    public String getResumePlace() {
        return resumePlace;
    }

    public void setResumePlace(String resumePlace) {
        this.resumePlace = resumePlace;
    }

    public String getResumeOwner() {
        return resumeOwner;
    }

    public void setResumeOwner(String resumeOwner) {
        this.resumeOwner = resumeOwner;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public String getTechnicalAbility() {
        return technicalAbility;
    }

    public void setTechnicalAbility(String technicalAbility) {
        this.technicalAbility = technicalAbility;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getGoalCareer() {
        return goalCareer;
    }

    public void setGoalCareer(String goalCareer) {
        this.goalCareer = goalCareer;
    }

    public String getGoalCity() {
        return goalCity;
    }

    public void setGoalCity(String goalCity) {
        this.goalCity = goalCity;
    }

    public String getJobIntention() {
        return jobIntention;
    }

    public void setJobIntention(String jobIntention) {
        this.jobIntention = jobIntention;
    }

    public String getPersonalStatus() {
        return personalStatus;
    }

    public void setPersonalStatus(String personalStatus) {
        this.personalStatus = personalStatus;
    }

    public String getLastWorkExperience() {
        return lastWorkExperience;
    }

    public void setLastWorkExperience(String lastWorkExperience) {
        this.lastWorkExperience = lastWorkExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getLastProjectExperience() {
        return lastProjectExperience;
    }

    public void setLastProjectExperience(String lastProjectExperience) {
        this.lastProjectExperience = lastProjectExperience;
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience;
    }

    public String getLastEducationExperience() {
        return lastEducationExperience;
    }

    public void setLastEducationExperience(String lastEducationExperience) {
        this.lastEducationExperience = lastEducationExperience;
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getPersonalIntroduce() {
        return personalIntroduce;
    }

    public void setPersonalIntroduce(String personalIntroduce) {
        this.personalIntroduce = personalIntroduce;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getLockUserId() {
        return lockUserId;
    }

    public void setLockUserId(String lockUserId) {
        this.lockUserId = lockUserId;
    }

    public Integer getHeadHunterId() {
        return headHunterId;
    }

    public void setHeadHunterId(Integer headHunterId) {
        this.headHunterId = headHunterId;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getLockDate() {
        return lockDate;
    }

    public void setLockDate(String lockDate) {
        this.lockDate = lockDate;
    }

    public String getChannelResumeId() {
        return channelResumeId;
    }

    public void setChannelResumeId(String channelResumeId) {
        this.channelResumeId = channelResumeId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getHeadhuntingRecommend() {
        return headhuntingRecommend;
    }

    public void setHeadhuntingRecommend(Integer headhuntingRecommend) {
        this.headhuntingRecommend = headhuntingRecommend;
    }

    public String getResumeOriginFileName() {
        return resumeOriginFileName;
    }

    public void setResumeOriginFileName(String resumeOriginFileName) {
        this.resumeOriginFileName = resumeOriginFileName;
    }

    public String getIntroductionOfComments() {
        return introductionOfComments;
    }

    public void setIntroductionOfComments(String introductionOfComments) {
        this.introductionOfComments = introductionOfComments;
    }

    public Boolean getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getStudentType() {
        return studentType;
    }

    public void setStudentType(Integer studentType) {
        this.studentType = studentType;
    }

}
