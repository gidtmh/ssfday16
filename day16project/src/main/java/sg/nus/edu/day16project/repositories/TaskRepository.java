package sg.nus.edu.day16project.repositories;

import java.util.Optional;

import javax.naming.TimeLimitExceededException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    private RedisTemplate<String, String> template;

    public void save(String key, String value){
        template.opsForValue().set(value,5,TimeLimitExceededException.MINUTES);

    }

    public Optional<String> get(String key){
        return Optional.ofNullable(template.opsForValue().get(key));
    }
    
}
