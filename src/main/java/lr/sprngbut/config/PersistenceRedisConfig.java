package lr.sprngbut.config;
/*
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableRedisRepositories
public class PersistenceRedisConfig{

    private static final Logger log = LoggerFactory.getLogger(PersistenceRedisConfig.class);

    @Bean
    @ConfigurationProperties(prefix = "redis.conf")
    PersistenceRedisCommonProp getRedisProp(){
        return new PersistenceRedisCommonProp();
    }

    @Bean
    RedisConnectionFactory getConFac(){

        RedisStandaloneConfiguration cfg = new RedisStandaloneConfiguration();

        //cfg.setUsername(getRedisProp().getUsername());
        cfg.setPassword(RedisPassword.of(getRedisProp().getPassword()));
        cfg.setDatabase(getRedisProp().getDatabase());
        cfg.setPort(getRedisProp().getPort());
        cfg.setHostName(getRedisProp().getHost());

        log.info("### ==> getConFac() <== ###");

        return new LettuceConnectionFactory(cfg,getLettucePoolCfg());
    }

    private LettucePoolingClientConfiguration getLettucePoolCfg(){

        LettucePoolingClientConfiguration build = LettucePoolingClientConfiguration.builder()
                .poolConfig(genericPool())
                .build();

        log.info("### ==> getLettucePoolCfg() <== ###");

        return build;
    }

    private GenericObjectPoolConfig<RedisProperties.Lettuce> genericPool(){

        GenericObjectPoolConfig<RedisProperties.Lettuce> cfg = new GenericObjectPoolConfig<>();
        cfg.setMinIdle(getRedisProp().getMinIdle());
        cfg.setMaxIdle(getRedisProp().getMaxIdle());
        cfg.setMaxTotal(getRedisProp().getMaxTotal());

        log.info("### ==> genericPool() <== ###");

        return cfg;
    }

    @Bean
    @Primary
    public RedisTemplate<String,Object> getRedisTemplate(){
        RedisTemplate<String,Object> template = new RedisTemplate<>();

        template.setConnectionFactory(getConFac());
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new JdkSerializationRedisSerializer());
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();

        log.info("### ==> getRedisTemplate() <== ###");

        return template;
    }

}
 */
