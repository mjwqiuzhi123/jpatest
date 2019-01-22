package cn.merryyou.jpa.repository;

import cn.merryyou.jpa.domain.Resume51;
import cn.merryyou.jpa.domain.ResumeFormat;
import cn.merryyou.jpa.domain.ResumeSummarySpider;
import cn.merryyou.jpa.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @param
 * @author majunwei01
 * @date 2019-1-3 11:22
 * @return
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HatsRepositoryTest {

    @Autowired
    private ResumeZLRepository resumeRepository;

    @Autowired
    private Resume51Repository resume51Repository;

    @Autowired
    private ResumeFMRepository resumeFMRepository;

    @Test
    public void findResumeFromZL() throws Exception {
        List<ResumeFormat> resumeFormats = new ArrayList<>();
        long counts = resumeRepository.count();
//        for (int i = 1; i < counts; i++) {
//            if (i * 500 <= counts) {
        Page<ResumeSummarySpider> resumeSummarySpiders = resumeRepository.findAll(new PageRequest(1, 10));
        List<ResumeSummarySpider> content = resumeSummarySpiders.getContent();
        for (ResumeSummarySpider resumeSummarySpider : content) {
            log.info(resumeSummarySpider.toString());
            ResumeFormat resumeFormat = new ResumeFormat();
            resumeFormat.setResumePlace(resumeSummarySpider.getResume_source());
            resumeFormat.setName(new String(resumeSummarySpider.getUserName().getBytes(), "UTF-8"));
            if (resumeSummarySpider.getGender() != null && resumeSummarySpider.getGender().equals("女")) {
                resumeFormat.setGenderId(0);
            } else if (resumeSummarySpider.getGender() != null && resumeSummarySpider.getGender().equals("男")) {
                resumeFormat.setGenderId(1);
            } else {
                resumeFormat.setGenderId(null);
            }
            resumeFormat.setAge(resumeSummarySpider.getAge());
            resumeFormat.setWorkYears(resumeSummarySpider.getWorkYears());
            resumeFormat.setPersonalPic(resumeSummarySpider.getPortraitUrl());
            resumeFormat.setLastJob(resumeSummarySpider.getJobTitle());
            resumeFormat.setEducation(resumeSummarySpider.getEduLevel());
            resumeFormat.setUpdateDate(DateUtils.stringToDate(resumeSummarySpider.getResumeModifyDate()));
            resumeFormat.setGoalSalary(resumeSummarySpider.getDesiredSalary());
            resumeFormat.setPersonalStatus(resumeSummarySpider.getCareerStatus());
            resumeFormat.setGoalCareer(resumeSummarySpider.getDesiredJobType());
            resumeFormat.setGoalCity(resumeSummarySpider.getDesireCity());
            resumeFormat.setUniversity(resumeSummarySpider.getSchoolName());
            resumeFormat.setLastMajor(resumeSummarySpider.getSchool_major());
            JSONObject jsonObject = new JSONObject(resumeSummarySpider.getResumeSummaryJson());
            resumeFormat.setEducationExperience(jsonObject.opt("schoolDetail").toString());
            resumeFormat.setLastWorkExperience(jsonObject.opt("lastJobDetail").toString());
            //JSONObject object = jsonObject.optJSONObject();
            resumeFormats.add(resumeFormat);
        }
//            }
//        }
        resumeFMRepository.save(resumeFormats);
    }

    @Test
    public void findResume51job() throws Exception {
        List<ResumeFormat> resumeFormats = new ArrayList<>();
        long counts = resume51Repository.count();
//        for (int i = 1; i < counts; i++) {
//            if (i * 500 <= counts) {
        Page<Resume51> resume51s = resume51Repository.findAll(new PageRequest(1, 10));
        List<Resume51> content = resume51s.getContent();
        for (Resume51 resume51 : content) {
            log.info(resume51.toString());
            ResumeFormat resumeFormat = new ResumeFormat();
            resumeFormat.setPersonalPic(resume51.getHeadImgContent());
            resumeFormat.setResumePlace("前程无忧");
            // 简历头部基本信息
            JSONObject jsonObject = new JSONObject(resume51.getHeadBaseInfo());
            String age = jsonObject.opt("age").toString();
            resumeFormat.setAge(Integer.parseInt(age.substring(0, age.indexOf("岁"))));
            resumeFormat.setBirthDate(age.substring(age.indexOf("（") + 1, age.indexOf("）")));
            String gender = jsonObject.opt("gender").toString();
            if (gender != null && gender.equals("女")) {
                resumeFormat.setGenderId(0);
            } else if (gender != null && gender.equals("男")) {
                resumeFormat.setGenderId(1);
            } else {
                resumeFormat.setGenderId(null);
            }
            String personalStatus = jsonObject.opt("job_hunt_status").toString();
            resumeFormat.setPersonalStatus(personalStatus);
            String email = jsonObject.opt("mail").toString();
            resumeFormat.setMailbox(email);
            String phone = jsonObject.opt("phone").toString();
            resumeFormat.setPhoneNumber(phone);
            String liveAddress = jsonObject.opt("residence").toString();
            resumeFormat.setLiveAddress(liveAddress);
            String workYears = jsonObject.opt("work_time").toString();
            resumeFormat.setWorkYears(Integer.parseInt(workYears.substring(0,workYears.indexOf("年"))));
            // 个人情况

//            resumeFormat.setAge(resume51.getAge());
//            resumeFormat.setWorkYears(resume51.getWorkYears());
//            resumeFormat.setPersonalPic(resume51.getPortraitUrl());
//            resumeFormat.setLastJob(resume51.getJobTitle());
//            resumeFormat.setEducation(resume51.getEduLevel());
//            resumeFormat.setUpdateDate(DateUtils.stringToDate(resume51.getResumeModifyDate()));
//            resumeFormat.setGoalSalary(resume51.getDesiredSalary());
//            resumeFormat.setGoalCareer(resume51.getDesiredJobType());
//            resumeFormat.setGoalCity(resume51.getDesireCity());
//            resumeFormat.setUniversity(resume51.getSchoolName());
//            resumeFormat.setLastMajor(resume51.getSchool_major());
//            JSONObject jsonObject = new JSONObject(resume51.getResumeSummaryJson());
//            resumeFormat.setEducationExperience(jsonObject.opt("schoolDetail").toString());
//            resumeFormat.setLastWorkExperience(jsonObject.opt("lastJobDetail").toString());
//            //JSONObject object = jsonObject.optJSONObject();
            resumeFormats.add(resumeFormat);
        }
//            }
//        }
        resumeFMRepository.save(resumeFormats);
    }
}
