package cn.merryyou.jpa.repository;

import cn.merryyou.jpa.domain.ResumeFormat;
import cn.merryyou.jpa.domain.ResumeSummarySpider;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2018/2/5.
 *
 * @author zlf
 * @since 1.0
 */
public interface ResumeFMRepository extends JpaRepository<ResumeFormat, Integer> {
}
