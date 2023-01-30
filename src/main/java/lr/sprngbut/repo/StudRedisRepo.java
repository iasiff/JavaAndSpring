package lr.sprngbut.repo;
/*
import lr.sprngbut.entity.StudRedis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudRedisRepo {

    private static final Logger log = LoggerFactory.getLogger(StudRedisRepo.class);
    private static final String KEY = "Stud";

    @Autowired
    private RedisTemplate template;

    public void save(StudRedis rs){

        log.info("### ==> sav() <== ###");
        template.opsForHash().put(KEY,rs.getRoll(),rs);
    }

    public List<StudRedis> getStuds(){
        log.info("### ==> getStuds() <== ###");
        return template.opsForHash().values(KEY);
    }

    public void deleteAll(){
        template.delete(KEY);
    }

}
 */
